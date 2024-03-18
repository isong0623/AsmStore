package com.haoda.common.net.service.console.product

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface ProductDataSourceWrapper {
	fun <T:BaseResult<Void>> unpublish_1Product(id:String):Flowable<T> {
		return ApiEngine.getService(ProductService::class.java)
			.unpublish_1Product<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> list_3Product():Flowable<T> {
		return ApiEngine.getService(ProductService::class.java)
			.list_3Product<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> updateImgProduct(productId:String):Flowable<T> {
		return ApiEngine.getService(ProductService::class.java)
			.updateImgProduct<T>(productId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_15Product():Flowable<T> {
		return ApiEngine.getService(ProductService::class.java)
			.update_15Product<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_19Product(id:String):Flowable<T> {
		return ApiEngine.getService(ProductService::class.java)
			.detail_19Product<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> pageByCategoryIdProduct(categoryId:String,currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(ProductService::class.java)
			.pageByCategoryIdProduct<T>(categoryId,currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_14Product(id:String):Flowable<T> {
		return ApiEngine.getService(ProductService::class.java)
			.delete_14Product<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> refreshAllProduct():Flowable<T> {
		return ApiEngine.getService(ProductService::class.java)
			.refreshAllProduct<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> publish_1Product(id:String):Flowable<T> {
		return ApiEngine.getService(ProductService::class.java)
			.publish_1Product<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_21Product(currentPage:String,firstCategoryId:String?,name:String?,pageSize:String?,publishStatus:String?):Flowable<T> {
		return ApiEngine.getService(ProductService::class.java)
			.page_21Product<T>(currentPage,firstCategoryId,name,pageSize,publishStatus)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_15Product():Flowable<T> {
		return ApiEngine.getService(ProductService::class.java)
			.save_15Product<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadPicture_7Product():Flowable<T> {
		return ApiEngine.getService(ProductService::class.java)
			.uploadPicture_7Product<T>()
			.compose(RxSchedulers.io_main())
	}

}