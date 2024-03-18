package com.haoda.common.net.service.mall.memberAppraise

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class MemberAppraiseDataSourceImpl : BaseDataSource() {

	var service = object : MemberAppraiseDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("批量上传评价图片")
	fun<T:BaseResult<Void>> uploadPicsMemberAppraise(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.uploadPicsMemberAppraise<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> uploadPicsMemberAppraise(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.uploadPicsMemberAppraise<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("已评价商品分页查询")
	fun<T:BaseResult<Void>> getMemberAppraisedPageMemberAppraise(
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getMemberAppraisedPageMemberAppraise<T>(currentPage,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getMemberAppraisedPageMemberAppraise(
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getMemberAppraisedPageMemberAppraise<T>(currentPage,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("商品评价")
	fun<T:BaseResult<Void>> appSave_1MemberAppraise(
		@Description("评价内容") appraise:String,
		@Description("描述相符评分") descriptionStar:String,
		@Description("物流评分（非必须参数）") feightStar:String? = null,
		@Description("匿名状态（0->不匿名1->匿名）") hideStatus:String,
		@Description("订单ID") orderId:String,
		@Description("评价图片数组（非必须参数）") picList:String? = null,
		@Description("商品ID") productId:String,
		@Description("服务态度评分（非必须参数）") serviceStar:String? = null,
		@Description("商品属性（非必须参数）") skuAttribute:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.appSave_1MemberAppraise<T>(appraise,descriptionStar,feightStar,hideStatus,orderId,picList,productId,serviceStar,skuAttribute).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> appSave_1MemberAppraise(
		@Description("评价内容") appraise:String,
		@Description("描述相符评分") descriptionStar:String,
		@Description("物流评分（非必须参数）") feightStar:String? = null,
		@Description("匿名状态（0->不匿名1->匿名）") hideStatus:String,
		@Description("订单ID") orderId:String,
		@Description("评价图片数组（非必须参数）") picList:String? = null,
		@Description("商品ID") productId:String,
		@Description("服务态度评分（非必须参数）") serviceStar:String? = null,
		@Description("商品属性（非必须参数）") skuAttribute:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.appSave_1MemberAppraise<T>(appraise,descriptionStar,feightStar,hideStatus,orderId,picList,productId,serviceStar,skuAttribute).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("上传评价图片")
	fun<T:BaseResult<Void>> uploadPicMemberAppraise(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.uploadPicMemberAppraise<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> uploadPicMemberAppraise(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.uploadPicMemberAppraise<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("未评价商品分页查询")
	fun<T:BaseResult<Void>> getMemberNotAppraisePageMemberAppraise(
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getMemberNotAppraisePageMemberAppraise<T>(currentPage,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getMemberNotAppraisePageMemberAppraise(
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getMemberNotAppraisePageMemberAppraise<T>(currentPage,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}