package com.haoda.common.net.service.console.promotionDaily

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface PromotionDailyService : BaseService{
	@Description("设置商品")
	@FormUrlEncoded
	@POST(Constants.API.SET_PRODUCTS_2PROMOTION_DAILY_Url)
	fun <T:BaseResult<Void>> setProducts_2PromotionDaily(
		@Field("id") @Description("ID") id:String,
		@Field("productIds") @Description("商品ID数组") productIds:String
	):  Flowable<T>


	@Description("启用")
	@FormUrlEncoded
	@POST(Constants.API.START_USE_6PROMOTION_DAILY_Url)
	fun <T:BaseResult<Void>> startUse_6PromotionDaily(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_19_PROMOTION_DAILY_Url)
	fun <T:BaseResult<Void>> update_19PromotionDaily(
		@Field("categoryId") @Description("商品分类ID（非必须参数）") categoryId:String?,
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("endTime") @Description("结束时间（非必须参数）") endTime:String?,
		@Field("id") @Description("id") id:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pic") @Description("图片（非必须参数）") pic:String?,
		@Field("sort") @Description("排序（非必须参数）") sort:String?,
		@Field("startTime") @Description("开始时间（非必须参数）") startTime:String?,
		@Field("status") @Description("状态（非必须参数）") status:String?
	):  Flowable<T>


	@Description("上传图片")
	@POST(Constants.API.UPLOAD_PICTURE_8PROMOTION_DAILY_Url)
	fun <T:BaseResult<Void>> uploadPicture_8PromotionDaily(

	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_17_PROMOTION_DAILY_Url)
	fun <T:BaseResult<Void>> delete_17PromotionDaily(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("获取以选择商品id列表")
	@FormUrlEncoded
	@POST(Constants.API.GET_SELECTED_PRODECT_IDS_2_PROMOTION_DAILY_Url)
	fun <T:BaseResult<Void>> getSelectedProdectIds_2PromotionDaily(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_23_PROMOTION_DAILY_Url)
	fun <T:BaseResult<Void>> detail_23PromotionDaily(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_19_PROMOTION_DAILY_Url)
	fun <T:BaseResult<Void>> save_19PromotionDaily(
		@Field("categoryId") @Description("商品分类ID") categoryId:String,
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("endTime") @Description("结束时间") endTime:String,
		@Field("name") @Description("名称") name:String,
		@Field("pic") @Description("图片") pic:String,
		@Field("sort") @Description("排序") sort:String,
		@Field("startTime") @Description("开始时间") startTime:String,
		@Field("status") @Description("状态") status:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_25_PROMOTION_DAILY_Url)
	fun <T:BaseResult<Void>> page_25PromotionDaily(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("停用")
	@FormUrlEncoded
	@POST(Constants.API.STOP_USE_6PROMOTION_DAILY_Url)
	fun <T:BaseResult<Void>> stopUse_6PromotionDaily(
		@Field("id") @Description("id") id:String
	):  Flowable<T>

}