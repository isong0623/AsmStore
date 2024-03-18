package com.haoda.common.net.service.exploreconsole.test

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface TestDataSourceWrapper {
	fun <T:BaseResult<Void>> detailUsingGETTest():Flowable<T> {
		return ApiEngine.getService(TestService::class.java)
			.detailUsingGETTest<T>()
			.compose(RxSchedulers.io_main())
	}

}