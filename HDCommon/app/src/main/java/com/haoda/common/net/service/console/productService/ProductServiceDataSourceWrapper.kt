package com.haoda.common.net.service.console.productService

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface ProductServiceDataSourceWrapper {
	fun <T:BaseResult<Void>> detail_20ProductService(id:String):Flowable<T> {
		return ApiEngine.getService(ProductServiceService::class.java)
			.detail_20ProductService<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_22ProductService(currentPage:String,name:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(ProductServiceService::class.java)
			.page_22ProductService<T>(currentPage,name,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_15ProductService(id:String):Flowable<T> {
		return ApiEngine.getService(ProductServiceService::class.java)
			.delete_15ProductService<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_16ProductService(description:String?,id:String,name:String?,sort:String?):Flowable<T> {
		return ApiEngine.getService(ProductServiceService::class.java)
			.update_16ProductService<T>(description,id,name,sort)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_16ProductService(description:String,name:String,sort:String):Flowable<T> {
		return ApiEngine.getService(ProductServiceService::class.java)
			.save_16ProductService<T>(description,name,sort)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> list_4ProductService():Flowable<T> {
		return ApiEngine.getService(ProductServiceService::class.java)
			.list_4ProductService<T>()
			.compose(RxSchedulers.io_main())
	}

}