package com.haoda.common.net.service.console.analysis

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface AnalysisDataSourceWrapper {
	fun <T:BaseResult<Void>> newAddSum_1Analysis(endTime:String,startTime:String,type:String):Flowable<T> {
		return ApiEngine.getService(AnalysisService::class.java)
			.newAddSum_1Analysis<T>(endTime,startTime,type)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> newAddNumAnalysis(endTime:String,startTime:String,type:String):Flowable<T> {
		return ApiEngine.getService(AnalysisService::class.java)
			.newAddNumAnalysis<T>(endTime,startTime,type)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> newAddConsumerAnalysis(endTime:String,startTime:String,type:String):Flowable<T> {
		return ApiEngine.getService(AnalysisService::class.java)
			.newAddConsumerAnalysis<T>(endTime,startTime,type)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> doneConsumerAnalysis(endTime:String,startTime:String,type:String):Flowable<T> {
		return ApiEngine.getService(AnalysisService::class.java)
			.doneConsumerAnalysis<T>(endTime,startTime,type)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> doneNumAnalysis(endTime:String,startTime:String,type:String):Flowable<T> {
		return ApiEngine.getService(AnalysisService::class.java)
			.doneNumAnalysis<T>(endTime,startTime,type)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> overviewAnalysis(endTime:String,startTime:String):Flowable<T> {
		return ApiEngine.getService(AnalysisService::class.java)
			.overviewAnalysis<T>(endTime,startTime)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> ordersAnalysis():Flowable<T> {
		return ApiEngine.getService(AnalysisService::class.java)
			.ordersAnalysis<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> doneSumAnalysis(endTime:String,startTime:String,type:String):Flowable<T> {
		return ApiEngine.getService(AnalysisService::class.java)
			.doneSumAnalysis<T>(endTime,startTime,type)
			.compose(RxSchedulers.io_main())
	}

}