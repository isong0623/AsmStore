package com.haoda.common.net.service.base.user

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class UserDataSourceImpl : BaseDataSource() {

	var service = object : UserDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("添加")
	fun<T:BaseResult<Void>> save_6User(
		@Description("手机号") mobile:String,
		@Description("真实姓名") realName:String,
		@Description("备注（非必须参数）") remark:String? = null,
		@Description("角色ID数组") roleIds:String,
		@Description("状态：0->禁用1->正常2->锁定") status:String,
		@Description("用户名") userName:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.save_6User<T>(mobile,realName,remark,roleIds,status,userName).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> save_6User(
		@Description("手机号") mobile:String,
		@Description("真实姓名") realName:String,
		@Description("备注（非必须参数）") remark:String? = null,
		@Description("角色ID数组") roleIds:String,
		@Description("状态：0->禁用1->正常2->锁定") status:String,
		@Description("用户名") userName:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.save_6User<T>(mobile,realName,remark,roleIds,status,userName).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取角色")
	fun<T:BaseResult<Void>> rangeRoles_1User(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.rangeRoles_1User<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> rangeRoles_1User(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.rangeRoles_1User<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("删除")
	fun<T:BaseResult<Void>> delete_6User(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.delete_6User<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> delete_6User(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.delete_6User<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("详情")
	fun<T:BaseResult<Void>> detail_3User(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detail_3User<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detail_3User(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detail_3User<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分配角色")
	fun<T:BaseResult<Void>> rangeRolesUser(
		@Description("id") id:String,
		@Description("roleIds") roleIds:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.rangeRolesUser<T>(id,roleIds).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> rangeRolesUser(
		@Description("id") id:String,
		@Description("roleIds") roleIds:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.rangeRolesUser<T>(id,roleIds).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("修改")
	fun<T:BaseResult<Void>> update_6User(
		@Description("id") id:String,
		@Description("手机号（非必须参数）") mobile:String? = null,
		@Description("真实姓名（非必须参数）") realName:String? = null,
		@Description("备注（非必须参数）") remark:String? = null,
		@Description("角色ID数组") roleIds:String,
		@Description("状态：0->禁用1->正常2->锁定（非必须参数）") status:String? = null,
		@Description("用户名（非必须参数）") userName:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.update_6User<T>(id,mobile,realName,remark,roleIds,status,userName).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> update_6User(
		@Description("id") id:String,
		@Description("手机号（非必须参数）") mobile:String? = null,
		@Description("真实姓名（非必须参数）") realName:String? = null,
		@Description("备注（非必须参数）") remark:String? = null,
		@Description("角色ID数组") roleIds:String,
		@Description("状态：0->禁用1->正常2->锁定（非必须参数）") status:String? = null,
		@Description("用户名（非必须参数）") userName:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.update_6User<T>(id,mobile,realName,remark,roleIds,status,userName).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分页查询")
	fun<T:BaseResult<Void>> page_6User(
		@Description("当前页") currentPage:String,
		@Description("手机号（非必须参数）") mobile:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("真实姓名（非必须参数）") realName:String? = null,
		@Description("用户名（非必须参数）") userName:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.page_6User<T>(currentPage,mobile,pageSize,realName,userName).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> page_6User(
		@Description("当前页") currentPage:String,
		@Description("手机号（非必须参数）") mobile:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("真实姓名（非必须参数）") realName:String? = null,
		@Description("用户名（非必须参数）") userName:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.page_6User<T>(currentPage,mobile,pageSize,realName,userName).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("重置密码")
	fun<T:BaseResult<Void>> detail_2User(
		@Description("id") id:String,
		@Description("newPassword") newPassword:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detail_2User<T>(id,newPassword).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detail_2User(
		@Description("id") id:String,
		@Description("newPassword") newPassword:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detail_2User<T>(id,newPassword).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}