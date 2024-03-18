package com.haoda.common.net.service.member.finance

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface FinanceService : BaseService{
	@Description("银行卡对账状态")
	@FormUrlEncoded
	@POST(Constants.API.AUDIT_STATUS_FINANCE_Url)
	fun <T:BaseResult<Void>> auditStatusFinance(
		@Field("auditId") @Description("该条记录的Id") auditId:String,
		@Field("auditState") @Description("当前操作的状态，1-审核中，2-审核成功，3-完成") auditState:String
	):  Flowable<T>


	@Description("财务对账数据")
	@FormUrlEncoded
	@POST(Constants.API.RECONCILIATION_MANAGEMENT_FINANCE_Url)
	fun <T:BaseResult<Void>> reconciliationManagementFinance(
		@Field("pageNum") @Description("pageNum（非必须参数）") pageNum:String?,
		@Field("pageSize") @Description("pageSize（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("微信对账状态")
	@FormUrlEncoded
	@POST(Constants.API.WECHAT_AUDIT_STATUS_FINANCE_Url)
	fun <T:BaseResult<Void>> wechatAuditStatusFinance(
		@Field("auditId") @Description("该条记录的Id") auditId:String,
		@Field("auditState") @Description("当前操作的状态，1-审核中，2-审核成功，同意打款") auditState:String
	):  Flowable<T>

}