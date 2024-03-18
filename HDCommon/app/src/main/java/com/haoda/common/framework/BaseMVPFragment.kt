package com.haoda.common.framework

import com.haoda.common.base.BaseFragment

//@Presenter(BasePresenter::class)
@Suppress("LeakingThis")
open abstract class BaseMVPFragment<T:BasePresenter> : BaseFragment() , BaseView {
    private val mPresenter:T = BasePresenter.getInstance((this.javaClass.getAnnotation(Presenter::class.java)?.value as Any).javaClass as Class<T>)
    init {
        mPresenter.attachView(baseView = this)
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.onDestroy()
    }
}