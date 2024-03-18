package com.haoda.common.net.service.console.memberAnalysis

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class MemberAnalysisDataSourceImpl : BaseDataSource() {

	var service = object : MemberAnalysisDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("会员概况")
	fun<T:BaseResult<Void>> memberOverviewMemberAnalysis(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.memberOverviewMemberAnalysis<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> memberOverviewMemberAnalysis(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.memberOverviewMemberAnalysis<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("新增会员总数")
	fun<T:BaseResult<Void>> newAddSumMemberAnalysis(
		@Description("结束时间2020-08-01/2020-09") endTime:String,
		@Description("开始时间2020-08-01/2020-08") startTime:String,
		@Description("选择类型（1-以天为单位，2-以月为单位）") type:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.newAddSumMemberAnalysis<T>(endTime,startTime,type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> newAddSumMemberAnalysis(
		@Description("结束时间2020-08-01/2020-09") endTime:String,
		@Description("开始时间2020-08-01/2020-08") startTime:String,
		@Description("选择类型（1-以天为单位，2-以月为单位）") type:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.newAddSumMemberAnalysis<T>(endTime,startTime,type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("会员总数")
	fun<T:BaseResult<Void>> memberSumMemberAnalysis(
		@Description("结束时间2020-08-01/2020-09") endTime:String,
		@Description("开始时间2020-08-01/2020-08") startTime:String,
		@Description("选择类型（1-以天为单位，2-以月为单位）") type:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.memberSumMemberAnalysis<T>(endTime,startTime,type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> memberSumMemberAnalysis(
		@Description("结束时间2020-08-01/2020-09") endTime:String,
		@Description("开始时间2020-08-01/2020-08") startTime:String,
		@Description("选择类型（1-以天为单位，2-以月为单位）") type:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.memberSumMemberAnalysis<T>(endTime,startTime,type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}