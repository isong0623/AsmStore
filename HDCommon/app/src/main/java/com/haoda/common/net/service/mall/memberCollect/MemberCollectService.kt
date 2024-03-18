package com.haoda.common.net.service.mall.memberCollect

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface MemberCollectService : BaseService{
	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.MEMBER_PAGE_MEMBER_COLLECT_Url)
	fun <T:BaseResult<Void>> memberPageMemberCollect(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数(默认10条)（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("取消收藏")
	@FormUrlEncoded
	@POST(Constants.API.MEMBER_CANCEL_COLLECT_MEMBER_COLLECT_Url)
	fun <T:BaseResult<Void>> memberCancelCollectMemberCollect(
		@Field("productId") @Description("productId") productId:String
	):  Flowable<T>


	@Description("获取用户收藏商品数量")
	@POST(Constants.API.MEMBER_COUNT_MEMBER_COLLECT_Url)
	fun <T:BaseResult<Void>> memberCountMemberCollect(

	):  Flowable<T>


	@Description("收藏商品")
	@FormUrlEncoded
	@POST(Constants.API.MEMBER_COLLECT_MEMBER_COLLECT_Url)
	fun <T:BaseResult<Void>> memberCollectMemberCollect(
		@Field("productId") @Description("商品ID") productId:String,
		@Field("skuCode") @Description("sku唯一码") skuCode:String
	):  Flowable<T>


	@Description("批量取消收藏")
	@FormUrlEncoded
	@POST(Constants.API.MEMBER_CANCEL_COLLECT_BATCH_MEMBER_COLLECT_Url)
	fun <T:BaseResult<Void>> memberCancelCollectBatchMemberCollect(
		@Field("productIds") @Description("productIds") productIds:String
	):  Flowable<T>

}