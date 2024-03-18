package com.haoda.common.net.service.mall.appraise

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface AppraiseDataSourceWrapper {
	fun <T:BaseResult<Void>> pageAppraise(currentPage:String,pageSize:String?,productId:String,queryFlag:String?):Flowable<T> {
		return ApiEngine.getService(AppraiseService::class.java)
			.pageAppraise<T>(currentPage,pageSize,productId,queryFlag)
			.compose(RxSchedulers.io_main())
	}

}