package com.haoda.common.net.service.mall.orderRefundApplay

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class OrderRefundApplayDataSourceImpl : BaseDataSource() {

	var service = object : OrderRefundApplayDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("撤销售后申请")
	fun<T:BaseResult<Void>> revokeRefundApplayOrderRefundApplay(
		@Description("订单商品ID") orderItemId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.revokeRefundApplayOrderRefundApplay<T>(orderItemId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> revokeRefundApplayOrderRefundApplay(
		@Description("订单商品ID") orderItemId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.revokeRefundApplayOrderRefundApplay<T>(orderItemId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("上传申请图片")
	fun<T:BaseResult<Void>> uploadPic_1OrderRefundApplay(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.uploadPic_1OrderRefundApplay<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> uploadPic_1OrderRefundApplay(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.uploadPic_1OrderRefundApplay<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("提交售后申请")
	fun<T:BaseResult<Void>> orderRefundApplayOrderRefundApplay(
		@Description("联系电话") contactMobile:String,
		@Description("联系人") contactPerson:String,
		@Description("用户描述（非必须参数）") memberDesc:String? = null,
		@Description("订单商品ID") orderItemId:String,
		@Description("图片链接地址数组（非必须参数）") pics:String? = null,
		@Description("商品数量") quantity:String,
		@Description("退款原因ID") refundReasonId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.orderRefundApplayOrderRefundApplay<T>(contactMobile,contactPerson,memberDesc,orderItemId,pics,quantity,refundReasonId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> orderRefundApplayOrderRefundApplay(
		@Description("联系电话") contactMobile:String,
		@Description("联系人") contactPerson:String,
		@Description("用户描述（非必须参数）") memberDesc:String? = null,
		@Description("订单商品ID") orderItemId:String,
		@Description("图片链接地址数组（非必须参数）") pics:String? = null,
		@Description("商品数量") quantity:String,
		@Description("退款原因ID") refundReasonId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.orderRefundApplayOrderRefundApplay<T>(contactMobile,contactPerson,memberDesc,orderItemId,pics,quantity,refundReasonId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("批量上传申请图片")
	fun<T:BaseResult<Void>> uploadPics_1OrderRefundApplay(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.uploadPics_1OrderRefundApplay<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> uploadPics_1OrderRefundApplay(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.uploadPics_1OrderRefundApplay<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取退货原因选择列表")
	fun<T:BaseResult<Void>> getRefundReasonSelectDataOrderRefundApplay(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getRefundReasonSelectDataOrderRefundApplay<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getRefundReasonSelectDataOrderRefundApplay(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getRefundReasonSelectDataOrderRefundApplay<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("订单售后申请详细信息")
	fun<T:BaseResult<Void>> detail_1OrderRefundApplay(
		@Description("orderRefundApplayId") orderRefundApplayId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detail_1OrderRefundApplay<T>(orderRefundApplayId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detail_1OrderRefundApplay(
		@Description("orderRefundApplayId") orderRefundApplayId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detail_1OrderRefundApplay<T>(orderRefundApplayId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("订单售后分页查询")
	fun<T:BaseResult<Void>> appMemberRefundPageOrderRefundApplay(
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.appMemberRefundPageOrderRefundApplay<T>(currentPage,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> appMemberRefundPageOrderRefundApplay(
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.appMemberRefundPageOrderRefundApplay<T>(currentPage,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("订单售后申请分页查询")
	fun<T:BaseResult<Void>> appMemberRefundApplayPageOrderRefundApplay(
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.appMemberRefundApplayPageOrderRefundApplay<T>(currentPage,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> appMemberRefundApplayPageOrderRefundApplay(
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.appMemberRefundApplayPageOrderRefundApplay<T>(currentPage,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}