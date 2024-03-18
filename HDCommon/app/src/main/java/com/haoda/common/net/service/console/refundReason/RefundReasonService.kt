package com.haoda.common.net.service.console.refundReason

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface RefundReasonService : BaseService{
	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_22_REFUND_REASON_Url)
	fun <T:BaseResult<Void>> update_22RefundReason(
		@Field("id") @Description("id") id:String,
		@Field("reasonDesc") @Description("退货原因描述（非必须参数）") reasonDesc:String?,
		@Field("sort") @Description("排序（非必须参数）") sort:String?,
		@Field("status") @Description("状态（0->停用1->正常）（非必须参数）") status:String?
	):  Flowable<T>


	@Description("启用")
	@FormUrlEncoded
	@POST(Constants.API.START_USE_7REFUND_REASON_Url)
	fun <T:BaseResult<Void>> startUse_7RefundReason(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_26_REFUND_REASON_Url)
	fun <T:BaseResult<Void>> detail_26RefundReason(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("停用")
	@FormUrlEncoded
	@POST(Constants.API.STOP_USE_7REFUND_REASON_Url)
	fun <T:BaseResult<Void>> stopUse_7RefundReason(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_22_REFUND_REASON_Url)
	fun <T:BaseResult<Void>> save_22RefundReason(
		@Field("reasonDesc") @Description("退货原因描述") reasonDesc:String,
		@Field("sort") @Description("排序") sort:String,
		@Field("status") @Description("状态（0->停用1->正常）") status:String
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_19_REFUND_REASON_Url)
	fun <T:BaseResult<Void>> delete_19RefundReason(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_27_REFUND_REASON_Url)
	fun <T:BaseResult<Void>> page_27RefundReason(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>

}