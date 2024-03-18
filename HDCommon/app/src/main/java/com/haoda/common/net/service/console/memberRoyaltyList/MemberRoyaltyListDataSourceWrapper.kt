package com.haoda.common.net.service.console.memberRoyaltyList

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface MemberRoyaltyListDataSourceWrapper {
	fun <T:BaseResult<Void>> subordinatePageByIdMemberRoyaltyList(memberId:String,pageNum:String,pageSize:String?,mobile:String?):Flowable<T> {
		return ApiEngine.getService(MemberRoyaltyListService::class.java)
			.subordinatePageByIdMemberRoyaltyList<T>(memberId,pageNum,pageSize,mobile)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_13MemberRoyaltyList(pageNum:String,pageSize:String?,mobile:String?):Flowable<T> {
		return ApiEngine.getService(MemberRoyaltyListService::class.java)
			.page_13MemberRoyaltyList<T>(pageNum,pageSize,mobile)
			.compose(RxSchedulers.io_main())
	}

}