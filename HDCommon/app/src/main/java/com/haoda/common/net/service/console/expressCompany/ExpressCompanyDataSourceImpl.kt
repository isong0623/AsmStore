package com.haoda.common.net.service.console.expressCompany

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class ExpressCompanyDataSourceImpl : BaseDataSource() {

	var service = object : ExpressCompanyDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("修改")
	fun<T:BaseResult<Void>> update_6ExpressCompany(
		@Description("编号（非必须参数）") code:String? = null,
		@Description("id") id:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("状态（0=>停用1->正常）（非必须参数）") status:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.update_6ExpressCompany<T>(code,id,name,status).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> update_6ExpressCompany(
		@Description("编号（非必须参数）") code:String? = null,
		@Description("id") id:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("状态（0=>停用1->正常）（非必须参数）") status:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.update_6ExpressCompany<T>(code,id,name,status).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("详情")
	fun<T:BaseResult<Void>> detail_6ExpressCompany(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detail_6ExpressCompany<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detail_6ExpressCompany(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detail_6ExpressCompany<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("停用")
	fun<T:BaseResult<Void>> stopUse_2ExpressCompany(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.stopUse_2ExpressCompany<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> stopUse_2ExpressCompany(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.stopUse_2ExpressCompany<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分页查询")
	fun<T:BaseResult<Void>> page_7ExpressCompany(
		@Description("编号（非必须参数）") code:String? = null,
		@Description("当前页") currentPage:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("状态（0=>停用1->正常）（非必须参数）") status:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.page_7ExpressCompany<T>(code,currentPage,name,pageSize,status).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> page_7ExpressCompany(
		@Description("编号（非必须参数）") code:String? = null,
		@Description("当前页") currentPage:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("状态（0=>停用1->正常）（非必须参数）") status:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.page_7ExpressCompany<T>(code,currentPage,name,pageSize,status).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("添加")
	fun<T:BaseResult<Void>> save_6ExpressCompany(
		@Description("编号") code:String,
		@Description("名称") name:String,
		@Description("状态（0=>停用1->正常）") status:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.save_6ExpressCompany<T>(code,name,status).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> save_6ExpressCompany(
		@Description("编号") code:String,
		@Description("名称") name:String,
		@Description("状态（0=>停用1->正常）") status:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.save_6ExpressCompany<T>(code,name,status).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取选择列表")
	fun<T:BaseResult<Void>> getSelectListExpressCompany(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getSelectListExpressCompany<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getSelectListExpressCompany(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getSelectListExpressCompany<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("启用")
	fun<T:BaseResult<Void>> startUse_2ExpressCompany(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.startUse_2ExpressCompany<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> startUse_2ExpressCompany(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.startUse_2ExpressCompany<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("删除")
	fun<T:BaseResult<Void>> delete_5ExpressCompany(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.delete_5ExpressCompany<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> delete_5ExpressCompany(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.delete_5ExpressCompany<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}