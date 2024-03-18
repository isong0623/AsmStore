package com.haoda.common.net.service.mall.login

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface LoginDataSourceWrapper {
	fun <T:BaseResult<Void>> passwordLogin_1Login(refreshToken:String):Flowable<T> {
		return ApiEngine.getService(LoginService::class.java)
			.passwordLogin_1Login<T>(refreshToken)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> wechartNewLoginLogin(encryptedData:String,iv:String,jsCode:String):Flowable<T> {
		return ApiEngine.getService(LoginService::class.java)
			.wechartNewLoginLogin<T>(encryptedData,iv,jsCode)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> sendAuthCodeLogin(mobile:String):Flowable<T> {
		return ApiEngine.getService(LoginService::class.java)
			.sendAuthCodeLogin<T>(mobile)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> authCodeLoginLogin(mobile:String,authCode:String):Flowable<T> {
		return ApiEngine.getService(LoginService::class.java)
			.authCodeLoginLogin<T>(mobile,authCode)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> bindingBankCardCodeLogin(mobile:String):Flowable<T> {
		return ApiEngine.getService(LoginService::class.java)
			.bindingBankCardCodeLogin<T>(mobile)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> wechartNewJscodeLogin(avatarUrl:String?,city:String?,country:String?,gender:String?,language:String?,memberId:String,memberWechartId:String,nickName:String?,province:String?):Flowable<T> {
		return ApiEngine.getService(LoginService::class.java)
			.wechartNewJscodeLogin<T>(avatarUrl,city,country,gender,language,memberId,memberWechartId,nickName,province)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> passwordLoginLogin(mobile:String,password:String):Flowable<T> {
		return ApiEngine.getService(LoginService::class.java)
			.passwordLoginLogin<T>(mobile,password)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> wechartLoginLogin(encryptedData:String,iv:String,memberWechartId:String):Flowable<T> {
		return ApiEngine.getService(LoginService::class.java)
			.wechartLoginLogin<T>(encryptedData,iv,memberWechartId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> wechartJscodeLogin(avatarUrl:String?,city:String?,country:String?,gender:String?,jsCode:String,language:String?,nickName:String?,province:String?):Flowable<T> {
		return ApiEngine.getService(LoginService::class.java)
			.wechartJscodeLogin<T>(avatarUrl,city,country,gender,jsCode,language,nickName,province)
			.compose(RxSchedulers.io_main())
	}

}