package com.haoda.common.net.service.mall.memberAppraise

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface MemberAppraiseDataSourceWrapper {
	fun <T:BaseResult<Void>> uploadPicsMemberAppraise():Flowable<T> {
		return ApiEngine.getService(MemberAppraiseService::class.java)
			.uploadPicsMemberAppraise<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getMemberAppraisedPageMemberAppraise(currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(MemberAppraiseService::class.java)
			.getMemberAppraisedPageMemberAppraise<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> appSave_1MemberAppraise(appraise:String,descriptionStar:String,feightStar:String?,hideStatus:String,orderId:String,picList:String?,productId:String,serviceStar:String?,skuAttribute:String?):Flowable<T> {
		return ApiEngine.getService(MemberAppraiseService::class.java)
			.appSave_1MemberAppraise<T>(appraise,descriptionStar,feightStar,hideStatus,orderId,picList,productId,serviceStar,skuAttribute)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadPicMemberAppraise():Flowable<T> {
		return ApiEngine.getService(MemberAppraiseService::class.java)
			.uploadPicMemberAppraise<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getMemberNotAppraisePageMemberAppraise(currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(MemberAppraiseService::class.java)
			.getMemberNotAppraisePageMemberAppraise<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}

}