package com.haoda.common.net.service.console.orderItemPromotion

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface OrderItemPromotionService : BaseService{
	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_14_ORDER_ITEM_PROMOTION_Url)
	fun <T:BaseResult<Void>> detail_14OrderItemPromotion(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_11_ORDER_ITEM_PROMOTION_Url)
	fun <T:BaseResult<Void>> update_11OrderItemPromotion(
		@Field("id") @Description("id") id:String,
		@Field("orderItemId") @Description("订单详细ID（非必须参数）") orderItemId:String?,
		@Field("productId") @Description("商品ID（非必须参数）") productId:String?,
		@Field("productQuantity") @Description("商品数量（非必须参数）") productQuantity:String?,
		@Field("promotionId") @Description("优惠ID（非必须参数）") promotionId:String?,
		@Field("promotionParam") @Description("优惠参数（非必须参数）") promotionParam:String?,
		@Field("promotionType") @Description("促销类型：0->无促销;6->优选尖货；（非必须参数）") promotionType:String?
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_10_ORDER_ITEM_PROMOTION_Url)
	fun <T:BaseResult<Void>> delete_10OrderItemPromotion(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_16_ORDER_ITEM_PROMOTION_Url)
	fun <T:BaseResult<Void>> page_16OrderItemPromotion(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("orderItemId") @Description("订单详细ID（非必须参数）") orderItemId:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("productId") @Description("商品ID（非必须参数）") productId:String?,
		@Field("productQuantity") @Description("商品数量（非必须参数）") productQuantity:String?,
		@Field("promotionId") @Description("优惠ID（非必须参数）") promotionId:String?,
		@Field("promotionParam") @Description("优惠参数（非必须参数）") promotionParam:String?,
		@Field("promotionType") @Description("促销类型：0->无促销;6->优选尖货；（非必须参数）") promotionType:String?
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_11_ORDER_ITEM_PROMOTION_Url)
	fun <T:BaseResult<Void>> save_11OrderItemPromotion(
		@Field("orderItemId") @Description("订单详细ID") orderItemId:String,
		@Field("productId") @Description("商品ID") productId:String,
		@Field("productQuantity") @Description("商品数量") productQuantity:String,
		@Field("promotionId") @Description("优惠ID") promotionId:String,
		@Field("promotionParam") @Description("优惠参数") promotionParam:String,
		@Field("promotionType") @Description("促销类型：0->无促销;6->优选尖货；") promotionType:String
	):  Flowable<T>

}