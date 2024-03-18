package com.haoda.common.net.service.mall.memberCoupon

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class MemberCouponDataSourceImpl : BaseDataSource() {

	var service = object : MemberCouponDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("获取可领取优惠券列表")
	fun<T:BaseResult<Void>> memberCanGetListMemberCoupon(
		@Description("优惠券类型") type:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.memberCanGetListMemberCoupon<T>(type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> memberCanGetListMemberCoupon(
		@Description("优惠券类型") type:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.memberCanGetListMemberCoupon<T>(type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分页查询")
	fun<T:BaseResult<Void>> memberPage_1MemberCoupon(
		@Description("当前页") currentPage:String,
		@Description("每页条数(默认10条)（非必须参数）") pageSize:String? = null,
		@Description("1->未使用2->已使用3->已过期99->全部（非必须参数）") qureyCode:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.memberPage_1MemberCoupon<T>(currentPage,pageSize,qureyCode).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> memberPage_1MemberCoupon(
		@Description("当前页") currentPage:String,
		@Description("每页条数(默认10条)（非必须参数）") pageSize:String? = null,
		@Description("1->未使用2->已使用3->已过期99->全部（非必须参数）") qureyCode:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.memberPage_1MemberCoupon<T>(currentPage,pageSize,qureyCode).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("领取优惠券")
	fun<T:BaseResult<Void>> receiveCouponMemberCoupon(
		@Description("couponId") couponId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.receiveCouponMemberCoupon<T>(couponId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> receiveCouponMemberCoupon(
		@Description("couponId") couponId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.receiveCouponMemberCoupon<T>(couponId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("根据id查询")
	fun<T:BaseResult<Void>> queryCouponByIdMemberCoupon(
		@Description("couponId") couponId:String,
		@Description("优惠券id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.queryCouponByIdMemberCoupon<T>(couponId,id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> queryCouponByIdMemberCoupon(
		@Description("couponId") couponId:String,
		@Description("优惠券id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.queryCouponByIdMemberCoupon<T>(couponId,id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}