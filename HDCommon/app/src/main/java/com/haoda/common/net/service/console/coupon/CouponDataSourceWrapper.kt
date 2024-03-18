package com.haoda.common.net.service.console.coupon

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface CouponDataSourceWrapper {
	fun <T:BaseResult<Void>> update_2Coupon(categoryIds:String?,description:String?,getEndTime:String?,getStartTime:String?,getTimeFlag:String?,id:String,minPoint:String?,name:String?,perLimit:String?,price:String?,publishCount:String?,publishCountType:String?,status:String?,type:String?,useEndTime:String?,useStartTime:String?,useTimeLimit:String?,useTimeType:String?,useType:String?):Flowable<T> {
		return ApiEngine.getService(CouponService::class.java)
			.update_2Coupon<T>(categoryIds,description,getEndTime,getStartTime,getTimeFlag,id,minPoint,name,perLimit,price,publishCount,publishCountType,status,type,useEndTime,useStartTime,useTimeLimit,useTimeType,useType)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_2Coupon(categoryIds:String?,description:String?,getEndTime:String?,getStartTime:String?,getTimeFlag:String,minPoint:String,name:String,perLimit:String,price:String,publishCount:String?,publishCountType:String,status:String,type:String,useEndTime:String?,useStartTime:String?,useTimeLimit:String?,useTimeType:String,useType:String):Flowable<T> {
		return ApiEngine.getService(CouponService::class.java)
			.save_2Coupon<T>(categoryIds,description,getEndTime,getStartTime,getTimeFlag,minPoint,name,perLimit,price,publishCount,publishCountType,status,type,useEndTime,useStartTime,useTimeLimit,useTimeType,useType)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> startUseCoupon(id:String):Flowable<T> {
		return ApiEngine.getService(CouponService::class.java)
			.startUseCoupon<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_2Coupon(id:String):Flowable<T> {
		return ApiEngine.getService(CouponService::class.java)
			.detail_2Coupon<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> stopUseCoupon(id:String):Flowable<T> {
		return ApiEngine.getService(CouponService::class.java)
			.stopUseCoupon<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_3Coupon(currentPage:String,name:String?,pageSize:String?,type:String?):Flowable<T> {
		return ApiEngine.getService(CouponService::class.java)
			.page_3Coupon<T>(currentPage,name,pageSize,type)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getCouponByTypeCoupon(type:String):Flowable<T> {
		return ApiEngine.getService(CouponService::class.java)
			.getCouponByTypeCoupon<T>(type)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_2Coupon(id:String):Flowable<T> {
		return ApiEngine.getService(CouponService::class.java)
			.delete_2Coupon<T>(id)
			.compose(RxSchedulers.io_main())
	}

}