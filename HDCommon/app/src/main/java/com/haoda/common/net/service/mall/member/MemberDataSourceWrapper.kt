package com.haoda.common.net.service.mall.member

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface MemberDataSourceWrapper {
	fun <T:BaseResult<Void>> appUpdateMemberMember(birthday:String?,icon:String?,id:String,nickname:String?,personSign:String?):Flowable<T> {
		return ApiEngine.getService(MemberService::class.java)
			.appUpdateMemberMember<T>(birthday,icon,id,nickname,personSign)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadIconMember():Flowable<T> {
		return ApiEngine.getService(MemberService::class.java)
			.uploadIconMember<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> appUpdatePasswordMember(oldPassword:String,newPassword:String):Flowable<T> {
		return ApiEngine.getService(MemberService::class.java)
			.appUpdatePasswordMember<T>(oldPassword,newPassword)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> firstSetPasswordMember(password:String):Flowable<T> {
		return ApiEngine.getService(MemberService::class.java)
			.firstSetPasswordMember<T>(password)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> myOrderMember():Flowable<T> {
		return ApiEngine.getService(MemberService::class.java)
			.myOrderMember<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> currentUserMember():Flowable<T> {
		return ApiEngine.getService(MemberService::class.java)
			.currentUserMember<T>()
			.compose(RxSchedulers.io_main())
	}

}