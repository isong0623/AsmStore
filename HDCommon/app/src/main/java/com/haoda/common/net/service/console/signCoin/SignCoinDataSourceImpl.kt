package com.haoda.common.net.service.console.signCoin

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class SignCoinDataSourceImpl : BaseDataSource() {

	var service = object : SignCoinDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("删除签到配置")
	fun<T:BaseResult<Void>> delete_21SignCoin(
		@Description("签到配置id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.delete_21SignCoin<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> delete_21SignCoin(
		@Description("签到配置id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.delete_21SignCoin<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("添加签到配置")
	fun<T:BaseResult<Void>> save_24SignCoin(
		@Description("获取额外积分奖励的条件(连续天数)") continuousSum:String,
		@Description("签到基本积分奖励（非必须参数）") copperCoin:String? = null,
		@Description("连续签到额外积分奖励") copperCoinExtra:String,
		@Description("dayofweek(1、2、3、4、5、6、7)") weekDay:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.save_24SignCoin<T>(continuousSum,copperCoin,copperCoinExtra,weekDay).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> save_24SignCoin(
		@Description("获取额外积分奖励的条件(连续天数)") continuousSum:String,
		@Description("签到基本积分奖励（非必须参数）") copperCoin:String? = null,
		@Description("连续签到额外积分奖励") copperCoinExtra:String,
		@Description("dayofweek(1、2、3、4、5、6、7)") weekDay:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.save_24SignCoin<T>(continuousSum,copperCoin,copperCoinExtra,weekDay).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("签到配置详情")
	fun<T:BaseResult<Void>> detail_28SignCoin(
		@Description("签到配置id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detail_28SignCoin<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detail_28SignCoin(
		@Description("签到配置id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detail_28SignCoin<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("签到配置list")
	fun<T:BaseResult<Void>> list_7SignCoin(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.list_7SignCoin<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> list_7SignCoin(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.list_7SignCoin<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("更新签到配置")
	fun<T:BaseResult<Void>> update_24SignCoin(
		@Description("获取额外积分奖励的条件(连续天数)（非必须参数）") continuousSum:String? = null,
		@Description("签到基本积分奖励（非必须参数）") copperCoin:String? = null,
		@Description("连续签到额外积分奖励（非必须参数）") copperCoinExtra:String? = null,
		@Description("签到配置id") id:String,
		@Description("dayofweek(1、2、3、4、5、6、7)（非必须参数）") weekDay:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.update_24SignCoin<T>(continuousSum,copperCoin,copperCoinExtra,id,weekDay).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> update_24SignCoin(
		@Description("获取额外积分奖励的条件(连续天数)（非必须参数）") continuousSum:String? = null,
		@Description("签到基本积分奖励（非必须参数）") copperCoin:String? = null,
		@Description("连续签到额外积分奖励（非必须参数）") copperCoinExtra:String? = null,
		@Description("签到配置id") id:String,
		@Description("dayofweek(1、2、3、4、5、6、7)（非必须参数）") weekDay:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.update_24SignCoin<T>(continuousSum,copperCoin,copperCoinExtra,id,weekDay).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("签到配置分页")
	fun<T:BaseResult<Void>> page_29SignCoin(
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.page_29SignCoin<T>(currentPage,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> page_29SignCoin(
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.page_29SignCoin<T>(currentPage,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}