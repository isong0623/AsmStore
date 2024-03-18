package com.haoda.common.net.service.console.memberRoyaltyList

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class MemberRoyaltyListDataSourceImpl : BaseDataSource() {

	var service = object : MemberRoyaltyListDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("分页查询下级用户")
	fun<T:BaseResult<Void>> subordinatePageByIdMemberRoyaltyList(
		@Description("当前用户Id") memberId:String,
		@Description("当前页") pageNum:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("mobile（非必须参数）") mobile:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.subordinatePageByIdMemberRoyaltyList<T>(memberId,pageNum,pageSize,mobile).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> subordinatePageByIdMemberRoyaltyList(
		@Description("当前用户Id") memberId:String,
		@Description("当前页") pageNum:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("mobile（非必须参数）") mobile:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.subordinatePageByIdMemberRoyaltyList<T>(memberId,pageNum,pageSize,mobile).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分页查询")
	fun<T:BaseResult<Void>> page_13MemberRoyaltyList(
		@Description("当前页") pageNum:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("mobile（非必须参数）") mobile:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.page_13MemberRoyaltyList<T>(pageNum,pageSize,mobile).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> page_13MemberRoyaltyList(
		@Description("当前页") pageNum:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("mobile（非必须参数）") mobile:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.page_13MemberRoyaltyList<T>(pageNum,pageSize,mobile).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}