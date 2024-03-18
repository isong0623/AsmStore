package com.haoda.common.net.service.console.productService

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface ProductServiceService : BaseService{
	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_20_PRODUCT_SERVICE_Url)
	fun <T:BaseResult<Void>> detail_20ProductService(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_22_PRODUCT_SERVICE_Url)
	fun <T:BaseResult<Void>> page_22ProductService(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("name") @Description("服务名称（非必须参数）") name:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_15_PRODUCT_SERVICE_Url)
	fun <T:BaseResult<Void>> delete_15ProductService(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_16_PRODUCT_SERVICE_Url)
	fun <T:BaseResult<Void>> update_16ProductService(
		@Field("description") @Description("服务说明（非必须参数）") description:String?,
		@Field("id") @Description("id") id:String,
		@Field("name") @Description("服务名称（非必须参数）") name:String?,
		@Field("sort") @Description("排序（非必须参数）") sort:String?
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_16_PRODUCT_SERVICE_Url)
	fun <T:BaseResult<Void>> save_16ProductService(
		@Field("description") @Description("服务说明") description:String,
		@Field("name") @Description("服务名称") name:String,
		@Field("sort") @Description("排序") sort:String
	):  Flowable<T>


	@Description("获取所有")
	@POST(Constants.API.LIST_4_PRODUCT_SERVICE_Url)
	fun <T:BaseResult<Void>> list_4ProductService(

	):  Flowable<T>

}