package com.haoda.common.net.service.console.attributeCategory

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface AttributeCategoryService : BaseService{
	@Description("更新属性分类")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_13_ATTRIBUTE_CATEGORY_Url)
	fun <T:BaseResult<Void>> update_13AttributeCategory(
		@Field("attributeCategoryName") @Description("商品属性分类名称") attributeCategoryName:String,
		@Field("id") @Description("属性分类id") id:String,
		@Field("note") @Description("备注（非必须参数）") note:String?,
		@Field("sort") @Description("排序") sort:String
	):  Flowable<T>


	@Description("属性分类分页")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_19_ATTRIBUTE_CATEGORY_Url)
	fun <T:BaseResult<Void>> page_19AttributeCategory(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("添加属性分类")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_13_ATTRIBUTE_CATEGORY_Url)
	fun <T:BaseResult<Void>> save_13AttributeCategory(
		@Field("attributeCategoryName") @Description("商品属性分类名称") attributeCategoryName:String,
		@Field("note") @Description("备注（非必须参数）") note:String?,
		@Field("sort") @Description("排序") sort:String
	):  Flowable<T>


	@Description("属性分类list")
	@POST(Constants.API.LIST_1_ATTRIBUTE_CATEGORY_Url)
	fun <T:BaseResult<Void>> list_1AttributeCategory(

	):  Flowable<T>


	@Description("属性分类详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_17_ATTRIBUTE_CATEGORY_Url)
	fun <T:BaseResult<Void>> detail_17AttributeCategory(
		@Field("id") @Description("属性分类id") id:String
	):  Flowable<T>


	@Description("删除属性分类")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_12_ATTRIBUTE_CATEGORY_Url)
	fun <T:BaseResult<Void>> delete_12AttributeCategory(
		@Field("id") @Description("属性分类id") id:String
	):  Flowable<T>

}