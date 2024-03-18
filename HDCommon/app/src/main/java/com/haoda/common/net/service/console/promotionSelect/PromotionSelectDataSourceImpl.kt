package com.haoda.common.net.service.console.promotionSelect

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class PromotionSelectDataSourceImpl : BaseDataSource() {

	var service = object : PromotionSelectDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("修改")
	fun<T:BaseResult<Void>> update_20PromotionSelect(
		@Description("折扣（非必须参数）") discount:String? = null,
		@Description("描述（非必须参数）") discription:String? = null,
		@Description("id") id:String,
		@Description("每人限购数量（非必须参数）") perLimit:String? = null,
		@Description("日期（非必须参数）") promotionDate:String? = null,
		@Description("卖出数量（非必须参数）") saleMax:String? = null,
		@Description("开始时间（非必须参数）") startTime:String? = null,
		@Description("状态（0->停用1->正常）（非必须参数）") status:String? = null,
		@Description("标题（非必须参数）") title:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.update_20PromotionSelect<T>(discount,discription,id,perLimit,promotionDate,saleMax,startTime,status,title).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> update_20PromotionSelect(
		@Description("折扣（非必须参数）") discount:String? = null,
		@Description("描述（非必须参数）") discription:String? = null,
		@Description("id") id:String,
		@Description("每人限购数量（非必须参数）") perLimit:String? = null,
		@Description("日期（非必须参数）") promotionDate:String? = null,
		@Description("卖出数量（非必须参数）") saleMax:String? = null,
		@Description("开始时间（非必须参数）") startTime:String? = null,
		@Description("状态（0->停用1->正常）（非必须参数）") status:String? = null,
		@Description("标题（非必须参数）") title:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.update_20PromotionSelect<T>(discount,discription,id,perLimit,promotionDate,saleMax,startTime,status,title).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取以选择商品id列表")
	fun<T:BaseResult<Void>> getSelectedProdectIds_3PromotionSelect(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getSelectedProdectIds_3PromotionSelect<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getSelectedProdectIds_3PromotionSelect(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getSelectedProdectIds_3PromotionSelect<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("详情")
	fun<T:BaseResult<Void>> detail_24PromotionSelect(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detail_24PromotionSelect<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detail_24PromotionSelect(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detail_24PromotionSelect<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("添加")
	fun<T:BaseResult<Void>> save_20PromotionSelect(
		@Description("折扣") discount:String,
		@Description("描述（非必须参数）") discription:String? = null,
		@Description("每人限购数量") perLimit:String,
		@Description("日期") promotionDate:String,
		@Description("卖出数量") saleMax:String,
		@Description("开始时间") startTime:String,
		@Description("状态（0->停用1->正常）") status:String,
		@Description("标题") title:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.save_20PromotionSelect<T>(discount,discription,perLimit,promotionDate,saleMax,startTime,status,title).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> save_20PromotionSelect(
		@Description("折扣") discount:String,
		@Description("描述（非必须参数）") discription:String? = null,
		@Description("每人限购数量") perLimit:String,
		@Description("日期") promotionDate:String,
		@Description("卖出数量") saleMax:String,
		@Description("开始时间") startTime:String,
		@Description("状态（0->停用1->正常）") status:String,
		@Description("标题") title:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.save_20PromotionSelect<T>(discount,discription,perLimit,promotionDate,saleMax,startTime,status,title).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分页查询")
	fun<T:BaseResult<Void>> page_26PromotionSelect(
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("标题（非必须参数）") title:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.page_26PromotionSelect<T>(currentPage,pageSize,title).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> page_26PromotionSelect(
		@Description("当前页") currentPage:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("标题（非必须参数）") title:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.page_26PromotionSelect<T>(currentPage,pageSize,title).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("删除")
	fun<T:BaseResult<Void>> delete_18PromotionSelect(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.delete_18PromotionSelect<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> delete_18PromotionSelect(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.delete_18PromotionSelect<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("设置商品")
	fun<T:BaseResult<Void>> setProducts_3PromotionSelect(
		@Description("ID") id:String,
		@Description("skuCode数组") skuCodes:String,
		@Description("productIds") productIds:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.setProducts_3PromotionSelect<T>(id,skuCodes,productIds).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> setProducts_3PromotionSelect(
		@Description("ID") id:String,
		@Description("skuCode数组") skuCodes:String,
		@Description("productIds") productIds:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.setProducts_3PromotionSelect<T>(id,skuCodes,productIds).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}