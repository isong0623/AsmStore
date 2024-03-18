package com.haoda.common.base

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.graphics.Rect
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import android.util.DisplayMetrics
import android.util.Log
import android.util.TypedValue
import android.view.*
import android.view.ViewTreeObserver.OnGlobalLayoutListener
import android.view.inputmethod.InputMethodManager
import androidx.annotation.ColorInt
import androidx.annotation.LayoutRes
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.haoda.common.BuildConfig
import com.haoda.common.R
import com.haoda.common.core.RouterManager
import com.haoda.common.framework.BaseView
import com.haoda.common.utils.EasyPermission
import com.haoda.common.utils.StatusBarUtil
import com.haoda.common.utils.SystemBarTintManager
import com.haoda.common.widget.TitleBarView
import com.scwang.smart.refresh.footer.BallPulseFooter
import com.scwang.smart.refresh.header.MaterialHeader
import com.scwang.smart.refresh.layout.SmartRefreshLayout
import com.scwang.smart.refresh.layout.api.RefreshLayout
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener
import com.scwang.smart.refresh.layout.listener.OnRefreshListener
import org.kotlin.annotationProcessor.LayoutResId
import java.util.*

open abstract class BaseActivity :AppCompatActivity(), OnRefreshListener, OnLoadMoreListener, BaseView {

    companion object {
        init {
            SmartRefreshLayout.setDefaultRefreshHeaderCreator { context: Context, layout: RefreshLayout ->
                layout.setPrimaryColorsId(R.color.app_theme_color, android.R.color.white)
                val header = MaterialHeader(context)
                header.setProgressBackgroundColorSchemeResource(android.R.color.white)
                header.setColorSchemeResources(R.color.app_theme_color)
                header
            }
            SmartRefreshLayout.setDefaultRefreshFooterCreator { context: Context, layout: RefreshLayout ->
                layout.setPrimaryColorsId(R.color.app_theme_color, android.R.color.white)
                val footer = BallPulseFooter(context)
                footer.setBackgroundColor(Color.TRANSPARENT)
                footer.setAnimatingColor(context.resources.getColor(R.color.app_theme_color))
                footer.setNormalColor(Color.TRANSPARENT)
                footer
            }
        }

        @JvmStatic
        var iScreenHeight = 0
        @JvmStatic
        var iScreenWidth = 0
        @JvmStatic
        var iStatusBarHeight = 0
        @JvmStatic
        var iNavigationBarHeight = 0
    }

