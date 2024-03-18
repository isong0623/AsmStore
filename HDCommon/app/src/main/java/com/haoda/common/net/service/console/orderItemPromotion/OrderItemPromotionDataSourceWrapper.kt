package com.haoda.common.net.service.console.orderItemPromotion

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface OrderItemPromotionDataSourceWrapper {
	fun <T:BaseResult<Void>> detail_14OrderItemPromotion(id:String):Flowable<T> {
		return ApiEngine.getService(OrderItemPromotionService::class.java)
			.detail_14OrderItemPromotion<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_11OrderItemPromotion(id:String,orderItemId:String?,productId:String?,productQuantity:String?,promotionId:String?,promotionParam:String?,promotionType:String?):Flowable<T> {
		return ApiEngine.getService(OrderItemPromotionService::class.java)
			.update_11OrderItemPromotion<T>(id,orderItemId,productId,productQuantity,promotionId,promotionParam,promotionType)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_10OrderItemPromotion(id:String):Flowable<T> {
		return ApiEngine.getService(OrderItemPromotionService::class.java)
			.delete_10OrderItemPromotion<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_16OrderItemPromotion(currentPage:String,orderItemId:String?,pageSize:String?,productId:String?,productQuantity:String?,promotionId:String?,promotionParam:String?,promotionType:String?):Flowable<T> {
		return ApiEngine.getService(OrderItemPromotionService::class.java)
			.page_16OrderItemPromotion<T>(currentPage,orderItemId,pageSize,productId,productQuantity,promotionId,promotionParam,promotionType)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_11OrderItemPromotion(orderItemId:String,productId:String,productQuantity:String,promotionId:String,promotionParam:String,promotionType:String):Flowable<T> {
		return ApiEngine.getService(OrderItemPromotionService::class.java)
			.save_11OrderItemPromotion<T>(orderItemId,productId,productQuantity,promotionId,promotionParam,promotionType)
			.compose(RxSchedulers.io_main())
	}

}