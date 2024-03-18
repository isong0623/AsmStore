package com.haoda.common.net.service.base.consoleIndex

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface ConsoleIndexService : BaseService{
	@Description("修改密码")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_PASSWORD_CONSOLE_INDEX_Url)
	fun <T:BaseResult<Void>> updatePasswordConsoleIndex(
		@Field("oldPassword") @Description("oldPassword") oldPassword:String,
		@Field("newPassword") @Description("newPassword") newPassword:String
	):  Flowable<T>


	@Description("获取登录用户")
	@POST(Constants.API.CURRENT_USER_CONSOLE_INDEX_Url)
	fun <T:BaseResult<Void>> currentUserConsoleIndex(

	):  Flowable<T>


	@Description("退出")
	@POST(Constants.API.LOGOUT_CONSOLE_INDEX_Url)
	fun <T:BaseResult<Void>> logoutConsoleIndex(

	):  Flowable<T>


	@Description("获取菜单")
	@POST(Constants.API.MENU_CONSOLE_INDEX_Url)
	fun <T:BaseResult<Void>> menuConsoleIndex(

	):  Flowable<T>


	@Description("获取当前用户权限")
	@POST(Constants.API.GET_CURRENT_USER_PERMISSIONS_CONSOLE_INDEX_Url)
	fun <T:BaseResult<Void>> getCurrentUserPermissionsConsoleIndex(

	):  Flowable<T>

}