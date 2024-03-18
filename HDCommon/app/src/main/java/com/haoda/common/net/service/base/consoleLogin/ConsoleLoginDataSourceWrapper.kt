package com.haoda.common.net.service.base.consoleLogin

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface ConsoleLoginDataSourceWrapper {
	fun <T:BaseResult<Void>> loginConsoleLogin(password:String,userName:String):Flowable<T> {
		return ApiEngine.getService(ConsoleLoginService::class.java)
			.loginConsoleLogin<T>(password,userName)
			.compose(RxSchedulers.io_main())
	}

}