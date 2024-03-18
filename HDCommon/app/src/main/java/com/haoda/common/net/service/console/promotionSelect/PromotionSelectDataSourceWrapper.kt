package com.haoda.common.net.service.console.promotionSelect

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface PromotionSelectDataSourceWrapper {
	fun <T:BaseResult<Void>> update_20PromotionSelect(discount:String?,discription:String?,id:String,perLimit:String?,promotionDate:String?,saleMax:String?,startTime:String?,status:String?,title:String?):Flowable<T> {
		return ApiEngine.getService(PromotionSelectService::class.java)
			.update_20PromotionSelect<T>(discount,discription,id,perLimit,promotionDate,saleMax,startTime,status,title)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getSelectedProdectIds_3PromotionSelect(id:String):Flowable<T> {
		return ApiEngine.getService(PromotionSelectService::class.java)
			.getSelectedProdectIds_3PromotionSelect<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_24PromotionSelect(id:String):Flowable<T> {
		return ApiEngine.getService(PromotionSelectService::class.java)
			.detail_24PromotionSelect<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_20PromotionSelect(discount:String,discription:String?,perLimit:String,promotionDate:String,saleMax:String,startTime:String,status:String,title:String):Flowable<T> {
		return ApiEngine.getService(PromotionSelectService::class.java)
			.save_20PromotionSelect<T>(discount,discription,perLimit,promotionDate,saleMax,startTime,status,title)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_26PromotionSelect(currentPage:String,pageSize:String?,title:String?):Flowable<T> {
		return ApiEngine.getService(PromotionSelectService::class.java)
			.page_26PromotionSelect<T>(currentPage,pageSize,title)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_18PromotionSelect(id:String):Flowable<T> {
		return ApiEngine.getService(PromotionSelectService::class.java)
			.delete_18PromotionSelect<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> setProducts_3PromotionSelect(id:String,skuCodes:String,productIds:String):Flowable<T> {
		return ApiEngine.getService(PromotionSelectService::class.java)
			.setProducts_3PromotionSelect<T>(id,skuCodes,productIds)
			.compose(RxSchedulers.io_main())
	}

}