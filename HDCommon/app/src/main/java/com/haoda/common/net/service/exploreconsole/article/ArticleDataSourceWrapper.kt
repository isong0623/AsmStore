package com.haoda.common.net.service.exploreconsole.article

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface ArticleDataSourceWrapper {
	fun <T:BaseResult<Void>> publishArticle(id:String):Flowable<T> {
		return ApiEngine.getService(ArticleService::class.java)
			.publishArticle<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> pageArticle(currentPage:String,pageSize:String?,searchEndTime:String?,searchStartTime:String?,status:String?,title:String?):Flowable<T> {
		return ApiEngine.getService(ArticleService::class.java)
			.pageArticle<T>(currentPage,pageSize,searchEndTime,searchStartTime,status,title)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> consoleUpdateArticle(articleProductAndPics:String,content:String,id:String,pic:String,status:String,title:String):Flowable<T> {
		return ApiEngine.getService(ArticleService::class.java)
			.consoleUpdateArticle<T>(articleProductAndPics,content,id,pic,status,title)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> articleCommentDeleteArticle(commentId:String):Flowable<T> {
		return ApiEngine.getService(ArticleService::class.java)
			.articleCommentDeleteArticle<T>(commentId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getPorductsArticle(productName:String):Flowable<T> {
		return ApiEngine.getService(ArticleService::class.java)
			.getPorductsArticle<T>(productName)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> consoleDeleteArticle(id:String):Flowable<T> {
		return ApiEngine.getService(ArticleService::class.java)
			.consoleDeleteArticle<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detailArticle(id:String):Flowable<T> {
		return ApiEngine.getService(ArticleService::class.java)
			.detailArticle<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> consoleSaveArticle(articleProductAndPics:String,content:String,pic:String,status:String,title:String):Flowable<T> {
		return ApiEngine.getService(ArticleService::class.java)
			.consoleSaveArticle<T>(articleProductAndPics,content,pic,status,title)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> unpublishArticle(id:String):Flowable<T> {
		return ApiEngine.getService(ArticleService::class.java)
			.unpublishArticle<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getArticleCommentPageArticle(articleId:String,currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(ArticleService::class.java)
			.getArticleCommentPageArticle<T>(articleId,currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadPictureArticle():Flowable<T> {
		return ApiEngine.getService(ArticleService::class.java)
			.uploadPictureArticle<T>()
			.compose(RxSchedulers.io_main())
	}

}