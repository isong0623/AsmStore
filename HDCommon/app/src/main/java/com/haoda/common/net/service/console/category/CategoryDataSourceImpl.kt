package com.haoda.common.net.service.console.category

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class CategoryDataSourceImpl : BaseDataSource() {

	var service = object : CategoryDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("详情")
	fun<T:BaseResult<Void>> detailCategory(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detailCategory<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detailCategory(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detailCategory<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("上传图片")
	fun<T:BaseResult<Void>> uploadPictureCategory(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.uploadPictureCategory<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> uploadPictureCategory(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.uploadPictureCategory<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("删除")
	fun<T:BaseResult<Void>> deleteCategory(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.deleteCategory<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> deleteCategory(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.deleteCategory<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("修改")
	fun<T:BaseResult<Void>> updateCategory(
		@Description("底部图片地址（非必须参数）") bottomPictureUrl:String? = null,
		@Description("描述（非必须参数）") description:String? = null,
		@Description("图标（非必须参数）") icon:String? = null,
		@Description("id") id:String,
		@Description("首页排序（非必须参数）") indexSort:String? = null,
		@Description("是否显示在首页：1->是；0->不是（非必须参数）") indexStatus:String? = null,
		@Description("关键字（非必须参数）") keywords:String? = null,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("导航栏排序（非必须参数）") navSort:String? = null,
		@Description("是否显示在导航栏：1->是；0->不是（非必须参数）") navStatus:String? = null,
		@Description("页面样式类型（1->红色2->黄色3->绿色）（非必须参数）") pageIconType:String? = null,
		@Description("上级分类的编号：0表示一级分类（非必须参数）") parentId:String? = null,
		@Description("商品分类图片（非必须参数）") pictureUrl:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.updateCategory<T>(bottomPictureUrl,description,icon,id,indexSort,indexStatus,keywords,name,navSort,navStatus,pageIconType,parentId,pictureUrl).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> updateCategory(
		@Description("底部图片地址（非必须参数）") bottomPictureUrl:String? = null,
		@Description("描述（非必须参数）") description:String? = null,
		@Description("图标（非必须参数）") icon:String? = null,
		@Description("id") id:String,
		@Description("首页排序（非必须参数）") indexSort:String? = null,
		@Description("是否显示在首页：1->是；0->不是（非必须参数）") indexStatus:String? = null,
		@Description("关键字（非必须参数）") keywords:String? = null,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("导航栏排序（非必须参数）") navSort:String? = null,
		@Description("是否显示在导航栏：1->是；0->不是（非必须参数）") navStatus:String? = null,
		@Description("页面样式类型（1->红色2->黄色3->绿色）（非必须参数）") pageIconType:String? = null,
		@Description("上级分类的编号：0表示一级分类（非必须参数）") parentId:String? = null,
		@Description("商品分类图片（非必须参数）") pictureUrl:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.updateCategory<T>(bottomPictureUrl,description,icon,id,indexSort,indexStatus,keywords,name,navSort,navStatus,pageIconType,parentId,pictureUrl).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分页查询")
	fun<T:BaseResult<Void>> pageCategory(
		@Description("当前页") currentPage:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.pageCategory<T>(currentPage,name,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> pageCategory(
		@Description("当前页") currentPage:String,
		@Description("名称（非必须参数）") name:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.pageCategory<T>(currentPage,name,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取带等级商品分类")
	fun<T:BaseResult<Void>> levelListCategory(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.levelListCategory<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> levelListCategory(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.levelListCategory<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("添加")
	fun<T:BaseResult<Void>> saveCategory(
		@Description("底部图片地址（非必须参数）") bottomPictureUrl:String? = null,
		@Description("描述（非必须参数）") description:String? = null,
		@Description("图标（非必须参数）") icon:String? = null,
		@Description("首页排序（非必须参数）") indexSort:String? = null,
		@Description("是否显示在首页：1->是；0->不是（非必须参数）") indexStatus:String? = null,
		@Description("关键字（非必须参数）") keywords:String? = null,
		@Description("名称") name:String,
		@Description("导航栏排序（非必须参数）") navSort:String? = null,
		@Description("是否显示在导航栏：1->是；0->不是（非必须参数）") navStatus:String? = null,
		@Description("页面样式类型（1->红色2->黄色3->绿色）（非必须参数）") pageIconType:String? = null,
		@Description("上级分类的编号：0表示一级分类") parentId:String,
		@Description("商品分类图片（非必须参数）") pictureUrl:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.saveCategory<T>(bottomPictureUrl,description,icon,indexSort,indexStatus,keywords,name,navSort,navStatus,pageIconType,parentId,pictureUrl).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> saveCategory(
		@Description("底部图片地址（非必须参数）") bottomPictureUrl:String? = null,
		@Description("描述（非必须参数）") description:String? = null,
		@Description("图标（非必须参数）") icon:String? = null,
		@Description("首页排序（非必须参数）") indexSort:String? = null,
		@Description("是否显示在首页：1->是；0->不是（非必须参数）") indexStatus:String? = null,
		@Description("关键字（非必须参数）") keywords:String? = null,
		@Description("名称") name:String,
		@Description("导航栏排序（非必须参数）") navSort:String? = null,
		@Description("是否显示在导航栏：1->是；0->不是（非必须参数）") navStatus:String? = null,
		@Description("页面样式类型（1->红色2->黄色3->绿色）（非必须参数）") pageIconType:String? = null,
		@Description("上级分类的编号：0表示一级分类") parentId:String,
		@Description("商品分类图片（非必须参数）") pictureUrl:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.saveCategory<T>(bottomPictureUrl,description,icon,indexSort,indexStatus,keywords,name,navSort,navStatus,pageIconType,parentId,pictureUrl).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取一级商品分类")
	fun<T:BaseResult<Void>> getFirstCategoryCategory(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getFirstCategoryCategory<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getFirstCategoryCategory(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getFirstCategoryCategory<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}