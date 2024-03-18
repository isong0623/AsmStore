package com.haoda.common.net.service.console.commentReportList

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface CommentReportListService : BaseService{
	@Description("删除无效举报的记录")
	@FormUrlEncoded
	@POST(Constants.API.ONLY_DEL_REPORT_COMMENT_REPORT_LIST_Url)
	fun <T:BaseResult<Void>> onlyDelReportCommentReportList(
		@Field("commentReportId") @Description("举报ID") commentReportId:String
	):  Flowable<T>


	@Description("删除被举报的评论")
	@FormUrlEncoded
	@POST(Constants.API.DEL_COMMENT_COMMENT_REPORT_LIST_Url)
	fun <T:BaseResult<Void>> delCommentCommentReportList(
		@Field("commentId") @Description("评论ID") commentId:String,
		@Field("commentReportId") @Description("举报ID") commentReportId:String
	):  Flowable<T>


	@Description("分页查询举报内容")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_2_COMMENT_REPORT_LIST_Url)
	fun <T:BaseResult<Void>> page_2CommentReportList(
		@Field("pageNum") @Description("当前页") pageNum:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>

}