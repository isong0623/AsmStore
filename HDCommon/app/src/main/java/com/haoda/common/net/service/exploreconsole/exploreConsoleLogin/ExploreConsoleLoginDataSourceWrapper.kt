package com.haoda.common.net.service.exploreconsole.exploreConsoleLogin

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface ExploreConsoleLoginDataSourceWrapper {
	fun <T:BaseResult<Void>> logoutExploreConsoleLogin():Flowable<T> {
		return ApiEngine.getService(ExploreConsoleLoginService::class.java)
			.logoutExploreConsoleLogin<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> loginExploreConsoleLogin(password:String,userName:String):Flowable<T> {
		return ApiEngine.getService(ExploreConsoleLoginService::class.java)
			.loginExploreConsoleLogin<T>(password,userName)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> currentUserExploreConsoleLogin():Flowable<T> {
		return ApiEngine.getService(ExploreConsoleLoginService::class.java)
			.currentUserExploreConsoleLogin<T>()
			.compose(RxSchedulers.io_main())
	}

}