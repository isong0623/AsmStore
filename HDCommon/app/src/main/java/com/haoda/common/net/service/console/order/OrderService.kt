package com.haoda.common.net.service.console.order

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface OrderService : BaseService{
	@Description("订单详细信息")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_13_ORDER_Url)
	fun <T:BaseResult<Void>> detail_13Order(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("订单快递信息")
	@FormUrlEncoded
	@POST(Constants.API.ORDER_EXPRESS_INFO_ORDER_Url)
	fun <T:BaseResult<Void>> orderExpressInfoOrder(
		@Field("id") @Description("=订单ID") id:String
	):  Flowable<T>


	@Description("订单快递信息")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_ORDER_DELIVERY_ORDER_Url)
	fun <T:BaseResult<Void>> updateOrderDeliveryOrder(
		@Field("note") @Description("订单备注（非必须参数）") note:String?,
		@Field("orderId") @Description("订单ID") orderId:String,
		@Field("receiverCity") @Description("城市（非必须参数）") receiverCity:String?,
		@Field("receiverDetailAddress") @Description("详细地址（非必须参数）") receiverDetailAddress:String?,
		@Field("receiverName") @Description("收货人姓名（非必须参数）") receiverName:String?,
		@Field("receiverPhone") @Description("收货人电话（非必须参数）") receiverPhone:String?,
		@Field("receiverPostCode") @Description("收货人邮编（非必须参数）") receiverPostCode:String?,
		@Field("receiverProvince") @Description("省份/直辖市（非必须参数）") receiverProvince:String?,
		@Field("receiverRegion") @Description("区（非必须参数）") receiverRegion:String?
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_15_ORDER_Url)
	fun <T:BaseResult<Void>> page_15Order(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("endSubmitTime") @Description("订单提交时间（非必须参数）") endSubmitTime:String?,
		@Field("memberId") @Description("会员id（非必须参数）") memberId:String?,
		@Field("mobile") @Description("会员手机（非必须参数）") mobile:String?,
		@Field("nickname") @Description("会员昵称（非必须参数）") nickname:String?,
		@Field("orderNo") @Description("订单编号（非必须参数）") orderNo:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("startSubmitTime") @Description("订单提交时间（非必须参数）") startSubmitTime:String?,
		@Field("status") @Description("订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单（非必须参数）") status:String?
	):  Flowable<T>


	@Description("订单发货")
	@FormUrlEncoded
	@POST(Constants.API.ORDER_DELIVER_ORDER_Url)
	fun <T:BaseResult<Void>> orderDeliverOrder(
		@Field("deliveryCompany") @Description("快递公司编号") deliveryCompany:String,
		@Field("deliverySn") @Description("快递单号") deliverySn:String,
		@Field("orderId") @Description("=订单ID") orderId:String
	):  Flowable<T>

}