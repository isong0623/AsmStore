package com.haoda.common.net.service.mall.memberExplore

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface MemberExploreService : BaseService{
	@Description("评论点赞")
	@FormUrlEncoded
	@POST(Constants.API.COMMENT_STAR_MEMBER_EXPLORE_Url)
	fun <T:BaseResult<Void>> commentStarMemberExplore(
		@Field("commentId") @Description("commentId") commentId:String
	):  Flowable<T>


	@Description("取消关注")
	@FormUrlEncoded
	@POST(Constants.API.CANCEL_FOLLOW_MEMBER_EXPLORE_Url)
	fun <T:BaseResult<Void>> cancelFollowMemberExplore(
		@Field("publisherId") @Description("publisherId") publisherId:String
	):  Flowable<T>


	@Description("点赞")
	@FormUrlEncoded
	@POST(Constants.API.STAR_MEMBER_EXPLORE_Url)
	fun <T:BaseResult<Void>> starMemberExplore(
		@Field("articleId") @Description("articleId") articleId:String
	):  Flowable<T>


	@Description("评论举报")
	@FormUrlEncoded
	@POST(Constants.API.COMMENT_REPORT_MEMBER_EXPLORE_Url)
	fun <T:BaseResult<Void>> commentReportMemberExplore(
		@Field("commentId") @Description("评论ID") commentId:String,
		@Field("firstLevelId") @Description("如果是二级评论，传一级评论ID（非必须参数）") firstLevelId:String?,
		@Field("reportId") @Description("举报类型ID") reportId:String
	):  Flowable<T>


	@Description("分页获取关注文章信息")
	@FormUrlEncoded
	@POST(Constants.API.GET_FOLLOWED_ARTICLE_PAGE_MEMBER_EXPLORE_Url)
	fun <T:BaseResult<Void>> getFollowedArticlePageMemberExplore(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("用户关注数量")
	@POST(Constants.API.MEMBERFOLLOW_COUNT_MEMBER_EXPLORE_Url)
	fun <T:BaseResult<Void>> memberfollowCountMemberExplore(

	):  Flowable<T>


	@Description("关注")
	@FormUrlEncoded
	@POST(Constants.API.FOLLOW_MEMBER_EXPLORE_Url)
	fun <T:BaseResult<Void>> followMemberExplore(
		@Field("publisherId") @Description("publisherId") publisherId:String
	):  Flowable<T>


	@Description("评论取消点赞")
	@FormUrlEncoded
	@POST(Constants.API.COMMENT_CANCEL_STAR_MEMBER_EXPLORE_Url)
	fun <T:BaseResult<Void>> commentCancelStarMemberExplore(
		@Field("commentId") @Description("commentId") commentId:String
	):  Flowable<T>


	@Description("分页获取发布者信息")
	@FormUrlEncoded
	@POST(Constants.API.FOLLOWED_PUBLISHER_PAGE_MEMBER_EXPLORE_Url)
	fun <T:BaseResult<Void>> followedPublisherPageMemberExplore(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("取消点赞")
	@FormUrlEncoded
	@POST(Constants.API.CANCEL_STAR_MEMBER_EXPLORE_Url)
	fun <T:BaseResult<Void>> cancelStarMemberExplore(
		@Field("articleId") @Description("articleId") articleId:String
	):  Flowable<T>


	@Description("发布文章评论")
	@FormUrlEncoded
	@POST(Constants.API.ARTICLE_COMMENT_MEMBER_EXPLORE_Url)
	fun <T:BaseResult<Void>> articleCommentMemberExplore(
		@Field("articleId") @Description("文章ID") articleId:String,
		@Field("content") @Description("评论内容") content:String,
		@Field("replyId") @Description("回复评论ID（非必须参数）") replyId:String?
	):  Flowable<T>

}