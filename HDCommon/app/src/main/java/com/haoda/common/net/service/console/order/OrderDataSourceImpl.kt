package com.haoda.common.net.service.console.order

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

	@Description("订单详细信息")
	fun<T:BaseResult<Void>> detail_13Order(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detail_13Order<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detail_13Order(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detail_13Order<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("订单快递信息")
	fun<T:BaseResult<Void>> orderExpressInfoOrder(
		@Description("=订单ID") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.orderExpressInfoOrder<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> orderExpressInfoOrder(
		@Description("=订单ID") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.orderExpressInfoOrder<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("订单快递信息")
	fun<T:BaseResult<Void>> updateOrderDeliveryOrder(
		@Description("订单备注（非必须参数）") note:String? = null,
		@Description("订单ID") orderId:String,
		@Description("城市（非必须参数）") receiverCity:String? = null,
		@Description("详细地址（非必须参数）") receiverDetailAddress:String? = null,
		@Description("收货人姓名（非必须参数）") receiverName:String? = null,
		@Description("收货人电话（非必须参数）") receiverPhone:String? = null,
		@Description("收货人邮编（非必须参数）") receiverPostCode:String? = null,
		@Description("省份/直辖市（非必须参数）") receiverProvince:String? = null,
		@Description("区（非必须参数）") receiverRegion:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.updateOrderDeliveryOrder<T>(note,orderId,receiverCity,receiverDetailAddress,receiverName,receiverPhone,receiverPostCode,receiverProvince,receiverRegion).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> updateOrderDeliveryOrder(
		@Description("订单备注（非必须参数）") note:String? = null,
		@Description("订单ID") orderId:String,
		@Description("城市（非必须参数）") receiverCity:String? = null,
		@Description("详细地址（非必须参数）") receiverDetailAddress:String? = null,
		@Description("收货人姓名（非必须参数）") receiverName:String? = null,
		@Description("收货人电话（非必须参数）") receiverPhone:String? = null,
		@Description("收货人邮编（非必须参数）") receiverPostCode:String? = null,
		@Description("省份/直辖市（非必须参数）") receiverProvince:String? = null,
		@Description("区（非必须参数）") receiverRegion:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.updateOrderDeliveryOrder<T>(note,orderId,receiverCity,receiverDetailAddress,receiverName,receiverPhone,receiverPostCode,receiverProvince,receiverRegion).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分页查询")
	fun<T:BaseResult<Void>> page_15Order(
		@Description("当前页") currentPage:String,
		@Description("订单提交时间（非必须参数）") endSubmitTime:String? = null,
		@Description("会员id（非必须参数）") memberId:String? = null,
		@Description("会员手机（非必须参数）") mobile:String? = null,
		@Description("会员昵称（非必须参数）") nickname:String? = null,
		@Description("订单编号（非必须参数）") orderNo:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("订单提交时间（非必须参数）") startSubmitTime:String? = null,
		@Description("订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单（非必须参数）") status:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.page_15Order<T>(currentPage,endSubmitTime,memberId,mobile,nickname,orderNo,pageSize,startSubmitTime,status).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> page_15Order(
		@Description("当前页") currentPage:String,
		@Description("订单提交时间（非必须参数）") endSubmitTime:String? = null,
		@Description("会员id（非必须参数）") memberId:String? = null,
		@Description("会员手机（非必须参数）") mobile:String? = null,
		@Description("会员昵称（非必须参数）") nickname:String? = null,
		@Description("订单编号（非必须参数）") orderNo:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("订单提交时间（非必须参数）") startSubmitTime:String? = null,
		@Description("订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单（非必须参数）") status:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.page_15Order<T>(currentPage,endSubmitTime,memberId,mobile,nickname,orderNo,pageSize,startSubmitTime,status).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("订单发货")
	fun<T:BaseResult<Void>> orderDeliverOrder(
		@Description("快递公司编号") deliveryCompany:String,
		@Description("快递单号") deliverySn:String,
		@Description("=订单ID") orderId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.orderDeliverOrder<T>(deliveryCompany,deliverySn,orderId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> orderDeliverOrder(
		@Description("快递公司编号") deliveryCompany:String,
		@Description("快递单号") deliverySn:String,
		@Description("=订单ID") orderId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.orderDeliverOrder<T>(deliveryCompany,deliverySn,orderId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}