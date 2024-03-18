package com.haoda.common.net.service.console.signCoin

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface SignCoinService : BaseService{
	@Description("删除签到配置")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_21_SIGN_COIN_Url)
	fun <T:BaseResult<Void>> delete_21SignCoin(
		@Field("id") @Description("签到配置id") id:String
	):  Flowable<T>


	@Description("添加签到配置")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_24_SIGN_COIN_Url)
	fun <T:BaseResult<Void>> save_24SignCoin(
		@Field("continuousSum") @Description("获取额外积分奖励的条件(连续天数)") continuousSum:String,
		@Field("copperCoin") @Description("签到基本积分奖励（非必须参数）") copperCoin:String?,
		@Field("copperCoinExtra") @Description("连续签到额外积分奖励") copperCoinExtra:String,
		@Field("weekDay") @Description("dayofweek(1、2、3、4、5、6、7)") weekDay:String
	):  Flowable<T>


	@Description("签到配置详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_28_SIGN_COIN_Url)
	fun <T:BaseResult<Void>> detail_28SignCoin(
		@Field("id") @Description("签到配置id") id:String
	):  Flowable<T>


	@Description("签到配置list")
	@POST(Constants.API.LIST_7_SIGN_COIN_Url)
	fun <T:BaseResult<Void>> list_7SignCoin(

	):  Flowable<T>


	@Description("更新签到配置")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_24_SIGN_COIN_Url)
	fun <T:BaseResult<Void>> update_24SignCoin(
		@Field("continuousSum") @Description("获取额外积分奖励的条件(连续天数)（非必须参数）") continuousSum:String?,
		@Field("copperCoin") @Description("签到基本积分奖励（非必须参数）") copperCoin:String?,
		@Field("copperCoinExtra") @Description("连续签到额外积分奖励（非必须参数）") copperCoinExtra:String?,
		@Field("id") @Description("签到配置id") id:String,
		@Field("weekDay") @Description("dayofweek(1、2、3、4、5、6、7)（非必须参数）") weekDay:String?
	):  Flowable<T>


	@Description("签到配置分页")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_29_SIGN_COIN_Url)
	fun <T:BaseResult<Void>> page_29SignCoin(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>

}