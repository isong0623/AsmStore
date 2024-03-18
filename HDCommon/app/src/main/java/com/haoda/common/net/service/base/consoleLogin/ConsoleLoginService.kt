package com.haoda.common.net.service.base.consoleLogin

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface ConsoleLoginService : BaseService{
	@Description("登录")
	@FormUrlEncoded
	@POST(Constants.API.LOGIN_CONSOLE_LOGIN_Url)
	fun <T:BaseResult<Void>> loginConsoleLogin(
		@Field("password") @Description("密码") password:String,
		@Field("userName") @Description("用户名") userName:String
	):  Flowable<T>

}