package com.haoda.common.net.service.mall.coinTask

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface CoinTaskService : BaseService{
	@Description("7天连续签到记录")
	@POST(Constants.API.SIGN_LOG_COIN_TASK_Url)
	fun <T:BaseResult<Void>> signLogCoinTask(

	):  Flowable<T>


	@Description("获取团子任务列表")
	@POST(Constants.API.GET_APP_COIN_TASK_LISTCOIN_TASK_Url)
	fun <T:BaseResult<Void>> getAppCoinTaskListCoinTask(

	):  Flowable<T>


	@Description("完成任务")
	@FormUrlEncoded
	@POST(Constants.API.COMPLETE_COIN_TASK_Url)
	fun <T:BaseResult<Void>> completeCoinTask(
		@Field("id") @Description("id（非必须参数）") id:String?
	):  Flowable<T>

}