package com.haoda.common.net.service.console.orderRefundApplay

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface OrderRefundApplayDataSourceWrapper {
	fun <T:BaseResult<Void>> detail_15OrderRefundApplay(id:String):Flowable<T> {
		return ApiEngine.getService(OrderRefundApplayService::class.java)
			.detail_15OrderRefundApplay<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> applayNotAgreeOrderRefundApplay(id:String,prodessDesc:String?):Flowable<T> {
		return ApiEngine.getService(OrderRefundApplayService::class.java)
			.applayNotAgreeOrderRefundApplay<T>(id,prodessDesc)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> applayAgreeOrderRefundApplay(id:String,prodessDesc:String?,receiveAddress:String,receiveMobile:String,receivePerson:String):Flowable<T> {
		return ApiEngine.getService(OrderRefundApplayService::class.java)
			.applayAgreeOrderRefundApplay<T>(id,prodessDesc,receiveAddress,receiveMobile,receivePerson)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_17OrderRefundApplay(applayNo:String?,currentPage:String,pageSize:String?,refundStatus:String?):Flowable<T> {
		return ApiEngine.getService(OrderRefundApplayService::class.java)
			.page_17OrderRefundApplay<T>(applayNo,currentPage,pageSize,refundStatus)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> refundAgreeOrderRefundApplay(id:String):Flowable<T> {
		return ApiEngine.getService(OrderRefundApplayService::class.java)
			.refundAgreeOrderRefundApplay<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> refundNotAgreeOrderRefundApplay(id:String,prodessDesc:String?):Flowable<T> {
		return ApiEngine.getService(OrderRefundApplayService::class.java)
			.refundNotAgreeOrderRefundApplay<T>(id,prodessDesc)
			.compose(RxSchedulers.io_main())
	}

}