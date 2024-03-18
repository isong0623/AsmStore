package com.haoda.common.net.service.console.coinTask

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class CoinTaskDataSourceImpl : BaseDataSource() {

	var service = object : CoinTaskDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("删除")
	fun<T:BaseResult<Void>> delete_1CoinTask(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.delete_1CoinTask<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> delete_1CoinTask(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.delete_1CoinTask<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分页查询")
	fun<T:BaseResult<Void>> page_1CoinTask(
		@Description("当前页") currentPage:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("类型（1->签到2->商品分享3->商品评价）（非必须参数）") type:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.page_1CoinTask<T>(currentPage,name,pageSize,type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> page_1CoinTask(
		@Description("当前页") currentPage:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("类型（1->签到2->商品分享3->商品评价）（非必须参数）") type:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.page_1CoinTask<T>(currentPage,name,pageSize,type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("详情")
	fun<T:BaseResult<Void>> detail_1CoinTask(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detail_1CoinTask<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detail_1CoinTask(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detail_1CoinTask<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("添加")
	fun<T:BaseResult<Void>> save_1CoinTask(
		@Description("奖励米粉值") copperCoin:String,
		@Description("描述") description:String,
		@Description("结束时间") endTime:String,
		@Description("奖励领取次数") finishCount:String,
		@Description("名称") name:String,
		@Description("排序") sort:String,
		@Description("开始时间") startTime:String,
		@Description("状态（0->停用1->正常）") status:String,
		@Description("任务完成次数") taskCount:String,
		@Description("类型（1->签到2->商品分享3->商品评价）") type:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.save_1CoinTask<T>(copperCoin,description,endTime,finishCount,name,sort,startTime,status,taskCount,type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> save_1CoinTask(
		@Description("奖励米粉值") copperCoin:String,
		@Description("描述") description:String,
		@Description("结束时间") endTime:String,
		@Description("奖励领取次数") finishCount:String,
		@Description("名称") name:String,
		@Description("排序") sort:String,
		@Description("开始时间") startTime:String,
		@Description("状态（0->停用1->正常）") status:String,
		@Description("任务完成次数") taskCount:String,
		@Description("类型（1->签到2->商品分享3->商品评价）") type:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.save_1CoinTask<T>(copperCoin,description,endTime,finishCount,name,sort,startTime,status,taskCount,type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("修改")
	fun<T:BaseResult<Void>> update_1CoinTask(
		@Description("奖励米粉值（非必须参数）") copperCoin:String? = null,
		@Description("描述（非必须参数）") description:String? = null,
		@Description("结束时间（非必须参数）") endTime:String? = null,
		@Description("奖励领取次数（非必须参数）") finishCount:String? = null,
		@Description("id") id:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("排序（非必须参数）") sort:String? = null,
		@Description("开始时间（非必须参数）") startTime:String? = null,
		@Description("状态（0->停用1->正常）（非必须参数）") status:String? = null,
		@Description("任务完成次数（非必须参数）") taskCount:String? = null,
		@Description("类型（1->签到2->商品分享3->商品评价）（非必须参数）") type:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.update_1CoinTask<T>(copperCoin,description,endTime,finishCount,id,name,sort,startTime,status,taskCount,type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> update_1CoinTask(
		@Description("奖励米粉值（非必须参数）") copperCoin:String? = null,
		@Description("描述（非必须参数）") description:String? = null,
		@Description("结束时间（非必须参数）") endTime:String? = null,
		@Description("奖励领取次数（非必须参数）") finishCount:String? = null,
		@Description("id") id:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("排序（非必须参数）") sort:String? = null,
		@Description("开始时间（非必须参数）") startTime:String? = null,
		@Description("状态（0->停用1->正常）（非必须参数）") status:String? = null,
		@Description("任务完成次数（非必须参数）") taskCount:String? = null,
		@Description("类型（1->签到2->商品分享3->商品评价）（非必须参数）") type:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.update_1CoinTask<T>(copperCoin,description,endTime,finishCount,id,name,sort,startTime,status,taskCount,type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}