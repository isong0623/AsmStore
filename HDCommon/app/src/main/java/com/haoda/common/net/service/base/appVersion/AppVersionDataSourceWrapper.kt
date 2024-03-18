package com.haoda.common.net.service.base.appVersion

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface AppVersionDataSourceWrapper {
	fun <T:BaseResult<Void>> updateAppVersion(build:String,id:String,intervalTime:String,isForceUpdate:String,platformMarking:String,updateContent:String,updatePath:String):Flowable<T> {
		return ApiEngine.getService(AppVersionService::class.java)
			.updateAppVersion<T>(build,id,intervalTime,isForceUpdate,platformMarking,updateContent,updatePath)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> deleteAppVersion(id:String):Flowable<T> {
		return ApiEngine.getService(AppVersionService::class.java)
			.deleteAppVersion<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> saveAppVersion(build:String,intervalTime:String,isForceUpdate:String,platformMarking:String,updateContent:String,updatePath:String):Flowable<T> {
		return ApiEngine.getService(AppVersionService::class.java)
			.saveAppVersion<T>(build,intervalTime,isForceUpdate,platformMarking,updateContent,updatePath)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detailAppVersion(id:String):Flowable<T> {
		return ApiEngine.getService(AppVersionService::class.java)
			.detailAppVersion<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> pageAppVersion(currentPage:String?,pagesize:String?):Flowable<T> {
		return ApiEngine.getService(AppVersionService::class.java)
			.pageAppVersion<T>(currentPage,pagesize)
			.compose(RxSchedulers.io_main())
	}

}