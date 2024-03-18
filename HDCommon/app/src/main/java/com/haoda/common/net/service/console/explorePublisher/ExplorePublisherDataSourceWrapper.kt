package com.haoda.common.net.service.console.explorePublisher

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface ExplorePublisherDataSourceWrapper {
	fun <T:BaseResult<Void>> save_5ExplorePublisher(memberId:String):Flowable<T> {
		return ApiEngine.getService(ExplorePublisherService::class.java)
			.save_5ExplorePublisher<T>(memberId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadPicture_3ExplorePublisher():Flowable<T> {
		return ApiEngine.getService(ExplorePublisherService::class.java)
			.uploadPicture_3ExplorePublisher<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_5ExplorePublisher(description:String?,icon:String?,id:String,nickname:String?,personSign:String?,status:String?):Flowable<T> {
		return ApiEngine.getService(ExplorePublisherService::class.java)
			.update_5ExplorePublisher<T>(description,icon,id,nickname,personSign,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_6ExplorePublisher(currentPage:String,nickname:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(ExplorePublisherService::class.java)
			.page_6ExplorePublisher<T>(currentPage,nickname,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_5ExplorePublisher(id:String):Flowable<T> {
		return ApiEngine.getService(ExplorePublisherService::class.java)
			.detail_5ExplorePublisher<T>(id)
			.compose(RxSchedulers.io_main())
	}

}