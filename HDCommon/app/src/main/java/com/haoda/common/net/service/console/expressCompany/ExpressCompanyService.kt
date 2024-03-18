package com.haoda.common.net.service.console.expressCompany

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface ExpressCompanyService : BaseService{
	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_6_EXPRESS_COMPANY_Url)
	fun <T:BaseResult<Void>> update_6ExpressCompany(
		@Field("code") @Description("编号（非必须参数）") code:String?,
		@Field("id") @Description("id") id:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("status") @Description("状态（0=>停用1->正常）（非必须参数）") status:String?
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_6_EXPRESS_COMPANY_Url)
	fun <T:BaseResult<Void>> detail_6ExpressCompany(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("停用")
	@FormUrlEncoded
	@POST(Constants.API.STOP_USE_2EXPRESS_COMPANY_Url)
	fun <T:BaseResult<Void>> stopUse_2ExpressCompany(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_7_EXPRESS_COMPANY_Url)
	fun <T:BaseResult<Void>> page_7ExpressCompany(
		@Field("code") @Description("编号（非必须参数）") code:String?,
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("status") @Description("状态（0=>停用1->正常）（非必须参数）") status:String?
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_6_EXPRESS_COMPANY_Url)
	fun <T:BaseResult<Void>> save_6ExpressCompany(
		@Field("code") @Description("编号") code:String,
		@Field("name") @Description("名称") name:String,
		@Field("status") @Description("状态（0=>停用1->正常）") status:String
	):  Flowable<T>


	@Description("获取选择列表")
	@POST(Constants.API.GET_SELECT_LIST_EXPRESS_COMPANY_Url)
	fun <T:BaseResult<Void>> getSelectListExpressCompany(

	):  Flowable<T>


	@Description("启用")
	@FormUrlEncoded
	@POST(Constants.API.START_USE_2EXPRESS_COMPANY_Url)
	fun <T:BaseResult<Void>> startUse_2ExpressCompany(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_5_EXPRESS_COMPANY_Url)
	fun <T:BaseResult<Void>> delete_5ExpressCompany(
		@Field("id") @Description("id") id:String
	):  Flowable<T>

}