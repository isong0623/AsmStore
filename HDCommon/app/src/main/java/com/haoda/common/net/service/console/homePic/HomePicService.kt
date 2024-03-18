package com.haoda.common.net.service.console.homePic

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface HomePicService : BaseService{
	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_10_HOME_PIC_Url)
	fun <T:BaseResult<Void>> save_10HomePic(
		@Field("channelType") @Description("渠道类型：1->app首页广告") channelType:String,
		@Field("discription") @Description("描述（非必须参数）") discription:String?,
		@Field("endTime") @Description("结束时间") endTime:String,
		@Field("jumpType") @Description("跳转类型：0->不跳转1->H5页面2->商品详情") jumpType:String,
		@Field("name") @Description("名称") name:String,
		@Field("pageUrl") @Description("链接地址（非必须参数）") pageUrl:String?,
		@Field("pic") @Description("图片地址") pic:String,
		@Field("productId") @Description("商品ID（非必须参数）") productId:String?,
		@Field("sort") @Description("排序") sort:String,
		@Field("startTime") @Description("开始时间") startTime:String,
		@Field("status") @Description("上下线状态：0->下线；1->上线") status:String
	):  Flowable<T>


	@Description("上传图片")
	@POST(Constants.API.UPLOAD_HTML5_3HOME_PIC_Url)
	fun <T:BaseResult<Void>> uploadHtml5_3HomePic(

	):  Flowable<T>


	@Description("启用")
	@FormUrlEncoded
	@POST(Constants.API.START_USE_5HOME_PIC_Url)
	fun <T:BaseResult<Void>> startUse_5HomePic(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_10_HOME_PIC_Url)
	fun <T:BaseResult<Void>> update_10HomePic(
		@Field("channelType") @Description("渠道类型：1->app首页广告（非必须参数）") channelType:String?,
		@Field("discription") @Description("描述（非必须参数）") discription:String?,
		@Field("endTime") @Description("结束时间（非必须参数）") endTime:String?,
		@Field("id") @Description("id") id:String,
		@Field("jumpType") @Description("跳转类型：0->不跳转1->H5页面2->商品详情（非必须参数）") jumpType:String?,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageUrl") @Description("链接地址（非必须参数）") pageUrl:String?,
		@Field("pic") @Description("图片地址（非必须参数）") pic:String?,
		@Field("productId") @Description("商品ID（非必须参数）") productId:String?,
		@Field("sort") @Description("排序（非必须参数）") sort:String?,
		@Field("startTime") @Description("开始时间（非必须参数）") startTime:String?,
		@Field("status") @Description("上下线状态：0->下线；1->上线（非必须参数）") status:String?
	):  Flowable<T>


	@Description("上传图片")
	@POST(Constants.API.UPLOAD_PICTURE_6HOME_PIC_Url)
	fun <T:BaseResult<Void>> uploadPicture_6HomePic(

	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_9_HOME_PIC_Url)
	fun <T:BaseResult<Void>> delete_9HomePic(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("停用")
	@FormUrlEncoded
	@POST(Constants.API.STOP_USE_5HOME_PIC_Url)
	fun <T:BaseResult<Void>> stopUse_5HomePic(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_10_HOME_PIC_Url)
	fun <T:BaseResult<Void>> detail_10HomePic(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_11_HOME_PIC_Url)
	fun <T:BaseResult<Void>> page_11HomePic(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>

}