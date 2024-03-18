package com.haoda.common.net.service.live.liveRealtime

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class LiveRealtimeDataSourceImpl : BaseDataSource() {

	var service = object : LiveRealtimeDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("点赞")
	fun<T:BaseResult<Void>> updateLikeNumLiveRealtime(
		@Description("点赞数量") likeNum:String,
		@Description("直播用户ID") memberId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.updateLikeNumLiveRealtime<T>(likeNum,memberId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> updateLikeNumLiveRealtime(
		@Description("点赞数量") likeNum:String,
		@Description("直播用户ID") memberId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.updateLikeNumLiveRealtime<T>(likeNum,memberId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取当前直播点赞数")
	fun<T:BaseResult<Void>> getLikeNumLiveRealtime(
		@Description("是否为关闭直播事件（非必须参数）") isClose:String? = null,
		@Description("直播用户ID") memberId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getLikeNumLiveRealtime<T>(isClose,memberId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getLikeNumLiveRealtime(
		@Description("是否为关闭直播事件（非必须参数）") isClose:String? = null,
		@Description("直播用户ID") memberId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getLikeNumLiveRealtime<T>(isClose,memberId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("直播结束保存带货记录并返回")
	fun<T:BaseResult<Void>> updateliveRecordLiveRealtime(
		@Description("streamerId") streamerId:String,
		@Description("recordId") recordId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.updateliveRecordLiveRealtime<T>(streamerId,recordId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> updateliveRecordLiveRealtime(
		@Description("streamerId") streamerId:String,
		@Description("recordId") recordId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.updateliveRecordLiveRealtime<T>(streamerId,recordId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("移除黑名单中的用户")
	fun<T:BaseResult<Void>> removeBlackListLiveRealtime(
		@Description("黑名单用户id") blackUserId:String,
		@Description("主播id") streamerId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.removeBlackListLiveRealtime<T>(blackUserId,streamerId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> removeBlackListLiveRealtime(
		@Description("黑名单用户id") blackUserId:String,
		@Description("主播id") streamerId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.removeBlackListLiveRealtime<T>(blackUserId,streamerId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取管理列表（黑名单列表，禁言列表）")
	fun<T:BaseResult<Void>> getSuperviseListLiveRealtime(
		@Description("房间Id（可以为空）") roomId:String,
		@Description("主播id") streamerId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getSuperviseListLiveRealtime<T>(roomId,streamerId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getSuperviseListLiveRealtime(
		@Description("房间Id（可以为空）") roomId:String,
		@Description("主播id") streamerId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getSuperviseListLiveRealtime<T>(roomId,streamerId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("搜索直播间中观众")
	fun<T:BaseResult<Void>> searchViewerLiveRealtime(
		@Description("房间号") roomId:String,
		@Description("观众名") viewerName:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.searchViewerLiveRealtime<T>(roomId,viewerName).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> searchViewerLiveRealtime(
		@Description("房间号") roomId:String,
		@Description("观众名") viewerName:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.searchViewerLiveRealtime<T>(roomId,viewerName).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取直播间观众列表")
	fun<T:BaseResult<Void>> getViewerListLiveRealtime(
		@Description("房间ID") roomId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getViewerListLiveRealtime<T>(roomId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getViewerListLiveRealtime(
		@Description("房间ID") roomId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getViewerListLiveRealtime<T>(roomId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}