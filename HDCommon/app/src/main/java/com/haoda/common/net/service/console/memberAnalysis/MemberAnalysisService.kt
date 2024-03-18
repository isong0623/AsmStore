package com.haoda.common.net.service.console.memberAnalysis

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface MemberAnalysisService : BaseService{
	@Description("会员概况")
	@POST(Constants.API.MEMBER_OVERVIEW_MEMBER_ANALYSIS_Url)
	fun <T:BaseResult<Void>> memberOverviewMemberAnalysis(

	):  Flowable<T>


	@Description("新增会员总数")
	@FormUrlEncoded
	@POST(Constants.API.NEW_ADD_SUM_MEMBER_ANALYSIS_Url)
	fun <T:BaseResult<Void>> newAddSumMemberAnalysis(
		@Field("endTime") @Description("结束时间2020-08-01/2020-09") endTime:String,
		@Field("startTime") @Description("开始时间2020-08-01/2020-08") startTime:String,
		@Field("type") @Description("选择类型（1-以天为单位，2-以月为单位）") type:String
	):  Flowable<T>


	@Description("会员总数")
	@FormUrlEncoded
	@POST(Constants.API.MEMBER_SUM_MEMBER_ANALYSIS_Url)
	fun <T:BaseResult<Void>> memberSumMemberAnalysis(
		@Field("endTime") @Description("结束时间2020-08-01/2020-09") endTime:String,
		@Field("startTime") @Description("开始时间2020-08-01/2020-08") startTime:String,
		@Field("type") @Description("选择类型（1-以天为单位，2-以月为单位）") type:String
	):  Flowable<T>

}