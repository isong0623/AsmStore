package com.haoda.common.net.service.console.orderItemPromotion

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class OrderItemPromotionDataSourceImpl : BaseDataSource() {

	var service = object : OrderItemPromotionDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("详情")
	fun<T:BaseResult<Void>> detail_14OrderItemPromotion(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detail_14OrderItemPromotion<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detail_14OrderItemPromotion(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detail_14OrderItemPromotion<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("修改")
	fun<T:BaseResult<Void>> update_11OrderItemPromotion(
		@Description("id") id:String,
		@Description("订单详细ID（非必须参数）") orderItemId:String? = null,
		@Description("商品ID（非必须参数）") productId:String? = null,
		@Description("商品数量（非必须参数）") productQuantity:String? = null,
		@Description("优惠ID（非必须参数）") promotionId:String? = null,
		@Description("优惠参数（非必须参数）") promotionParam:String? = null,
		@Description("促销类型：0->无促销;6->优选尖货；（非必须参数）") promotionType:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.update_11OrderItemPromotion<T>(id,orderItemId,productId,productQuantity,promotionId,promotionParam,promotionType).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> update_11OrderItemPromotion(
		@Description("id") id:String,
		@Description("订单详细ID（非必须参数）") orderItemId:String? = null,
		@Description("商品ID（非必须参数）") productId:String? = null,
		@Description("商品数量（非必须参数）") productQuantity:String? = null,
		@Description("优惠ID（非必须参数）") promotionId:String? = null,
		@Description("优惠参数（非必须参数）") promotionParam:String? = null,
		@Description("促销类型：0->无促销;6->优选尖货；（非必须参数）") promotionType:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.update_11OrderItemPromotion<T>(id,orderItemId,productId,productQuantity,promotionId,promotionParam,promotionType).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("删除")
	fun<T:BaseResult<Void>> delete_10OrderItemPromotion(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.delete_10OrderItemPromotion<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> delete_10OrderItemPromotion(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.delete_10OrderItemPromotion<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分页查询")
	fun<T:BaseResult<Void>> page_16OrderItemPromotion(
		@Description("当前页") currentPage:String,
		@Description("订单详细ID（非必须参数）") orderItemId:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("商品ID（非必须参数）") productId:String? = null,
		@Description("商品数量（非必须参数）") productQuantity:String? = null,
		@Description("优惠ID（非必须参数）") promotionId:String? = null,
		@Description("优惠参数（非必须参数）") promotionParam:String? = null,
		@Description("促销类型：0->无促销;6->优选尖货；（非必须参数）") promotionType:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.page_16OrderItemPromotion<T>(currentPage,orderItemId,pageSize,productId,productQuantity,promotionId,promotionParam,promotionType).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> page_16OrderItemPromotion(
		@Description("当前页") currentPage:String,
		@Description("订单详细ID（非必须参数）") orderItemId:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("商品ID（非必须参数）") productId:String? = null,
		@Description("商品数量（非必须参数）") productQuantity:String? = null,
		@Description("优惠ID（非必须参数）") promotionId:String? = null,
		@Description("优惠参数（非必须参数）") promotionParam:String? = null,
		@Description("促销类型：0->无促销;6->优选尖货；（非必须参数）") promotionType:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.page_16OrderItemPromotion<T>(currentPage,orderItemId,pageSize,productId,productQuantity,promotionId,promotionParam,promotionType).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("添加")
	fun<T:BaseResult<Void>> save_11OrderItemPromotion(
		@Description("订单详细ID") orderItemId:String,
		@Description("商品ID") productId:String,
		@Description("商品数量") productQuantity:String,
		@Description("优惠ID") promotionId:String,
		@Description("优惠参数") promotionParam:String,
		@Description("促销类型：0->无促销;6->优选尖货；") promotionType:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.save_11OrderItemPromotion<T>(orderItemId,productId,productQuantity,promotionId,promotionParam,promotionType).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> save_11OrderItemPromotion(
		@Description("订单详细ID") orderItemId:String,
		@Description("商品ID") productId:String,
		@Description("商品数量") productQuantity:String,
		@Description("优惠ID") promotionId:String,
		@Description("优惠参数") promotionParam:String,
		@Description("促销类型：0->无促销;6->优选尖货；") promotionType:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.save_11OrderItemPromotion<T>(orderItemId,productId,productQuantity,promotionId,promotionParam,promotionType).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}