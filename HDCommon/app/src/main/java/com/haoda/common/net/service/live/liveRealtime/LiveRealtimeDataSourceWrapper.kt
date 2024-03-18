package com.haoda.common.net.service.live.liveRealtime

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface LiveRealtimeDataSourceWrapper {
	fun <T:BaseResult<Void>> updateLikeNumLiveRealtime(likeNum:String,memberId:String):Flowable<T> {
		return ApiEngine.getService(LiveRealtimeService::class.java)
			.updateLikeNumLiveRealtime<T>(likeNum,memberId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getLikeNumLiveRealtime(isClose:String?,memberId:String):Flowable<T> {
		return ApiEngine.getService(LiveRealtimeService::class.java)
			.getLikeNumLiveRealtime<T>(isClose,memberId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> updateliveRecordLiveRealtime(streamerId:String,recordId:String):Flowable<T> {
		return ApiEngine.getService(LiveRealtimeService::class.java)
			.updateliveRecordLiveRealtime<T>(streamerId,recordId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> removeBlackListLiveRealtime(blackUserId:String,streamerId:String):Flowable<T> {
		return ApiEngine.getService(LiveRealtimeService::class.java)
			.removeBlackListLiveRealtime<T>(blackUserId,streamerId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getSuperviseListLiveRealtime(roomId:String,streamerId:String):Flowable<T> {
		return ApiEngine.getService(LiveRealtimeService::class.java)
			.getSuperviseListLiveRealtime<T>(roomId,streamerId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> searchViewerLiveRealtime(roomId:String,viewerName:String):Flowable<T> {
		return ApiEngine.getService(LiveRealtimeService::class.java)
			.searchViewerLiveRealtime<T>(roomId,viewerName)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getViewerListLiveRealtime(roomId:String):Flowable<T> {
		return ApiEngine.getService(LiveRealtimeService::class.java)
			.getViewerListLiveRealtime<T>(roomId)
			.compose(RxSchedulers.io_main())
	}

}