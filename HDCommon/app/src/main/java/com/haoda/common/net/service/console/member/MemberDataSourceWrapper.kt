package com.haoda.common.net.service.console.member

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface MemberDataSourceWrapper {
	fun <T:BaseResult<Void>> page_12Member(currentPage:String,mobile:String?,nickname:String?,pageSize:String?,publisherStatus:String?):Flowable<T> {
		return ApiEngine.getService(MemberService::class.java)
			.page_12Member<T>(currentPage,mobile,nickname,pageSize,publisherStatus)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> startPublisherMember(id:String):Flowable<T> {
		return ApiEngine.getService(MemberService::class.java)
			.startPublisherMember<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> stopPublisherMember(id:String):Flowable<T> {
		return ApiEngine.getService(MemberService::class.java)
			.stopPublisherMember<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_11Member(id:String):Flowable<T> {
		return ApiEngine.getService(MemberService::class.java)
			.detail_11Member<T>(id)
			.compose(RxSchedulers.io_main())
	}

}