package com.haoda.common.net.service.console.rate

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class RateDataSourceImpl : BaseDataSource() {

	var service = object : RateDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("详情")
	fun<T:BaseResult<Void>> detail_25Rate(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detail_25Rate<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detail_25Rate(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detail_25Rate<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("详情")
	fun<T:BaseResult<Void>> save_21Rate(
		@Description("会员比率") memberRate:String,
		@Description("一级佣金比率") oneroyaltyRate:String,
		@Description("平台比率") paltformRate:String,
		@Description("二级佣金比率") tworoyaltyRate:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.save_21Rate<T>(memberRate,oneroyaltyRate,paltformRate,tworoyaltyRate).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> save_21Rate(
		@Description("会员比率") memberRate:String,
		@Description("一级佣金比率") oneroyaltyRate:String,
		@Description("平台比率") paltformRate:String,
		@Description("二级佣金比率") tworoyaltyRate:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.save_21Rate<T>(memberRate,oneroyaltyRate,paltformRate,tworoyaltyRate).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取所有比率")
	fun<T:BaseResult<Void>> list_6Rate(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.list_6Rate<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> list_6Rate(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.list_6Rate<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("编辑")
	fun<T:BaseResult<Void>> update_21Rate(
		@Description("id（非必须参数）") id:String? = null,
		@Description("memberRate（非必须参数）") memberRate:String? = null,
		@Description("oneroyaltyRate（非必须参数）") oneroyaltyRate:String? = null,
		@Description("paltformRate（非必须参数）") paltformRate:String? = null,
		@Description("tworoyaltyRate（非必须参数）") tworoyaltyRate:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.update_21Rate<T>(id,memberRate,oneroyaltyRate,paltformRate,tworoyaltyRate).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> update_21Rate(
		@Description("id（非必须参数）") id:String? = null,
		@Description("memberRate（非必须参数）") memberRate:String? = null,
		@Description("oneroyaltyRate（非必须参数）") oneroyaltyRate:String? = null,
		@Description("paltformRate（非必须参数）") paltformRate:String? = null,
		@Description("tworoyaltyRate（非必须参数）") tworoyaltyRate:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.update_21Rate<T>(id,memberRate,oneroyaltyRate,paltformRate,tworoyaltyRate).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}