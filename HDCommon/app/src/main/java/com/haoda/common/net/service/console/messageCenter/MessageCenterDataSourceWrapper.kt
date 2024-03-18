package com.haoda.common.net.service.console.messageCenter

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface MessageCenterDataSourceWrapper {
	fun <T:BaseResult<Void>> pushMessageMessageCenter():Flowable<T> {
		return ApiEngine.getService(MessageCenterService::class.java)
			.pushMessageMessageCenter<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> pushPromotionMessageCenter():Flowable<T> {
		return ApiEngine.getService(MessageCenterService::class.java)
			.pushPromotionMessageCenter<T>()
			.compose(RxSchedulers.io_main())
	}

}