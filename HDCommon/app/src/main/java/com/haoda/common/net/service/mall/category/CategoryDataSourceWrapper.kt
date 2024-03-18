package com.haoda.common.net.service.mall.category

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface CategoryDataSourceWrapper {
	fun <T:BaseResult<Void>> levelDetailCategory(categoryId:String):Flowable<T> {
		return ApiEngine.getService(CategoryService::class.java)
			.levelDetailCategory<T>(categoryId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> productPageCategory(categoryId:String,currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(CategoryService::class.java)
			.productPageCategory<T>(categoryId,currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getOtherCategoryCategory(categoryId:String):Flowable<T> {
		return ApiEngine.getService(CategoryService::class.java)
			.getOtherCategoryCategory<T>(categoryId)
			.compose(RxSchedulers.io_main())
	}

}