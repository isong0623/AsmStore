package com.haoda.common.net.service.mall.home

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface HomeDataSourceWrapper {
	fun <T:BaseResult<Void>> getAppBannerHome():Flowable<T> {
		return ApiEngine.getService(HomeService::class.java)
			.getAppBannerHome<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getPromotionSelectHome():Flowable<T> {
		return ApiEngine.getService(HomeService::class.java)
			.getPromotionSelectHome<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getPromotionHotHome(currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(HomeService::class.java)
			.getPromotionHotHome<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getAppHomePicHome():Flowable<T> {
		return ApiEngine.getService(HomeService::class.java)
			.getAppHomePicHome<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getAppLaberHome():Flowable<T> {
		return ApiEngine.getService(HomeService::class.java)
			.getAppLaberHome<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> addShareNumHome(shareSign:String):Flowable<T> {
		return ApiEngine.getService(HomeService::class.java)
			.addShareNumHome<T>(shareSign)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getPromotionDailyHome():Flowable<T> {
		return ApiEngine.getService(HomeService::class.java)
			.getPromotionDailyHome<T>()
			.compose(RxSchedulers.io_main())
	}

}