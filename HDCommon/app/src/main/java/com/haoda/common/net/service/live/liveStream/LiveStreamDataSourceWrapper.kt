package com.haoda.common.net.service.live.liveStream

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface LiveStreamDataSourceWrapper {
	fun <T:BaseResult<Void>> rtmpPublishURLLiveStream(key:String?):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.rtmpPublishURLLiveStream<T>(key)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> followLiveStream(memberId:String):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.followLiveStream<T>(memberId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> liveShareUrlLiveStream(memberId:String,random:String?):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.liveShareUrlLiveStream<T>(memberId,random)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> rtmpPlayURLLiveStream(key:String?):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.rtmpPlayURLLiveStream<T>(key)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> historyRecordLiveStream(end:String?,key:String?,start:String?):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.historyRecordLiveStream<T>(end,key,start)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> liveStatusLiveStream(key:String?):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.liveStatusLiveStream<T>(key)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> listLiveRetLiveStream(limit:String?,marker:String?,viewerId:String):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.listLiveRetLiveStream<T>(limit,marker,viewerId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> snapshotPlayURLLiveStream(key:String?):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.snapshotPlayURLLiveStream<T>(key)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadPhotoLiveStream():Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.uploadPhotoLiveStream<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> hdlPlayURLLiveStream(key:String?):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.hdlPlayURLLiveStream<T>(key)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> createStreamLiveStream(key:String,memberId:String):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.createStreamLiveStream<T>(key,memberId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delLiveProductsLiveStream(memberId:String?):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.delLiveProductsLiveStream<T>(memberId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> qualificationAndIsExistKeyLiveStream(memberId:String):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.qualificationAndIsExistKeyLiveStream<T>(memberId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> saveLiveDataRetIdLiveStream(end:String?,key:String?,start:String?):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.saveLiveDataRetIdLiveStream<T>(end,key,start)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> saveLiveDataLiveStream(end:String?,key:String?,start:String?):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.saveLiveDataLiveStream<T>(end,key,start)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> liveShareDataLiveStream(memberId:String):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.liveShareDataLiveStream<T>(memberId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> enableStreamLiveStream(enableKey:String?):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.enableStreamLiveStream<T>(enableKey)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> saveLiveRoomInfoLiveStream(memberId:String,picUrl:String,productsInfo:String,roomName:String):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.saveLiveRoomInfoLiveStream<T>(memberId,picUrl,productsInfo,roomName)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> hlsPlayURLLiveStream(key:String?):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.hlsPlayURLLiveStream<T>(key)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> disableStreamLiveStream(disableKey:String?,disabledTill:String?,disabledType:String?):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.disableStreamLiveStream<T>(disableKey,disabledTill,disabledType)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> listRetLiveStream(limit:String?,marker:String?):Flowable<T> {
		return ApiEngine.getService(LiveStreamService::class.java)
			.listRetLiveStream<T>(limit,marker)
			.compose(RxSchedulers.io_main())
	}

}