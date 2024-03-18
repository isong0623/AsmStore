package com.haoda.common.net.service.base.user

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface UserService : BaseService{
	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_6_USER_Url)
	fun <T:BaseResult<Void>> save_6User(
		@Field("mobile") @Description("手机号") mobile:String,
		@Field("realName") @Description("真实姓名") realName:String,
		@Field("remark") @Description("备注（非必须参数）") remark:String?,
		@Field("roleIds") @Description("角色ID数组") roleIds:String,
		@Field("status") @Description("状态：0->禁用1->正常2->锁定") status:String,
		@Field("userName") @Description("用户名") userName:String
	):  Flowable<T>


	@Description("获取角色")
	@FormUrlEncoded
	@POST(Constants.API.RANGE_ROLES_1USER_Url)
	fun <T:BaseResult<Void>> rangeRoles_1User(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_6_USER_Url)
	fun <T:BaseResult<Void>> delete_6User(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_3_USER_Url)
	fun <T:BaseResult<Void>> detail_3User(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("分配角色")
	@FormUrlEncoded
	@POST(Constants.API.RANGE_ROLES_USER_Url)
	fun <T:BaseResult<Void>> rangeRolesUser(
		@Field("id") @Description("id") id:String,
		@Field("roleIds") @Description("roleIds") roleIds:String
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_6_USER_Url)
	fun <T:BaseResult<Void>> update_6User(
		@Field("id") @Description("id") id:String,
		@Field("mobile") @Description("手机号（非必须参数）") mobile:String?,
		@Field("realName") @Description("真实姓名（非必须参数）") realName:String?,
		@Field("remark") @Description("备注（非必须参数）") remark:String?,
		@Field("roleIds") @Description("角色ID数组") roleIds:String,
		@Field("status") @Description("状态：0->禁用1->正常2->锁定（非必须参数）") status:String?,
		@Field("userName") @Description("用户名（非必须参数）") userName:String?
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_6_USER_Url)
	fun <T:BaseResult<Void>> page_6User(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("mobile") @Description("手机号（非必须参数）") mobile:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("realName") @Description("真实姓名（非必须参数）") realName:String?,
		@Field("userName") @Description("用户名（非必须参数）") userName:String?
	):  Flowable<T>


	@Description("重置密码")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_2_USER_Url)
	fun <T:BaseResult<Void>> detail_2User(
		@Field("id") @Description("id") id:String,
		@Field("newPassword") @Description("newPassword") newPassword:String
	):  Flowable<T>

}