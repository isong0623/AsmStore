package com.haoda.common.net.service.mall.memberExplore

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface MemberExploreDataSourceWrapper {
	fun <T:BaseResult<Void>> commentStarMemberExplore(commentId:String):Flowable<T> {
		return ApiEngine.getService(MemberExploreService::class.java)
			.commentStarMemberExplore<T>(commentId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> cancelFollowMemberExplore(publisherId:String):Flowable<T> {
		return ApiEngine.getService(MemberExploreService::class.java)
			.cancelFollowMemberExplore<T>(publisherId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> starMemberExplore(articleId:String):Flowable<T> {
		return ApiEngine.getService(MemberExploreService::class.java)
			.starMemberExplore<T>(articleId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> commentReportMemberExplore(commentId:String,firstLevelId:String?,reportId:String):Flowable<T> {
		return ApiEngine.getService(MemberExploreService::class.java)
			.commentReportMemberExplore<T>(commentId,firstLevelId,reportId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getFollowedArticlePageMemberExplore(currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(MemberExploreService::class.java)
			.getFollowedArticlePageMemberExplore<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> memberfollowCountMemberExplore():Flowable<T> {
		return ApiEngine.getService(MemberExploreService::class.java)
			.memberfollowCountMemberExplore<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> followMemberExplore(publisherId:String):Flowable<T> {
		return ApiEngine.getService(MemberExploreService::class.java)
			.followMemberExplore<T>(publisherId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> commentCancelStarMemberExplore(commentId:String):Flowable<T> {
		return ApiEngine.getService(MemberExploreService::class.java)
			.commentCancelStarMemberExplore<T>(commentId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> followedPublisherPageMemberExplore(currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(MemberExploreService::class.java)
			.followedPublisherPageMemberExplore<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> cancelStarMemberExplore(articleId:String):Flowable<T> {
		return ApiEngine.getService(MemberExploreService::class.java)
			.cancelStarMemberExplore<T>(articleId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> articleCommentMemberExplore(articleId:String,content:String,replyId:String?):Flowable<T> {
		return ApiEngine.getService(MemberExploreService::class.java)
			.articleCommentMemberExplore<T>(articleId,content,replyId)
			.compose(RxSchedulers.io_main())
	}

}