package com.haoda.common.net.service.console.searchHot

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface SearchHotDataSourceWrapper {
	fun <T:BaseResult<Void>> page_28SearchHot(currentPage:String,keywords:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(SearchHotService::class.java)
			.page_28SearchHot<T>(currentPage,keywords,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_23SearchHot(id:String,keywords:String?,sort:String?,status:String?):Flowable<T> {
		return ApiEngine.getService(SearchHotService::class.java)
			.update_23SearchHot<T>(id,keywords,sort,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> stopUse_8SearchHot(id:String):Flowable<T> {
		return ApiEngine.getService(SearchHotService::class.java)
			.stopUse_8SearchHot<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_20SearchHot(id:String):Flowable<T> {
		return ApiEngine.getService(SearchHotService::class.java)
			.delete_20SearchHot<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_27SearchHot(id:String):Flowable<T> {
		return ApiEngine.getService(SearchHotService::class.java)
			.detail_27SearchHot<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_23SearchHot(keywords:String,sort:String,status:String):Flowable<T> {
		return ApiEngine.getService(SearchHotService::class.java)
			.save_23SearchHot<T>(keywords,sort,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> startUse_8SearchHot(id:String):Flowable<T> {
		return ApiEngine.getService(SearchHotService::class.java)
			.startUse_8SearchHot<T>(id)
			.compose(RxSchedulers.io_main())
	}

}