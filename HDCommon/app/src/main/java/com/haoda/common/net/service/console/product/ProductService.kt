package com.haoda.common.net.service.console.product

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface ProductService : BaseService{
	@Description("下架")
	@FormUrlEncoded
	@POST(Constants.API.UNPUBLISH_1_PRODUCT_Url)
	fun <T:BaseResult<Void>> unpublish_1Product(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("获取列表")
	@POST(Constants.API.LIST_3_PRODUCT_Url)
	fun <T:BaseResult<Void>> list_3Product(

	):  Flowable<T>


	@Description("修改商品分享图片")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_IMG_PRODUCT_Url)
	fun <T:BaseResult<Void>> updateImgProduct(
		@Field("productId") @Description("商品ID") productId:String
	):  Flowable<T>


	@Description("修改")
	@POST(Constants.API.UPDATE_15_PRODUCT_Url)
	fun <T:BaseResult<Void>> update_15Product(

	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_19_PRODUCT_Url)
	fun <T:BaseResult<Void>> detail_19Product(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("商品分类ID获取商品列表")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_BY_CATEGORY_ID_PRODUCT_Url)
	fun <T:BaseResult<Void>> pageByCategoryIdProduct(
		@Field("categoryId") @Description("商品分类ID") categoryId:String,
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_14_PRODUCT_Url)
	fun <T:BaseResult<Void>> delete_14Product(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("搜索刷新")
	@POST(Constants.API.REFRESH_ALL_PRODUCT_Url)
	fun <T:BaseResult<Void>> refreshAllProduct(

	):  Flowable<T>


	@Description("上架")
	@FormUrlEncoded
	@POST(Constants.API.PUBLISH_1_PRODUCT_Url)
	fun <T:BaseResult<Void>> publish_1Product(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_21_PRODUCT_Url)
	fun <T:BaseResult<Void>> page_21Product(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("firstCategoryId") @Description("商品一级分类ID（非必须参数）") firstCategoryId:String?,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("publishStatus") @Description("上架状态：0->下架；1->上架（非必须参数）") publishStatus:String?
	):  Flowable<T>


	@Description("添加")
	@POST(Constants.API.SAVE_15_PRODUCT_Url)
	fun <T:BaseResult<Void>> save_15Product(

	):  Flowable<T>


	@Description("上传图片")
	@POST(Constants.API.UPLOAD_PICTURE_7PRODUCT_Url)
	fun <T:BaseResult<Void>> uploadPicture_7Product(

	):  Flowable<T>

}