package com.haoda.common.net.service.console.orderSetting

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface OrderSettingService : BaseService{
	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_12_ORDER_SETTING_Url)
	fun <T:BaseResult<Void>> save_12OrderSetting(
		@Field("discription") @Description("描述") discription:String,
		@Field("settingKey") @Description("配置KEY") settingKey:String,
		@Field("settingValue") @Description("配置VALUE") settingValue:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_18_ORDER_SETTING_Url)
	fun <T:BaseResult<Void>> page_18OrderSetting(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("settingKey") @Description("配置KEY（非必须参数）") settingKey:String?
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_16_ORDER_SETTING_Url)
	fun <T:BaseResult<Void>> detail_16OrderSetting(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_11_ORDER_SETTING_Url)
	fun <T:BaseResult<Void>> delete_11OrderSetting(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_12_ORDER_SETTING_Url)
	fun <T:BaseResult<Void>> update_12OrderSetting(
		@Field("discription") @Description("描述（非必须参数）") discription:String?,
		@Field("id") @Description("id") id:String,
		@Field("settingKey") @Description("配置KEY（非必须参数）") settingKey:String?,
		@Field("settingValue") @Description("配置VALUE（非必须参数）") settingValue:String?
	):  Flowable<T>

}