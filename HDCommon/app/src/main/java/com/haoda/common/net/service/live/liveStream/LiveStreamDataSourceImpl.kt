package com.haoda.common.net.service.live.liveStream

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class LiveStreamDataSourceImpl : BaseDataSource() {

	var service = object : LiveStreamDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("RTMP推流地址")
	fun<T:BaseResult<Void>> rtmpPublishURLLiveStream(
		@Description("流名（非必须参数）") key:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.rtmpPublishURLLiveStream<T>(key).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> rtmpPublishURLLiveStream(
		@Description("流名（非必须参数）") key:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.rtmpPublishURLLiveStream<T>(key).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("直播关注列表接口")
	fun<T:BaseResult<Void>> followLiveStream(
		@Description("当前用户ID") memberId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.followLiveStream<T>(memberId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> followLiveStream(
		@Description("当前用户ID") memberId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.followLiveStream<T>(memberId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("直播分享小程序URL")
	fun<T:BaseResult<Void>> liveShareUrlLiveStream(
		@Description("主播ID") memberId:String,
		@Description("当前用户的随机码（非必须参数）") random:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.liveShareUrlLiveStream<T>(memberId,random).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> liveShareUrlLiveStream(
		@Description("主播ID") memberId:String,
		@Description("当前用户的随机码（非必须参数）") random:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.liveShareUrlLiveStream<T>(memberId,random).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("RTMP直播地址")
	fun<T:BaseResult<Void>> rtmpPlayURLLiveStream(
		@Description("流名（非必须参数）") key:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.rtmpPlayURLLiveStream<T>(key).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> rtmpPlayURLLiveStream(
		@Description("流名（非必须参数）") key:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.rtmpPlayURLLiveStream<T>(key).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("查看推流历史")
	fun<T:BaseResult<Void>> historyRecordLiveStream(
		@Description("时间戳，结束时间（非必须参数）") end:String? = null,
		@Description("流名（非必须参数）") key:String? = null,
		@Description("时间戳，起始时间（非必须参数）") start:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.historyRecordLiveStream<T>(end,key,start).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> historyRecordLiveStream(
		@Description("时间戳，结束时间（非必须参数）") end:String? = null,
		@Description("流名（非必须参数）") key:String? = null,
		@Description("时间戳，起始时间（非必须参数）") start:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.historyRecordLiveStream<T>(end,key,start).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("查看直播状态")
	fun<T:BaseResult<Void>> liveStatusLiveStream(
		@Description("直播key（非必须参数）") key:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.liveStatusLiveStream<T>(key).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> liveStatusLiveStream(
		@Description("直播key（非必须参数）") key:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.liveStatusLiveStream<T>(key).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("列出正在直播的流")
	fun<T:BaseResult<Void>> listLiveRetLiveStream(
		@Description("查询的数量（非必须参数）") limit:String? = null,
		@Description("上一次查询返回的标记（非必须参数）") marker:String? = null,
		@Description("观众ID") viewerId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.listLiveRetLiveStream<T>(limit,marker,viewerId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> listLiveRetLiveStream(
		@Description("查询的数量（非必须参数）") limit:String? = null,
		@Description("上一次查询返回的标记（非必须参数）") marker:String? = null,
		@Description("观众ID") viewerId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.listLiveRetLiveStream<T>(limit,marker,viewerId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("截图直播地址")
	fun<T:BaseResult<Void>> snapshotPlayURLLiveStream(
		@Description("流名（非必须参数）") key:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.snapshotPlayURLLiveStream<T>(key).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> snapshotPlayURLLiveStream(
		@Description("流名（非必须参数）") key:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.snapshotPlayURLLiveStream<T>(key).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("上传封面")
	fun<T:BaseResult<Void>> uploadPhotoLiveStream(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.uploadPhotoLiveStream<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> uploadPhotoLiveStream(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.uploadPhotoLiveStream<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("HDL直播地址")
	fun<T:BaseResult<Void>> hdlPlayURLLiveStream(
		@Description("流名（非必须参数）") key:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.hdlPlayURLLiveStream<T>(key).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> hdlPlayURLLiveStream(
		@Description("流名（非必须参数）") key:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.hdlPlayURLLiveStream<T>(key).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取直播鉴权")
	fun<T:BaseResult<Void>> createStreamLiveStream(
		@Description("创建流的名") key:String,
		@Description("直播用户ID") memberId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.createStreamLiveStream<T>(key,memberId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> createStreamLiveStream(
		@Description("创建流的名") key:String,
		@Description("直播用户ID") memberId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.createStreamLiveStream<T>(key,memberId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("删除直播商品")
	fun<T:BaseResult<Void>> delLiveProductsLiveStream(
		@Description("memberId（非必须参数）") memberId:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.delLiveProductsLiveStream<T>(memberId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> delLiveProductsLiveStream(
		@Description("memberId（非必须参数）") memberId:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.delLiveProductsLiveStream<T>(memberId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("检查用户直播资格和鉴权key")
	fun<T:BaseResult<Void>> qualificationAndIsExistKeyLiveStream(
		@Description("memberId") memberId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.qualificationAndIsExistKeyLiveStream<T>(memberId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> qualificationAndIsExistKeyLiveStream(
		@Description("memberId") memberId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.qualificationAndIsExistKeyLiveStream<T>(memberId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("保存直播数据并获取作业id")
	fun<T:BaseResult<Void>> saveLiveDataRetIdLiveStream(
		@Description("时间戳，要保存的直播的结束时间（非必须参数）") end:String? = null,
		@Description("流名（非必须参数）") key:String? = null,
		@Description("时间戳，要保存的直播的起始时间（非必须参数）") start:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.saveLiveDataRetIdLiveStream<T>(end,key,start).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> saveLiveDataRetIdLiveStream(
		@Description("时间戳，要保存的直播的结束时间（非必须参数）") end:String? = null,
		@Description("流名（非必须参数）") key:String? = null,
		@Description("时间戳，要保存的直播的起始时间（非必须参数）") start:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.saveLiveDataRetIdLiveStream<T>(end,key,start).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("保存直播数据")
	fun<T:BaseResult<Void>> saveLiveDataLiveStream(
		@Description("时间戳，要保存的直播的结束时间（非必须参数）") end:String? = null,
		@Description("流名（非必须参数）") key:String? = null,
		@Description("时间戳，要保存的直播的起始时间（非必须参数）") start:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.saveLiveDataLiveStream<T>(end,key,start).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> saveLiveDataLiveStream(
		@Description("时间戳，要保存的直播的结束时间（非必须参数）") end:String? = null,
		@Description("流名（非必须参数）") key:String? = null,
		@Description("时间戳，要保存的直播的起始时间（非必须参数）") start:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.saveLiveDataLiveStream<T>(end,key,start).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("直播分享")
	fun<T:BaseResult<Void>> liveShareDataLiveStream(
		@Description("主播ID") memberId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.liveShareDataLiveStream<T>(memberId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> liveShareDataLiveStream(
		@Description("主播ID") memberId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.liveShareDataLiveStream<T>(memberId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("启用流直播")
	fun<T:BaseResult<Void>> enableStreamLiveStream(
		@Description("启用的流名（非必须参数）") enableKey:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.enableStreamLiveStream<T>(enableKey).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> enableStreamLiveStream(
		@Description("启用的流名（非必须参数）") enableKey:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.enableStreamLiveStream<T>(enableKey).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("保存直播间信息")
	fun<T:BaseResult<Void>> saveLiveRoomInfoLiveStream(
		@Description("直播用户ID") memberId:String,
		@Description("封面Url") picUrl:String,
		@Description("商品Id集合") productsInfo:String,
		@Description("房间名") roomName:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.saveLiveRoomInfoLiveStream<T>(memberId,picUrl,productsInfo,roomName).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> saveLiveRoomInfoLiveStream(
		@Description("直播用户ID") memberId:String,
		@Description("封面Url") picUrl:String,
		@Description("商品Id集合") productsInfo:String,
		@Description("房间名") roomName:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.saveLiveRoomInfoLiveStream<T>(memberId,picUrl,productsInfo,roomName).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("HLS直播地址")
	fun<T:BaseResult<Void>> hlsPlayURLLiveStream(
		@Description("流名（非必须参数）") key:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.hlsPlayURLLiveStream<T>(key).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> hlsPlayURLLiveStream(
		@Description("流名（非必须参数）") key:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.hlsPlayURLLiveStream<T>(key).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("禁播")
	fun<T:BaseResult<Void>> disableStreamLiveStream(
		@Description("禁用的流名（非必须参数）") disableKey:String? = null,
		@Description("禁用时间（分钟）（非必须参数）") disabledTill:String? = null,
		@Description("禁用类型（非必须参数）") disabledType:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.disableStreamLiveStream<T>(disableKey,disabledTill,disabledType).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> disableStreamLiveStream(
		@Description("禁用的流名（非必须参数）") disableKey:String? = null,
		@Description("禁用时间（分钟）（非必须参数）") disabledTill:String? = null,
		@Description("禁用类型（非必须参数）") disabledType:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.disableStreamLiveStream<T>(disableKey,disabledTill,disabledType).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("列出所有流")
	fun<T:BaseResult<Void>> listRetLiveStream(
		@Description("查询的数量（非必须参数）") limit:String? = null,
		@Description("上一次查询返回的标记（非必须参数）") marker:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.listRetLiveStream<T>(limit,marker).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> listRetLiveStream(
		@Description("查询的数量（非必须参数）") limit:String? = null,
		@Description("上一次查询返回的标记（非必须参数）") marker:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.listRetLiveStream<T>(limit,marker).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}