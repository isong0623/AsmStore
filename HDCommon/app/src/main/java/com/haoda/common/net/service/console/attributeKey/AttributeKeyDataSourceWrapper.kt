package com.haoda.common.net.service.console.attributeKey

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface AttributeKeyDataSourceWrapper {
	fun <T:BaseResult<Void>> page_20AttributeKey(attributeCategoryId:String?,currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(AttributeKeyService::class.java)
			.page_20AttributeKey<T>(attributeCategoryId,currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_18AttributeKey(id:String):Flowable<T> {
		return ApiEngine.getService(AttributeKeyService::class.java)
			.detail_18AttributeKey<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> list_2AttributeKey(attributeCategoryId:String?):Flowable<T> {
		return ApiEngine.getService(AttributeKeyService::class.java)
			.list_2AttributeKey<T>(attributeCategoryId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_14AttributeKey(attributeCategoryId:String?,attributeKey:String?,attributeValue:String,id:String,note:String?,sort:String?):Flowable<T> {
		return ApiEngine.getService(AttributeKeyService::class.java)
			.update_14AttributeKey<T>(attributeCategoryId,attributeKey,attributeValue,id,note,sort)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_13AttributeKey(id:String):Flowable<T> {
		return ApiEngine.getService(AttributeKeyService::class.java)
			.delete_13AttributeKey<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_14AttributeKey(attributeCategoryId:String,attributeKey:String,attributeValue:String,note:String?,sort:String):Flowable<T> {
		return ApiEngine.getService(AttributeKeyService::class.java)
			.save_14AttributeKey<T>(attributeCategoryId,attributeKey,attributeValue,note,sort)
			.compose(RxSchedulers.io_main())
	}

}