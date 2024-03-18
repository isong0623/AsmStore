package com.haoda.common.net.service.console.homePic

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class HomePicDataSourceImpl : BaseDataSource() {

	var service = object : HomePicDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("添加")
	fun<T:BaseResult<Void>> save_10HomePic(
		@Description("渠道类型：1->app首页广告") channelType:String,
		@Description("描述（非必须参数）") discription:String? = null,
		@Description("结束时间") endTime:String,
		@Description("跳转类型：0->不跳转1->H5页面2->商品详情") jumpType:String,
		@Description("名称") name:String,
		@Description("链接地址（非必须参数）") pageUrl:String? = null,
		@Description("图片地址") pic:String,
		@Description("商品ID（非必须参数）") productId:String? = null,
		@Description("排序") sort:String,
		@Description("开始时间") startTime:String,
		@Description("上下线状态：0->下线；1->上线") status:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.save_10HomePic<T>(channelType,discription,endTime,jumpType,name,pageUrl,pic,productId,sort,startTime,status).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> save_10HomePic(
		@Description("渠道类型：1->app首页广告") channelType:String,
		@Description("描述（非必须参数）") discription:String? = null,
		@Description("结束时间") endTime:String,
		@Description("跳转类型：0->不跳转1->H5页面2->商品详情") jumpType:String,
		@Description("名称") name:String,
		@Description("链接地址（非必须参数）") pageUrl:String? = null,
		@Description("图片地址") pic:String,
		@Description("商品ID（非必须参数）") productId:String? = null,
		@Description("排序") sort:String,
		@Description("开始时间") startTime:String,
		@Description("上下线状态：0->下线；1->上线") status:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.save_10HomePic<T>(channelType,discription,endTime,jumpType,name,pageUrl,pic,productId,sort,startTime,status).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("上传图片")
	fun<T:BaseResult<Void>> uploadHtml5_3HomePic(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.uploadHtml5_3HomePic<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> uploadHtml5_3HomePic(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.uploadHtml5_3HomePic<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("启用")
	fun<T:BaseResult<Void>> startUse_5HomePic(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.startUse_5HomePic<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> startUse_5HomePic(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.startUse_5HomePic<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("修改")
	fun<T:BaseResult<Void>> update_10HomePic(
		@Description("渠道类型：1->app首页广告（非必须参数）") channelType:String? = null,
		@Description("描述（非必须参数）") discription:String? = null,
		@Description("结束时间（非必须参数）") endTime:String? = null,
		@Description("id") id:String,
		@Description("跳转类型：0->不跳转1->H5页面2->商品详情（非必须参数）") jumpType:String? = null,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("链接地址（非必须参数）") pageUrl:String? = null,
		@Description("图片地址（非必须参数）") pic:String? = null,
		@Description("商品ID（非必须参数）") productId:String? = null,
		@Description("排序（非必须参数）") sort:String? = null,
		@Description("开始时间（非必须参数）") startTime:String? = null,
		@Description("上下线状态：0->下线；1->上线（非必须参数）") status:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.update_10HomePic<T>(channelType,discription,endTime,id,jumpType,name,pageUrl,pic,productId,sort,startTime,status).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> update_10HomePic(
		@Description("渠道类型：1->app首页广告（非必须参数）") channelType:String? = null,
		@Description("描述（非必须参数）") discription:String? = null,
		@Description("结束时间（非必须参数）") endTime:String? = null,
		@Description("id") id:String,
		@Description("跳转类型：0->不跳转1->H5页面2->商品详情（非必须参数）") jumpType:String? = null,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("链接地址（非必须参数）") pageUrl:String? = null,
		@Description("图片地址（非必须参数）") pic:String? = null,
		@Description("商品ID（非必须参数）") productId:String? = null,
		@Description("排序（非必须参数）") sort:String? = null,
		@Description("开始时间（非必须参数）") startTime:String? = null,
		@Description("上下线状态：0->下线；1->上线（非必须参数）") status:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.update_10HomePic<T>(channelType,discription,endTime,id,jumpType,name,pageUrl,pic,productId,sort,startTime,status).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("上传图片")
	fun<T:BaseResult<Void>> uploadPicture_6HomePic(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.uploadPicture_6HomePic<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> uploadPicture_6HomePic(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.uploadPicture_6HomePic<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("删除")
	fun<T:BaseResult<Void>> delete_9HomePic(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.delete_9HomePic<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> delete_9HomePic(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.delete_9HomePic<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("停用")
	fun<T:BaseResult<Void>> stopUse_5HomePic(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.stopUse_5HomePic<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> stopUse_5HomePic(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.stopUse_5HomePic<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("详情")
	fun<T:BaseResult<Void>> detail_10HomePic(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detail_10HomePic<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detail_10HomePic(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detail_10HomePic<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分页查询")
	fun<T:BaseResult<Void>> page_11HomePic(
		@Description("当前页") currentPage:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.page_11HomePic<T>(currentPage,name,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> page_11HomePic(
		@Description("当前页") currentPage:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.page_11HomePic<T>(currentPage,name,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}