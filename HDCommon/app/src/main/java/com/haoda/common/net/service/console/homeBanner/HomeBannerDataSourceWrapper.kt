package com.haoda.common.net.service.console.homeBanner

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface HomeBannerDataSourceWrapper {
	fun <T:BaseResult<Void>> save_8HomeBanner(channelType:String,discription:String,endTime:String,jumpType:String,name:String,pageUrl:String?,pic:String,productId:String?,sort:String,startTime:String,status:String):Flowable<T> {
		return ApiEngine.getService(HomeBannerService::class.java)
			.save_8HomeBanner<T>(channelType,discription,endTime,jumpType,name,pageUrl,pic,productId,sort,startTime,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_8HomeBanner(id:String):Flowable<T> {
		return ApiEngine.getService(HomeBannerService::class.java)
			.detail_8HomeBanner<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_8HomeBanner(channelType:String?,discription:String?,endTime:String?,id:String,jumpType:String?,name:String?,pageUrl:String?,pic:String?,productId:String?,sort:String?,startTime:String?,status:String?):Flowable<T> {
		return ApiEngine.getService(HomeBannerService::class.java)
			.update_8HomeBanner<T>(channelType,discription,endTime,id,jumpType,name,pageUrl,pic,productId,sort,startTime,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_7HomeBanner(id:String):Flowable<T> {
		return ApiEngine.getService(HomeBannerService::class.java)
			.delete_7HomeBanner<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_9HomeBanner(currentPage:String,name:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(HomeBannerService::class.java)
			.page_9HomeBanner<T>(currentPage,name,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> stopUse_3HomeBanner(id:String):Flowable<T> {
		return ApiEngine.getService(HomeBannerService::class.java)
			.stopUse_3HomeBanner<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadHtml5_1HomeBanner():Flowable<T> {
		return ApiEngine.getService(HomeBannerService::class.java)
			.uploadHtml5_1HomeBanner<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadPicture_4HomeBanner():Flowable<T> {
		return ApiEngine.getService(HomeBannerService::class.java)
			.uploadPicture_4HomeBanner<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> startUse_3HomeBanner(id:String):Flowable<T> {
		return ApiEngine.getService(HomeBannerService::class.java)
			.startUse_3HomeBanner<T>(id)
			.compose(RxSchedulers.io_main())
	}

}