package com.haoda.common.net.service.base.appVersion

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class AppVersionDataSourceImpl : BaseDataSource() {

	var service = object : AppVersionDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("版本更新")
	fun<T:BaseResult<Void>> updateAppVersion(
		@Description("build") build:String,
		@Description("id") id:String,
		@Description("间隔时间") intervalTime:String,
		@Description("是否强制更新(1-强制更新，2-选择更新)") isForceUpdate:String,
		@Description("平台标记（ios,android）") platformMarking:String,
		@Description("更新内容") updateContent:String,
		@Description("下载更新路径") updatePath:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.updateAppVersion<T>(build,id,intervalTime,isForceUpdate,platformMarking,updateContent,updatePath).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> updateAppVersion(
		@Description("build") build:String,
		@Description("id") id:String,
		@Description("间隔时间") intervalTime:String,
		@Description("是否强制更新(1-强制更新，2-选择更新)") isForceUpdate:String,
		@Description("平台标记（ios,android）") platformMarking:String,
		@Description("更新内容") updateContent:String,
		@Description("下载更新路径") updatePath:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.updateAppVersion<T>(build,id,intervalTime,isForceUpdate,platformMarking,updateContent,updatePath).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("版本删除")
	fun<T:BaseResult<Void>> deleteAppVersion(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.deleteAppVersion<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> deleteAppVersion(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.deleteAppVersion<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("版本保存")
	fun<T:BaseResult<Void>> saveAppVersion(
		@Description("build") build:String,
		@Description("间隔时间(以小时为单位)") intervalTime:String,
		@Description("是否强制更新(1-强制更新，2-选择更新)") isForceUpdate:String,
		@Description("平台标记（ios,android）") platformMarking:String,
		@Description("更新内容") updateContent:String,
		@Description("下载更新路径") updatePath:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.saveAppVersion<T>(build,intervalTime,isForceUpdate,platformMarking,updateContent,updatePath).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> saveAppVersion(
		@Description("build") build:String,
		@Description("间隔时间(以小时为单位)") intervalTime:String,
		@Description("是否强制更新(1-强制更新，2-选择更新)") isForceUpdate:String,
		@Description("平台标记（ios,android）") platformMarking:String,
		@Description("更新内容") updateContent:String,
		@Description("下载更新路径") updatePath:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.saveAppVersion<T>(build,intervalTime,isForceUpdate,platformMarking,updateContent,updatePath).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("版本详情后台维护用")
	fun<T:BaseResult<Void>> detailAppVersion(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detailAppVersion<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detailAppVersion(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detailAppVersion<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分页查询")
	fun<T:BaseResult<Void>> pageAppVersion(
		@Description("currentPage（非必须参数）") currentPage:String? = null,
		@Description("pagesize（非必须参数）") pagesize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.pageAppVersion<T>(currentPage,pagesize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> pageAppVersion(
		@Description("currentPage（非必须参数）") currentPage:String? = null,
		@Description("pagesize（非必须参数）") pagesize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.pageAppVersion<T>(currentPage,pagesize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}