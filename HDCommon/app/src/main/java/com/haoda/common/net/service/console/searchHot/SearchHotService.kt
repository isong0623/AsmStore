package com.haoda.common.net.service.console.searchHot

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface SearchHotService : BaseService{
	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_28_SEARCH_HOT_Url)
	fun <T:BaseResult<Void>> page_28SearchHot(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("keywords") @Description("搜索关键词（非必须参数）") keywords:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_23_SEARCH_HOT_Url)
	fun <T:BaseResult<Void>> update_23SearchHot(
		@Field("id") @Description("id") id:String,
		@Field("keywords") @Description("搜索关键词（非必须参数）") keywords:String?,
		@Field("sort") @Description("排序（非必须参数）") sort:String?,
		@Field("status") @Description("状态（0->停用1->启用）（非必须参数）") status:String?
	):  Flowable<T>


	@Description("停用")
	@FormUrlEncoded
	@POST(Constants.API.STOP_USE_8SEARCH_HOT_Url)
	fun <T:BaseResult<Void>> stopUse_8SearchHot(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_20_SEARCH_HOT_Url)
	fun <T:BaseResult<Void>> delete_20SearchHot(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_27_SEARCH_HOT_Url)
	fun <T:BaseResult<Void>> detail_27SearchHot(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_23_SEARCH_HOT_Url)
	fun <T:BaseResult<Void>> save_23SearchHot(
		@Field("keywords") @Description("搜索关键词") keywords:String,
		@Field("sort") @Description("排序") sort:String,
		@Field("status") @Description("状态（0->停用1->启用）") status:String
	):  Flowable<T>


	@Description("启用")
	@FormUrlEncoded
	@POST(Constants.API.START_USE_8SEARCH_HOT_Url)
	fun <T:BaseResult<Void>> startUse_8SearchHot(
		@Field("id") @Description("id") id:String
	):  Flowable<T>

}