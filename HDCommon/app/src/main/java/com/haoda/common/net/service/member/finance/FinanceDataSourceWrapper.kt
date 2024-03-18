package com.haoda.common.net.service.member.finance

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface FinanceDataSourceWrapper {
	fun <T:BaseResult<Void>> auditStatusFinance(auditId:String,auditState:String):Flowable<T> {
		return ApiEngine.getService(FinanceService::class.java)
			.auditStatusFinance<T>(auditId,auditState)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> reconciliationManagementFinance(pageNum:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(FinanceService::class.java)
			.reconciliationManagementFinance<T>(pageNum,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> wechatAuditStatusFinance(auditId:String,auditState:String):Flowable<T> {
		return ApiEngine.getService(FinanceService::class.java)
			.wechatAuditStatusFinance<T>(auditId,auditState)
			.compose(RxSchedulers.io_main())
	}

}