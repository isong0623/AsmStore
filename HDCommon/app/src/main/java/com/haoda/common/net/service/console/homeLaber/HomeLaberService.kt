package com.haoda.common.net.service.console.homeLaber

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface HomeLaberService : BaseService{
	@Description("停用")
	@FormUrlEncoded
	@POST(Constants.API.STOP_USE_4HOME_LABER_Url)
	fun <T:BaseResult<Void>> stopUse_4HomeLaber(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("启用")
	@FormUrlEncoded
	@POST(Constants.API.START_USE_4HOME_LABER_Url)
	fun <T:BaseResult<Void>> startUse_4HomeLaber(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("上传图片")
	@POST(Constants.API.UPLOAD_HTML5_2HOME_LABER_Url)
	fun <T:BaseResult<Void>> uploadHtml5_2HomeLaber(

	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_10_HOME_LABER_Url)
	fun <T:BaseResult<Void>> page_10HomeLaber(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_8_HOME_LABER_Url)
	fun <T:BaseResult<Void>> delete_8HomeLaber(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("上传图片")
	@POST(Constants.API.UPLOAD_PICTURE_5HOME_LABER_Url)
	fun <T:BaseResult<Void>> uploadPicture_5HomeLaber(

	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_9_HOME_LABER_Url)
	fun <T:BaseResult<Void>> save_9HomeLaber(
		@Field("categoryId") @Description("商品分类ID（非必须参数）") categoryId:String?,
		@Field("channelType") @Description("渠道类型：1->app") channelType:String,
		@Field("discription") @Description("描述（非必须参数）") discription:String?,
		@Field("endTime") @Description("结束时间") endTime:String,
		@Field("icon") @Description("图标地址") icon:String,
		@Field("jumpType") @Description("跳转类型：0->不跳1->H5页面2->商品详情3->商品分类4->会员中心") jumpType:String,
		@Field("name") @Description("名称") name:String,
		@Field("pageUrl") @Description("链接地址（非必须参数）") pageUrl:String?,
		@Field("productId") @Description("商品ID（非必须参数）") productId:String?,
		@Field("sort") @Description("排序") sort:String,
		@Field("startTime") @Description("开始时间") startTime:String,
		@Field("status") @Description("上下线状态：0->下线；1->上线") status:String
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_9_HOME_LABER_Url)
	fun <T:BaseResult<Void>> detail_9HomeLaber(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_9_HOME_LABER_Url)
	fun <T:BaseResult<Void>> update_9HomeLaber(
		@Field("categoryId") @Description("商品分类ID（非必须参数）") categoryId:String?,
		@Field("channelType") @Description("渠道类型：1->app（非必须参数）") channelType:String?,
		@Field("discription") @Description("描述（非必须参数）") discription:String?,
		@Field("endTime") @Description("结束时间（非必须参数）") endTime:String?,
		@Field("icon") @Description("图标地址（非必须参数）") icon:String?,
		@Field("id") @Description("id") id:String,
		@Field("jumpType") @Description("跳转类型：0->不跳1->H5页面2->商品详情3->商品分类4->会员中心（非必须参数）") jumpType:String?,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageUrl") @Description("链接地址（非必须参数）") pageUrl:String?,
		@Field("productId") @Description("商品ID（非必须参数）") productId:String?,
		@Field("sort") @Description("排序（非必须参数）") sort:String?,
		@Field("startTime") @Description("开始时间（非必须参数）") startTime:String?,
		@Field("status") @Description("上下线状态：0->下线；1->上线（非必须参数）") status:String?
	):  Flowable<T>

}