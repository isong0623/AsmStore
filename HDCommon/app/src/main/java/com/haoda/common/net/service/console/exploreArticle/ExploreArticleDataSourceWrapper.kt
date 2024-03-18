package com.haoda.common.net.service.console.exploreArticle

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface ExploreArticleDataSourceWrapper {
	fun <T:BaseResult<Void>> save_3ExploreArticle(content:String,pics:String?,publisherId:String,summary:String,title:String):Flowable<T> {
		return ApiEngine.getService(ExploreArticleService::class.java)
			.save_3ExploreArticle<T>(content,pics,publisherId,summary,title)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getSelectedProdectIdsExploreArticle(id:String):Flowable<T> {
		return ApiEngine.getService(ExploreArticleService::class.java)
			.getSelectedProdectIdsExploreArticle<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> articleCommentDeleteExploreArticle(commentId:String):Flowable<T> {
		return ApiEngine.getService(ExploreArticleService::class.java)
			.articleCommentDeleteExploreArticle<T>(commentId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_4ExploreArticle(currentPage:String,pageSize:String?,title:String?):Flowable<T> {
		return ApiEngine.getService(ExploreArticleService::class.java)
			.page_4ExploreArticle<T>(currentPage,pageSize,title)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> unpublishExploreArticle(id:String):Flowable<T> {
		return ApiEngine.getService(ExploreArticleService::class.java)
			.unpublishExploreArticle<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getArticleCommentPageExploreArticle(articleId:String,currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(ExploreArticleService::class.java)
			.getArticleCommentPageExploreArticle<T>(articleId,currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> publishExploreArticle(id:String):Flowable<T> {
		return ApiEngine.getService(ExploreArticleService::class.java)
			.publishExploreArticle<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_3ExploreArticle(id:String):Flowable<T> {
		return ApiEngine.getService(ExploreArticleService::class.java)
			.detail_3ExploreArticle<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> setProductsExploreArticle(id:String,productIds:String):Flowable<T> {
		return ApiEngine.getService(ExploreArticleService::class.java)
			.setProductsExploreArticle<T>(id,productIds)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_3ExploreArticle(content:String?,id:String,pics:String?,publisherId:String?,summary:String?,title:String?):Flowable<T> {
		return ApiEngine.getService(ExploreArticleService::class.java)
			.update_3ExploreArticle<T>(content,id,pics,publisherId,summary,title)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_3ExploreArticle(id:String):Flowable<T> {
		return ApiEngine.getService(ExploreArticleService::class.java)
			.delete_3ExploreArticle<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadPicture_1ExploreArticle():Flowable<T> {
		return ApiEngine.getService(ExploreArticleService::class.java)
			.uploadPicture_1ExploreArticle<T>()
			.compose(RxSchedulers.io_main())
	}

}