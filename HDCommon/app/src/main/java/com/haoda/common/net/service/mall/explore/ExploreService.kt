package com.haoda.common.net.service.mall.explore

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface ExploreService : BaseService{
	@Description("分页获取发布者点赞文章信息")
	@FormUrlEncoded
	@POST(Constants.API.APP_PUBLISHER_STAR_PAGE_EXPLORE_Url)
	fun <T:BaseResult<Void>> appPublisherStarPageExplore(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("publisherId") @Description("发布者ID") publisherId:String
	):  Flowable<T>


	@Description("分页获取发布者文章信息")
	@FormUrlEncoded
	@POST(Constants.API.GET_PUBLISHER_ARTICLE_PAGE_EXPLORE_Url)
	fun <T:BaseResult<Void>> getPublisherArticlePageExplore(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("publisherId") @Description("发布者ID") publisherId:String
	):  Flowable<T>


	@Description("分页获取文章评论信息")
	@FormUrlEncoded
	@POST(Constants.API.GET_ARTICLE_COMMENT_PAGE_EXPLORE_Url)
	fun <T:BaseResult<Void>> getArticleCommentPageExplore(
		@Field("articleId") @Description("文章ID") articleId:String,
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("文章详细信息")
	@FormUrlEncoded
	@POST(Constants.API.ARTICLE_DETAIL_EXPLORE_Url)
	fun <T:BaseResult<Void>> articleDetailExplore(
		@Field("articleId") @Description("articleId") articleId:String
	):  Flowable<T>


	@Description("发布者详细信息")
	@FormUrlEncoded
	@POST(Constants.API.PUBLISHER_INDEX_EXPLORE_Url)
	fun <T:BaseResult<Void>> publisherIndexExplore(
		@Field("publisherId") @Description("publisherId") publisherId:String
	):  Flowable<T>


	@Description("分页获取文章信息")
	@FormUrlEncoded
	@Headers("haodaAuthorization:\"\"")
	@POST(Constants.API.GET_ARTICLE_PAGE_EXPLORE_Url)
	fun <T:BaseResult<Void>> getArticlePageExplore(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>

}