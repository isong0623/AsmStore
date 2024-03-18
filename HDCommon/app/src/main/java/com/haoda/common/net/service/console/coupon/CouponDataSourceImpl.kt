package com.haoda.common.net.service.console.coupon

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class CouponDataSourceImpl : BaseDataSource() {

	var service = object : CouponDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("修改")
	fun<T:BaseResult<Void>> update_2Coupon(
		@Description("商品分类ID数组（非必须参数）") categoryIds:String? = null,
		@Description("描述（非必须参数）") description:String? = null,
		@Description("获取结束时间（非必须参数）") getEndTime:String? = null,
		@Description("获取开始时间（非必须参数）") getStartTime:String? = null,
		@Description("获取时间标志（0->无限制1->有限制）（非必须参数）") getTimeFlag:String? = null,
		@Description("id") id:String,
		@Description("使用最低金额；0表示无门槛（非必须参数）") minPoint:String? = null,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("每人限领张数（非必须参数）") perLimit:String? = null,
		@Description("金额（非必须参数）") price:String? = null,
		@Description("发行数量（非必须参数）") publishCount:String? = null,
		@Description("发行数量类型（0->不限量1->限量）（非必须参数）") publishCountType:String? = null,
		@Description("状态（0->停用1->正常）（非必须参数）") status:String? = null,
		@Description("优惠卷类型；1->注册赠券2->用户领取（非必须参数）") type:String? = null,
		@Description("结束使用时间（非必须参数）") useEndTime:String? = null,
		@Description("开始使用时间（非必须参数）") useStartTime:String? = null,
		@Description("领取后可用时间（单位：天）（非必须参数）") useTimeLimit:String? = null,
		@Description("使用时间类型（1->固定日期2->固定时长）（非必须参数）") useTimeType:String? = null,
		@Description("使用类型：1->全场通用；2->指定分类；（非必须参数）") useType:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.update_2Coupon<T>(categoryIds,description,getEndTime,getStartTime,getTimeFlag,id,minPoint,name,perLimit,price,publishCount,publishCountType,status,type,useEndTime,useStartTime,useTimeLimit,useTimeType,useType).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> update_2Coupon(
		@Description("商品分类ID数组（非必须参数）") categoryIds:String? = null,
		@Description("描述（非必须参数）") description:String? = null,
		@Description("获取结束时间（非必须参数）") getEndTime:String? = null,
		@Description("获取开始时间（非必须参数）") getStartTime:String? = null,
		@Description("获取时间标志（0->无限制1->有限制）（非必须参数）") getTimeFlag:String? = null,
		@Description("id") id:String,
		@Description("使用最低金额；0表示无门槛（非必须参数）") minPoint:String? = null,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("每人限领张数（非必须参数）") perLimit:String? = null,
		@Description("金额（非必须参数）") price:String? = null,
		@Description("发行数量（非必须参数）") publishCount:String? = null,
		@Description("发行数量类型（0->不限量1->限量）（非必须参数）") publishCountType:String? = null,
		@Description("状态（0->停用1->正常）（非必须参数）") status:String? = null,
		@Description("优惠卷类型；1->注册赠券2->用户领取（非必须参数）") type:String? = null,
		@Description("结束使用时间（非必须参数）") useEndTime:String? = null,
		@Description("开始使用时间（非必须参数）") useStartTime:String? = null,
		@Description("领取后可用时间（单位：天）（非必须参数）") useTimeLimit:String? = null,
		@Description("使用时间类型（1->固定日期2->固定时长）（非必须参数）") useTimeType:String? = null,
		@Description("使用类型：1->全场通用；2->指定分类；（非必须参数）") useType:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.update_2Coupon<T>(categoryIds,description,getEndTime,getStartTime,getTimeFlag,id,minPoint,name,perLimit,price,publishCount,publishCountType,status,type,useEndTime,useStartTime,useTimeLimit,useTimeType,useType).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("添加")
	fun<T:BaseResult<Void>> save_2Coupon(
		@Description("商品分类ID数组（非必须参数）") categoryIds:String? = null,
		@Description("描述（非必须参数）") description:String? = null,
		@Description("获取结束时间（非必须参数）") getEndTime:String? = null,
		@Description("获取开始时间（非必须参数）") getStartTime:String? = null,
		@Description("获取时间标志（0->无限制1->有限制）") getTimeFlag:String,
		@Description("使用最低金额；0表示无门槛") minPoint:String,
		@Description("名称") name:String,
		@Description("每人限领张数") perLimit:String,
		@Description("金额") price:String,
		@Description("发行数量（非必须参数）") publishCount:String? = null,
		@Description("发行数量类型（0->不限量1->限量）") publishCountType:String,
		@Description("状态（0->停用1->正常）") status:String,
		@Description("优惠卷类型；1->注册赠券2->用户领取") type:String,
		@Description("结束使用时间（非必须参数）") useEndTime:String? = null,
		@Description("开始使用时间（非必须参数）") useStartTime:String? = null,
		@Description("领取后可用时间（单位：天）（非必须参数）") useTimeLimit:String? = null,
		@Description("使用时间类型（1->固定日期2->固定时长）") useTimeType:String,
		@Description("使用类型：1->全场通用；2->指定分类；") useType:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.save_2Coupon<T>(categoryIds,description,getEndTime,getStartTime,getTimeFlag,minPoint,name,perLimit,price,publishCount,publishCountType,status,type,useEndTime,useStartTime,useTimeLimit,useTimeType,useType).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> save_2Coupon(
		@Description("商品分类ID数组（非必须参数）") categoryIds:String? = null,
		@Description("描述（非必须参数）") description:String? = null,
		@Description("获取结束时间（非必须参数）") getEndTime:String? = null,
		@Description("获取开始时间（非必须参数）") getStartTime:String? = null,
		@Description("获取时间标志（0->无限制1->有限制）") getTimeFlag:String,
		@Description("使用最低金额；0表示无门槛") minPoint:String,
		@Description("名称") name:String,
		@Description("每人限领张数") perLimit:String,
		@Description("金额") price:String,
		@Description("发行数量（非必须参数）") publishCount:String? = null,
		@Description("发行数量类型（0->不限量1->限量）") publishCountType:String,
		@Description("状态（0->停用1->正常）") status:String,
		@Description("优惠卷类型；1->注册赠券2->用户领取") type:String,
		@Description("结束使用时间（非必须参数）") useEndTime:String? = null,
		@Description("开始使用时间（非必须参数）") useStartTime:String? = null,
		@Description("领取后可用时间（单位：天）（非必须参数）") useTimeLimit:String? = null,
		@Description("使用时间类型（1->固定日期2->固定时长）") useTimeType:String,
		@Description("使用类型：1->全场通用；2->指定分类；") useType:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.save_2Coupon<T>(categoryIds,description,getEndTime,getStartTime,getTimeFlag,minPoint,name,perLimit,price,publishCount,publishCountType,status,type,useEndTime,useStartTime,useTimeLimit,useTimeType,useType).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("启用")
	fun<T:BaseResult<Void>> startUseCoupon(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.startUseCoupon<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> startUseCoupon(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.startUseCoupon<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("详情")
	fun<T:BaseResult<Void>> detail_2Coupon(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detail_2Coupon<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detail_2Coupon(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detail_2Coupon<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("停用")
	fun<T:BaseResult<Void>> stopUseCoupon(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.stopUseCoupon<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> stopUseCoupon(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.stopUseCoupon<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分页查询")
	fun<T:BaseResult<Void>> page_3Coupon(
		@Description("当前页") currentPage:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("优惠卷类型；1->注册赠券2->用户领取优惠券（非必须参数）") type:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.page_3Coupon<T>(currentPage,name,pageSize,type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> page_3Coupon(
		@Description("当前页") currentPage:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("优惠卷类型；1->注册赠券2->用户领取优惠券（非必须参数）") type:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.page_3Coupon<T>(currentPage,name,pageSize,type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取推送的优惠卷")
	fun<T:BaseResult<Void>> getCouponByTypeCoupon(
		@Description("type") type:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getCouponByTypeCoupon<T>(type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getCouponByTypeCoupon(
		@Description("type") type:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getCouponByTypeCoupon<T>(type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("删除")
	fun<T:BaseResult<Void>> delete_2Coupon(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.delete_2Coupon<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> delete_2Coupon(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.delete_2Coupon<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}