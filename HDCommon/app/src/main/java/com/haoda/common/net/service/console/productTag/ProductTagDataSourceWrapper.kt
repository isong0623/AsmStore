package com.haoda.common.net.service.console.productTag

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface ProductTagDataSourceWrapper {
	fun <T:BaseResult<Void>> update_17ProductTag(discription:String?,id:String,name:String?):Flowable<T> {
		return ApiEngine.getService(ProductTagService::class.java)
			.update_17ProductTag<T>(discription,id,name)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_17ProductTag(discription:String?,name:String):Flowable<T> {
		return ApiEngine.getService(ProductTagService::class.java)
			.save_17ProductTag<T>(discription,name)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> list_5ProductTag():Flowable<T> {
		return ApiEngine.getService(ProductTagService::class.java)
			.list_5ProductTag<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_16ProductTag(id:String):Flowable<T> {
		return ApiEngine.getService(ProductTagService::class.java)
			.delete_16ProductTag<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_23ProductTag(currentPage:String,name:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(ProductTagService::class.java)
			.page_23ProductTag<T>(currentPage,name,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_21ProductTag(id:String):Flowable<T> {
		return ApiEngine.getService(ProductTagService::class.java)
			.detail_21ProductTag<T>(id)
			.compose(RxSchedulers.io_main())
	}

}