package com.haoda.common.net.service.mall.memberHome

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface MemberHomeDataSourceWrapper {
	fun <T:BaseResult<Void>> memberHomeIndexMemberHome():Flowable<T> {
		return ApiEngine.getService(MemberHomeService::class.java)
			.memberHomeIndexMemberHome<T>()
			.compose(RxSchedulers.io_main())
	}

}