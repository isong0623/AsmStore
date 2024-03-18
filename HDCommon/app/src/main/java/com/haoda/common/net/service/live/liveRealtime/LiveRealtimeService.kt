package com.haoda.common.net.service.live.liveRealtime

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface LiveRealtimeService : BaseService{
	@Description("点赞")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_LIKE_NUM_LIVE_REALTIME_Url)
	fun <T:BaseResult<Void>> updateLikeNumLiveRealtime(
		@Field("likeNum") @Description("点赞数量") likeNum:String,
		@Field("memberId") @Description("直播用户ID") memberId:String
	):  Flowable<T>


	@Description("获取当前直播点赞数")
	@FormUrlEncoded
	@POST(Constants.API.GET_LIKE_NUM_LIVE_REALTIME_Url)
	fun <T:BaseResult<Void>> getLikeNumLiveRealtime(
		@Field("isClose") @Description("是否为关闭直播事件（非必须参数）") isClose:String?,
		@Field("memberId") @Description("直播用户ID") memberId:String
	):  Flowable<T>


	@Description("直播结束保存带货记录并返回")
	@FormUrlEncoded
	@POST(Constants.API.UPDATELIVE_RECORD_LIVE_REALTIME_Url)
	fun <T:BaseResult<Void>> updateliveRecordLiveRealtime(
		@Field("streamerId") @Description("streamerId") streamerId:String,
		@Field("recordId") @Description("recordId") recordId:String
	):  Flowable<T>


	@Description("移除黑名单中的用户")
	@FormUrlEncoded
	@POST(Constants.API.REMOVE_BLACK_LIST_LIVE_REALTIME_Url)
	fun <T:BaseResult<Void>> removeBlackListLiveRealtime(
		@Field("blackUserId") @Description("黑名单用户id") blackUserId:String,
		@Field("streamerId") @Description("主播id") streamerId:String
	):  Flowable<T>


	@Description("获取管理列表（黑名单列表，禁言列表）")
	@FormUrlEncoded
	@POST(Constants.API.GET_SUPERVISE_LIST_LIVE_REALTIME_Url)
	fun <T:BaseResult<Void>> getSuperviseListLiveRealtime(
		@Field("roomId") @Description("房间Id（可以为空）") roomId:String,
		@Field("streamerId") @Description("主播id") streamerId:String
	):  Flowable<T>


	@Description("搜索直播间中观众")
	@FormUrlEncoded
	@POST(Constants.API.SEARCH_VIEWER_LIVE_REALTIME_Url)
	fun <T:BaseResult<Void>> searchViewerLiveRealtime(
		@Field("roomId") @Description("房间号") roomId:String,
		@Field("viewerName") @Description("观众名") viewerName:String
	):  Flowable<T>


	@Description("获取直播间观众列表")
	@FormUrlEncoded
	@POST(Constants.API.GET_VIEWER_LIST_LIVE_REALTIME_Url)
	fun <T:BaseResult<Void>> getViewerListLiveRealtime(
		@Field("roomId") @Description("房间ID") roomId:String
	):  Flowable<T>

}