package com.haoda.common.net.service.console.order

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface OrderDataSourceWrapper {
	fun <T:BaseResult<Void>> detail_13Order(id:String):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.detail_13Order<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> orderExpressInfoOrder(id:String):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.orderExpressInfoOrder<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> updateOrderDeliveryOrder(note:String?,orderId:String,receiverCity:String?,receiverDetailAddress:String?,receiverName:String?,receiverPhone:String?,receiverPostCode:String?,receiverProvince:String?,receiverRegion:String?):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.updateOrderDeliveryOrder<T>(note,orderId,receiverCity,receiverDetailAddress,receiverName,receiverPhone,receiverPostCode,receiverProvince,receiverRegion)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_15Order(currentPage:String,endSubmitTime:String?,memberId:String?,mobile:String?,nickname:String?,orderNo:String?,pageSize:String?,startSubmitTime:String?,status:String?):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.page_15Order<T>(currentPage,endSubmitTime,memberId,mobile,nickname,orderNo,pageSize,startSubmitTime,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> orderDeliverOrder(deliveryCompany:String,deliverySn:String,orderId:String):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.orderDeliverOrder<T>(deliveryCompany,deliverySn,orderId)
			.compose(RxSchedulers.io_main())
	}

}