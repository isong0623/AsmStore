package com.haoda.common.net.service.console.analysis

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class AnalysisDataSourceImpl : BaseDataSource() {

	var service = object : AnalysisDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("新增订单金额")
	fun<T:BaseResult<Void>> newAddSum_1Analysis(
		@Description("结束时间2020-08-01/2020-09") endTime:String,
		@Description("开始时间2020-08-01/2020-08") startTime:String,
		@Description("选择类型（1-以天为单位，2-以月为单位）") type:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.newAddSum_1Analysis<T>(endTime,startTime,type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> newAddSum_1Analysis(
		@Description("结束时间2020-08-01/2020-09") endTime:String,
		@Description("开始时间2020-08-01/2020-08") startTime:String,
		@Description("选择类型（1-以天为单位，2-以月为单位）") type:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.newAddSum_1Analysis<T>(endTime,startTime,type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("新增订单数量统计")
	fun<T:BaseResult<Void>> newAddNumAnalysis(
		@Description("结束时间2020-08-01/2020-09") endTime:String,
		@Description("开始时间2020-08-01/2020-08") startTime:String,
		@Description("选择类型（1-以天为单位，2-以月为单位）") type:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.newAddNumAnalysis<T>(endTime,startTime,type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> newAddNumAnalysis(
		@Description("结束时间2020-08-01/2020-09") endTime:String,
		@Description("开始时间2020-08-01/2020-08") startTime:String,
		@Description("选择类型（1-以天为单位，2-以月为单位）") type:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.newAddNumAnalysis<T>(endTime,startTime,type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("新增订单人数")
	fun<T:BaseResult<Void>> newAddConsumerAnalysis(
		@Description("结束时间2020-08-01/2020-09") endTime:String,
		@Description("开始时间2020-08-01/2020-08") startTime:String,
		@Description("选择类型（1-以天为单位，2-以月为单位）") type:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.newAddConsumerAnalysis<T>(endTime,startTime,type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> newAddConsumerAnalysis(
		@Description("结束时间2020-08-01/2020-09") endTime:String,
		@Description("开始时间2020-08-01/2020-08") startTime:String,
		@Description("选择类型（1-以天为单位，2-以月为单位）") type:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.newAddConsumerAnalysis<T>(endTime,startTime,type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("已完成订单人数")
	fun<T:BaseResult<Void>> doneConsumerAnalysis(
		@Description("结束时间2020-08-01/2020-09") endTime:String,
		@Description("开始时间2020-08-01/2020-08") startTime:String,
		@Description("选择类型（1-以天为单位，2-以月为单位）") type:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.doneConsumerAnalysis<T>(endTime,startTime,type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> doneConsumerAnalysis(
		@Description("结束时间2020-08-01/2020-09") endTime:String,
		@Description("开始时间2020-08-01/2020-08") startTime:String,
		@Description("选择类型（1-以天为单位，2-以月为单位）") type:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.doneConsumerAnalysis<T>(endTime,startTime,type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("已完成订单")
	fun<T:BaseResult<Void>> doneNumAnalysis(
		@Description("结束时间2020-08-01/2020-09") endTime:String,
		@Description("开始时间2020-08-01/2020-08") startTime:String,
		@Description("选择类型（1-以天为单位，2-以月为单位）") type:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.doneNumAnalysis<T>(endTime,startTime,type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> doneNumAnalysis(
		@Description("结束时间2020-08-01/2020-09") endTime:String,
		@Description("开始时间2020-08-01/2020-08") startTime:String,
		@Description("选择类型（1-以天为单位，2-以月为单位）") type:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.doneNumAnalysis<T>(endTime,startTime,type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("订单概况")
	fun<T:BaseResult<Void>> overviewAnalysis(
		@Description("结束时间2020-08-01") endTime:String,
		@Description("开始时间2020-08-01") startTime:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.overviewAnalysis<T>(endTime,startTime).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> overviewAnalysis(
		@Description("结束时间2020-08-01") endTime:String,
		@Description("开始时间2020-08-01") startTime:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.overviewAnalysis<T>(endTime,startTime).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("订单实时数据")
	fun<T:BaseResult<Void>> ordersAnalysis(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.ordersAnalysis<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> ordersAnalysis(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.ordersAnalysis<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("已完成订单金额")
	fun<T:BaseResult<Void>> doneSumAnalysis(
		@Description("结束时间2020-08-01/2020-09") endTime:String,
		@Description("开始时间2020-08-01/2020-08") startTime:String,
		@Description("选择类型（1-以天为单位，2-以月为单位）") type:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.doneSumAnalysis<T>(endTime,startTime,type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> doneSumAnalysis(
		@Description("结束时间2020-08-01/2020-09") endTime:String,
		@Description("开始时间2020-08-01/2020-08") startTime:String,
		@Description("选择类型（1-以天为单位，2-以月为单位）") type:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.doneSumAnalysis<T>(endTime,startTime,type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}