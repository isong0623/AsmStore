package com.haoda.common.net.service.base.dicType

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface DicTypeService : BaseService{
	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_2_DIC_TYPE_Url)
	fun <T:BaseResult<Void>> page_2DicType(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("field") @Description("字段（非必须参数）") field:String?,
		@Field("fieldDesc") @Description("描述（非必须参数）") fieldDesc:String?,
		@Field("module") @Description("模块（非必须参数）") module:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_2_DIC_TYPE_Url)
	fun <T:BaseResult<Void>> save_2DicType(
		@Field("field") @Description("字段") field:String,
		@Field("fieldDesc") @Description("描述") fieldDesc:String,
		@Field("module") @Description("模块") module:String
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_2_DIC_TYPE_Url)
	fun <T:BaseResult<Void>> update_2DicType(
		@Field("field") @Description("字段（非必须参数）") field:String?,
		@Field("fieldDesc") @Description("描述（非必须参数）") fieldDesc:String?,
		@Field("id") @Description("id") id:String,
		@Field("module") @Description("模块（非必须参数）") module:String?
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_2_DIC_TYPE_Url)
	fun <T:BaseResult<Void>> delete_2DicType(
		@Field("id") @Description("id") id:String
	):  Flowable<T>

}