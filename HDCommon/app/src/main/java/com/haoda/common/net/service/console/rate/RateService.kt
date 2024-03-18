package com.haoda.common.net.service.console.rate

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface RateService : BaseService{
	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_25_RATE_Url)
	fun <T:BaseResult<Void>> detail_25Rate(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_21_RATE_Url)
	fun <T:BaseResult<Void>> save_21Rate(
		@Field("memberRate") @Description("会员比率") memberRate:String,
		@Field("oneroyaltyRate") @Description("一级佣金比率") oneroyaltyRate:String,
		@Field("paltformRate") @Description("平台比率") paltformRate:String,
		@Field("tworoyaltyRate") @Description("二级佣金比率") tworoyaltyRate:String
	):  Flowable<T>


	@Description("获取所有比率")
	@POST(Constants.API.LIST_6_RATE_Url)
	fun <T:BaseResult<Void>> list_6Rate(

	):  Flowable<T>


	@Description("编辑")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_21_RATE_Url)
	fun <T:BaseResult<Void>> update_21Rate(
		@Field("id") @Description("id（非必须参数）") id:String?,
		@Field("memberRate") @Description("memberRate（非必须参数）") memberRate:String?,
		@Field("oneroyaltyRate") @Description("oneroyaltyRate（非必须参数）") oneroyaltyRate:String?,
		@Field("paltformRate") @Description("paltformRate（非必须参数）") paltformRate:String?,
		@Field("tworoyaltyRate") @Description("tworoyaltyRate（非必须参数）") tworoyaltyRate:String?
	):  Flowable<T>

}