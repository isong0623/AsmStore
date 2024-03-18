package com.haoda.common.net.service.console.memberSuggest

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface MemberSuggestService : BaseService{
	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_14_MEMBER_SUGGEST_Url)
	fun <T:BaseResult<Void>> page_14MemberSuggest(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("mobile") @Description("用户手机号（非必须参数）") mobile:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_12_MEMBER_SUGGEST_Url)
	fun <T:BaseResult<Void>> detail_12MemberSuggest(
		@Field("id") @Description("id") id:String
	):  Flowable<T>

}