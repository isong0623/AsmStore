package com.haoda.common.net.service.console.attributeKey

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface AttributeKeyService : BaseService{
	@Description("属性分页")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_20_ATTRIBUTE_KEY_Url)
	fun <T:BaseResult<Void>> page_20AttributeKey(
		@Field("attributeCategoryId") @Description("属性分类id（非必须参数）") attributeCategoryId:String?,
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("属性分类详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_18_ATTRIBUTE_KEY_Url)
	fun <T:BaseResult<Void>> detail_18AttributeKey(
		@Field("id") @Description("属性id") id:String
	):  Flowable<T>


	@Description("属性keylist")
	@FormUrlEncoded
	@POST(Constants.API.LIST_2_ATTRIBUTE_KEY_Url)
	fun <T:BaseResult<Void>> list_2AttributeKey(
		@Field("attributeCategoryId") @Description("属性分类id（非必须参数）") attributeCategoryId:String?
	):  Flowable<T>


	@Description("更新属性")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_14_ATTRIBUTE_KEY_Url)
	fun <T:BaseResult<Void>> update_14AttributeKey(
		@Field("attributeCategoryId") @Description("属性分类id（非必须参数）") attributeCategoryId:String?,
		@Field("attributeKey") @Description("属性名（非必须参数）") attributeKey:String?,
		@Field("attributeValue") @Description("属性值") attributeValue:String,
		@Field("id") @Description("属性名id") id:String,
		@Field("note") @Description("备注（非必须参数）") note:String?,
		@Field("sort") @Description("排序（非必须参数）") sort:String?
	):  Flowable<T>


	@Description("删除属性")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_13_ATTRIBUTE_KEY_Url)
	fun <T:BaseResult<Void>> delete_13AttributeKey(
		@Field("id") @Description("属性id") id:String
	):  Flowable<T>


	@Description("添加属性名key")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_14_ATTRIBUTE_KEY_Url)
	fun <T:BaseResult<Void>> save_14AttributeKey(
		@Field("attributeCategoryId") @Description("属性分类id为空") attributeCategoryId:String,
		@Field("attributeKey") @Description("属性名为空") attributeKey:String,
		@Field("attributeValue") @Description("属性值") attributeValue:String,
		@Field("note") @Description("备注（非必须参数）") note:String?,
		@Field("sort") @Description("排序") sort:String
	):  Flowable<T>

}