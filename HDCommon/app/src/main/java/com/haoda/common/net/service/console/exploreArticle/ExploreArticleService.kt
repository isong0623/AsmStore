package com.haoda.common.net.service.console.exploreArticle

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface ExploreArticleService : BaseService{
	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_3_EXPLORE_ARTICLE_Url)
	fun <T:BaseResult<Void>> save_3ExploreArticle(
		@Field("content") @Description("内容") content:String,
		@Field("pics") @Description("图片地址数组实例：\"图片地址1\",\"图片地址2\"（非必须参数）") pics:String?,
		@Field("publisherId") @Description("发布者ID") publisherId:String,
		@Field("summary") @Description("概要") summary:String,
		@Field("title") @Description("标题") title:String
	):  Flowable<T>


	@Description("获取以选择商品id列表")
	@FormUrlEncoded
	@POST(Constants.API.GET_SELECTED_PRODECT_IDSEXPLORE_ARTICLE_Url)
	fun <T:BaseResult<Void>> getSelectedProdectIdsExploreArticle(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("评论删除")
	@FormUrlEncoded
	@POST(Constants.API.ARTICLE_COMMENT_DELETE_EXPLORE_ARTICLE_Url)
	fun <T:BaseResult<Void>> articleCommentDeleteExploreArticle(
		@Field("commentId") @Description("commentId") commentId:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_4_EXPLORE_ARTICLE_Url)
	fun <T:BaseResult<Void>> page_4ExploreArticle(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("title") @Description("标题（非必须参数）") title:String?
	):  Flowable<T>


	@Description("取消发布")
	@FormUrlEncoded
	@POST(Constants.API.UNPUBLISH_EXPLORE_ARTICLE_Url)
	fun <T:BaseResult<Void>> unpublishExploreArticle(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("分页获取文章评论信息")
	@FormUrlEncoded
	@POST(Constants.API.GET_ARTICLE_COMMENT_PAGE_EXPLORE_ARTICLE_Url)
	fun <T:BaseResult<Void>> getArticleCommentPageExploreArticle(
		@Field("articleId") @Description("文章ID") articleId:String,
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("发布")
	@FormUrlEncoded
	@POST(Constants.API.PUBLISH_EXPLORE_ARTICLE_Url)
	fun <T:BaseResult<Void>> publishExploreArticle(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_3_EXPLORE_ARTICLE_Url)
	fun <T:BaseResult<Void>> detail_3ExploreArticle(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("设置商品")
	@FormUrlEncoded
	@POST(Constants.API.SET_PRODUCTS_EXPLORE_ARTICLE_Url)
	fun <T:BaseResult<Void>> setProductsExploreArticle(
		@Field("id") @Description("ID") id:String,
		@Field("productIds") @Description("商品ID数组") productIds:String
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_3_EXPLORE_ARTICLE_Url)
	fun <T:BaseResult<Void>> update_3ExploreArticle(
		@Field("content") @Description("内容（非必须参数）") content:String?,
		@Field("id") @Description("id") id:String,
		@Field("pics") @Description("图片地址数组实例：\"图片地址1\",\"图片地址2\"（非必须参数）") pics:String?,
		@Field("publisherId") @Description("发布者ID（非必须参数）") publisherId:String?,
		@Field("summary") @Description("概要（非必须参数）") summary:String?,
		@Field("title") @Description("标题（非必须参数）") title:String?
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_3_EXPLORE_ARTICLE_Url)
	fun <T:BaseResult<Void>> delete_3ExploreArticle(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("上传图片")
	@POST(Constants.API.UPLOAD_PICTURE_1EXPLORE_ARTICLE_Url)
	fun <T:BaseResult<Void>> uploadPicture_1ExploreArticle(

	):  Flowable<T>

}