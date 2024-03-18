package com.haoda.common.net.service.console.promotion

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface PromotionDataSourceWrapper {
	fun <T:BaseResult<Void>> detail_22Promotion(id:String):Flowable<T> {
		return ApiEngine.getService(PromotionService::class.java)
			.detail_22Promotion<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> setProducts_1Promotion(id:String,productIds:String):Flowable<T> {
		return ApiEngine.getService(PromotionService::class.java)
			.setProducts_1Promotion<T>(id,productIds)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_24Promotion(currentPage:String,name:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(PromotionService::class.java)
			.page_24Promotion<T>(currentPage,name,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_18Promotion(description:String?,name:String,status:String):Flowable<T> {
		return ApiEngine.getService(PromotionService::class.java)
			.save_18Promotion<T>(description,name,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getSelectedProdectIds_1Promotion(id:String):Flowable<T> {
		return ApiEngine.getService(PromotionService::class.java)
			.getSelectedProdectIds_1Promotion<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_18Promotion(description:String?,id:String,name:String?,status:String?):Flowable<T> {
		return ApiEngine.getService(PromotionService::class.java)
			.update_18Promotion<T>(description,id,name,status)
			.compose(RxSchedulers.io_main())
	}

}