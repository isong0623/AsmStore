package com.haoda.common.net.service.console.memberSuggest

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface MemberSuggestDataSourceWrapper {
	fun <T:BaseResult<Void>> page_14MemberSuggest(currentPage:String,mobile:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(MemberSuggestService::class.java)
			.page_14MemberSuggest<T>(currentPage,mobile,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_12MemberSuggest(id:String):Flowable<T> {
		return ApiEngine.getService(MemberSuggestService::class.java)
			.detail_12MemberSuggest<T>(id)
			.compose(RxSchedulers.io_main())
	}

}