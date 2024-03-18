package com.haoda.common.net.service.console.member

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface MemberService : BaseService{
	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_12_MEMBER_Url)
	fun <T:BaseResult<Void>> page_12Member(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("mobile") @Description("手机号码（非必须参数）") mobile:String?,
		@Field("nickname") @Description("用户昵称（非必须参数）") nickname:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("publisherStatus") @Description("发布者状态（0->不是1->是）（非必须参数）") publisherStatus:String?
	):  Flowable<T>


	@Description("启用发布文章")
	@FormUrlEncoded
	@POST(Constants.API.START_PUBLISHER_MEMBER_Url)
	fun <T:BaseResult<Void>> startPublisherMember(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("停用发布文章")
	@FormUrlEncoded
	@POST(Constants.API.STOP_PUBLISHER_MEMBER_Url)
	fun <T:BaseResult<Void>> stopPublisherMember(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_11_MEMBER_Url)
	fun <T:BaseResult<Void>> detail_11Member(
		@Field("id") @Description("id") id:String
	):  Flowable<T>

}