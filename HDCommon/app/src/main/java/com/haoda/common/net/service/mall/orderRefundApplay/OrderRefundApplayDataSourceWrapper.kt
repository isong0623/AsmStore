package com.haoda.common.net.service.mall.orderRefundApplay

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface OrderRefundApplayDataSourceWrapper {
	fun <T:BaseResult<Void>> revokeRefundApplayOrderRefundApplay(orderItemId:String):Flowable<T> {
		return ApiEngine.getService(OrderRefundApplayService::class.java)
			.revokeRefundApplayOrderRefundApplay<T>(orderItemId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadPic_1OrderRefundApplay():Flowable<T> {
		return ApiEngine.getService(OrderRefundApplayService::class.java)
			.uploadPic_1OrderRefundApplay<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> orderRefundApplayOrderRefundApplay(contactMobile:String,contactPerson:String,memberDesc:String?,orderItemId:String,pics:String?,quantity:String,refundReasonId:String):Flowable<T> {
		return ApiEngine.getService(OrderRefundApplayService::class.java)
			.orderRefundApplayOrderRefundApplay<T>(contactMobile,contactPerson,memberDesc,orderItemId,pics,quantity,refundReasonId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadPics_1OrderRefundApplay():Flowable<T> {
		return ApiEngine.getService(OrderRefundApplayService::class.java)
			.uploadPics_1OrderRefundApplay<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getRefundReasonSelectDataOrderRefundApplay():Flowable<T> {
		return ApiEngine.getService(OrderRefundApplayService::class.java)
			.getRefundReasonSelectDataOrderRefundApplay<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_1OrderRefundApplay(orderRefundApplayId:String):Flowable<T> {
		return ApiEngine.getService(OrderRefundApplayService::class.java)
			.detail_1OrderRefundApplay<T>(orderRefundApplayId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> appMemberRefundPageOrderRefundApplay(currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(OrderRefundApplayService::class.java)
			.appMemberRefundPageOrderRefundApplay<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> appMemberRefundApplayPageOrderRefundApplay(currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(OrderRefundApplayService::class.java)
			.appMemberRefundApplayPageOrderRefundApplay<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}

}