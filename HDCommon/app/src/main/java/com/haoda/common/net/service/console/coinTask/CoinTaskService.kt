package com.haoda.common.net.service.console.coinTask

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface CoinTaskService : BaseService{
	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_1_COIN_TASK_Url)
	fun <T:BaseResult<Void>> delete_1CoinTask(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_1_COIN_TASK_Url)
	fun <T:BaseResult<Void>> page_1CoinTask(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("type") @Description("类型（1->签到2->商品分享3->商品评价）（非必须参数）") type:String?
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_1_COIN_TASK_Url)
	fun <T:BaseResult<Void>> detail_1CoinTask(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_1_COIN_TASK_Url)
	fun <T:BaseResult<Void>> save_1CoinTask(
		@Field("copperCoin") @Description("奖励米粉值") copperCoin:String,
		@Field("description") @Description("描述") description:String,
		@Field("endTime") @Description("结束时间") endTime:String,
		@Field("finishCount") @Description("奖励领取次数") finishCount:String,
		@Field("name") @Description("名称") name:String,
		@Field("sort") @Description("排序") sort:String,
		@Field("startTime") @Description("开始时间") startTime:String,
		@Field("status") @Description("状态（0->停用1->正常）") status:String,
		@Field("taskCount") @Description("任务完成次数") taskCount:String,
		@Field("type") @Description("类型（1->签到2->商品分享3->商品评价）") type:String
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_1_COIN_TASK_Url)
	fun <T:BaseResult<Void>> update_1CoinTask(
		@Field("copperCoin") @Description("奖励米粉值（非必须参数）") copperCoin:String?,
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("endTime") @Description("结束时间（非必须参数）") endTime:String?,
		@Field("finishCount") @Description("奖励领取次数（非必须参数）") finishCount:String?,
		@Field("id") @Description("id") id:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("sort") @Description("排序（非必须参数）") sort:String?,
		@Field("startTime") @Description("开始时间（非必须参数）") startTime:String?,
		@Field("status") @Description("状态（0->停用1->正常）（非必须参数）") status:String?,
		@Field("taskCount") @Description("任务完成次数（非必须参数）") taskCount:String?,
		@Field("type") @Description("类型（1->签到2->商品分享3->商品评价）（非必须参数）") type:String?
	):  Flowable<T>

}