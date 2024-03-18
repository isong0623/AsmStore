package com.haoda.common.net.service.console.orderRefundApplay

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface OrderRefundApplayService : BaseService{
	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_15_ORDER_REFUND_APPLAY_Url)
	fun <T:BaseResult<Void>> detail_15OrderRefundApplay(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("申请拒绝")
	@FormUrlEncoded
	@POST(Constants.API.APPLAY_NOT_AGREE_ORDER_REFUND_APPLAY_Url)
	fun <T:BaseResult<Void>> applayNotAgreeOrderRefundApplay(
		@Field("id") @Description("主键") id:String,
		@Field("prodessDesc") @Description("处理备注（非必须参数）") prodessDesc:String?
	):  Flowable<T>


	@Description("申请通过")
	@FormUrlEncoded
	@POST(Constants.API.APPLAY_AGREE_ORDER_REFUND_APPLAY_Url)
	fun <T:BaseResult<Void>> applayAgreeOrderRefundApplay(
		@Field("id") @Description("主键") id:String,
		@Field("prodessDesc") @Description("处理备注（非必须参数）") prodessDesc:String?,
		@Field("receiveAddress") @Description("收货地址") receiveAddress:String,
		@Field("receiveMobile") @Description("收货人电话") receiveMobile:String,
		@Field("receivePerson") @Description("收货人") receivePerson:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_17_ORDER_REFUND_APPLAY_Url)
	fun <T:BaseResult<Void>> page_17OrderRefundApplay(
		@Field("applayNo") @Description("退货单号（非必须参数）") applayNo:String?,
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("refundStatus") @Description("状态（1->待处理2->退货中3->已完成4->申请拒绝5->退款拒绝）（非必须参数）") refundStatus:String?
	):  Flowable<T>


	@Description("同意退款")
	@FormUrlEncoded
	@POST(Constants.API.REFUND_AGREE_ORDER_REFUND_APPLAY_Url)
	fun <T:BaseResult<Void>> refundAgreeOrderRefundApplay(
		@Field("id") @Description("主键") id:String
	):  Flowable<T>


	@Description("拒绝退款")
	@FormUrlEncoded
	@POST(Constants.API.REFUND_NOT_AGREE_ORDER_REFUND_APPLAY_Url)
	fun <T:BaseResult<Void>> refundNotAgreeOrderRefundApplay(
		@Field("id") @Description("主键") id:String,
		@Field("prodessDesc") @Description("处理备注（非必须参数）") prodessDesc:String?
	):  Flowable<T>

}