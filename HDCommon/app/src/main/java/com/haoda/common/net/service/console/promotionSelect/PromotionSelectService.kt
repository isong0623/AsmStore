package com.haoda.common.net.service.console.promotionSelect

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface PromotionSelectService : BaseService{
	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_20_PROMOTION_SELECT_Url)
	fun <T:BaseResult<Void>> update_20PromotionSelect(
		@Field("discount") @Description("折扣（非必须参数）") discount:String?,
		@Field("discription") @Description("描述（非必须参数）") discription:String?,
		@Field("id") @Description("id") id:String,
		@Field("perLimit") @Description("每人限购数量（非必须参数）") perLimit:String?,
		@Field("promotionDate") @Description("日期（非必须参数）") promotionDate:String?,
		@Field("saleMax") @Description("卖出数量（非必须参数）") saleMax:String?,
		@Field("startTime") @Description("开始时间（非必须参数）") startTime:String?,
		@Field("status") @Description("状态（0->停用1->正常）（非必须参数）") status:String?,
		@Field("title") @Description("标题（非必须参数）") title:String?
	):  Flowable<T>


	@Description("获取以选择商品id列表")
	@FormUrlEncoded
	@POST(Constants.API.GET_SELECTED_PRODECT_IDS_3_PROMOTION_SELECT_Url)
	fun <T:BaseResult<Void>> getSelectedProdectIds_3PromotionSelect(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_24_PROMOTION_SELECT_Url)
	fun <T:BaseResult<Void>> detail_24PromotionSelect(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_20_PROMOTION_SELECT_Url)
	fun <T:BaseResult<Void>> save_20PromotionSelect(
		@Field("discount") @Description("折扣") discount:String,
		@Field("discription") @Description("描述（非必须参数）") discription:String?,
		@Field("perLimit") @Description("每人限购数量") perLimit:String,
		@Field("promotionDate") @Description("日期") promotionDate:String,
		@Field("saleMax") @Description("卖出数量") saleMax:String,
		@Field("startTime") @Description("开始时间") startTime:String,
		@Field("status") @Description("状态（0->停用1->正常）") status:String,
		@Field("title") @Description("标题") title:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_26_PROMOTION_SELECT_Url)
	fun <T:BaseResult<Void>> page_26PromotionSelect(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("title") @Description("标题（非必须参数）") title:String?
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_18_PROMOTION_SELECT_Url)
	fun <T:BaseResult<Void>> delete_18PromotionSelect(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("设置商品")
	@FormUrlEncoded
	@POST(Constants.API.SET_PRODUCTS_3PROMOTION_SELECT_Url)
	fun <T:BaseResult<Void>> setProducts_3PromotionSelect(
		@Field("id") @Description("ID") id:String,
		@Field("skuCodes") @Description("skuCode数组") skuCodes:String,
		@Field("productIds") @Description("productIds") productIds:String
	):  Flowable<T>

}