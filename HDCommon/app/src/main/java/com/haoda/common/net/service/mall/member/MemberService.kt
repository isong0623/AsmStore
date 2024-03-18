package com.haoda.common.net.service.mall.member

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface MemberService : BaseService{
	@Description("修改个人信息")
	@FormUrlEncoded
	@POST(Constants.API.APP_UPDATE_MEMBER_MEMBER_Url)
	fun <T:BaseResult<Void>> appUpdateMemberMember(
		@Field("birthday") @Description("生日（非必须参数）") birthday:String?,
		@Field("icon") @Description("头像地址（非必须参数）") icon:String?,
		@Field("id") @Description("id") id:String,
		@Field("nickname") @Description("昵称（非必须参数）") nickname:String?,
		@Field("personSign") @Description("个性签名（非必须参数）") personSign:String?
	):  Flowable<T>


	@Description("上传头像")
	@POST(Constants.API.UPLOAD_ICON_MEMBER_Url)
	fun <T:BaseResult<Void>> uploadIconMember(

	):  Flowable<T>


	@Description("修改密码")
	@FormUrlEncoded
	@POST(Constants.API.APP_UPDATE_PASSWORD_MEMBER_Url)
	fun <T:BaseResult<Void>> appUpdatePasswordMember(
		@Field("oldPassword") @Description("oldPassword") oldPassword:String,
		@Field("newPassword") @Description("newPassword") newPassword:String
	):  Flowable<T>


	@Description("第一次设置密码")
	@FormUrlEncoded
	@POST(Constants.API.FIRST_SET_PASSWORD_MEMBER_Url)
	fun <T:BaseResult<Void>> firstSetPasswordMember(
		@Field("password") @Description("password") password:String
	):  Flowable<T>


	@Description("我的订单")
	@POST(Constants.API.MY_ORDER_MEMBER_Url)
	fun <T:BaseResult<Void>> myOrderMember(

	):  Flowable<T>


	@Description("获取当前用户")
	@POST(Constants.API.CURRENT_USER_MEMBER_Url)
	fun <T:BaseResult<Void>> currentUserMember(

	):  Flowable<T>

}