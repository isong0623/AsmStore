package com.haoda.common.net.service.live.liveSubscribe

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface LiveSubscribeService : BaseService{
	@Description("取消关注")
	@FormUrlEncoded
	@POST(Constants.API.CANCEL_SUBSCRIBE_LIVE_SUBSCRIBE_Url)
	fun <T:BaseResult<Void>> cancelSubscribeLiveSubscribe(
		@Field("memberId") @Description("当前用户Id") memberId:String,
		@Field("streamerId") @Description("主播Id") streamerId:String
	):  Flowable<T>


	@Description("观众信息")
	@FormUrlEncoded
	@POST(Constants.API.VIEWER_INFO_LIVE_SUBSCRIBE_Url)
	fun <T:BaseResult<Void>> viewerInfoLiveSubscribe(
		@Field("memberId") @Description("当前用户Id") memberId:String,
		@Field("roomId") @Description("直播间Id") roomId:String,
		@Field("streamerId") @Description("主播Id") streamerId:String
	):  Flowable<T>


	@Description("关注")
	@FormUrlEncoded
	@POST(Constants.API.SUBSCRIBE_LIVE_SUBSCRIBE_Url)
	fun <T:BaseResult<Void>> subscribeLiveSubscribe(
		@Field("memberId") @Description("当前用户Id") memberId:String,
		@Field("streamerId") @Description("主播Id") streamerId:String
	):  Flowable<T>


	@Description("获取粉丝数/点赞数")
	@FormUrlEncoded
	@POST(Constants.API.GET_STREAMER_INFO_LIVE_SUBSCRIBE_Url)
	fun <T:BaseResult<Void>> getStreamerInfoLiveSubscribe(
		@Field("streamerId") @Description("主播Id") streamerId:String
	):  Flowable<T>

}