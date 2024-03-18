package com.haoda.common.net.service.live.liveSubscribe

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class LiveSubscribeDataSourceImpl : BaseDataSource() {

	var service = object : LiveSubscribeDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("取消关注")
	fun<T:BaseResult<Void>> cancelSubscribeLiveSubscribe(
		@Description("当前用户Id") memberId:String,
		@Description("主播Id") streamerId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.cancelSubscribeLiveSubscribe<T>(memberId,streamerId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> cancelSubscribeLiveSubscribe(
		@Description("当前用户Id") memberId:String,
		@Description("主播Id") streamerId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.cancelSubscribeLiveSubscribe<T>(memberId,streamerId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("观众信息")
	fun<T:BaseResult<Void>> viewerInfoLiveSubscribe(
		@Description("当前用户Id") memberId:String,
		@Description("直播间Id") roomId:String,
		@Description("主播Id") streamerId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.viewerInfoLiveSubscribe<T>(memberId,roomId,streamerId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> viewerInfoLiveSubscribe(
		@Description("当前用户Id") memberId:String,
		@Description("直播间Id") roomId:String,
		@Description("主播Id") streamerId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.viewerInfoLiveSubscribe<T>(memberId,roomId,streamerId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("关注")
	fun<T:BaseResult<Void>> subscribeLiveSubscribe(
		@Description("当前用户Id") memberId:String,
		@Description("主播Id") streamerId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.subscribeLiveSubscribe<T>(memberId,streamerId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> subscribeLiveSubscribe(
		@Description("当前用户Id") memberId:String,
		@Description("主播Id") streamerId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.subscribeLiveSubscribe<T>(memberId,streamerId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取粉丝数/点赞数")
	fun<T:BaseResult<Void>> getStreamerInfoLiveSubscribe(
		@Description("主播Id") streamerId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getStreamerInfoLiveSubscribe<T>(streamerId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getStreamerInfoLiveSubscribe(
		@Description("主播Id") streamerId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getStreamerInfoLiveSubscribe<T>(streamerId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}