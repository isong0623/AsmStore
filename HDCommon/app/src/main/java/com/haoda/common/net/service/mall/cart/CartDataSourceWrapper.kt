package com.haoda.common.net.service.mall.cart

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface CartDataSourceWrapper {
	fun <T:BaseResult<Void>> getCartCart():Flowable<T> {
		return ApiEngine.getService(CartService::class.java)
			.getCartCart<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> appClearCart():Flowable<T> {
		return ApiEngine.getService(CartService::class.java)
			.appClearCart<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> selectCart(id:String?):Flowable<T> {
		return ApiEngine.getService(CartService::class.java)
			.selectCart<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> selectAllCart():Flowable<T> {
		return ApiEngine.getService(CartService::class.java)
			.selectAllCart<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> unSelectAllCart():Flowable<T> {
		return ApiEngine.getService(CartService::class.java)
			.unSelectAllCart<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> updateQuantityCart(id:String,quantity:String):Flowable<T> {
		return ApiEngine.getService(CartService::class.java)
			.updateQuantityCart<T>(id,quantity)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> unSelectCart(id:String?):Flowable<T> {
		return ApiEngine.getService(CartService::class.java)
			.unSelectCart<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> appBatchDeleteCart(ids:String):Flowable<T> {
		return ApiEngine.getService(CartService::class.java)
			.appBatchDeleteCart<T>(ids)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> appSaveCart(productAttributes:String,productId:String,quantity:String,skuCode:String):Flowable<T> {
		return ApiEngine.getService(CartService::class.java)
			.appSaveCart<T>(productAttributes,productId,quantity,skuCode)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> appDeleteCart(id:String):Flowable<T> {
		return ApiEngine.getService(CartService::class.java)
			.appDeleteCart<T>(id)
			.compose(RxSchedulers.io_main())
	}

}