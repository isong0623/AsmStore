package com.haoda.common.net.service.mall.appraise

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class AppraiseDataSourceImpl : BaseDataSource() {

	var service = object : AppraiseDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("分页查询")
	fun<T:BaseResult<Void>> pageAppraise(
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("商品ID") productId:String,
		@Description("查询标识（1->全部2->最新3->有图）（非必须参数）") queryFlag:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.pageAppraise<T>(currentPage,pageSize,productId,queryFlag).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> pageAppraise(
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("商品ID") productId:String,
		@Description("查询标识（1->全部2->最新3->有图）（非必须参数）") queryFlag:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.pageAppraise<T>(currentPage,pageSize,productId,queryFlag).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}