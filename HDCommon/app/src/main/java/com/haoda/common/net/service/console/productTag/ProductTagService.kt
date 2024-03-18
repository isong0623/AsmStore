package com.haoda.common.net.service.console.productTag

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface ProductTagService : BaseService{
	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_17_PRODUCT_TAG_Url)
	fun <T:BaseResult<Void>> update_17ProductTag(
		@Field("discription") @Description("描述（非必须参数）") discription:String?,
		@Field("id") @Description("id") id:String,
		@Field("name") @Description("名称（非必须参数）") name:String?
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_17_PRODUCT_TAG_Url)
	fun <T:BaseResult<Void>> save_17ProductTag(
		@Field("discription") @Description("描述（非必须参数）") discription:String?,
		@Field("name") @Description("名称") name:String
	):  Flowable<T>


	@Description("获取列表")
	@POST(Constants.API.LIST_5_PRODUCT_TAG_Url)
	fun <T:BaseResult<Void>> list_5ProductTag(

	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_16_PRODUCT_TAG_Url)
	fun <T:BaseResult<Void>> delete_16ProductTag(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_23_PRODUCT_TAG_Url)
	fun <T:BaseResult<Void>> page_23ProductTag(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_21_PRODUCT_TAG_Url)
	fun <T:BaseResult<Void>> detail_21ProductTag(
		@Field("id") @Description("id") id:String
	):  Flowable<T>

}