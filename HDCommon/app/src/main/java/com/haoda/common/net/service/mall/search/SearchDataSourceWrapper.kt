package com.haoda.common.net.service.mall.search

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface SearchDataSourceWrapper {
	fun <T:BaseResult<Void>> appGetSearchHotSearch():Flowable<T> {
		return ApiEngine.getService(SearchService::class.java)
			.appGetSearchHotSearch<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> searchSearch(currentPage:String,keywords:String?,pageSize:String?,sortType:String?):Flowable<T> {
		return ApiEngine.getService(SearchService::class.java)
			.searchSearch<T>(currentPage,keywords,pageSize,sortType)
			.compose(RxSchedulers.io_main())
	}

}