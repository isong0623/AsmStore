package com.haoda.common.net.service.console.category

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface CategoryService : BaseService{
	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_CATEGORY_Url)
	fun <T:BaseResult<Void>> detailCategory(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("上传图片")
	@POST(Constants.API.UPLOAD_PICTURE_CATEGORY_Url)
	fun <T:BaseResult<Void>> uploadPictureCategory(

	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_CATEGORY_Url)
	fun <T:BaseResult<Void>> deleteCategory(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_CATEGORY_Url)
	fun <T:BaseResult<Void>> updateCategory(
		@Field("bottomPictureUrl") @Description("底部图片地址（非必须参数）") bottomPictureUrl:String?,
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("icon") @Description("图标（非必须参数）") icon:String?,
		@Field("id") @Description("id") id:String,
		@Field("indexSort") @Description("首页排序（非必须参数）") indexSort:String?,
		@Field("indexStatus") @Description("是否显示在首页：1->是；0->不是（非必须参数）") indexStatus:String?,
		@Field("keywords") @Description("关键字（非必须参数）") keywords:String?,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("navSort") @Description("导航栏排序（非必须参数）") navSort:String?,
		@Field("navStatus") @Description("是否显示在导航栏：1->是；0->不是（非必须参数）") navStatus:String?,
		@Field("pageIconType") @Description("页面样式类型（1->红色2->黄色3->绿色）（非必须参数）") pageIconType:String?,
		@Field("parentId") @Description("上级分类的编号：0表示一级分类（非必须参数）") parentId:String?,
		@Field("pictureUrl") @Description("商品分类图片（非必须参数）") pictureUrl:String?
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_CATEGORY_Url)
	fun <T:BaseResult<Void>> pageCategory(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("获取带等级商品分类")
	@POST(Constants.API.LEVEL_LIST_CATEGORY_Url)
	fun <T:BaseResult<Void>> levelListCategory(

	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_CATEGORY_Url)
	fun <T:BaseResult<Void>> saveCategory(
		@Field("bottomPictureUrl") @Description("底部图片地址（非必须参数）") bottomPictureUrl:String?,
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("icon") @Description("图标（非必须参数）") icon:String?,
		@Field("indexSort") @Description("首页排序（非必须参数）") indexSort:String?,
		@Field("indexStatus") @Description("是否显示在首页：1->是；0->不是（非必须参数）") indexStatus:String?,
		@Field("keywords") @Description("关键字（非必须参数）") keywords:String?,
		@Field("name") @Description("名称") name:String,
		@Field("navSort") @Description("导航栏排序（非必须参数）") navSort:String?,
		@Field("navStatus") @Description("是否显示在导航栏：1->是；0->不是（非必须参数）") navStatus:String?,
		@Field("pageIconType") @Description("页面样式类型（1->红色2->黄色3->绿色）（非必须参数）") pageIconType:String?,
		@Field("parentId") @Description("上级分类的编号：0表示一级分类") parentId:String,
		@Field("pictureUrl") @Description("商品分类图片（非必须参数）") pictureUrl:String?
	):  Flowable<T>


	@Description("获取一级商品分类")
	@POST(Constants.API.GET_FIRST_CATEGORY_CATEGORY_Url)
	fun <T:BaseResult<Void>> getFirstCategoryCategory(

	):  Flowable<T>

}