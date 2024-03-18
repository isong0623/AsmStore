package com.haoda.common.net.service.mall.search

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class SearchDataSourceImpl : BaseDataSource() {

	var service = object : SearchDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("获取热门搜索")
	fun<T:BaseResult<Void>> appGetSearchHotSearch(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.appGetSearchHotSearch<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> appGetSearchHotSearch(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.appGetSearchHotSearch<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("搜索商品")
	fun<T:BaseResult<Void>> searchSearch(
		@Description("当前页") currentPage:String,
		@Description("keywords（非必须参数）") keywords:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("排序类型(1->按新品从新到旧；2->按销量从高到低；3->按价格从低到高；4->按价格从高到低；99->综合)（非必须参数）") sortType:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.searchSearch<T>(currentPage,keywords,pageSize,sortType).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> searchSearch(
		@Description("当前页") currentPage:String,
		@Description("keywords（非必须参数）") keywords:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("排序类型(1->按新品从新到旧；2->按销量从高到低；3->按价格从低到高；4->按价格从高到低；99->综合)（非必须参数）") sortType:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.searchSearch<T>(currentPage,keywords,pageSize,sortType).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}