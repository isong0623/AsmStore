package com.haoda.common.net.service.base.dicDetail

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface DicDetailService : BaseService{
	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_1_DIC_DETAIL_Url)
	fun <T:BaseResult<Void>> delete_1DicDetail(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("加载数据字典")
	@POST(Constants.API.LOAD_DIC_DIC_DETAIL_Url)
	fun <T:BaseResult<Void>> loadDicDicDetail(

	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_1_DIC_DETAIL_Url)
	fun <T:BaseResult<Void>> save_1DicDetail(
		@Field("dicKey") @Description("数据字典key") dicKey:String,
		@Field("dicTypeId") @Description("数据字典类型id") dicTypeId:String,
		@Field("dicValue") @Description("数据字典value") dicValue:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_1_DIC_DETAIL_Url)
	fun <T:BaseResult<Void>> page_1DicDetail(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("dicTypeId") @Description("数据字典类型id（非必须参数）") dicTypeId:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_1_DIC_DETAIL_Url)
	fun <T:BaseResult<Void>> update_1DicDetail(
		@Field("dicKey") @Description("数据字典key（非必须参数）") dicKey:String?,
		@Field("dicTypeId") @Description("数据字典类型id（非必须参数）") dicTypeId:String?,
		@Field("dicValue") @Description("数据字典value（非必须参数）") dicValue:String?,
		@Field("id") @Description("id") id:String
	):  Flowable<T>

}