package com.haoda.common.net.service.console.rate

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface RateDataSourceWrapper {
	fun <T:BaseResult<Void>> detail_25Rate(id:String):Flowable<T> {
		return ApiEngine.getService(RateService::class.java)
			.detail_25Rate<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_21Rate(memberRate:String,oneroyaltyRate:String,paltformRate:String,tworoyaltyRate:String):Flowable<T> {
		return ApiEngine.getService(RateService::class.java)
			.save_21Rate<T>(memberRate,oneroyaltyRate,paltformRate,tworoyaltyRate)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> list_6Rate():Flowable<T> {
		return ApiEngine.getService(RateService::class.java)
			.list_6Rate<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_21Rate(id:String?,memberRate:String?,oneroyaltyRate:String?,paltformRate:String?,tworoyaltyRate:String?):Flowable<T> {
		return ApiEngine.getService(RateService::class.java)
			.update_21Rate<T>(id,memberRate,oneroyaltyRate,paltformRate,tworoyaltyRate)
			.compose(RxSchedulers.io_main())
	}

}