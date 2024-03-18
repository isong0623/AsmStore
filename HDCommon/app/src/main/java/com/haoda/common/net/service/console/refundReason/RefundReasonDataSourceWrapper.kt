package com.haoda.common.net.service.console.refundReason

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface RefundReasonDataSourceWrapper {
	fun <T:BaseResult<Void>> update_22RefundReason(id:String,reasonDesc:String?,sort:String?,status:String?):Flowable<T> {
		return ApiEngine.getService(RefundReasonService::class.java)
			.update_22RefundReason<T>(id,reasonDesc,sort,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> startUse_7RefundReason(id:String):Flowable<T> {
		return ApiEngine.getService(RefundReasonService::class.java)
			.startUse_7RefundReason<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_26RefundReason(id:String):Flowable<T> {
		return ApiEngine.getService(RefundReasonService::class.java)
			.detail_26RefundReason<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> stopUse_7RefundReason(id:String):Flowable<T> {
		return ApiEngine.getService(RefundReasonService::class.java)
			.stopUse_7RefundReason<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_22RefundReason(reasonDesc:String,sort:String,status:String):Flowable<T> {
		return ApiEngine.getService(RefundReasonService::class.java)
			.save_22RefundReason<T>(reasonDesc,sort,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_19RefundReason(id:String):Flowable<T> {
		return ApiEngine.getService(RefundReasonService::class.java)
			.delete_19RefundReason<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_27RefundReason(currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(RefundReasonService::class.java)
			.page_27RefundReason<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}

}