package com.haoda.common.net.service.member.royalty

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface RoyaltyService : BaseService{
	@Description("获取用户粉丝全部数据")
	@FormUrlEncoded
	@POST(Constants.API.FIND_MEMBER_IDBY_FANS_ROYALTY_Url)
	fun <T:BaseResult<Void>> findMemberIdByFansRoyalty(
		@Field("memberId") @Description("当前登录用户ID") memberId:String,
		@Field("pageNum") @Description("页数（非必须参数）") pageNum:String?,
		@Field("pageSize") @Description("每页的条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("获取用户提现历史记录")
	@FormUrlEncoded
	@POST(Constants.API.GET_MEMBER_WITHDRAW_ROYALTY_Url)
	fun <T:BaseResult<Void>> getMemberWithdrawRoyalty(
		@Field("memberId") @Description("当前登录用户ID(不可为空)") memberId:String,
		@Field("pageNum") @Description("pageNum（非必须参数）") pageNum:String?,
		@Field("pageSize") @Description("pageSize（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("月度概况")
	@FormUrlEncoded
	@POST(Constants.API.MONTHLY_SURVEY_ROYALTY_Url)
	fun <T:BaseResult<Void>> monthlySurveyRoyalty(
		@Field("currentPage") @Description("当前页（非必须参数）") currentPage:String?,
		@Field("fansCondition") @Description("粉丝条件（1-直属粉丝，2-二级粉丝）（非必须参数）") fansCondition:String?,
		@Field("monthCondition") @Description("月条件（1-本月，2-上月）（非必须参数）") monthCondition:String?,
		@Field("pageSize") @Description("查询条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("根据用户ID获取银行卡列表信息")
	@FormUrlEncoded
	@POST(Constants.API.GET_MEMBER_BANK_ROYALTY_Url)
	fun <T:BaseResult<Void>> getMemberBankRoyalty(
		@Field("memberId") @Description("当前登录用户ID(ID为空，随机码不可为空)") memberId:String,
		@Field("pageNum") @Description("pageNum（非必须参数）") pageNum:String?,
		@Field("pageSize") @Description("pageSize（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("保存新的银行卡信息")
	@POST(Constants.API.SAVE_MEMBER_BANK_ROYALTY_Url)
	fun <T:BaseResult<Void>> saveMemberBankRoyalty(

	):  Flowable<T>


	@Description("今日/昨日概况")
	@FormUrlEncoded
	@POST(Constants.API.DAY_SURVEY_ROYALTY_Url)
	fun <T:BaseResult<Void>> daySurveyRoyalty(
		@Field("currentPage") @Description("当前页（非必须参数）") currentPage:String?,
		@Field("dayCondition") @Description("日条件（1-今天，2-昨天）（非必须参数）") dayCondition:String?,
		@Field("fansCondition") @Description("粉丝条件（1-直属粉丝，2-二级粉丝）（非必须参数）") fansCondition:String?,
		@Field("pageSize") @Description("查询条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("我的收益")
	@POST(Constants.API.MY_PROFIT_ROYALTY_Url)
	fun <T:BaseResult<Void>> myProfitRoyalty(

	):  Flowable<T>


	@Description("验证用户是否微信授权")
	@POST(Constants.API.WECHAT_AUTHORIZATION_ROYALTY_Url)
	fun <T:BaseResult<Void>> wechatAuthorizationRoyalty(

	):  Flowable<T>


	@Description("获取用户粉丝当日数据")
	@FormUrlEncoded
	@POST(Constants.API.FIND_MEMBER_IDBY_DAYFANS_ROYALTY_Url)
	fun <T:BaseResult<Void>> findMemberIdByDayFansRoyalty(
		@Field("isType") @Description("天数（非必须参数）") isType:String?,
		@Field("memberId") @Description("当前登录用户ID") memberId:String,
		@Field("pageNum") @Description("页数（非必须参数）") pageNum:String?,
		@Field("pageSize") @Description("每页的条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("账单明细")
	@FormUrlEncoded
	@POST(Constants.API.BILLDETAILS_ROYALTY_Url)
	fun <T:BaseResult<Void>> billdetailsRoyalty(
		@Field("currentPage") @Description("当前页（非必须参数）") currentPage:String?,
		@Field("pageSize") @Description("查询条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("直播收益详情")
	@FormUrlEncoded
	@POST(Constants.API.LIVE_PROFIT_DETAIL_ROYALTY_Url)
	fun <T:BaseResult<Void>> liveProfitDetailRoyalty(
		@Field("currentPage") @Description("当前页（非必须参数）") currentPage:String?,
		@Field("endTime") @Description("直播结束时间") endTime:String,
		@Field("pageSize") @Description("查询条数（非必须参数）") pageSize:String?,
		@Field("startTime") @Description("直播开始时间") startTime:String
	):  Flowable<T>


	@Description("获取用户首页分销数据")
	@FormUrlEncoded
	@POST(Constants.API.FIND_MEMBER_IDBY_LOGROYALTY_Url)
	fun <T:BaseResult<Void>> findMemberIdByLogRoyalty(
		@Field("memberId") @Description("当前登录用户ID（非必须参数）") memberId:String?,
		@Field("random") @Description("分享用户随机码（非必须参数）") random:String?
	):  Flowable<T>


	@Description("支付成功添加分销订单记录")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_RECORD_ROYALTY_Url)
	fun <T:BaseResult<Void>> saveRecordRoyalty(
		@Field("orderId") @Description("订单id") orderId:String
	):  Flowable<T>


	@Description("获取用户分销基础数据/可提现余额")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_ROYALTY_Url)
	fun <T:BaseResult<Void>> detailRoyalty(
		@Field("memberId") @Description("当前登录用户ID") memberId:String
	):  Flowable<T>


	@Description("提现-提现余额")
	@FormUrlEncoded
	@POST(Constants.API.GET_POSTAL_CASH_ROYALTY_Url)
	fun <T:BaseResult<Void>> getPostalCashRoyalty(
		@Field("amount") @Description("提现额度") amount:String,
		@Field("bankId") @Description("银行卡号（非必须参数）") bankId:String?,
		@Field("memberId") @Description("当前登录用户ID") memberId:String,
		@Field("postalCashWay") @Description("提现方式,0-银行卡，1-微信") postalCashWay:String
	):  Flowable<T>


	@Description("获取用户分销数据")
	@FormUrlEncoded
	@POST(Constants.API.FIND_MEMBER_IDBY_LOGDETAILS_ROYALTY_Url)
	fun <T:BaseResult<Void>> findMemberIdByLogDetailsRoyalty(
		@Field("memberId") @Description("当前登录用户ID") memberId:String,
		@Field("pageNum") @Description("页数（非必须参数）") pageNum:String?,
		@Field("pageSize") @Description("每页的条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("查询用户分销体系(没有则添加)")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_MEMBER_ROYALTY_Url)
	fun <T:BaseResult<Void>> saveMemberRoyalty(
		@Field("memberId") @Description("当前登录用户ID(ID为空，随机码不可为空)（非必须参数）") memberId:String?,
		@Field("random") @Description("分享用户随机码(随机码为空，ID不可为空)（非必须参数）") random:String?,
		@Field("time") @Description("time") time:String
	):  Flowable<T>


	@Description("获取直播记录")
	@FormUrlEncoded
	@POST(Constants.API.GETLIVE_RECORD_ROYALTY_Url)
	fun <T:BaseResult<Void>> getliveRecordRoyalty(
		@Field("currentPage") @Description("当前页（非必须参数）") currentPage:String?,
		@Field("pageSize") @Description("查询条数（非必须参数）") pageSize:String?
	):  Flowable<T>

}