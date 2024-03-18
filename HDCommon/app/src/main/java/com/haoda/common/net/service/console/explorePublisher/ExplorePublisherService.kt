package com.haoda.common.net.service.console.explorePublisher

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface ExplorePublisherService : BaseService{
	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_5_EXPLORE_PUBLISHER_Url)
	fun <T:BaseResult<Void>> save_5ExplorePublisher(
		@Field("memberId") @Description("用户ID") memberId:String
	):  Flowable<T>


	@Description("上传图片")
	@POST(Constants.API.UPLOAD_PICTURE_3EXPLORE_PUBLISHER_Url)
	fun <T:BaseResult<Void>> uploadPicture_3ExplorePublisher(

	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_5_EXPLORE_PUBLISHER_Url)
	fun <T:BaseResult<Void>> update_5ExplorePublisher(
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("icon") @Description("头像（非必须参数）") icon:String?,
		@Field("id") @Description("id") id:String,
		@Field("nickname") @Description("昵称（非必须参数）") nickname:String?,
		@Field("personSign") @Description("签名（非必须参数）") personSign:String?,
		@Field("status") @Description("状态:0->禁用；1->启用（非必须参数）") status:String?
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_6_EXPLORE_PUBLISHER_Url)
	fun <T:BaseResult<Void>> page_6ExplorePublisher(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("nickname") @Description("昵称（非必须参数）") nickname:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_5_EXPLORE_PUBLISHER_Url)
	fun <T:BaseResult<Void>> detail_5ExplorePublisher(
		@Field("id") @Description("id") id:String
	):  Flowable<T>

}