package com.haoda.common.net.service.mall.category

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface CategoryService : BaseService{
	@Description("商品分类详细信息")
	@FormUrlEncoded
	@Headers("haodaAuthorization:\"\"")
	@POST(Constants.API.LEVEL_DETAIL_CATEGORY_Url)
	fun <T:BaseResult<Void>> levelDetailCategory(
		@Field("categoryId") @Description("categoryId") categoryId:String
	):  Flowable<T>


	@Description("分页获取商品信息")
	@FormUrlEncoded
	@Headers("haodaAuthorization:\"\"")
	@POST(Constants.API.PRODUCT_PAGE_CATEGORY_Url)
	fun <T:BaseResult<Void>> productPageCategory(
		@Field("categoryId") @Description("商品分类ID") categoryId:String,
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("获取其他商品分类")
	@FormUrlEncoded
	@POST(Constants.API.GET_OTHER_CATEGORY_CATEGORY_Url)
	fun <T:BaseResult<Void>> getOtherCategoryCategory(
		@Field("categoryId") @Description("categoryId") categoryId:String
	):  Flowable<T>

}