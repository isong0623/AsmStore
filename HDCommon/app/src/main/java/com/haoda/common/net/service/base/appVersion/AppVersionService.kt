package com.haoda.common.net.service.base.appVersion

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface AppVersionService : BaseService{
	@Description("版本更新")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_APP_VERSION_Url)
	fun <T:BaseResult<Void>> updateAppVersion(
		@Field("build") @Description("build") build:String,
		@Field("id") @Description("id") id:String,
		@Field("intervalTime") @Description("间隔时间") intervalTime:String,
		@Field("isForceUpdate") @Description("是否强制更新(1-强制更新，2-选择更新)") isForceUpdate:String,
		@Field("platformMarking") @Description("平台标记（ios,android）") platformMarking:String,
		@Field("updateContent") @Description("更新内容") updateContent:String,
		@Field("updatePath") @Description("下载更新路径") updatePath:String
	):  Flowable<T>


	@Description("版本删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_APP_VERSION_Url)
	fun <T:BaseResult<Void>> deleteAppVersion(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("版本保存")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_APP_VERSION_Url)
	fun <T:BaseResult<Void>> saveAppVersion(
		@Field("build") @Description("build") build:String,
		@Field("intervalTime") @Description("间隔时间(以小时为单位)") intervalTime:String,
		@Field("isForceUpdate") @Description("是否强制更新(1-强制更新，2-选择更新)") isForceUpdate:String,
		@Field("platformMarking") @Description("平台标记（ios,android）") platformMarking:String,
		@Field("updateContent") @Description("更新内容") updateContent:String,
		@Field("updatePath") @Description("下载更新路径") updatePath:String
	):  Flowable<T>


	@Description("版本详情后台维护用")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_APP_VERSION_Url)
	fun <T:BaseResult<Void>> detailAppVersion(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_APP_VERSION_Url)
	fun <T:BaseResult<Void>> pageAppVersion(
		@Field("currentPage") @Description("currentPage（非必须参数）") currentPage:String?,
		@Field("pagesize") @Description("pagesize（非必须参数）") pagesize:String?
	):  Flowable<T>

}