package com.haoda.common.net.service.exploreconsole.article

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface ArticleService : BaseService{
	@Description("发布")
	@FormUrlEncoded
	@POST(Constants.API.PUBLISH_ARTICLE_Url)
	fun <T:BaseResult<Void>> publishArticle(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_ARTICLE_Url)
	fun <T:BaseResult<Void>> pageArticle(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("searchEndTime") @Description("发布结束时间（非必须参数）") searchEndTime:String?,
		@Field("searchStartTime") @Description("发布开始时间（非必须参数）") searchStartTime:String?,
		@Field("status") @Description("状态（0->未发布1->发布）（非必须参数）") status:String?,
		@Field("title") @Description("标题（非必须参数）") title:String?
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.CONSOLE_UPDATE_ARTICLE_Url)
	fun <T:BaseResult<Void>> consoleUpdateArticle(
		@Field("articleProductAndPics") @Description("图片地址和商品ID实例：[{\"productId\":9,\"picUrl\":\"aaa.jpg\"}]") articleProductAndPics:String,
		@Field("content") @Description("内容") content:String,
		@Field("id") @Description("文章ID") id:String,
		@Field("pic") @Description("内容主图") pic:String,
		@Field("status") @Description("状态（0->未发布1->发布）") status:String,
		@Field("title") @Description("标题") title:String
	):  Flowable<T>


	@Description("评论删除")
	@FormUrlEncoded
	@POST(Constants.API.ARTICLE_COMMENT_DELETE_ARTICLE_Url)
	fun <T:BaseResult<Void>> articleCommentDeleteArticle(
		@Field("commentId") @Description("commentId") commentId:String
	):  Flowable<T>


	@Description("获取商品列表")
	@FormUrlEncoded
	@POST(Constants.API.GET_PORDUCTS_ARTICLE_Url)
	fun <T:BaseResult<Void>> getPorductsArticle(
		@Field("productName") @Description("商品名称") productName:String
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.CONSOLE_DELETE_ARTICLE_Url)
	fun <T:BaseResult<Void>> consoleDeleteArticle(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("文章详细信息")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_ARTICLE_Url)
	fun <T:BaseResult<Void>> detailArticle(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.CONSOLE_SAVE_ARTICLE_Url)
	fun <T:BaseResult<Void>> consoleSaveArticle(
		@Field("articleProductAndPics") @Description("图片地址和商品ID实例：[{\"productId\":9,\"picUrl\":\"aaa.jpg\"}]") articleProductAndPics:String,
		@Field("content") @Description("内容") content:String,
		@Field("pic") @Description("内容主图") pic:String,
		@Field("status") @Description("状态（0->未发布1->发布）") status:String,
		@Field("title") @Description("标题") title:String
	):  Flowable<T>


	@Description("取消发布")
	@FormUrlEncoded
	@POST(Constants.API.UNPUBLISH_ARTICLE_Url)
	fun <T:BaseResult<Void>> unpublishArticle(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("分页获取文章评论信息")
	@FormUrlEncoded
	@POST(Constants.API.GET_ARTICLE_COMMENT_PAGE_ARTICLE_Url)
	fun <T:BaseResult<Void>> getArticleCommentPageArticle(
		@Field("articleId") @Description("文章ID") articleId:String,
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("上传图片")
	@POST(Constants.API.UPLOAD_PICTURE_ARTICLE_Url)
	fun <T:BaseResult<Void>> uploadPictureArticle(

	):  Flowable<T>

}