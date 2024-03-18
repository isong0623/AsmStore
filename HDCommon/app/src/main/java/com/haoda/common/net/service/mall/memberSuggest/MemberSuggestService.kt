package com.haoda.common.net.service.mall.memberSuggest

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface MemberSuggestService : BaseService{
	@Description("用户意见反馈")
	@FormUrlEncoded
	@POST(Constants.API.APP_SUGGEST_MEMBER_SUGGEST_Url)
	fun <T:BaseResult<Void>> appSuggestMemberSuggest(
		@Field("content") @Description("content") content:String
	):  Flowable<T>

}