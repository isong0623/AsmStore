package com.haoda.common.net.service.base.user

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface UserDataSourceWrapper {
	fun <T:BaseResult<Void>> save_6User(mobile:String,realName:String,remark:String?,roleIds:String,status:String,userName:String):Flowable<T> {
		return ApiEngine.getService(UserService::class.java)
			.save_6User<T>(mobile,realName,remark,roleIds,status,userName)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> rangeRoles_1User(id:String):Flowable<T> {
		return ApiEngine.getService(UserService::class.java)
			.rangeRoles_1User<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_6User(id:String):Flowable<T> {
		return ApiEngine.getService(UserService::class.java)
			.delete_6User<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_3User(id:String):Flowable<T> {
		return ApiEngine.getService(UserService::class.java)
			.detail_3User<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> rangeRolesUser(id:String,roleIds:String):Flowable<T> {
		return ApiEngine.getService(UserService::class.java)
			.rangeRolesUser<T>(id,roleIds)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_6User(id:String,mobile:String?,realName:String?,remark:String?,roleIds:String,status:String?,userName:String?):Flowable<T> {
		return ApiEngine.getService(UserService::class.java)
			.update_6User<T>(id,mobile,realName,remark,roleIds,status,userName)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_6User(currentPage:String,mobile:String?,pageSize:String?,realName:String?,userName:String?):Flowable<T> {
		return ApiEngine.getService(UserService::class.java)
			.page_6User<T>(currentPage,mobile,pageSize,realName,userName)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_2User(id:String,newPassword:String):Flowable<T> {
		return ApiEngine.getService(UserService::class.java)
			.detail_2User<T>(id,newPassword)
			.compose(RxSchedulers.io_main())
	}

}