package com.haoda.common.net.service.mall.memberCoupon

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface MemberCouponDataSourceWrapper {
	fun <T:BaseResult<Void>> memberCanGetListMemberCoupon(type:String):Flowable<T> {
		return ApiEngine.getService(MemberCouponService::class.java)
			.memberCanGetListMemberCoupon<T>(type)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> memberPage_1MemberCoupon(currentPage:String,pageSize:String?,qureyCode:String?):Flowable<T> {
		return ApiEngine.getService(MemberCouponService::class.java)
			.memberPage_1MemberCoupon<T>(currentPage,pageSize,qureyCode)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> receiveCouponMemberCoupon(couponId:String):Flowable<T> {
		return ApiEngine.getService(MemberCouponService::class.java)
			.receiveCouponMemberCoupon<T>(couponId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> queryCouponByIdMemberCoupon(couponId:String,id:String):Flowable<T> {
		return ApiEngine.getService(MemberCouponService::class.java)
			.queryCouponByIdMemberCoupon<T>(couponId,id)
			.compose(RxSchedulers.io_main())
	}

}