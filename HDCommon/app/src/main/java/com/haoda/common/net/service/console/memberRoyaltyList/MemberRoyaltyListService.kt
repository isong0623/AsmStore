package com.haoda.common.net.service.console.memberRoyaltyList

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface MemberRoyaltyListService : BaseService{
	@Description("分页查询下级用户")
	@FormUrlEncoded
	@POST(Constants.API.SUBORDINATE_PAGE_BYID_MEMBER_ROYALTY_LIST_Url)
	fun <T:BaseResult<Void>> subordinatePageByIdMemberRoyaltyList(
		@Field("memberId") @Description("当前用户Id") memberId:String,
		@Field("pageNum") @Description("当前页") pageNum:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("mobile") @Description("mobile（非必须参数）") mobile:String?
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_13_MEMBER_ROYALTY_LIST_Url)
	fun <T:BaseResult<Void>> page_13MemberRoyaltyList(
		@Field("pageNum") @Description("当前页") pageNum:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("mobile") @Description("mobile（非必须参数）") mobile:String?
	):  Flowable<T>

}