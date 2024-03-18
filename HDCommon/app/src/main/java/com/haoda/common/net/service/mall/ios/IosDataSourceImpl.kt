package com.haoda.common.net.service.mall.ios

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class IosDataSourceImpl : BaseDataSource() {

	var service = object : IosDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("ios展示标识")
	fun<T:BaseResult<Void>> iosShowIos(
		@Description("ios版本(包)入参") buildIn:String,
		@Description("字典表ios-config-build-id") dicKeyId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.iosShowIos<T>(buildIn,dicKeyId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> iosShowIos(
		@Description("ios版本(包)入参") buildIn:String,
		@Description("字典表ios-config-build-id") dicKeyId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.iosShowIos<T>(buildIn,dicKeyId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("ios更新信息")
	fun<T:BaseResult<Void>> iosUpdateIos(
		@Description("build号") buildIn:String,
		@Description("下载渠道") downloadChannel:String,
		@Description("平台标记(ios,android)") platformMarking:String,
		@Description("版本号") version:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.iosUpdateIos<T>(buildIn,downloadChannel,platformMarking,version).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> iosUpdateIos(
		@Description("build号") buildIn:String,
		@Description("下载渠道") downloadChannel:String,
		@Description("平台标记(ios,android)") platformMarking:String,
		@Description("版本号") version:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.iosUpdateIos<T>(buildIn,downloadChannel,platformMarking,version).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}