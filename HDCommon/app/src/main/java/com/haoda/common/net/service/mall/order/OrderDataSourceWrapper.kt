package com.haoda.common.net.service.mall.order

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface OrderDataSourceWrapper {
	fun <T:BaseResult<Void>> addMemberVipOrder(orderId:String,payAmount:String,payType:String):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.addMemberVipOrder<T>(orderId,payAmount,payType)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getOrderCheckByProductIdOrder(productIdAndskuCodeAndQuantitys:String):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.getOrderCheckByProductIdOrder<T>(productIdAndskuCodeAndQuantitys)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> memberOrderCancelOrder(orderId:String):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.memberOrderCancelOrder<T>(orderId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> orderPayOrder(orderId:String,payAmount:String,payType:String):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.orderPayOrder<T>(orderId,payAmount,payType)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> orderPayResOrder(orderId:String):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.orderPayResOrder<T>(orderId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getExpressMessageOrder(orderId:String):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.getExpressMessageOrder<T>(orderId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getOrderCheckByCartOrder():Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.getOrderCheckByCartOrder<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getOrderCouponsOrder(productIdAndQuantitys:String):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.getOrderCouponsOrder<T>(productIdAndQuantitys)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> orderNotAppraisedProductListOrder(orderId:String):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.orderNotAppraisedProductListOrder<T>(orderId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> orderCheckRefreshOrder(memberCouponId:String?,productIdAndskuCodeAndQuantitys:String):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.orderCheckRefreshOrder<T>(memberCouponId,productIdAndskuCodeAndQuantitys)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> appMemberPageOrder(currentPage:String,orderStatus:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.appMemberPageOrder<T>(currentPage,orderStatus,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> receivedConfirmOrder(orderId:String):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.receivedConfirmOrder<T>(orderId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> orderDetailOrder(orderId:String):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.orderDetailOrder<T>(orderId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> memberDeleteOrder(orderId:String):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.memberDeleteOrder<T>(orderId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> orderSubmitViewOrder(orderId:String?):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.orderSubmitViewOrder<T>(orderId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> orderSubmitOrder(acturalPrice:String,memberCouponId:String?,orderNote:String?,productIdAndskuCodeAndQuantitys:String,receiveAddressId:String,streamerId:String?):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.orderSubmitOrder<T>(acturalPrice,memberCouponId,orderNote,productIdAndskuCodeAndQuantitys,receiveAddressId,streamerId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> orderVipSubmitOrder(acturalPrice:String,memberCouponId:String?,orderNote:String?,productIdAndQuantitys:String,receiveAddressId:String):Flowable<T> {
		return ApiEngine.getService(OrderService::class.java)
			.orderVipSubmitOrder<T>(acturalPrice,memberCouponId,orderNote,productIdAndQuantitys,receiveAddressId)
			.compose(RxSchedulers.io_main())
	}

}