package com.haoda.common.net.service.base.permission

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface PermissionDataSourceWrapper {
	fun <T:BaseResult<Void>> update_3Permission(currentPage:String,icon:String?,id:String,name:String?,pageSize:String?,param:String?,pid:String?,requestUrl:String?,searchEndDate:String?,searchEndTime:String?,searchStartDate:String?,searchStartTime:String?,sort:String?,type:String?,viewUri:String?):Flowable<T> {
		return ApiEngine.getService(PermissionService::class.java)
			.update_3Permission<T>(currentPage,icon,id,name,pageSize,param,pid,requestUrl,searchEndDate,searchEndTime,searchStartDate,searchStartTime,sort,type,viewUri)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_3Permission(currentPage:String,icon:String?,id:String,name:String,pageSize:String?,param:String?,pid:String,requestUrl:String?,searchEndDate:String?,searchEndTime:String?,searchStartDate:String?,searchStartTime:String?,sort:String?,type:String,viewUri:String?):Flowable<T> {
		return ApiEngine.getService(PermissionService::class.java)
			.save_3Permission<T>(currentPage,icon,id,name,pageSize,param,pid,requestUrl,searchEndDate,searchEndTime,searchStartDate,searchStartTime,sort,type,viewUri)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_3Permission(currentPage:String,name:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(PermissionService::class.java)
			.page_3Permission<T>(currentPage,name,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_3Permission(id:String):Flowable<T> {
		return ApiEngine.getService(PermissionService::class.java)
			.delete_3Permission<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> listPermission():Flowable<T> {
		return ApiEngine.getService(PermissionService::class.java)
			.listPermission<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_1Permission(id:String):Flowable<T> {
		return ApiEngine.getService(PermissionService::class.java)
			.detail_1Permission<T>(id)
			.compose(RxSchedulers.io_main())
	}

}