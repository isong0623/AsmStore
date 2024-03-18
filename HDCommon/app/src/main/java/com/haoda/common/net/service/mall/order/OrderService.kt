package com.haoda.common.net.service.mall.order

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface OrderService : BaseService{
	@Description("VIP购买订单支付成功，给用户添加会员")
	@FormUrlEncoded
	@POST(Constants.API.ADD_MEMBER_VIP_ORDER_Url)
	fun <T:BaseResult<Void>> addMemberVipOrder(
		@Field("orderId") @Description("会员订单ID") orderId:String,
		@Field("payAmount") @Description("实付金额") payAmount:String,
		@Field("payType") @Description("支付类型（1->支付宝2->微信3->微信小程序）") payType:String
	):  Flowable<T>


	@Description("立即购买确认订单")
	@FormUrlEncoded
	@POST(Constants.API.GET_ORDER_CHECK_BY_PRODUCT_ID_ORDER_Url)
	fun <T:BaseResult<Void>> getOrderCheckByProductIdOrder(
		@Field("productIdAndskuCodeAndQuantitys") @Description("商品ID和数量实例：{\"productId\":\"112\",\"quantity\":1,\"skuCode\":1\"productAttributeList\":\"[{\"attributeKey\":\"尺码\",\"attributeValue\":[\"xl\"]},{\"attributeKey\":\"颜色\",\"attributeValue\":[\"黑色\"]}]\"}") productIdAndskuCodeAndQuantitys:String
	):  Flowable<T>


	@Description("取消订单")
	@FormUrlEncoded
	@POST(Constants.API.MEMBER_ORDER_CANCEL_ORDER_Url)
	fun <T:BaseResult<Void>> memberOrderCancelOrder(
		@Field("orderId") @Description("orderId") orderId:String
	):  Flowable<T>


	@Description("2、商户后台下单（微信或者支付宝）（原订单支付）")
	@FormUrlEncoded
	@POST(Constants.API.ORDER_PAY_ORDER_Url)
	fun <T:BaseResult<Void>> orderPayOrder(
		@Field("orderId") @Description("订单ID") orderId:String,
		@Field("payAmount") @Description("实付金额") payAmount:String,
		@Field("payType") @Description("支付类型（1->支付宝2->微信3->微信小程序）") payType:String
	):  Flowable<T>


	@Description("查询支付结果")
	@FormUrlEncoded
	@POST(Constants.API.ORDER_PAY_RES_ORDER_Url)
	fun <T:BaseResult<Void>> orderPayResOrder(
		@Field("orderId") @Description("订单ID") orderId:String
	):  Flowable<T>


	@Description("获取订单快递信息")
	@FormUrlEncoded
	@POST(Constants.API.GET_EXPRESS_MESSAGE_ORDER_Url)
	fun <T:BaseResult<Void>> getExpressMessageOrder(
		@Field("orderId") @Description("orderId") orderId:String
	):  Flowable<T>


	@Description("购物车确认订单")
	@POST(Constants.API.GET_ORDER_CHECK_BY_CARTORDER_Url)
	fun <T:BaseResult<Void>> getOrderCheckByCartOrder(

	):  Flowable<T>


	@Description("获取订单优惠券")
	@FormUrlEncoded
	@POST(Constants.API.GET_ORDER_COUPONS_ORDER_Url)
	fun <T:BaseResult<Void>> getOrderCouponsOrder(
		@Field("productIdAndQuantitys") @Description("商品ID和数量数组实例：[{\"productId\":9,\"quantity\":1}]") productIdAndQuantitys:String
	):  Flowable<T>


	@Description("订单未评价商品列表")
	@FormUrlEncoded
	@POST(Constants.API.ORDER_NOT_APPRAISED_PRODUCT_LISTORDER_Url)
	fun <T:BaseResult<Void>> orderNotAppraisedProductListOrder(
		@Field("orderId") @Description("orderId") orderId:String
	):  Flowable<T>


	@Description("刷新确认订单信息")
	@FormUrlEncoded
	@POST(Constants.API.ORDER_CHECK_REFRESH_ORDER_Url)
	fun <T:BaseResult<Void>> orderCheckRefreshOrder(
		@Field("memberCouponId") @Description("用户优惠券ID（非必须参数）") memberCouponId:String?,
		@Field("productIdAndskuCodeAndQuantitys") @Description("商品ID和sku码和数量数组实例：[{\"productId\":9,\"skuCode\":1,\"quantity\":1}]") productIdAndskuCodeAndQuantitys:String
	):  Flowable<T>


	@Description("订单分页查询")
	@FormUrlEncoded
	@POST(Constants.API.APP_MEMBER_PAGE_ORDER_Url)
	fun <T:BaseResult<Void>> appMemberPageOrder(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("orderStatus") @Description("订单状态（99->全部0->待付款1->待发货2->待收货3->已完成）（非必须参数）") orderStatus:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("订单确认收货接口")
	@FormUrlEncoded
	@POST(Constants.API.RECEIVED_CONFIRM_ORDER_Url)
	fun <T:BaseResult<Void>> receivedConfirmOrder(
		@Field("orderId") @Description("orderId") orderId:String
	):  Flowable<T>


	@Description("订单详细信息")
	@FormUrlEncoded
	@POST(Constants.API.ORDER_DETAIL_ORDER_Url)
	fun <T:BaseResult<Void>> orderDetailOrder(
		@Field("orderId") @Description("orderId") orderId:String
	):  Flowable<T>


	@Description("删除订单信息")
	@FormUrlEncoded
	@POST(Constants.API.MEMBER_DELETE_ORDER_Url)
	fun <T:BaseResult<Void>> memberDeleteOrder(
		@Field("orderId") @Description("orderId") orderId:String
	):  Flowable<T>


	@Description("待付款订单重新付款")
	@FormUrlEncoded
	@POST(Constants.API.ORDER_SUBMIT_VIEW_ORDER_Url)
	fun <T:BaseResult<Void>> orderSubmitViewOrder(
		@Field("orderId") @Description("orderId（非必须参数）") orderId:String?
	):  Flowable<T>


	@Description("1、提交订单")
	@FormUrlEncoded
	@POST(Constants.API.ORDER_SUBMIT_ORDER_Url)
	fun <T:BaseResult<Void>> orderSubmitOrder(
		@Field("acturalPrice") @Description("实付金额") acturalPrice:String,
		@Field("memberCouponId") @Description("用户优惠券ID（非必须参数）") memberCouponId:String?,
		@Field("orderNote") @Description("订单备注（非必须参数）") orderNote:String?,
		@Field("productIdAndskuCodeAndQuantitys") @Description("商品ID和sku码和数量数组和商品属性实例：[{\"productId\":9,\"skuCode\":1,\"quantity\":1,\"productAttributeList\":\"[{\"attributeKey\":\"尺码\",\"attributeValue\":[\"xl\"]}]\"}]") productIdAndskuCodeAndQuantitys:String,
		@Field("receiveAddressId") @Description("用户收货地址ID") receiveAddressId:String,
		@Field("streamerId") @Description("主播id，不是从直播间购买的商品，不需要传（非必须参数）") streamerId:String?
	):  Flowable<T>


	@Description("提交购买vip订单")
	@FormUrlEncoded
	@POST(Constants.API.ORDER_VIP_SUBMIT_ORDER_Url)
	fun <T:BaseResult<Void>> orderVipSubmitOrder(
		@Field("acturalPrice") @Description("实付金额") acturalPrice:String,
		@Field("memberCouponId") @Description("用户优惠券ID（非必须参数）") memberCouponId:String?,
		@Field("orderNote") @Description("订单备注（非必须参数）") orderNote:String?,
		@Field("productIdAndQuantitys") @Description("商品ID和数量数组,这里只有一个vip实例：[{\"productId\":110,\"quantity\":1}]") productIdAndQuantitys:String,
		@Field("receiveAddressId") @Description("用户收货地址ID虚拟物品默认传0") receiveAddressId:String
	):  Flowable<T>

}