    //region 生命周期
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        initLayout()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initLayout()
    }

    var isStart = false
    override fun onStart() {
        super.onStart()
        isStart = true
    }

    var isResumed = false
    override fun onResume() {
        super.onResume()
        isResumed = true
        if(bIsInitView){
            onInitLazy()
        }
    }

    override fun onPause() {
        super.onPause()
        isResumed = false
    }

    override fun onStop() {
        super.onStop()
        isStart = false
    }

    override fun onDestroy() {
        super.onDestroy()
        mHandler?.removeCallbacksAndMessages(null)
    }
    //endregion

    //region 初始化
    open fun getContext():Context = this@BaseActivity
    open fun getActivity():BaseActivity = this@BaseActivity

    open fun hasTitleBar(): Boolean = true
    private var titleBarView: TitleBarView? = null
    open fun getTitleBar():TitleBarView {
        if(titleBarView==null){
            titleBarView = TitleBarView(this)
            titleBarView?.id = R.id.cl_title_bar
        }
        return titleBarView?:(Object() as TitleBarView)
    }

    open fun hasStatusBar(): Boolean = true
    private var vStatusBar: View? = null
    open fun getStatusBar():View {
        if(vStatusBar==null){
            vStatusBar = View(this)
            vStatusBar?.id = android.R.id.statusBarBackground
        }
        return vStatusBar?:(Object() as View)
    }

    open fun hasRefreshBar(): Boolean = false
    private var refreshBar : SmartRefreshLayout? = null
    open fun getRefreshBar():SmartRefreshLayout {
        if(refreshBar==null){
            refreshBar = SmartRefreshLayout(this)
            refreshBar?.setOnRefreshListener(this)
            refreshBar?.setOnLoadMoreListener(this)
        }
        return refreshBar?:(Object() as SmartRefreshLayout)
    }

    override fun onRefresh(refreshLayout: RefreshLayout) {

    }

    override fun onLoadMore(refreshLayout: RefreshLayout) {

    }

    @LayoutRes
    open fun getContentViewResId(): Int {
        return this.javaClass.getAnnotation(LayoutResId::class.java)?.value?: View.NO_ID
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
        mHandler?.post { onBindView(window.decorView.findViewById(R.id.content)) }
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

    protected open fun onBindView(vContent: View) {}
    private var bIsInitLayout = false
    private fun initLayout() {
        if (bIsInitLayout) return
        bIsInitLayout = true
        mHandler = Handler()
        if(iScreenHeight ==0){
            val outMetrics = DisplayMetrics()
            windowManager.defaultDisplay.getMetrics(outMetrics)
            iScreenWidth = outMetrics.widthPixels
            iScreenHeight = outMetrics.heightPixels
            iStatusBarHeight = StatusBarUtil.getStatusBarHeight(this)
            iNavigationBarHeight = StatusBarUtil.getNavigationBarHeightIfHas(this)
        }
        setContentView(getContentViewResId())
    }

    override fun setContentView(layoutResID: Int) {
        if(layoutResID == View.NO_ID) return
        initSystemBarTint()
        StatusBarUtil.setLightStatusBar(this, getForegroundStatusBarColor(), true)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        var parent : ViewGroup = ConstraintLayout(this)
        var topId = android.R.id.statusBarBackground
        parent.addView(getStatusBar(),
                object :ConstraintLayout.LayoutParams(-1,if(hasStatusBar()) iStatusBarHeight else 0){
                    init {
                        verticalBias = 0f
                        topToTop = 0
                        leftToLeft = 0
                        rightToRight = 0
                        bottomToBottom = 0
                    }
                })
        if(hasTitleBar()){
            parent.addView(getTitleBar(),
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
        val content = LayoutInflater.from(this).inflate(layoutResID,null)
        if(hasRefreshBar()){
            parent.addView(getRefreshBar(),object : ConstraintLayout.LayoutParams(-1,0){
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
            parent.addView(content,object : ConstraintLayout.LayoutParams(-1,0){
                init {
                    topToBottom = topId
                    leftToLeft = 0
                    rightToRight = 0
                    bottomToBottom = 0
                }
            })
        }
        setContentView(parent)
    }

    override fun setContentView(view: View?) {
        super.setContentView(view)
        onInitView()
    }

    override fun setContentView(view: View?, params: ViewGroup.LayoutParams?) {
        super.setContentView(view, params)
        onInitView()
    }
    //endregion

    //region 软键盘
    open fun hideKeyboard() { //隐藏软键盘
        try {
            (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        } catch (e: Exception) {
            if (BuildConfig.DEBUG) Log.e("HideInput", e.message)
        }
    }

    protected var inputManager: InputMethodManager? = null
    open fun showKeyboard(v: View) { //获取焦点并且显示输入法
        try {
            v.clearFocus()
        } catch (e: Exception) {
        }
        try {
            v.isFocusable = true
        } catch (e: Exception) {
        }
        try {
            v.isFocusableInTouchMode = true
        } catch (e: Exception) {
        }
        try {
            v.requestFocus()
        } catch (e: Exception) {
        }
        if (inputManager == null) inputManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        if (v.hasFocus()) inputManager!!.toggleSoftInput(0, 0)
        if (v.hasFocus()) inputManager!!.showSoftInput(v, InputMethodManager.SHOW_IMPLICIT)
    }

    /**监听软键盘动态调整布局高度 */
    interface OnKeyBoardLayoutStateChangeListener {
        fun onKeyBoardShow(keyBoardHeight: Int, gapHeight: Int)
        fun onKeyBoardHide()
    }

    var _onKeyBoardLayoutStateChangeListener: OnKeyBoardLayoutStateChangeListener ? = null
    var onGlobalLayoutListener: OnGlobalLayoutListener? = null
    var rect = Rect()
    var bInited = false
    var bLastVisibelState = false
    var gapHeight = 0
    fun setOnKeyBoardLayoutStateChangeListener(
            keyBoardLayoutStateChangeListener: OnKeyBoardLayoutStateChangeListener?) {
        removeOnKeyBoardLayoutStateChangeListener()
        _onKeyBoardLayoutStateChangeListener = keyBoardLayoutStateChangeListener
        if (keyBoardLayoutStateChangeListener == null) return
        val decorView = window.decorView
        decorView.viewTreeObserver.addOnGlobalLayoutListener(object : OnGlobalLayoutListener {
            override fun onGlobalLayout() {
                val listener: OnGlobalLayoutListener = this
                decorView.viewTreeObserver.removeOnGlobalLayoutListener(listener)
                window.decorView.postDelayed({
                    //可能不会实时获取到，故作延时，否则可能导致判断出错
                    //获取当前根视图在屏幕上显示的大小
                    decorView.getWindowVisibleDisplayFrame(rect)
                    //计算出可见屏幕的高度
                    val displayHight = rect.bottom - rect.top
                    //获得屏幕整体的高度
                    val hight = decorView.height
                    //获得键盘高度
                    val keyboardHeight = hight - displayHight
                    val visible = displayHight.toDouble() / hight < 0.8
                    if (!visible) gapHeight = hight - displayHight
                    if (!bInited || visible != bLastVisibelState) {
                        window.decorView.post {
                            if (visible) {
                                try {
                                    keyBoardLayoutStateChangeListener.onKeyBoardShow(keyboardHeight, gapHeight)
                                } catch (e: Exception) {
                                }
                            } else {
                                try {
                                    keyBoardLayoutStateChangeListener.onKeyBoardHide()
                                } catch (e: Exception) {
                                }
                            }
                        }
                        bInited = true
                        bLastVisibelState = visible
                    }
                    window.decorView.postDelayed({
                        decorView?.viewTreeObserver?.addOnGlobalLayoutListener(listener)
                    },
                            80L)
                }, 100L)
            }
        }.also { onGlobalLayoutListener = it })
    }

    protected open fun removeOnKeyBoardLayoutStateChangeListener() {
        if (_onKeyBoardLayoutStateChangeListener != null && onGlobalLayoutListener != null) window.decorView.viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener)
    }
    //endregion

    //region 状态栏
    /** 获取主题色  */
    protected open fun getColorPrimary(): Int {
        val typedValue = TypedValue()
        theme.resolveAttribute(R.attr.colorPrimary, typedValue, true)
        return typedValue.data
    }

    /** 子类可以重写改变状态栏背景颜色  */
    @ColorInt
    protected open fun setBackgroundStatusBarColor(): Int {
        return getColorPrimary()
    }

    /**
     * 子类可以重写改变状态栏前景颜色
     * return 是否是黑色前景字体图标颜色
     */
    protected open fun getForegroundStatusBarColor(): Boolean {
        return true
    }

    /** 子类可以重写决定是否使用透明状态栏  */
    protected open fun translucentStatusBar(): Boolean {
        return true
    }

    /** 设置状态栏颜色  */
    protected open fun initSystemBarTint() {
        val window = window
        if (translucentStatusBar()) {
            // 设置状态栏全透明
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                window.statusBarColor = Color.TRANSPARENT
                window.navigationBarColor = Color.parseColor(if (getForegroundStatusBarColor()) "#000000" else "#ffffff")
            } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                val tintManager = SystemBarTintManager(this)
                tintManager.setNavigationBarTintColor(Color.parseColor(if (getForegroundStatusBarColor()) "#000000" else "#ffffff"))
            }
            return
        }
        // 沉浸式状态栏
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            //5.0以上使用原生方法
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = setBackgroundStatusBarColor()
            window.navigationBarColor = Color.parseColor(if (getForegroundStatusBarColor()) "#000000" else "#ffffff")
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //4.4-5.0使用三方工具类，有些4.4的手机有问题，这里为演示方便，不使用沉浸式
//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            val tintManager = SystemBarTintManager(this)
            tintManager.setStatusBarTintEnabled(true)
            tintManager.setNavigationBarTintColor(Color.parseColor(if (getForegroundStatusBarColor()) "#000000" else "#ffffff"))
            tintManager.setStatusBarTintColor(setBackgroundStatusBarColor())
        } else {
            if (getForegroundStatusBarColor()) {
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            } else {
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            }
        }
    }
    //endregion

    //region 参数
    private val paramsManager: MutableMap<Long, Any> = HashMap()
    private var lParamsId: Long = 0
    protected open fun putParams(param: Any): Long {
        val id = ++lParamsId
        paramsManager[id] = param
        return id
    }

    protected open fun getParams(id: Long): Any? {
        return paramsManager[id]
    }

    protected open fun releasePamrams(id: Long) {
        paramsManager.remove(id)
    }

    protected open fun isPreLoadMode(): Boolean {
        return false
    }
    //endregion

    //region 权限、启动参数处理
    fun startActivity(@NonNull routerKey:String,
                      bindData: Bundle = Bundle(),
                      flags:Int = -1){
        startActivity(RouterManager.match(routerKey),bindData, flags)
    }

    fun startActivity(@NonNull clz: Class<*>,
                      bindData: Bundle = Bundle(),
                      flags:Int = -1) {
        startActivity(object :Intent(this, clz){
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
                               callBack: OnActivityResultItemCallBack?=null){
        startActivityForResult(RouterManager.match(routerKey),bindData, requestCode, flags, callBack)
    }

    fun startActivityForResult(clz: Class<*>,
                               bindData: Bundle = Bundle(),
                               requestCode: Int = getNextRequestCode(),
                               flags:Int = -1,
                               callBack: OnActivityResultItemCallBack?=null) {
        callBack?.let { mapResultCallbacks[requestCode] = it }
        startActivityForResult(object :Intent(this, clz){
            init {
                putExtras(bindData)
                if(flags!=-1){
                    addFlags(flags)
                }
            }
        }, requestCode)
    }

    private var _requestCodeGennerator = 0x7fff
    private fun getNextRequestCode(): Int {
        return ++_requestCodeGennerator % 0x7fff + 0x7fff
    }

    val mapResultCallbacks: MutableMap<Int, OnActivityResultItemCallBack> = HashMap()
    val setOnActivityResultCallBacks: MutableSet<OnActivityResultCallBack> = HashSet()

    interface OnActivityResultCallBack {
        fun OnActivityResult(requestCode: Int, resultCode: Int, data: Intent?): Boolean
    }

    interface OnActivityResultItemCallBack {
        fun OnActivityRequestResult(resultCode: Int, data: Intent?)
    }

    open fun registerOnActivityResultCallBack(callBack: OnActivityResultCallBack?) {
        if (callBack != null) {
            setOnActivityResultCallBacks.add(callBack)
        }
    }

    open fun unregisterOnActivityResultCallBack(callBack: OnActivityResultCallBack?) {
        if (callBack != null) {
            setOnActivityResultCallBacks.remove(callBack)
        }
    }

    open fun hasPermision(permissionToCheck: String?): Boolean {
        return PackageManager.PERMISSION_GRANTED == ContextCompat.checkSelfPermission(this, permissionToCheck!!)
    }

    private var permissionResultListener: EasyPermission.PermissionResultListener? = null
    private var requestedPermission: String? = null

    open fun requestPermission(permission: String, listener: EasyPermission.PermissionResultListener) {
        permissionResultListener = listener
        requestedPermission = permission
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, permission)) {
            ActivityCompat.requestPermissions(this, arrayOf<String?>(permission), 1 shl 15)
        } else if (!hasPermision(permission)) {
            ActivityCompat.requestPermissions(this, arrayOf<String?>(permission), 1 shl 15)
        } else {
            permissionResultListener?.onPermissionGranted()
            permissionResultListener = null
            requestedPermission = null
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        for (callBack in setOnActivityResultCallBacks) {
            if (callBack.OnActivityResult(requestCode, resultCode, data)) {
                return  //是否拦截此次事件
            }
        }
        if (requestCode == 1 shl 15 && permissionResultListener != null) {
            if (hasPermision(requestedPermission))
                permissionResultListener?.onPermissionGranted()
            else
                permissionResultListener?.onPermissionDenied()
            permissionResultListener = null
            requestedPermission = null
            return
        }
        val callBack = mapResultCallbacks[requestCode]
        if (callBack != null) {
            callBack.OnActivityRequestResult(resultCode, data)
            mapResultCallbacks.remove(requestCode)
            return  //中断子类的onActivityResult执行
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1 shl 15 && permissionResultListener != null) {
            if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                permissionResultListener?.onPermissionGranted()
            else
                permissionResultListener?.onPermissionDenied()
            permissionResultListener = null
            requestedPermission = null
            return
        }
    }
    //endregion
}