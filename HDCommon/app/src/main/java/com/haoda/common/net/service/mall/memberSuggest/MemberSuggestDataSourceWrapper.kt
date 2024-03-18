package com.haoda.common.net.service.mall.memberSuggest

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface MemberSuggestDataSourceWrapper {
	fun <T:BaseResult<Void>> appSuggestMemberSuggest(content:String):Flowable<T> {
		return ApiEngine.getService(MemberSuggestService::class.java)
			.appSuggestMemberSuggest<T>(content)
			.compose(RxSchedulers.io_main())
	}

}