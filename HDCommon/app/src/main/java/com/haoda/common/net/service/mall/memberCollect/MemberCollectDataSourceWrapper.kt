package com.haoda.common.net.service.mall.memberCollect

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface MemberCollectDataSourceWrapper {
	fun <T:BaseResult<Void>> memberPageMemberCollect(currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(MemberCollectService::class.java)
			.memberPageMemberCollect<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> memberCancelCollectMemberCollect(productId:String):Flowable<T> {
		return ApiEngine.getService(MemberCollectService::class.java)
			.memberCancelCollectMemberCollect<T>(productId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> memberCountMemberCollect():Flowable<T> {
		return ApiEngine.getService(MemberCollectService::class.java)
			.memberCountMemberCollect<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> memberCollectMemberCollect(productId:String,skuCode:String):Flowable<T> {
		return ApiEngine.getService(MemberCollectService::class.java)
			.memberCollectMemberCollect<T>(productId,skuCode)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> memberCancelCollectBatchMemberCollect(productIds:String):Flowable<T> {
		return ApiEngine.getService(MemberCollectService::class.java)
			.memberCancelCollectBatchMemberCollect<T>(productIds)
			.compose(RxSchedulers.io_main())
	}

}