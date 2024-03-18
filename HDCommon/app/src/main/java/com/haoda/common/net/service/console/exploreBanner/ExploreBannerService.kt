package com.haoda.common.net.service.console.exploreBanner

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface ExploreBannerService : BaseService{
	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_4_EXPLORE_BANNER_Url)
	fun <T:BaseResult<Void>> delete_4ExploreBanner(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_4_EXPLORE_BANNER_Url)
	fun <T:BaseResult<Void>> save_4ExploreBanner(
		@Field("articleId") @Description("文章ID（非必须参数）") articleId:String?,
		@Field("channelType") @Description("渠道类型：1->app推荐轮播") channelType:String,
		@Field("discription") @Description("描述（非必须参数）") discription:String?,
		@Field("endTime") @Description("结束时间") endTime:String,
		@Field("jumpType") @Description("跳转类型：0->不跳转1->H5页面2->文章详情") jumpType:String,
		@Field("name") @Description("名称") name:String,
		@Field("pageUrl") @Description("链接地址（非必须参数）") pageUrl:String?,
		@Field("pic") @Description("图片地址") pic:String,
		@Field("sort") @Description("排序") sort:String,
		@Field("startTime") @Description("开始时间") startTime:String,
		@Field("status") @Description("上下线状态：0->下线；1->上线") status:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_5_EXPLORE_BANNER_Url)
	fun <T:BaseResult<Void>> page_5ExploreBanner(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("停用")
	@FormUrlEncoded
	@POST(Constants.API.STOP_USE_1EXPLORE_BANNER_Url)
	fun <T:BaseResult<Void>> stopUse_1ExploreBanner(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("上传图片")
	@POST(Constants.API.UPLOAD_PICTURE_2EXPLORE_BANNER_Url)
	fun <T:BaseResult<Void>> uploadPicture_2ExploreBanner(

	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_4_EXPLORE_BANNER_Url)
	fun <T:BaseResult<Void>> update_4ExploreBanner(
		@Field("articleId") @Description("文章ID（非必须参数）") articleId:String?,
		@Field("channelType") @Description("渠道类型：1->app推荐轮播（非必须参数）") channelType:String?,
		@Field("discription") @Description("描述（非必须参数）") discription:String?,
		@Field("endTime") @Description("结束时间（非必须参数）") endTime:String?,
		@Field("id") @Description("id") id:String,
		@Field("jumpType") @Description("跳转类型：0->不跳转1->H5页面2->文章详情（非必须参数）") jumpType:String?,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageUrl") @Description("链接地址（非必须参数）") pageUrl:String?,
		@Field("pic") @Description("图片地址（非必须参数）") pic:String?,
		@Field("sort") @Description("排序（非必须参数）") sort:String?,
		@Field("startTime") @Description("开始时间（非必须参数）") startTime:String?,
		@Field("status") @Description("上下线状态：0->下线；1->上线（非必须参数）") status:String?
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_4_EXPLORE_BANNER_Url)
	fun <T:BaseResult<Void>> detail_4ExploreBanner(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("启用")
	@FormUrlEncoded
	@POST(Constants.API.START_USE_1EXPLORE_BANNER_Url)
	fun <T:BaseResult<Void>> startUse_1ExploreBanner(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("上传图片")
	@POST(Constants.API.UPLOAD_HTML5_EXPLORE_BANNER_Url)
	fun <T:BaseResult<Void>> uploadHtml5ExploreBanner(

	):  Flowable<T>

}