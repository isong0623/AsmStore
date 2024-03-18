package com.haoda.common.net.service.mall.login

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class LoginDataSourceImpl : BaseDataSource() {

	var service = object : LoginDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("更新token")
	fun<T:BaseResult<Void>> passwordLogin_1Login(
		@Description("refreshToken") refreshToken:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.passwordLogin_1Login<T>(refreshToken).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> passwordLogin_1Login(
		@Description("refreshToken") refreshToken:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.passwordLogin_1Login<T>(refreshToken).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("微信新登录")
	fun<T:BaseResult<Void>> wechartNewLoginLogin(
		@Description("手机号加密字符串") encryptedData:String,
		@Description("解密偏移量") iv:String,
		@Description("微信登录jscode") jsCode:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.wechartNewLoginLogin<T>(encryptedData,iv,jsCode).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> wechartNewLoginLogin(
		@Description("手机号加密字符串") encryptedData:String,
		@Description("解密偏移量") iv:String,
		@Description("微信登录jscode") jsCode:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.wechartNewLoginLogin<T>(encryptedData,iv,jsCode).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("发送验证码")
	fun<T:BaseResult<Void>> sendAuthCodeLogin(
		@Description("mobile") mobile:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.sendAuthCodeLogin<T>(mobile).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> sendAuthCodeLogin(
		@Description("mobile") mobile:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.sendAuthCodeLogin<T>(mobile).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("手机验证码登录")
	fun<T:BaseResult<Void>> authCodeLoginLogin(
		@Description("mobile") mobile:String,
		@Description("authCode") authCode:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.authCodeLoginLogin<T>(mobile,authCode).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> authCodeLoginLogin(
		@Description("mobile") mobile:String,
		@Description("authCode") authCode:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.authCodeLoginLogin<T>(mobile,authCode).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("发送绑定银行卡手机验证码")
	fun<T:BaseResult<Void>> bindingBankCardCodeLogin(
		@Description("mobile") mobile:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.bindingBankCardCodeLogin<T>(mobile).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> bindingBankCardCodeLogin(
		@Description("mobile") mobile:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.bindingBankCardCodeLogin<T>(mobile).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("微信新授权")
	fun<T:BaseResult<Void>> wechartNewJscodeLogin(
		@Description("头像（非必须参数）") avatarUrl:String? = null,
		@Description("市（非必须参数）") city:String? = null,
		@Description("国家（非必须参数）") country:String? = null,
		@Description("性别（1->男2->女）（非必须参数）") gender:String? = null,
		@Description("语言（非必须参数）") language:String? = null,
		@Description("用户ID") memberId:String,
		@Description("微信用户ID") memberWechartId:String,
		@Description("昵称（非必须参数）") nickName:String? = null,
		@Description("省（非必须参数）") province:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.wechartNewJscodeLogin<T>(avatarUrl,city,country,gender,language,memberId,memberWechartId,nickName,province).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> wechartNewJscodeLogin(
		@Description("头像（非必须参数）") avatarUrl:String? = null,
		@Description("市（非必须参数）") city:String? = null,
		@Description("国家（非必须参数）") country:String? = null,
		@Description("性别（1->男2->女）（非必须参数）") gender:String? = null,
		@Description("语言（非必须参数）") language:String? = null,
		@Description("用户ID") memberId:String,
		@Description("微信用户ID") memberWechartId:String,
		@Description("昵称（非必须参数）") nickName:String? = null,
		@Description("省（非必须参数）") province:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.wechartNewJscodeLogin<T>(avatarUrl,city,country,gender,language,memberId,memberWechartId,nickName,province).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("密码登录")
	fun<T:BaseResult<Void>> passwordLoginLogin(
		@Description("mobile") mobile:String,
		@Description("password") password:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.passwordLoginLogin<T>(mobile,password).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> passwordLoginLogin(
		@Description("mobile") mobile:String,
		@Description("password") password:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.passwordLoginLogin<T>(mobile,password).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("微信登录")
	fun<T:BaseResult<Void>> wechartLoginLogin(
		@Description("手机号加密字符串") encryptedData:String,
		@Description("解密偏移量") iv:String,
		@Description("微信用户ID") memberWechartId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.wechartLoginLogin<T>(encryptedData,iv,memberWechartId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> wechartLoginLogin(
		@Description("手机号加密字符串") encryptedData:String,
		@Description("解密偏移量") iv:String,
		@Description("微信用户ID") memberWechartId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.wechartLoginLogin<T>(encryptedData,iv,memberWechartId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("微信jscode")
	fun<T:BaseResult<Void>> wechartJscodeLogin(
		@Description("头像（非必须参数）") avatarUrl:String? = null,
		@Description("市（非必须参数）") city:String? = null,
		@Description("国家（非必须参数）") country:String? = null,
		@Description("性别（1->男2->女）（非必须参数）") gender:String? = null,
		@Description("微信登录jscode") jsCode:String,
		@Description("语言（非必须参数）") language:String? = null,
		@Description("昵称（非必须参数）") nickName:String? = null,
		@Description("省（非必须参数）") province:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.wechartJscodeLogin<T>(avatarUrl,city,country,gender,jsCode,language,nickName,province).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> wechartJscodeLogin(
		@Description("头像（非必须参数）") avatarUrl:String? = null,
		@Description("市（非必须参数）") city:String? = null,
		@Description("国家（非必须参数）") country:String? = null,
		@Description("性别（1->男2->女）（非必须参数）") gender:String? = null,
		@Description("微信登录jscode") jsCode:String,
		@Description("语言（非必须参数）") language:String? = null,
		@Description("昵称（非必须参数）") nickName:String? = null,
		@Description("省（非必须参数）") province:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.wechartJscodeLogin<T>(avatarUrl,city,country,gender,jsCode,language,nickName,province).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}