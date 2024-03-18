package com.haoda.common.net.service.mall.memberAppraise

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface MemberAppraiseService : BaseService{
	@Description("批量上传评价图片")
	@POST(Constants.API.UPLOAD_PICS_MEMBER_APPRAISE_Url)
	fun <T:BaseResult<Void>> uploadPicsMemberAppraise(

	):  Flowable<T>


	@Description("已评价商品分页查询")
	@FormUrlEncoded
	@POST(Constants.API.GET_MEMBER_APPRAISED_PAGE_MEMBER_APPRAISE_Url)
	fun <T:BaseResult<Void>> getMemberAppraisedPageMemberAppraise(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("商品评价")
	@FormUrlEncoded
	@POST(Constants.API.APP_SAVE_1MEMBER_APPRAISE_Url)
	fun <T:BaseResult<Void>> appSave_1MemberAppraise(
		@Field("appraise") @Description("评价内容") appraise:String,
		@Field("descriptionStar") @Description("描述相符评分") descriptionStar:String,
		@Field("feightStar") @Description("物流评分（非必须参数）") feightStar:String?,
		@Field("hideStatus") @Description("匿名状态（0->不匿名1->匿名）") hideStatus:String,
		@Field("orderId") @Description("订单ID") orderId:String,
		@Field("picList") @Description("评价图片数组（非必须参数）") picList:String?,
		@Field("productId") @Description("商品ID") productId:String,
		@Field("serviceStar") @Description("服务态度评分（非必须参数）") serviceStar:String?,
		@Field("skuAttribute") @Description("商品属性（非必须参数）") skuAttribute:String?
	):  Flowable<T>


	@Description("上传评价图片")
	@POST(Constants.API.UPLOAD_PIC_MEMBER_APPRAISE_Url)
	fun <T:BaseResult<Void>> uploadPicMemberAppraise(

	):  Flowable<T>


	@Description("未评价商品分页查询")
	@FormUrlEncoded
	@POST(Constants.API.GET_MEMBER_NOT_APPRAISE_PAGEMEMBER_APPRAISE_Url)
	fun <T:BaseResult<Void>> getMemberNotAppraisePageMemberAppraise(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>

}