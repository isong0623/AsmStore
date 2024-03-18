package com.haoda.common.net.service.console.messageCenter

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface MessageCenterService : BaseService{
	@Description("消息推送")
	@POST(Constants.API.PUSH_MESSAGE_MESSAGE_CENTER_Url)
	fun <T:BaseResult<Void>> pushMessageMessageCenter(

	):  Flowable<T>


	@Description("优惠活动推送")
	@POST(Constants.API.PUSH_PROMOTION_MESSAGE_CENTER_Url)
	fun <T:BaseResult<Void>> pushPromotionMessageCenter(

	):  Flowable<T>

}