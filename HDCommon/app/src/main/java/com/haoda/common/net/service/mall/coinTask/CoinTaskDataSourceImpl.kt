package com.haoda.common.net.service.mall.coinTask

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

	@Description("7天连续签到记录")
	fun<T:BaseResult<Void>> signLogCoinTask(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.signLogCoinTask<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> signLogCoinTask(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.signLogCoinTask<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取团子任务列表")
	fun<T:BaseResult<Void>> getAppCoinTaskListCoinTask(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getAppCoinTaskListCoinTask<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getAppCoinTaskListCoinTask(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getAppCoinTaskListCoinTask<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("完成任务")
	fun<T:BaseResult<Void>> completeCoinTask(
		@Description("id（非必须参数）") id:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.completeCoinTask<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> completeCoinTask(
		@Description("id（非必须参数）") id:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.completeCoinTask<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}