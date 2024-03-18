package com.haoda.common.net.service.mall.productShare

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface ProductShareDataSourceWrapper {
	fun <T:BaseResult<Void>> shareProductShare(productId:String):Flowable<T> {
		return ApiEngine.getService(ProductShareService::class.java)
			.shareProductShare<T>(productId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> shareSuccessProductShare(id:String,secretCode:String,shareType:String):Flowable<T> {
		return ApiEngine.getService(ProductShareService::class.java)
			.shareSuccessProductShare<T>(id,secretCode,shareType)
			.compose(RxSchedulers.io_main())
	}

}