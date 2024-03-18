package com.haoda.common.net.service.live.liveSubscribe

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface LiveSubscribeDataSourceWrapper {
	fun <T:BaseResult<Void>> cancelSubscribeLiveSubscribe(memberId:String,streamerId:String):Flowable<T> {
		return ApiEngine.getService(LiveSubscribeService::class.java)
			.cancelSubscribeLiveSubscribe<T>(memberId,streamerId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> viewerInfoLiveSubscribe(memberId:String,roomId:String,streamerId:String):Flowable<T> {
		return ApiEngine.getService(LiveSubscribeService::class.java)
			.viewerInfoLiveSubscribe<T>(memberId,roomId,streamerId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> subscribeLiveSubscribe(memberId:String,streamerId:String):Flowable<T> {
		return ApiEngine.getService(LiveSubscribeService::class.java)
			.subscribeLiveSubscribe<T>(memberId,streamerId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getStreamerInfoLiveSubscribe(streamerId:String):Flowable<T> {
		return ApiEngine.getService(LiveSubscribeService::class.java)
			.getStreamerInfoLiveSubscribe<T>(streamerId)
			.compose(RxSchedulers.io_main())
	}

}