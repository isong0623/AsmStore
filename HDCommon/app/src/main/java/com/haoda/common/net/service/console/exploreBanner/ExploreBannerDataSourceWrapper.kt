package com.haoda.common.net.service.console.exploreBanner

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface ExploreBannerDataSourceWrapper {
	fun <T:BaseResult<Void>> delete_4ExploreBanner(id:String):Flowable<T> {
		return ApiEngine.getService(ExploreBannerService::class.java)
			.delete_4ExploreBanner<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_4ExploreBanner(articleId:String?,channelType:String,discription:String?,endTime:String,jumpType:String,name:String,pageUrl:String?,pic:String,sort:String,startTime:String,status:String):Flowable<T> {
		return ApiEngine.getService(ExploreBannerService::class.java)
			.save_4ExploreBanner<T>(articleId,channelType,discription,endTime,jumpType,name,pageUrl,pic,sort,startTime,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_5ExploreBanner(currentPage:String,name:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(ExploreBannerService::class.java)
			.page_5ExploreBanner<T>(currentPage,name,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> stopUse_1ExploreBanner(id:String):Flowable<T> {
		return ApiEngine.getService(ExploreBannerService::class.java)
			.stopUse_1ExploreBanner<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadPicture_2ExploreBanner():Flowable<T> {
		return ApiEngine.getService(ExploreBannerService::class.java)
			.uploadPicture_2ExploreBanner<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_4ExploreBanner(articleId:String?,channelType:String?,discription:String?,endTime:String?,id:String,jumpType:String?,name:String?,pageUrl:String?,pic:String?,sort:String?,startTime:String?,status:String?):Flowable<T> {
		return ApiEngine.getService(ExploreBannerService::class.java)
			.update_4ExploreBanner<T>(articleId,channelType,discription,endTime,id,jumpType,name,pageUrl,pic,sort,startTime,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_4ExploreBanner(id:String):Flowable<T> {
		return ApiEngine.getService(ExploreBannerService::class.java)
			.detail_4ExploreBanner<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> startUse_1ExploreBanner(id:String):Flowable<T> {
		return ApiEngine.getService(ExploreBannerService::class.java)
			.startUse_1ExploreBanner<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadHtml5ExploreBanner():Flowable<T> {
		return ApiEngine.getService(ExploreBannerService::class.java)
			.uploadHtml5ExploreBanner<T>()
			.compose(RxSchedulers.io_main())
	}

}