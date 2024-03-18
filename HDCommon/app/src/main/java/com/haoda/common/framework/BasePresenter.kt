package com.haoda.common.framework

import com.haoda.common.base.BaseFragment
import java.util.HashMap

abstract class BasePresenter {

    var mView:BaseView?= null
    fun attachView(baseView:BaseView){
        mView = baseView
    }

    fun onDestroy(){
        releaseInstance(this.javaClass)
    }

    companion object{
        //region 单例模式
        private val intances: MutableMap<Class<*>, BasePresenter?> = HashMap()
        private operator fun <T : BasePresenter?> get(target: Class<T>): T? {
            synchronized(target) { return intances[target] as T? }
        }

        open fun <T : BasePresenter?> getInstance(target: Class<T>): T {
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
            return instance ?: Object() as T
        }

        open fun releaseInstance(target: Class<in BasePresenter>) {
            synchronized(target) { intances.remove(target) }
        }
        //endregion
    }

}