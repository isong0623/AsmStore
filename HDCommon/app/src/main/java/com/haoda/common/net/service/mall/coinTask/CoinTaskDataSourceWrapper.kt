package com.haoda.common.net.service.mall.coinTask

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface CoinTaskDataSourceWrapper {
	fun <T:BaseResult<Void>> signLogCoinTask():Flowable<T> {
		return ApiEngine.getService(CoinTaskService::class.java)
			.signLogCoinTask<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getAppCoinTaskListCoinTask():Flowable<T> {
		return ApiEngine.getService(CoinTaskService::class.java)
			.getAppCoinTaskListCoinTask<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> completeCoinTask(id:String?):Flowable<T> {
		return ApiEngine.getService(CoinTaskService::class.java)
			.completeCoinTask<T>(id)
			.compose(RxSchedulers.io_main())
	}

}