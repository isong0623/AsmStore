package com.haoda.common.net.service.mall.productShare

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class ProductShareDataSourceImpl : BaseDataSource() {

	var service = object : ProductShareDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("获取商品分享信息")
	fun<T:BaseResult<Void>> shareProductShare(
		@Description("productId") productId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.shareProductShare<T>(productId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> shareProductShare(
		@Description("productId") productId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.shareProductShare<T>(productId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分享成功")
	fun<T:BaseResult<Void>> shareSuccessProductShare(
		@Description("分享ID") id:String,
		@Description("分享加密信息") secretCode:String,
		@Description("分享类型（1-微信朋友圈2-微信好友）") shareType:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.shareSuccessProductShare<T>(id,secretCode,shareType).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> shareSuccessProductShare(
		@Description("分享ID") id:String,
		@Description("分享加密信息") secretCode:String,
		@Description("分享类型（1-微信朋友圈2-微信好友）") shareType:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.shareSuccessProductShare<T>(id,secretCode,shareType).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}