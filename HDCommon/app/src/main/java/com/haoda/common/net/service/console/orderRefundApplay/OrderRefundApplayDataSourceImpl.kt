package com.haoda.common.net.service.console.orderRefundApplay

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

	@Description("详情")
	fun<T:BaseResult<Void>> detail_15OrderRefundApplay(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detail_15OrderRefundApplay<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detail_15OrderRefundApplay(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detail_15OrderRefundApplay<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("申请拒绝")
	fun<T:BaseResult<Void>> applayNotAgreeOrderRefundApplay(
		@Description("主键") id:String,
		@Description("处理备注（非必须参数）") prodessDesc:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.applayNotAgreeOrderRefundApplay<T>(id,prodessDesc).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> applayNotAgreeOrderRefundApplay(
		@Description("主键") id:String,
		@Description("处理备注（非必须参数）") prodessDesc:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.applayNotAgreeOrderRefundApplay<T>(id,prodessDesc).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("申请通过")
	fun<T:BaseResult<Void>> applayAgreeOrderRefundApplay(
		@Description("主键") id:String,
		@Description("处理备注（非必须参数）") prodessDesc:String? = null,
		@Description("收货地址") receiveAddress:String,
		@Description("收货人电话") receiveMobile:String,
		@Description("收货人") receivePerson:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.applayAgreeOrderRefundApplay<T>(id,prodessDesc,receiveAddress,receiveMobile,receivePerson).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> applayAgreeOrderRefundApplay(
		@Description("主键") id:String,
		@Description("处理备注（非必须参数）") prodessDesc:String? = null,
		@Description("收货地址") receiveAddress:String,
		@Description("收货人电话") receiveMobile:String,
		@Description("收货人") receivePerson:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.applayAgreeOrderRefundApplay<T>(id,prodessDesc,receiveAddress,receiveMobile,receivePerson).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分页查询")
	fun<T:BaseResult<Void>> page_17OrderRefundApplay(
		@Description("退货单号（非必须参数）") applayNo:String? = null,
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("状态（1->待处理2->退货中3->已完成4->申请拒绝5->退款拒绝）（非必须参数）") refundStatus:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.page_17OrderRefundApplay<T>(applayNo,currentPage,pageSize,refundStatus).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> page_17OrderRefundApplay(
		@Description("退货单号（非必须参数）") applayNo:String? = null,
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("状态（1->待处理2->退货中3->已完成4->申请拒绝5->退款拒绝）（非必须参数）") refundStatus:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.page_17OrderRefundApplay<T>(applayNo,currentPage,pageSize,refundStatus).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("同意退款")
	fun<T:BaseResult<Void>> refundAgreeOrderRefundApplay(
		@Description("主键") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.refundAgreeOrderRefundApplay<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> refundAgreeOrderRefundApplay(
		@Description("主键") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.refundAgreeOrderRefundApplay<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("拒绝退款")
	fun<T:BaseResult<Void>> refundNotAgreeOrderRefundApplay(
		@Description("主键") id:String,
		@Description("处理备注（非必须参数）") prodessDesc:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.refundNotAgreeOrderRefundApplay<T>(id,prodessDesc).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> refundNotAgreeOrderRefundApplay(
		@Description("主键") id:String,
		@Description("处理备注（非必须参数）") prodessDesc:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.refundNotAgreeOrderRefundApplay<T>(id,prodessDesc).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}