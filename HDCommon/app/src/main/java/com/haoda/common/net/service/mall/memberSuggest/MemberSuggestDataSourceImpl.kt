package com.haoda.common.net.service.mall.memberSuggest

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class MemberSuggestDataSourceImpl : BaseDataSource() {

	var service = object : MemberSuggestDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("用户意见反馈")
	fun<T:BaseResult<Void>> appSuggestMemberSuggest(
		@Description("content") content:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.appSuggestMemberSuggest<T>(content).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> appSuggestMemberSuggest(
		@Description("content") content:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.appSuggestMemberSuggest<T>(content).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}