package com.haoda.common.net.service.console.promotionDaily

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface PromotionDailyDataSourceWrapper {
	fun <T:BaseResult<Void>> setProducts_2PromotionDaily(id:String,productIds:String):Flowable<T> {
		return ApiEngine.getService(PromotionDailyService::class.java)
			.setProducts_2PromotionDaily<T>(id,productIds)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> startUse_6PromotionDaily(id:String):Flowable<T> {
		return ApiEngine.getService(PromotionDailyService::class.java)
			.startUse_6PromotionDaily<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_19PromotionDaily(categoryId:String?,description:String?,endTime:String?,id:String,name:String?,pic:String?,sort:String?,startTime:String?,status:String?):Flowable<T> {
		return ApiEngine.getService(PromotionDailyService::class.java)
			.update_19PromotionDaily<T>(categoryId,description,endTime,id,name,pic,sort,startTime,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadPicture_8PromotionDaily():Flowable<T> {
		return ApiEngine.getService(PromotionDailyService::class.java)
			.uploadPicture_8PromotionDaily<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_17PromotionDaily(id:String):Flowable<T> {
		return ApiEngine.getService(PromotionDailyService::class.java)
			.delete_17PromotionDaily<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getSelectedProdectIds_2PromotionDaily(id:String):Flowable<T> {
		return ApiEngine.getService(PromotionDailyService::class.java)
			.getSelectedProdectIds_2PromotionDaily<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_23PromotionDaily(id:String):Flowable<T> {
		return ApiEngine.getService(PromotionDailyService::class.java)
			.detail_23PromotionDaily<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_19PromotionDaily(categoryId:String,description:String?,endTime:String,name:String,pic:String,sort:String,startTime:String,status:String):Flowable<T> {
		return ApiEngine.getService(PromotionDailyService::class.java)
			.save_19PromotionDaily<T>(categoryId,description,endTime,name,pic,sort,startTime,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_25PromotionDaily(currentPage:String,name:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(PromotionDailyService::class.java)
			.page_25PromotionDaily<T>(currentPage,name,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> stopUse_6PromotionDaily(id:String):Flowable<T> {
		return ApiEngine.getService(PromotionDailyService::class.java)
			.stopUse_6PromotionDaily<T>(id)
			.compose(RxSchedulers.io_main())
	}

}