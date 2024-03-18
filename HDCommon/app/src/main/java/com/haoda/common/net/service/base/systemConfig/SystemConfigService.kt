package com.haoda.common.net.service.base.systemConfig

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface SystemConfigService : BaseService{
	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_5_SYSTEM_CONFIG_Url)
	fun <T:BaseResult<Void>> delete_5SystemConfig(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_5_SYSTEM_CONFIG_Url)
	fun <T:BaseResult<Void>> page_5SystemConfig(
		@Field("configKey") @Description("配置项key（非必须参数）") configKey:String?,
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_5_SYSTEM_CONFIG_Url)
	fun <T:BaseResult<Void>> save_5SystemConfig(
		@Field("configKey") @Description("配置项key") configKey:String,
		@Field("configValue") @Description("配置项value") configValue:String,
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("status") @Description("状态(0->停用1->启用)") status:String
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_5_SYSTEM_CONFIG_Url)
	fun <T:BaseResult<Void>> update_5SystemConfig(
		@Field("configKey") @Description("配置项key（非必须参数）") configKey:String?,
		@Field("configValue") @Description("配置项value（非必须参数）") configValue:String?,
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("id") @Description("id") id:String,
		@Field("status") @Description("状态(0->停用1->启用)（非必须参数）") status:String?
	):  Flowable<T>

}