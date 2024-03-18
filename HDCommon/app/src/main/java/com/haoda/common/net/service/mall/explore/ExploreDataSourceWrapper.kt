package com.haoda.common.net.service.mall.explore

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface ExploreDataSourceWrapper {
	fun <T:BaseResult<Void>> appPublisherStarPageExplore(currentPage:String,pageSize:String?,publisherId:String):Flowable<T> {
		return ApiEngine.getService(ExploreService::class.java)
			.appPublisherStarPageExplore<T>(currentPage,pageSize,publisherId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getPublisherArticlePageExplore(currentPage:String,pageSize:String?,publisherId:String):Flowable<T> {
		return ApiEngine.getService(ExploreService::class.java)
			.getPublisherArticlePageExplore<T>(currentPage,pageSize,publisherId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getArticleCommentPageExplore(articleId:String,currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(ExploreService::class.java)
			.getArticleCommentPageExplore<T>(articleId,currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> articleDetailExplore(articleId:String):Flowable<T> {
		return ApiEngine.getService(ExploreService::class.java)
			.articleDetailExplore<T>(articleId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> publisherIndexExplore(publisherId:String):Flowable<T> {
		return ApiEngine.getService(ExploreService::class.java)
			.publisherIndexExplore<T>(publisherId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getArticlePageExplore(currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(ExploreService::class.java)
			.getArticlePageExplore<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}

}