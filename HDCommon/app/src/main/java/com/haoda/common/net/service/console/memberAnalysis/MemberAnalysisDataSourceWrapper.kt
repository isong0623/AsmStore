package com.haoda.common.net.service.console.memberAnalysis

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface MemberAnalysisDataSourceWrapper {
	fun <T:BaseResult<Void>> memberOverviewMemberAnalysis():Flowable<T> {
		return ApiEngine.getService(MemberAnalysisService::class.java)
			.memberOverviewMemberAnalysis<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> newAddSumMemberAnalysis(endTime:String,startTime:String,type:String):Flowable<T> {
		return ApiEngine.getService(MemberAnalysisService::class.java)
			.newAddSumMemberAnalysis<T>(endTime,startTime,type)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> memberSumMemberAnalysis(endTime:String,startTime:String,type:String):Flowable<T> {
		return ApiEngine.getService(MemberAnalysisService::class.java)
			.memberSumMemberAnalysis<T>(endTime,startTime,type)
			.compose(RxSchedulers.io_main())
	}

}