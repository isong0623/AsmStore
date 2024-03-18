package com.haoda.common.net.service.console.analysis

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface AnalysisService : BaseService{
	@Description("新增订单金额")
	@FormUrlEncoded
	@POST(Constants.API.NEW_ADD_SUM_1_ANALYSIS_Url)
	fun <T:BaseResult<Void>> newAddSum_1Analysis(
		@Field("endTime") @Description("结束时间2020-08-01/2020-09") endTime:String,
		@Field("startTime") @Description("开始时间2020-08-01/2020-08") startTime:String,
		@Field("type") @Description("选择类型（1-以天为单位，2-以月为单位）") type:String
	):  Flowable<T>


	@Description("新增订单数量统计")
	@FormUrlEncoded
	@POST(Constants.API.NEW_ADD_NUM_ANALYSIS_Url)
	fun <T:BaseResult<Void>> newAddNumAnalysis(
		@Field("endTime") @Description("结束时间2020-08-01/2020-09") endTime:String,
		@Field("startTime") @Description("开始时间2020-08-01/2020-08") startTime:String,
		@Field("type") @Description("选择类型（1-以天为单位，2-以月为单位）") type:String
	):  Flowable<T>


	@Description("新增订单人数")
	@FormUrlEncoded
	@POST(Constants.API.NEW_ADD_CONSUMER_ANALYSIS_Url)
	fun <T:BaseResult<Void>> newAddConsumerAnalysis(
		@Field("endTime") @Description("结束时间2020-08-01/2020-09") endTime:String,
		@Field("startTime") @Description("开始时间2020-08-01/2020-08") startTime:String,
		@Field("type") @Description("选择类型（1-以天为单位，2-以月为单位）") type:String
	):  Flowable<T>


	@Description("已完成订单人数")
	@FormUrlEncoded
	@POST(Constants.API.DONE_CONSUMER_ANALYSIS_Url)
	fun <T:BaseResult<Void>> doneConsumerAnalysis(
		@Field("endTime") @Description("结束时间2020-08-01/2020-09") endTime:String,
		@Field("startTime") @Description("开始时间2020-08-01/2020-08") startTime:String,
		@Field("type") @Description("选择类型（1-以天为单位，2-以月为单位）") type:String
	):  Flowable<T>


	@Description("已完成订单")
	@FormUrlEncoded
	@POST(Constants.API.DONE_NUM_ANALYSIS_Url)
	fun <T:BaseResult<Void>> doneNumAnalysis(
		@Field("endTime") @Description("结束时间2020-08-01/2020-09") endTime:String,
		@Field("startTime") @Description("开始时间2020-08-01/2020-08") startTime:String,
		@Field("type") @Description("选择类型（1-以天为单位，2-以月为单位）") type:String
	):  Flowable<T>


	@Description("订单概况")
	@FormUrlEncoded
	@POST(Constants.API.OVERVIEW_ANALYSIS_Url)
	fun <T:BaseResult<Void>> overviewAnalysis(
		@Field("endTime") @Description("结束时间2020-08-01") endTime:String,
		@Field("startTime") @Description("开始时间2020-08-01") startTime:String
	):  Flowable<T>


	@Description("订单实时数据")
	@POST(Constants.API.ORDERS_ANALYSIS_Url)
	fun <T:BaseResult<Void>> ordersAnalysis(

	):  Flowable<T>


	@Description("已完成订单金额")
	@FormUrlEncoded
	@POST(Constants.API.DONE_SUM_ANALYSIS_Url)
	fun <T:BaseResult<Void>> doneSumAnalysis(
		@Field("endTime") @Description("结束时间2020-08-01/2020-09") endTime:String,
		@Field("startTime") @Description("开始时间2020-08-01/2020-08") startTime:String,
		@Field("type") @Description("选择类型（1-以天为单位，2-以月为单位）") type:String
	):  Flowable<T>

}