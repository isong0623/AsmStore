package com.haoda.common.base

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.NonNull
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.haoda.common.R
import com.haoda.common.core.RouterManager
import com.haoda.common.framework.BaseView
import com.haoda.common.widget.TitleBarView
import com.scwang.smart.refresh.layout.SmartRefreshLayout
import com.scwang.smart.refresh.layout.api.RefreshLayout
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener
import com.scwang.smart.refresh.layout.listener.OnRefreshListener
import org.kotlin.annotationProcessor.LayoutResId
import java.util.*

open abstract class BaseFragment : Fragment() , OnRefreshListener, OnLoadMoreListener, BaseView {

    //region 生命周期
    protected fun getContentViewResId(): Int {
        return this.javaClass.getAnnotation(LayoutResId::class.java)?.value ?: View.NO_ID
    }
    protected fun isLazyLoadMode(): Boolean = false
    protected fun getNoneLazyModeLoadTime():Long = 0L

    private var flRoot:FrameLayout? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if(flRoot == null){
            flRoot = inflater.inflate(R.layout.fragment_init, null) as FrameLayout
        }
        if (mHandler == null) {
            mHandler = Handler()
        }
        return flRoot
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        if (flRoot == null) {
            flRoot = view as FrameLayout
        }
        if (!isLazyLoadMode()) {
            mHandler!!.postDelayed({ notifyInitFragment() }, getNoneLazyModeLoadTime())
        }
    }

    fun onFragmentResume() {}

    override fun onResume() {
        super.onResume()
        if(bIsInitView){
            onInitLazy()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        releaseInstance(this.javaClass)
        mHandler?.removeCallbacksAndMessages(null)
    }
    //endregion

    //region 初始化
    fun<T:View> findViewById(id:Int):T?{
        return flRoot?.findViewById(id)
    }

    open fun hasTitleBar(): Boolean = true
    private var titleBarView: TitleBarView? = null
    open fun getTitleBar(): TitleBarView {
        if(titleBarView==null) {
            titleBarView = context?.let { TitleBarView(it) }
            titleBarView?.id = R.id.cl_title_bar
        }
        return titleBarView?:(Object() as TitleBarView)
    }

    open fun hasStatusBar(): Boolean = true
    private var vStatusBar: View? = null
    open fun getStatusBar():View {
        if(vStatusBar==null){
            vStatusBar = View(context)
            vStatusBar?.id = android.R.id.statusBarBackground
        }
        return vStatusBar?:(Object() as View)
    }

    open fun hasRefreshBar(): Boolean = false
    private var refreshBar : SmartRefreshLayout? = null
    open fun getRefreshBar(): SmartRefreshLayout {
        if(refreshBar==null){
            refreshBar = SmartRefreshLayout(context)
            refreshBar?.setOnRefreshListener(this)
            refreshBar?.setOnLoadMoreListener(this)
        }
        return refreshBar?:(Object() as SmartRefreshLayout)
    }

    override fun onRefresh(refreshLayout: RefreshLayout) {

    }

    override fun onLoadMore(refreshLayout: RefreshLayout) {

    }

    open fun initView() {}
    open fun initData() {}

    open fun initLazyView() {}
    open fun initLazyData() {}

    protected var mHandler: Handler? = null
    private var bIsInitView = false
    private fun onInitView() {
        if (bIsInitView) return
        bIsInitView = true
        mHandler?.post { onBindView(flRoot) }
        mHandler?.post { initView() }
        mHandler?.post { initData() }
        if (isResumed) {
            onInitLazy()
        }
    }

    var bIsInitLazy = false
    private fun onInitLazy() {
        if (bIsInitView) {
            if (bIsInitLazy) return
            bIsInitLazy = true
            mHandler?.post { initLazyView() }
            mHandler?.post { initLazyData() }
        }
    }

    protected open fun onBindView(vContent: View?) {}
    private var bIsInitLayout = false
    private fun initLayout() {
        if (bIsInitLayout) return
        bIsInitLayout = true
        mHandler = Handler()
    }

    fun notifyInitFragment() {
        if (flRoot == null || flRoot!!.findViewById<View?>(R.id.fl_progress_load) == null) {
            return
        }

        var parent : ConstraintLayout? = context?.let { ConstraintLayout(it) }
        var topId = android.R.id.statusBarBackground
        parent?.addView(getStatusBar(),
                object :ConstraintLayout.LayoutParams(-1,if(hasStatusBar()) BaseActivity.iStatusBarHeight else 0){
                    init {
                        verticalBias = 0f
                        topToTop = 0
                        leftToLeft = 0
                        rightToRight = 0
                        bottomToBottom = 0
                    }
                })
        if(hasTitleBar()){
            parent?.addView(getTitleBar(),
                    object :ConstraintLayout.LayoutParams(-1,-2){
                        init {
                            verticalBias = 0f
                            topToBottom = android.R.id.statusBarBackground
                            leftToLeft = 0
                            rightToRight = 0
                            bottomToBottom = 0
                        }
                    })
            topId = R.id.cl_title_bar
        }
        val content = LayoutInflater.from(context).inflate(getContentViewResId(), null)
        if(hasRefreshBar()){
            parent?.addView(getRefreshBar(),object : ConstraintLayout.LayoutParams(-1,0){
                init {
                    topToBottom = topId
                    leftToLeft = 0
                    rightToRight = 0
                    bottomToBottom = 0
                }
            })
            getRefreshBar().addView(content, ViewGroup.LayoutParams(-1,-1))
        }
        else{
            parent?.addView(content,object : ConstraintLayout.LayoutParams(-1,0){
                init {
                    topToBottom = topId
                    leftToLeft = 0
                    rightToRight = 0
                    bottomToBottom = 0
                }
            })
        }
        parent?.let {
            setContentView(parent)
        }
        onInitView()
        (activity as? BaseActivity)?.let {
            it.registerOnActivityResultCallBack(onActivityResultCallBack)
        }
    }

    fun setContentView(vContentView: View) {
        if (flRoot == null || flRoot!!.findViewById<View?>(R.id.fl_progress_load) == null) {
            return
        }
        if (vContentView.parent != null) return
        flRoot!!.removeView(flRoot!!.findViewById(R.id.fl_progress_load))
        flRoot!!.addView(vContentView, FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
    }

    //endregion

    //region 权限、启动参数处理
    private var _requestCodeGennerator = 0x7fff
    private fun getNextRequestCode(): Int {
        return ++_requestCodeGennerator % 0x7fff + 0x7fff
    }

    fun startActivity(@NonNull routerKey:String,
                      bindData: Bundle = Bundle(),
                      flags:Int = -1){
        startActivity(RouterManager.match(routerKey),bindData, flags)
    }

    fun startActivity(@NonNull clz: Class<*>,
                      bindData: Bundle = Bundle(),
                      flags:Int = -1) {
        activity?.startActivity(object :Intent(activity, clz){
            init {
                putExtras(bindData)
                if(flags!=-1){
                    addFlags(flags)
                }
            }
        })
    }

    fun startActivityForResult(@NonNull routerKey:String,
                               bindData: Bundle = Bundle(),
                               requestCode: Int = getNextRequestCode(),
                               flags:Int = -1,
                               callBack: BaseActivity.OnActivityResultItemCallBack?=null){
        startActivityForResult(RouterManager.match(routerKey),bindData, requestCode, flags, callBack)
    }

    fun startActivityForResult(clz: Class<*>,
                               bindData: Bundle = Bundle(),
                               requestCode: Int = getNextRequestCode(),
                               flags:Int = -1,
                               callBack: BaseActivity.OnActivityResultItemCallBack?=null) {
        callBack?.let { mapResultCallbacks[requestCode] = it }
        startActivityForResult(object :Intent(activity, clz){
            init {
                putExtras(bindData)
                if(flags!=-1){
                    addFlags(flags)
                }
            }
        }, requestCode)
    }

    val mapResultCallbacks: MutableMap<Int, BaseActivity.OnActivityResultItemCallBack> = HashMap<Int, BaseActivity.OnActivityResultItemCallBack>()
    val onActivityResultCallBack: BaseActivity.OnActivityResultCallBack = object : BaseActivity.OnActivityResultCallBack {
        override fun OnActivityResult(requestCode: Int, resultCode: Int, data: Intent?): Boolean {
            val callBack: BaseActivity.OnActivityResultItemCallBack? = mapResultCallbacks[requestCode]
            if (callBack != null) {
                callBack.OnActivityRequestResult(resultCode, data)
                mapResultCallbacks.remove(requestCode)
                return true //中断子类的onActivityResult执行
            }
            return false
        }
    }

    //endregion

    //region 单例模式
    private val intances: MutableMap<Class<*>, BaseFragment?> = HashMap()
    private operator fun <T : BaseFragment?> get(target: Class<T>): T? {
        synchronized(target) { return intances[target] as T? }
    }

    open fun <T : BaseFragment?> getInstance(target: Class<T>): T? {
        var instance: T? = get(target)
        if (instance == null) {
            synchronized(target) {
                instance = get(target)
                if (instance == null) {
                    try {
                        val instanceConstructor = target.getConstructor()
                        instance = instanceConstructor.newInstance()
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                    intances[target] = instance
                }
            }
        }
        return instance
    }

    open fun releaseInstance(target: Class<in BaseFragment>?) {
        synchronized(target!!) { intances.remove(target) }
    }
    //endregion
}