package com.haoda.common.net.service.base.permission

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class PermissionDataSourceImpl : BaseDataSource() {

	var service = object : PermissionDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("修改")
	fun<T:BaseResult<Void>> update_3Permission(
		@Description("当前页") currentPage:String,
		@Description("图标（非必须参数）") icon:String? = null,
		@Description("id") id:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("（非必须参数）") pageSize:String? = null,
		@Description("权限值（非必须参数）") param:String? = null,
		@Description("父级权限id（非必须参数）") pid:String? = null,
		@Description("（非必须参数）") requestUrl:String? = null,
		@Description("（非必须参数）") searchEndDate:String? = null,
		@Description("（非必须参数）") searchEndTime:String? = null,
		@Description("（非必须参数）") searchStartDate:String? = null,
		@Description("（非必须参数）") searchStartTime:String? = null,
		@Description("排序（非必须参数）") sort:String? = null,
		@Description("权限类型：1->目录；2->菜单；3->按钮（非必须参数）") type:String? = null,
		@Description("前端资源路径（非必须参数）") viewUri:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.update_3Permission<T>(currentPage,icon,id,name,pageSize,param,pid,requestUrl,searchEndDate,searchEndTime,searchStartDate,searchStartTime,sort,type,viewUri).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> update_3Permission(
		@Description("当前页") currentPage:String,
		@Description("图标（非必须参数）") icon:String? = null,
		@Description("id") id:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("（非必须参数）") pageSize:String? = null,
		@Description("权限值（非必须参数）") param:String? = null,
		@Description("父级权限id（非必须参数）") pid:String? = null,
		@Description("（非必须参数）") requestUrl:String? = null,
		@Description("（非必须参数）") searchEndDate:String? = null,
		@Description("（非必须参数）") searchEndTime:String? = null,
		@Description("（非必须参数）") searchStartDate:String? = null,
		@Description("（非必须参数）") searchStartTime:String? = null,
		@Description("排序（非必须参数）") sort:String? = null,
		@Description("权限类型：1->目录；2->菜单；3->按钮（非必须参数）") type:String? = null,
		@Description("前端资源路径（非必须参数）") viewUri:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.update_3Permission<T>(currentPage,icon,id,name,pageSize,param,pid,requestUrl,searchEndDate,searchEndTime,searchStartDate,searchStartTime,sort,type,viewUri).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("添加")
	fun<T:BaseResult<Void>> save_3Permission(
		@Description("当前页") currentPage:String,
		@Description("图标（非必须参数）") icon:String? = null,
		@Description("") id:String,
		@Description("名称") name:String,
		@Description("（非必须参数）") pageSize:String? = null,
		@Description("权限值（非必须参数）") param:String? = null,
		@Description("父级权限id") pid:String,
		@Description("（非必须参数）") requestUrl:String? = null,
		@Description("（非必须参数）") searchEndDate:String? = null,
		@Description("（非必须参数）") searchEndTime:String? = null,
		@Description("（非必须参数）") searchStartDate:String? = null,
		@Description("（非必须参数）") searchStartTime:String? = null,
		@Description("排序（非必须参数）") sort:String? = null,
		@Description("权限类型：1->目录；2->菜单；3->按钮") type:String,
		@Description("前端资源路径（非必须参数）") viewUri:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.save_3Permission<T>(currentPage,icon,id,name,pageSize,param,pid,requestUrl,searchEndDate,searchEndTime,searchStartDate,searchStartTime,sort,type,viewUri).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> save_3Permission(
		@Description("当前页") currentPage:String,
		@Description("图标（非必须参数）") icon:String? = null,
		@Description("") id:String,
		@Description("名称") name:String,
		@Description("（非必须参数）") pageSize:String? = null,
		@Description("权限值（非必须参数）") param:String? = null,
		@Description("父级权限id") pid:String,
		@Description("（非必须参数）") requestUrl:String? = null,
		@Description("（非必须参数）") searchEndDate:String? = null,
		@Description("（非必须参数）") searchEndTime:String? = null,
		@Description("（非必须参数）") searchStartDate:String? = null,
		@Description("（非必须参数）") searchStartTime:String? = null,
		@Description("排序（非必须参数）") sort:String? = null,
		@Description("权限类型：1->目录；2->菜单；3->按钮") type:String,
		@Description("前端资源路径（非必须参数）") viewUri:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.save_3Permission<T>(currentPage,icon,id,name,pageSize,param,pid,requestUrl,searchEndDate,searchEndTime,searchStartDate,searchStartTime,sort,type,viewUri).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分页查询")
	fun<T:BaseResult<Void>> page_3Permission(
		@Description("当前页") currentPage:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.page_3Permission<T>(currentPage,name,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> page_3Permission(
		@Description("当前页") currentPage:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.page_3Permission<T>(currentPage,name,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("删除")
	fun<T:BaseResult<Void>> delete_3Permission(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.delete_3Permission<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> delete_3Permission(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.delete_3Permission<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取所有权限")
	fun<T:BaseResult<Void>> listPermission(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.listPermission<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> listPermission(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.listPermission<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("详情")
	fun<T:BaseResult<Void>> detail_1Permission(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detail_1Permission<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detail_1Permission(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detail_1Permission<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}