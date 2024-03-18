package com.haoda.common

import com.haoda.common.framework.BaseMVPActivity
import com.haoda.common.framework.BasePresenter
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.base.appVersion.AppVersionDataSourceImpl
import org.kotlin.annotationProcessor.Router

class MainActivity : BaseMVPActivity<BasePresenter>(){
    override fun hasTitleBar(): Boolean = false
    override fun getContentViewResId(): Int = R.layout.activity_common_main

    init {
        val a = AppVersionDataSourceImpl()
        a.detailAppVersion<BaseResult<Void>>("",{})
    }
}