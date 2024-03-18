package com.haoda.common.net.service.console.feightTemplate

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface FeightTemplateService : BaseService{
	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_7_FEIGHT_TEMPLATE_Url)
	fun <T:BaseResult<Void>> update_7FeightTemplate(
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("fullPrice") @Description("包邮价格（非必须参数）") fullPrice:String?,
		@Field("id") @Description("id") id:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("price") @Description("价格（非必须参数）") price:String?,
		@Field("type") @Description("类型（0->包邮1->满一定金额包邮2->固定金额）（非必须参数）") type:String?
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_8_FEIGHT_TEMPLATE_Url)
	fun <T:BaseResult<Void>> page_8FeightTemplate(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("获取所有")
	@POST(Constants.API.LIST_FEIGHT_TEMPLATE_Url)
	fun <T:BaseResult<Void>> listFeightTemplate(

	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_6_FEIGHT_TEMPLATE_Url)
	fun <T:BaseResult<Void>> delete_6FeightTemplate(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_7_FEIGHT_TEMPLATE_Url)
	fun <T:BaseResult<Void>> detail_7FeightTemplate(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_7_FEIGHT_TEMPLATE_Url)
	fun <T:BaseResult<Void>> save_7FeightTemplate(
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("fullPrice") @Description("包邮价格（非必须参数）") fullPrice:String?,
		@Field("name") @Description("名称") name:String,
		@Field("price") @Description("价格（非必须参数）") price:String?,
		@Field("type") @Description("类型（0->包邮1->满一定金额包邮2->固定金额）") type:String
	):  Flowable<T>

}