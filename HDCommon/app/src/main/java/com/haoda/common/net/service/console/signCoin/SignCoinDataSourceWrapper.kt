package com.haoda.common.net.service.console.signCoin

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface SignCoinDataSourceWrapper {
	fun <T:BaseResult<Void>> delete_21SignCoin(id:String):Flowable<T> {
		return ApiEngine.getService(SignCoinService::class.java)
			.delete_21SignCoin<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_24SignCoin(continuousSum:String,copperCoin:String?,copperCoinExtra:String,weekDay:String):Flowable<T> {
		return ApiEngine.getService(SignCoinService::class.java)
			.save_24SignCoin<T>(continuousSum,copperCoin,copperCoinExtra,weekDay)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_28SignCoin(id:String):Flowable<T> {
		return ApiEngine.getService(SignCoinService::class.java)
			.detail_28SignCoin<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> list_7SignCoin():Flowable<T> {
		return ApiEngine.getService(SignCoinService::class.java)
			.list_7SignCoin<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_24SignCoin(continuousSum:String?,copperCoin:String?,copperCoinExtra:String?,id:String,weekDay:String?):Flowable<T> {
		return ApiEngine.getService(SignCoinService::class.java)
			.update_24SignCoin<T>(continuousSum,copperCoin,copperCoinExtra,id,weekDay)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_29SignCoin(currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(SignCoinService::class.java)
			.page_29SignCoin<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}

}