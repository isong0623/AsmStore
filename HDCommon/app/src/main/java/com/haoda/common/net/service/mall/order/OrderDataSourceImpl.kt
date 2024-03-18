package com.haoda.common.net.service.mall.order

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class OrderDataSourceImpl : BaseDataSource() {

	var service = object : OrderDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("VIP购买订单支付成功，给用户添加会员")
	fun<T:BaseResult<Void>> addMemberVipOrder(
		@Description("会员订单ID") orderId:String,
		@Description("实付金额") payAmount:String,
		@Description("支付类型（1->支付宝2->微信3->微信小程序）") payType:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.addMemberVipOrder<T>(orderId,payAmount,payType).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> addMemberVipOrder(
		@Description("会员订单ID") orderId:String,
		@Description("实付金额") payAmount:String,
		@Description("支付类型（1->支付宝2->微信3->微信小程序）") payType:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.addMemberVipOrder<T>(orderId,payAmount,payType).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("立即购买确认订单")
	fun<T:BaseResult<Void>> getOrderCheckByProductIdOrder(
		@Description("商品ID和数量实例：{\"productId\":\"112\",\"quantity\":1,\"skuCode\":1\"productAttributeList\":\"[{\"attributeKey\":\"尺码\",\"attributeValue\":[\"xl\"]},{\"attributeKey\":\"颜色\",\"attributeValue\":[\"黑色\"]}]\"}") productIdAndskuCodeAndQuantitys:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getOrderCheckByProductIdOrder<T>(productIdAndskuCodeAndQuantitys).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getOrderCheckByProductIdOrder(
		@Description("商品ID和数量实例：{\"productId\":\"112\",\"quantity\":1,\"skuCode\":1\"productAttributeList\":\"[{\"attributeKey\":\"尺码\",\"attributeValue\":[\"xl\"]},{\"attributeKey\":\"颜色\",\"attributeValue\":[\"黑色\"]}]\"}") productIdAndskuCodeAndQuantitys:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getOrderCheckByProductIdOrder<T>(productIdAndskuCodeAndQuantitys).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("取消订单")
	fun<T:BaseResult<Void>> memberOrderCancelOrder(
		@Description("orderId") orderId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.memberOrderCancelOrder<T>(orderId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> memberOrderCancelOrder(
		@Description("orderId") orderId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.memberOrderCancelOrder<T>(orderId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("2、商户后台下单（微信或者支付宝）（原订单支付）")
	fun<T:BaseResult<Void>> orderPayOrder(
		@Description("订单ID") orderId:String,
		@Description("实付金额") payAmount:String,
		@Description("支付类型（1->支付宝2->微信3->微信小程序）") payType:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.orderPayOrder<T>(orderId,payAmount,payType).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> orderPayOrder(
		@Description("订单ID") orderId:String,
		@Description("实付金额") payAmount:String,
		@Description("支付类型（1->支付宝2->微信3->微信小程序）") payType:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.orderPayOrder<T>(orderId,payAmount,payType).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("查询支付结果")
	fun<T:BaseResult<Void>> orderPayResOrder(
		@Description("订单ID") orderId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.orderPayResOrder<T>(orderId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> orderPayResOrder(
		@Description("订单ID") orderId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.orderPayResOrder<T>(orderId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取订单快递信息")
	fun<T:BaseResult<Void>> getExpressMessageOrder(
		@Description("orderId") orderId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getExpressMessageOrder<T>(orderId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getExpressMessageOrder(
		@Description("orderId") orderId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getExpressMessageOrder<T>(orderId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("购物车确认订单")
	fun<T:BaseResult<Void>> getOrderCheckByCartOrder(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getOrderCheckByCartOrder<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getOrderCheckByCartOrder(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getOrderCheckByCartOrder<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取订单优惠券")
	fun<T:BaseResult<Void>> getOrderCouponsOrder(
		@Description("商品ID和数量数组实例：[{\"productId\":9,\"quantity\":1}]") productIdAndQuantitys:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getOrderCouponsOrder<T>(productIdAndQuantitys).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getOrderCouponsOrder(
		@Description("商品ID和数量数组实例：[{\"productId\":9,\"quantity\":1}]") productIdAndQuantitys:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getOrderCouponsOrder<T>(productIdAndQuantitys).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("订单未评价商品列表")
	fun<T:BaseResult<Void>> orderNotAppraisedProductListOrder(
		@Description("orderId") orderId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.orderNotAppraisedProductListOrder<T>(orderId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> orderNotAppraisedProductListOrder(
		@Description("orderId") orderId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.orderNotAppraisedProductListOrder<T>(orderId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("刷新确认订单信息")
	fun<T:BaseResult<Void>> orderCheckRefreshOrder(
		@Description("用户优惠券ID（非必须参数）") memberCouponId:String? = null,
		@Description("商品ID和sku码和数量数组实例：[{\"productId\":9,\"skuCode\":1,\"quantity\":1}]") productIdAndskuCodeAndQuantitys:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.orderCheckRefreshOrder<T>(memberCouponId,productIdAndskuCodeAndQuantitys).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> orderCheckRefreshOrder(
		@Description("用户优惠券ID（非必须参数）") memberCouponId:String? = null,
		@Description("商品ID和sku码和数量数组实例：[{\"productId\":9,\"skuCode\":1,\"quantity\":1}]") productIdAndskuCodeAndQuantitys:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.orderCheckRefreshOrder<T>(memberCouponId,productIdAndskuCodeAndQuantitys).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("订单分页查询")
	fun<T:BaseResult<Void>> appMemberPageOrder(
		@Description("当前页") currentPage:String,
		@Description("订单状态（99->全部0->待付款1->待发货2->待收货3->已完成）（非必须参数）") orderStatus:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.appMemberPageOrder<T>(currentPage,orderStatus,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> appMemberPageOrder(
		@Description("当前页") currentPage:String,
		@Description("订单状态（99->全部0->待付款1->待发货2->待收货3->已完成）（非必须参数）") orderStatus:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.appMemberPageOrder<T>(currentPage,orderStatus,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("订单确认收货接口")
	fun<T:BaseResult<Void>> receivedConfirmOrder(
		@Description("orderId") orderId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.receivedConfirmOrder<T>(orderId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> receivedConfirmOrder(
		@Description("orderId") orderId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.receivedConfirmOrder<T>(orderId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("订单详细信息")
	fun<T:BaseResult<Void>> orderDetailOrder(
		@Description("orderId") orderId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.orderDetailOrder<T>(orderId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> orderDetailOrder(
		@Description("orderId") orderId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.orderDetailOrder<T>(orderId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("删除订单信息")
	fun<T:BaseResult<Void>> memberDeleteOrder(
		@Description("orderId") orderId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.memberDeleteOrder<T>(orderId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> memberDeleteOrder(
		@Description("orderId") orderId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.memberDeleteOrder<T>(orderId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("待付款订单重新付款")
	fun<T:BaseResult<Void>> orderSubmitViewOrder(
		@Description("orderId（非必须参数）") orderId:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.orderSubmitViewOrder<T>(orderId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> orderSubmitViewOrder(
		@Description("orderId（非必须参数）") orderId:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.orderSubmitViewOrder<T>(orderId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("1、提交订单")
	fun<T:BaseResult<Void>> orderSubmitOrder(
		@Description("实付金额") acturalPrice:String,
		@Description("用户优惠券ID（非必须参数）") memberCouponId:String? = null,
		@Description("订单备注（非必须参数）") orderNote:String? = null,
		@Description("商品ID和sku码和数量数组和商品属性实例：[{\"productId\":9,\"skuCode\":1,\"quantity\":1,\"productAttributeList\":\"[{\"attributeKey\":\"尺码\",\"attributeValue\":[\"xl\"]}]\"}]") productIdAndskuCodeAndQuantitys:String,
		@Description("用户收货地址ID") receiveAddressId:String,
		@Description("主播id，不是从直播间购买的商品，不需要传（非必须参数）") streamerId:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.orderSubmitOrder<T>(acturalPrice,memberCouponId,orderNote,productIdAndskuCodeAndQuantitys,receiveAddressId,streamerId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> orderSubmitOrder(
		@Description("实付金额") acturalPrice:String,
		@Description("用户优惠券ID（非必须参数）") memberCouponId:String? = null,
		@Description("订单备注（非必须参数）") orderNote:String? = null,
		@Description("商品ID和sku码和数量数组和商品属性实例：[{\"productId\":9,\"skuCode\":1,\"quantity\":1,\"productAttributeList\":\"[{\"attributeKey\":\"尺码\",\"attributeValue\":[\"xl\"]}]\"}]") productIdAndskuCodeAndQuantitys:String,
		@Description("用户收货地址ID") receiveAddressId:String,
		@Description("主播id，不是从直播间购买的商品，不需要传（非必须参数）") streamerId:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.orderSubmitOrder<T>(acturalPrice,memberCouponId,orderNote,productIdAndskuCodeAndQuantitys,receiveAddressId,streamerId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("提交购买vip订单")
	fun<T:BaseResult<Void>> orderVipSubmitOrder(
		@Description("实付金额") acturalPrice:String,
		@Description("用户优惠券ID（非必须参数）") memberCouponId:String? = null,
		@Description("订单备注（非必须参数）") orderNote:String? = null,
		@Description("商品ID和数量数组,这里只有一个vip实例：[{\"productId\":110,\"quantity\":1}]") productIdAndQuantitys:String,
		@Description("用户收货地址ID虚拟物品默认传0") receiveAddressId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.orderVipSubmitOrder<T>(acturalPrice,memberCouponId,orderNote,productIdAndQuantitys,receiveAddressId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> orderVipSubmitOrder(
		@Description("实付金额") acturalPrice:String,
		@Description("用户优惠券ID（非必须参数）") memberCouponId:String? = null,
		@Description("订单备注（非必须参数）") orderNote:String? = null,
		@Description("商品ID和数量数组,这里只有一个vip实例：[{\"productId\":110,\"quantity\":1}]") productIdAndQuantitys:String,
		@Description("用户收货地址ID虚拟物品默认传0") receiveAddressId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.orderVipSubmitOrder<T>(acturalPrice,memberCouponId,orderNote,productIdAndQuantitys,receiveAddressId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}