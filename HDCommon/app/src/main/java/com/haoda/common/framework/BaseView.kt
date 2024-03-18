package com.haoda.common.framework

import com.haoda.common.BaseApp
import com.haoda.common.core.Handler
import com.haoda.common.tools.TipsDialog
import com.haoda.common.utils.ToastUtils

interface BaseView {

    fun toast(message:String){
        Handler.post{ToastUtils.show(message)}
    }

    fun toastCenter(message:String){
        Handler.post{ToastUtils.showCenter(message)}
    }

    fun showWaitDialog(){
        Handler.post{TipsDialog.createDialog(BaseApp.getCurActivity()).show()}
    }

    fun dissmissWaitDialog(){
        Handler.post{TipsDialog.dismissDialog()}
    }
}