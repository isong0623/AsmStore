package com.haoda.common.net.service.console.attributeKey

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class AttributeKeyDataSourceImpl : BaseDataSource() {

	var service = object : AttributeKeyDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("属性分页")
	fun<T:BaseResult<Void>> page_20AttributeKey(
		@Description("属性分类id（非必须参数）") attributeCategoryId:String? = null,
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.page_20AttributeKey<T>(attributeCategoryId,currentPage,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> page_20AttributeKey(
		@Description("属性分类id（非必须参数）") attributeCategoryId:String? = null,
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.page_20AttributeKey<T>(attributeCategoryId,currentPage,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("属性分类详情")
	fun<T:BaseResult<Void>> detail_18AttributeKey(
		@Description("属性id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detail_18AttributeKey<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detail_18AttributeKey(
		@Description("属性id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detail_18AttributeKey<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("属性keylist")
	fun<T:BaseResult<Void>> list_2AttributeKey(
		@Description("属性分类id（非必须参数）") attributeCategoryId:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.list_2AttributeKey<T>(attributeCategoryId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> list_2AttributeKey(
		@Description("属性分类id（非必须参数）") attributeCategoryId:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.list_2AttributeKey<T>(attributeCategoryId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("更新属性")
	fun<T:BaseResult<Void>> update_14AttributeKey(
		@Description("属性分类id（非必须参数）") attributeCategoryId:String? = null,
		@Description("属性名（非必须参数）") attributeKey:String? = null,
		@Description("属性值") attributeValue:String,
		@Description("属性名id") id:String,
		@Description("备注（非必须参数）") note:String? = null,
		@Description("排序（非必须参数）") sort:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.update_14AttributeKey<T>(attributeCategoryId,attributeKey,attributeValue,id,note,sort).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> update_14AttributeKey(
		@Description("属性分类id（非必须参数）") attributeCategoryId:String? = null,
		@Description("属性名（非必须参数）") attributeKey:String? = null,
		@Description("属性值") attributeValue:String,
		@Description("属性名id") id:String,
		@Description("备注（非必须参数）") note:String? = null,
		@Description("排序（非必须参数）") sort:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.update_14AttributeKey<T>(attributeCategoryId,attributeKey,attributeValue,id,note,sort).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("删除属性")
	fun<T:BaseResult<Void>> delete_13AttributeKey(
		@Description("属性id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.delete_13AttributeKey<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> delete_13AttributeKey(
		@Description("属性id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.delete_13AttributeKey<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("添加属性名key")
	fun<T:BaseResult<Void>> save_14AttributeKey(
		@Description("属性分类id为空") attributeCategoryId:String,
		@Description("属性名为空") attributeKey:String,
		@Description("属性值") attributeValue:String,
		@Description("备注（非必须参数）") note:String? = null,
		@Description("排序") sort:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.save_14AttributeKey<T>(attributeCategoryId,attributeKey,attributeValue,note,sort).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> save_14AttributeKey(
		@Description("属性分类id为空") attributeCategoryId:String,
		@Description("属性名为空") attributeKey:String,
		@Description("属性值") attributeValue:String,
		@Description("备注（非必须参数）") note:String? = null,
		@Description("排序") sort:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.save_14AttributeKey<T>(attributeCategoryId,attributeKey,attributeValue,note,sort).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}