package com.haoda.common.net.service.base.permission

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface PermissionService : BaseService{
	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_3_PERMISSION_Url)
	fun <T:BaseResult<Void>> update_3Permission(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("icon") @Description("图标（非必须参数）") icon:String?,
		@Field("id") @Description("id") id:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageSize") @Description("（非必须参数）") pageSize:String?,
		@Field("param") @Description("权限值（非必须参数）") param:String?,
		@Field("pid") @Description("父级权限id（非必须参数）") pid:String?,
		@Field("requestUrl") @Description("（非必须参数）") requestUrl:String?,
		@Field("searchEndDate") @Description("（非必须参数）") searchEndDate:String?,
		@Field("searchEndTime") @Description("（非必须参数）") searchEndTime:String?,
		@Field("searchStartDate") @Description("（非必须参数）") searchStartDate:String?,
		@Field("searchStartTime") @Description("（非必须参数）") searchStartTime:String?,
		@Field("sort") @Description("排序（非必须参数）") sort:String?,
		@Field("type") @Description("权限类型：1->目录；2->菜单；3->按钮（非必须参数）") type:String?,
		@Field("viewUri") @Description("前端资源路径（非必须参数）") viewUri:String?
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_3_PERMISSION_Url)
	fun <T:BaseResult<Void>> save_3Permission(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("icon") @Description("图标（非必须参数）") icon:String?,
		@Field("id") @Description("") id:String,
		@Field("name") @Description("名称") name:String,
		@Field("pageSize") @Description("（非必须参数）") pageSize:String?,
		@Field("param") @Description("权限值（非必须参数）") param:String?,
		@Field("pid") @Description("父级权限id") pid:String,
		@Field("requestUrl") @Description("（非必须参数）") requestUrl:String?,
		@Field("searchEndDate") @Description("（非必须参数）") searchEndDate:String?,
		@Field("searchEndTime") @Description("（非必须参数）") searchEndTime:String?,
		@Field("searchStartDate") @Description("（非必须参数）") searchStartDate:String?,
		@Field("searchStartTime") @Description("（非必须参数）") searchStartTime:String?,
		@Field("sort") @Description("排序（非必须参数）") sort:String?,
		@Field("type") @Description("权限类型：1->目录；2->菜单；3->按钮") type:String,
		@Field("viewUri") @Description("前端资源路径（非必须参数）") viewUri:String?
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_3_PERMISSION_Url)
	fun <T:BaseResult<Void>> page_3Permission(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_3_PERMISSION_Url)
	fun <T:BaseResult<Void>> delete_3Permission(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("获取所有权限")
	@POST(Constants.API.LIST_PERMISSION_Url)
	fun <T:BaseResult<Void>> listPermission(

	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_1_PERMISSION_Url)
	fun <T:BaseResult<Void>> detail_1Permission(
		@Field("id") @Description("id") id:String
	):  Flowable<T>
}