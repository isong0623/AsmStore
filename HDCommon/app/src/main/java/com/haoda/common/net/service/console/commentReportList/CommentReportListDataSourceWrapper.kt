package com.haoda.common.net.service.console.commentReportList

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface CommentReportListDataSourceWrapper {
	fun <T:BaseResult<Void>> onlyDelReportCommentReportList(commentReportId:String):Flowable<T> {
		return ApiEngine.getService(CommentReportListService::class.java)
			.onlyDelReportCommentReportList<T>(commentReportId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delCommentCommentReportList(commentId:String,commentReportId:String):Flowable<T> {
		return ApiEngine.getService(CommentReportListService::class.java)
			.delCommentCommentReportList<T>(commentId,commentReportId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_2CommentReportList(pageNum:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(CommentReportListService::class.java)
			.page_2CommentReportList<T>(pageNum,pageSize)
			.compose(RxSchedulers.io_main())
	}

}