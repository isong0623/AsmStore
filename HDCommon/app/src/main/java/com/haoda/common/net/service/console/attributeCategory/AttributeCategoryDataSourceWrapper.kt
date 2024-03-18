package com.haoda.common.net.service.console.attributeCategory

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface AttributeCategoryDataSourceWrapper {
	fun <T:BaseResult<Void>> update_13AttributeCategory(attributeCategoryName:String,id:String,note:String?,sort:String):Flowable<T> {
		return ApiEngine.getService(AttributeCategoryService::class.java)
			.update_13AttributeCategory<T>(attributeCategoryName,id,note,sort)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_19AttributeCategory(currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(AttributeCategoryService::class.java)
			.page_19AttributeCategory<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_13AttributeCategory(attributeCategoryName:String,note:String?,sort:String):Flowable<T> {
		return ApiEngine.getService(AttributeCategoryService::class.java)
			.save_13AttributeCategory<T>(attributeCategoryName,note,sort)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> list_1AttributeCategory():Flowable<T> {
		return ApiEngine.getService(AttributeCategoryService::class.java)
			.list_1AttributeCategory<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_17AttributeCategory(id:String):Flowable<T> {
		return ApiEngine.getService(AttributeCategoryService::class.java)
			.detail_17AttributeCategory<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_12AttributeCategory(id:String):Flowable<T> {
		return ApiEngine.getService(AttributeCategoryService::class.java)
			.delete_12AttributeCategory<T>(id)
			.compose(RxSchedulers.io_main())
	}

}