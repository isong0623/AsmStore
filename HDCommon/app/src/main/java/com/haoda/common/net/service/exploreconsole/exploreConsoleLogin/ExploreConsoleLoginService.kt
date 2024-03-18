package com.haoda.common.net.service.exploreconsole.exploreConsoleLogin

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface ExploreConsoleLoginService : BaseService{
	@Description("退出")
	@POST(Constants.API.LOGOUT_EXPLORE_CONSOLE_LOGIN_Url)
	fun <T:BaseResult<Void>> logoutExploreConsoleLogin(

	):  Flowable<T>


	@Description("登录")
	@FormUrlEncoded
	@POST(Constants.API.LOGIN_EXPLORE_CONSOLE_LOGIN_Url)
	fun <T:BaseResult<Void>> loginExploreConsoleLogin(
		@Field("password") @Description("密码") password:String,
		@Field("userName") @Description("用户名") userName:String
	):  Flowable<T>


	@Description("获取登录用户")
	@POST(Constants.API.CURRENT_USER_EXPLORE_CONSOLE_LOGIN_Url)
	fun <T:BaseResult<Void>> currentUserExploreConsoleLogin(

	):  Flowable<T>

}