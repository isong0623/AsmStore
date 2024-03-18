package com.haoda.common.net.service.base.systemConfig

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class SystemConfigDataSourceImpl : BaseDataSource() {

	var service = object : SystemConfigDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("删除")
	fun<T:BaseResult<Void>> delete_5SystemConfig(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.delete_5SystemConfig<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> delete_5SystemConfig(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.delete_5SystemConfig<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分页查询")
	fun<T:BaseResult<Void>> page_5SystemConfig(
		@Description("配置项key（非必须参数）") configKey:String? = null,
		@Description("当前页") currentPage:String,
		@Description("描述（非必须参数）") description:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.page_5SystemConfig<T>(configKey,currentPage,description,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> page_5SystemConfig(
		@Description("配置项key（非必须参数）") configKey:String? = null,
		@Description("当前页") currentPage:String,
		@Description("描述（非必须参数）") description:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.page_5SystemConfig<T>(configKey,currentPage,description,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("添加")
	fun<T:BaseResult<Void>> save_5SystemConfig(
		@Description("配置项key") configKey:String,
		@Description("配置项value") configValue:String,
		@Description("描述（非必须参数）") description:String? = null,
		@Description("状态(0->停用1->启用)") status:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.save_5SystemConfig<T>(configKey,configValue,description,status).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> save_5SystemConfig(
		@Description("配置项key") configKey:String,
		@Description("配置项value") configValue:String,
		@Description("描述（非必须参数）") description:String? = null,
		@Description("状态(0->停用1->启用)") status:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.save_5SystemConfig<T>(configKey,configValue,description,status).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("修改")
	fun<T:BaseResult<Void>> update_5SystemConfig(
		@Description("配置项key（非必须参数）") configKey:String? = null,
		@Description("配置项value（非必须参数）") configValue:String? = null,
		@Description("描述（非必须参数）") description:String? = null,
		@Description("id") id:String,
		@Description("状态(0->停用1->启用)（非必须参数）") status:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.update_5SystemConfig<T>(configKey,configValue,description,id,status).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> update_5SystemConfig(
		@Description("配置项key（非必须参数）") configKey:String? = null,
		@Description("配置项value（非必须参数）") configValue:String? = null,
		@Description("描述（非必须参数）") description:String? = null,
		@Description("id") id:String,
		@Description("状态(0->停用1->启用)（非必须参数）") status:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.update_5SystemConfig<T>(configKey,configValue,description,id,status).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}