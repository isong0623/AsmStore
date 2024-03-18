package com.haoda.common.net.service.console.category

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface CategoryDataSourceWrapper {
	fun <T:BaseResult<Void>> detailCategory(id:String):Flowable<T> {
		return ApiEngine.getService(CategoryService::class.java)
			.detailCategory<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadPictureCategory():Flowable<T> {
		return ApiEngine.getService(CategoryService::class.java)
			.uploadPictureCategory<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> deleteCategory(id:String):Flowable<T> {
		return ApiEngine.getService(CategoryService::class.java)
			.deleteCategory<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> updateCategory(bottomPictureUrl:String?,description:String?,icon:String?,id:String,indexSort:String?,indexStatus:String?,keywords:String?,name:String?,navSort:String?,navStatus:String?,pageIconType:String?,parentId:String?,pictureUrl:String?):Flowable<T> {
		return ApiEngine.getService(CategoryService::class.java)
			.updateCategory<T>(bottomPictureUrl,description,icon,id,indexSort,indexStatus,keywords,name,navSort,navStatus,pageIconType,parentId,pictureUrl)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> pageCategory(currentPage:String,name:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(CategoryService::class.java)
			.pageCategory<T>(currentPage,name,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> levelListCategory():Flowable<T> {
		return ApiEngine.getService(CategoryService::class.java)
			.levelListCategory<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> saveCategory(bottomPictureUrl:String?,description:String?,icon:String?,indexSort:String?,indexStatus:String?,keywords:String?,name:String,navSort:String?,navStatus:String?,pageIconType:String?,parentId:String,pictureUrl:String?):Flowable<T> {
		return ApiEngine.getService(CategoryService::class.java)
			.saveCategory<T>(bottomPictureUrl,description,icon,indexSort,indexStatus,keywords,name,navSort,navStatus,pageIconType,parentId,pictureUrl)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getFirstCategoryCategory():Flowable<T> {
		return ApiEngine.getService(CategoryService::class.java)
			.getFirstCategoryCategory<T>()
			.compose(RxSchedulers.io_main())
	}

}