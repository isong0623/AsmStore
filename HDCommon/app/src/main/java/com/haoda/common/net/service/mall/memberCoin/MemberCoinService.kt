package com.haoda.common.net.service.mall.memberCoin

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface MemberCoinService : BaseService{
	@Description("用户我的团子值接口")
	@POST(Constants.API.GOLD_INDEX_MEMBER_COIN_Url)
	fun <T:BaseResult<Void>> goldIndexMemberCoin(

	):  Flowable<T>


	@Description("用户我的米粉值接口")
	@POST(Constants.API.COPPER_INDEX_MEMBER_COIN_Url)
	fun <T:BaseResult<Void>> copperIndexMemberCoin(

	):  Flowable<T>


	@Description("分页获取米粉值交易明细")
	@FormUrlEncoded
	@POST(Constants.API.MEMBER_COPPER_LOG_PAGE_MEMBER_COIN_Url)
	fun <T:BaseResult<Void>> memberCopperLogPageMemberCoin(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("米粉值兑换团子")
	@FormUrlEncoded
	@POST(Constants.API.COPPER_TO_GOLD_MEMBER_COIN_Url)
	fun <T:BaseResult<Void>> copperToGoldMemberCoin(
		@Field("count") @Description("count") count:String
	):  Flowable<T>


	@Description("分页获取团子值交易明细")
	@FormUrlEncoded
	@POST(Constants.API.MEMBER_GOLD_LOG_PAGE_MEMBER_COIN_Url)
	fun <T:BaseResult<Void>> memberGoldLogPageMemberCoin(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>

}