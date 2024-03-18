package com.haoda.common.net.service.console.promotion

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface PromotionService : BaseService{
	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_22_PROMOTION_Url)
	fun <T:BaseResult<Void>> detail_22Promotion(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("设置商品")
	@FormUrlEncoded
	@POST(Constants.API.SET_PRODUCTS_1PROMOTION_Url)
	fun <T:BaseResult<Void>> setProducts_1Promotion(
		@Field("id") @Description("ID") id:String,
		@Field("productIds") @Description("商品ID数组") productIds:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_24_PROMOTION_Url)
	fun <T:BaseResult<Void>> page_24Promotion(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_18_PROMOTION_Url)
	fun <T:BaseResult<Void>> save_18Promotion(
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("name") @Description("名称") name:String,
		@Field("status") @Description("状态（0->停用1->正常）") status:String
	):  Flowable<T>


	@Description("获取以选择商品id列表")
	@FormUrlEncoded
	@POST(Constants.API.GET_SELECTED_PRODECT_IDS_1_PROMOTION_Url)
	fun <T:BaseResult<Void>> getSelectedProdectIds_1Promotion(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_18_PROMOTION_Url)
	fun <T:BaseResult<Void>> update_18Promotion(
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("id") @Description("id") id:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("status") @Description("状态（0->停用1->正常）（非必须参数）") status:String?
	):  Flowable<T>

}