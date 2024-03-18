package com.haoda.common.net.service.base.role

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface RoleService : BaseService{
	@Description("查询所有")
	@POST(Constants.API.LIST_1_ROLE_Url)
	fun <T:BaseResult<Void>> list_1Role(

	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_4_ROLE_Url)
	fun <T:BaseResult<Void>> update_4Role(
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("id") @Description("id") id:String,
		@Field("name") @Description("名称（非必须参数）") name:String?
	):  Flowable<T>


	@Description("分配权限")
	@FormUrlEncoded
	@POST(Constants.API.RANGE_PERMISSIONS_ROLE_Url)
	fun <T:BaseResult<Void>> rangePermissionsRole(
		@Field("id") @Description("id") id:String,
		@Field("permissionIds") @Description("permissionIds") permissionIds:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_4_ROLE_Url)
	fun <T:BaseResult<Void>> page_4Role(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("获取权限")
	@FormUrlEncoded
	@POST(Constants.API.GET_PERMISSIONS_ROLE_Url)
	fun <T:BaseResult<Void>> getPermissionsRole(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_4_ROLE_Url)
	fun <T:BaseResult<Void>> delete_4Role(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_4_ROLE_Url)
	fun <T:BaseResult<Void>> save_4Role(
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("name") @Description("名称") name:String
	):  Flowable<T>

}