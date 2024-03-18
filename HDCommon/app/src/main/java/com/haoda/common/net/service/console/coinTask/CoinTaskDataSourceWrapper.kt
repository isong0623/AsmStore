package com.haoda.common.net.service.console.coinTask

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface CoinTaskDataSourceWrapper {
	fun <T:BaseResult<Void>> delete_1CoinTask(id:String):Flowable<T> {
		return ApiEngine.getService(CoinTaskService::class.java)
			.delete_1CoinTask<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_1CoinTask(currentPage:String,name:String?,pageSize:String?,type:String?):Flowable<T> {
		return ApiEngine.getService(CoinTaskService::class.java)
			.page_1CoinTask<T>(currentPage,name,pageSize,type)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_1CoinTask(id:String):Flowable<T> {
		return ApiEngine.getService(CoinTaskService::class.java)
			.detail_1CoinTask<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_1CoinTask(copperCoin:String,description:String,endTime:String,finishCount:String,name:String,sort:String,startTime:String,status:String,taskCount:String,type:String):Flowable<T> {
		return ApiEngine.getService(CoinTaskService::class.java)
			.save_1CoinTask<T>(copperCoin,description,endTime,finishCount,name,sort,startTime,status,taskCount,type)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_1CoinTask(copperCoin:String?,description:String?,endTime:String?,finishCount:String?,id:String,name:String?,sort:String?,startTime:String?,status:String?,taskCount:String?,type:String?):Flowable<T> {
		return ApiEngine.getService(CoinTaskService::class.java)
			.update_1CoinTask<T>(copperCoin,description,endTime,finishCount,id,name,sort,startTime,status,taskCount,type)
			.compose(RxSchedulers.io_main())
	}

}