package com.haoda.common.net.service.member.royalty

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface RoyaltyDataSourceWrapper {
	fun <T:BaseResult<Void>> findMemberIdByFansRoyalty(memberId:String,pageNum:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.findMemberIdByFansRoyalty<T>(memberId,pageNum,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getMemberWithdrawRoyalty(memberId:String,pageNum:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.getMemberWithdrawRoyalty<T>(memberId,pageNum,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> monthlySurveyRoyalty(currentPage:String?,fansCondition:String?,monthCondition:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.monthlySurveyRoyalty<T>(currentPage,fansCondition,monthCondition,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getMemberBankRoyalty(memberId:String,pageNum:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.getMemberBankRoyalty<T>(memberId,pageNum,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> saveMemberBankRoyalty():Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.saveMemberBankRoyalty<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> daySurveyRoyalty(currentPage:String?,dayCondition:String?,fansCondition:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.daySurveyRoyalty<T>(currentPage,dayCondition,fansCondition,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> myProfitRoyalty():Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.myProfitRoyalty<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> wechatAuthorizationRoyalty():Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.wechatAuthorizationRoyalty<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> findMemberIdByDayFansRoyalty(isType:String?,memberId:String,pageNum:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.findMemberIdByDayFansRoyalty<T>(isType,memberId,pageNum,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> billdetailsRoyalty(currentPage:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.billdetailsRoyalty<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> liveProfitDetailRoyalty(currentPage:String?,endTime:String,pageSize:String?,startTime:String):Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.liveProfitDetailRoyalty<T>(currentPage,endTime,pageSize,startTime)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> findMemberIdByLogRoyalty(memberId:String?,random:String?):Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.findMemberIdByLogRoyalty<T>(memberId,random)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> saveRecordRoyalty(orderId:String):Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.saveRecordRoyalty<T>(orderId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detailRoyalty(memberId:String):Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.detailRoyalty<T>(memberId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getPostalCashRoyalty(amount:String,bankId:String?,memberId:String,postalCashWay:String):Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.getPostalCashRoyalty<T>(amount,bankId,memberId,postalCashWay)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> findMemberIdByLogDetailsRoyalty(memberId:String,pageNum:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.findMemberIdByLogDetailsRoyalty<T>(memberId,pageNum,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> saveMemberRoyalty(memberId:String?,random:String?,time:String):Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.saveMemberRoyalty<T>(memberId,random,time)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getliveRecordRoyalty(currentPage:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(RoyaltyService::class.java)
			.getliveRecordRoyalty<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}

}