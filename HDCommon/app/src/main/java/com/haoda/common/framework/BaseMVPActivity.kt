package com.haoda.common.framework

import com.haoda.common.base.BaseActivity

//@Presenter(BasePresenter::class)
@Suppress("LeakingThis")
open abstract class BaseMVPActivity<T:BasePresenter> : BaseActivity(), BaseView {
    private val mPresenter:T = BasePresenter.getInstance((this.javaClass.getAnnotation(Presenter::class.java)?.value as Any).javaClass as Class<T>)
    init {
        mPresenter.attachView(baseView = this)
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.onDestroy()
    }
}