package com.haoda.common.net.service.base.consoleIndex

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface ConsoleIndexDataSourceWrapper {
	fun <T:BaseResult<Void>> updatePasswordConsoleIndex(oldPassword:String,newPassword:String):Flowable<T> {
		return ApiEngine.getService(ConsoleIndexService::class.java)
			.updatePasswordConsoleIndex<T>(oldPassword,newPassword)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> currentUserConsoleIndex():Flowable<T> {
		return ApiEngine.getService(ConsoleIndexService::class.java)
			.currentUserConsoleIndex<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> logoutConsoleIndex():Flowable<T> {
		return ApiEngine.getService(ConsoleIndexService::class.java)
			.logoutConsoleIndex<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> menuConsoleIndex():Flowable<T> {
		return ApiEngine.getService(ConsoleIndexService::class.java)
			.menuConsoleIndex<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getCurrentUserPermissionsConsoleIndex():Flowable<T> {
		return ApiEngine.getService(ConsoleIndexService::class.java)
			.getCurrentUserPermissionsConsoleIndex<T>()
			.compose(RxSchedulers.io_main())
	}

}