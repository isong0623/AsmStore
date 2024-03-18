package com.haoda.common.net.service.mall.login

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface LoginService : BaseService{
	@Description("更新token")
	@FormUrlEncoded
	@Headers("haodaAuthorization:\"\"")
	@POST(Constants.API.PASSWORD_LOGIN_1LOGIN_Url)
	fun <T:BaseResult<Void>> passwordLogin_1Login(
		@Field("refreshToken") @Description("refreshToken") refreshToken:String
	):  Flowable<T>


	@Description("微信新登录")
	@FormUrlEncoded
	@POST(Constants.API.WECHART_NEW_LOGIN_LOGIN_Url)
	fun <T:BaseResult<Void>> wechartNewLoginLogin(
		@Field("encryptedData") @Description("手机号加密字符串") encryptedData:String,
		@Field("iv") @Description("解密偏移量") iv:String,
		@Field("jsCode") @Description("微信登录jscode") jsCode:String
	):  Flowable<T>


	@Description("发送验证码")
	@FormUrlEncoded
	@POST(Constants.API.SEND_AUTH_CODE_LOGIN_Url)
	fun <T:BaseResult<Void>> sendAuthCodeLogin(
		@Field("mobile") @Description("mobile") mobile:String
	):  Flowable<T>


	@Description("手机验证码登录")
	@FormUrlEncoded
	@POST(Constants.API.AUTH_CODE_LOGIN_LOGIN_Url)
	fun <T:BaseResult<Void>> authCodeLoginLogin(
		@Field("mobile") @Description("mobile") mobile:String,
		@Field("authCode") @Description("authCode") authCode:String
	):  Flowable<T>


	@Description("发送绑定银行卡手机验证码")
	@FormUrlEncoded
	@POST(Constants.API.BINDING_BANK_CARD_CODE_LOGIN_Url)
	fun <T:BaseResult<Void>> bindingBankCardCodeLogin(
		@Field("mobile") @Description("mobile") mobile:String
	):  Flowable<T>


	@Description("微信新授权")
	@FormUrlEncoded
	@POST(Constants.API.WECHART_NEW_JSCODE_LOGIN_Url)
	fun <T:BaseResult<Void>> wechartNewJscodeLogin(
		@Field("avatarUrl") @Description("头像（非必须参数）") avatarUrl:String?,
		@Field("city") @Description("市（非必须参数）") city:String?,
		@Field("country") @Description("国家（非必须参数）") country:String?,
		@Field("gender") @Description("性别（1->男2->女）（非必须参数）") gender:String?,
		@Field("language") @Description("语言（非必须参数）") language:String?,
		@Field("memberId") @Description("用户ID") memberId:String,
		@Field("memberWechartId") @Description("微信用户ID") memberWechartId:String,
		@Field("nickName") @Description("昵称（非必须参数）") nickName:String?,
		@Field("province") @Description("省（非必须参数）") province:String?
	):  Flowable<T>


	@Description("密码登录")
	@FormUrlEncoded
	@POST(Constants.API.PASSWORD_LOGIN_LOGIN_Url)
	fun <T:BaseResult<Void>> passwordLoginLogin(
		@Field("mobile") @Description("mobile") mobile:String,
		@Field("password") @Description("password") password:String
	):  Flowable<T>


	@Description("微信登录")
	@FormUrlEncoded
	@POST(Constants.API.WECHART_LOGIN_LOGIN_Url)
	fun <T:BaseResult<Void>> wechartLoginLogin(
		@Field("encryptedData") @Description("手机号加密字符串") encryptedData:String,
		@Field("iv") @Description("解密偏移量") iv:String,
		@Field("memberWechartId") @Description("微信用户ID") memberWechartId:String
	):  Flowable<T>


	@Description("微信jscode")
	@FormUrlEncoded
	@POST(Constants.API.WECHART_JSCODE_LOGIN_Url)
	fun <T:BaseResult<Void>> wechartJscodeLogin(
		@Field("avatarUrl") @Description("头像（非必须参数）") avatarUrl:String?,
		@Field("city") @Description("市（非必须参数）") city:String?,
		@Field("country") @Description("国家（非必须参数）") country:String?,
		@Field("gender") @Description("性别（1->男2->女）（非必须参数）") gender:String?,
		@Field("jsCode") @Description("微信登录jscode") jsCode:String,
		@Field("language") @Description("语言（非必须参数）") language:String?,
		@Field("nickName") @Description("昵称（非必须参数）") nickName:String?,
		@Field("province") @Description("省（非必须参数）") province:String?
	):  Flowable<T>

}