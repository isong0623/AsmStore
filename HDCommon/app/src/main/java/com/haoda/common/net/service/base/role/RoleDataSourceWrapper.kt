package com.haoda.common.net.service.base.role

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface RoleDataSourceWrapper {
	fun <T:BaseResult<Void>> list_1Role():Flowable<T> {
		return ApiEngine.getService(RoleService::class.java)
			.list_1Role<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_4Role(description:String?,id:String,name:String?):Flowable<T> {
		return ApiEngine.getService(RoleService::class.java)
			.update_4Role<T>(description,id,name)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> rangePermissionsRole(id:String,permissionIds:String):Flowable<T> {
		return ApiEngine.getService(RoleService::class.java)
			.rangePermissionsRole<T>(id,permissionIds)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_4Role(currentPage:String,name:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(RoleService::class.java)
			.page_4Role<T>(currentPage,name,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getPermissionsRole(id:String):Flowable<T> {
		return ApiEngine.getService(RoleService::class.java)
			.getPermissionsRole<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_4Role(id:String):Flowable<T> {
		return ApiEngine.getService(RoleService::class.java)
			.delete_4Role<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_4Role(description:String?,name:String):Flowable<T> {
		return ApiEngine.getService(RoleService::class.java)
			.save_4Role<T>(description,name)
			.compose(RxSchedulers.io_main())
	}

}