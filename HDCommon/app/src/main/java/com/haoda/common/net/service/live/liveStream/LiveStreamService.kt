package com.haoda.common.net.service.live.liveStream

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface LiveStreamService : BaseService{
	@Description("RTMP推流地址")
	@FormUrlEncoded
	@POST(Constants.API.RTMP_PUBLISH_URLLIVE_STREAM_Url)
	fun <T:BaseResult<Void>> rtmpPublishURLLiveStream(
		@Field("key") @Description("流名（非必须参数）") key:String?
	):  Flowable<T>


	@Description("直播关注列表接口")
	@FormUrlEncoded
	@POST(Constants.API.FOLLOW_LIVE_STREAM_Url)
	fun <T:BaseResult<Void>> followLiveStream(
		@Field("memberId") @Description("当前用户ID") memberId:String
	):  Flowable<T>


	@Description("直播分享小程序URL")
	@FormUrlEncoded
	@POST(Constants.API.LIVE_SHARE_URL_LIVE_STREAM_Url)
	fun <T:BaseResult<Void>> liveShareUrlLiveStream(
		@Field("memberId") @Description("主播ID") memberId:String,
		@Field("random") @Description("当前用户的随机码（非必须参数）") random:String?
	):  Flowable<T>


	@Description("RTMP直播地址")
	@FormUrlEncoded
	@POST(Constants.API.RTMP_PLAY_URLLIVE_STREAM_Url)
	fun <T:BaseResult<Void>> rtmpPlayURLLiveStream(
		@Field("key") @Description("流名（非必须参数）") key:String?
	):  Flowable<T>


	@Description("查看推流历史")
	@FormUrlEncoded
	@POST(Constants.API.HISTORY_RECORD_LIVE_STREAM_Url)
	fun <T:BaseResult<Void>> historyRecordLiveStream(
		@Field("end") @Description("时间戳，结束时间（非必须参数）") end:String?,
		@Field("key") @Description("流名（非必须参数）") key:String?,
		@Field("start") @Description("时间戳，起始时间（非必须参数）") start:String?
	):  Flowable<T>


	@Description("查看直播状态")
	@FormUrlEncoded
	@POST(Constants.API.LIVE_STATUS_LIVE_STREAM_Url)
	fun <T:BaseResult<Void>> liveStatusLiveStream(
		@Field("key") @Description("直播key（非必须参数）") key:String?
	):  Flowable<T>


	@Description("列出正在直播的流")
	@FormUrlEncoded
	@POST(Constants.API.LIST_LIVE_RET_LIVE_STREAM_Url)
	fun <T:BaseResult<Void>> listLiveRetLiveStream(
		@Field("limit") @Description("查询的数量（非必须参数）") limit:String?,
		@Field("marker") @Description("上一次查询返回的标记（非必须参数）") marker:String?,
		@Field("viewerId") @Description("观众ID") viewerId:String
	):  Flowable<T>


	@Description("截图直播地址")
	@FormUrlEncoded
	@POST(Constants.API.SNAPSHOT_PLAY_URLLIVE_STREAM_Url)
	fun <T:BaseResult<Void>> snapshotPlayURLLiveStream(
		@Field("key") @Description("流名（非必须参数）") key:String?
	):  Flowable<T>


	@Description("上传封面")
	@POST(Constants.API.UPLOAD_PHOTO_LIVE_STREAM_Url)
	fun <T:BaseResult<Void>> uploadPhotoLiveStream(

	):  Flowable<T>


	@Description("HDL直播地址")
	@FormUrlEncoded
	@POST(Constants.API.HDL_PLAY_URLLIVE_STREAM_Url)
	fun <T:BaseResult<Void>> hdlPlayURLLiveStream(
		@Field("key") @Description("流名（非必须参数）") key:String?
	):  Flowable<T>


	@Description("获取直播鉴权")
	@FormUrlEncoded
	@POST(Constants.API.CREATE_STREAM_LIVE_STREAM_Url)
	fun <T:BaseResult<Void>> createStreamLiveStream(
		@Field("key") @Description("创建流的名") key:String,
		@Field("memberId") @Description("直播用户ID") memberId:String
	):  Flowable<T>


	@Description("删除直播商品")
	@FormUrlEncoded
	@POST(Constants.API.DEL_LIVE_PRODUCTS_LIVE_STREAM_Url)
	fun <T:BaseResult<Void>> delLiveProductsLiveStream(
		@Field("memberId") @Description("memberId（非必须参数）") memberId:String?
	):  Flowable<T>


	@Description("检查用户直播资格和鉴权key")
	@FormUrlEncoded
	@POST(Constants.API.QUALIFICATION_AND_ISEXIST_KEYLIVE_STREAM_Url)
	fun <T:BaseResult<Void>> qualificationAndIsExistKeyLiveStream(
		@Field("memberId") @Description("memberId") memberId:String
	):  Flowable<T>


	@Description("保存直播数据并获取作业id")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_LIVE_DATA_RETID_LIVESTREAM_Url)
	fun <T:BaseResult<Void>> saveLiveDataRetIdLiveStream(
		@Field("end") @Description("时间戳，要保存的直播的结束时间（非必须参数）") end:String?,
		@Field("key") @Description("流名（非必须参数）") key:String?,
		@Field("start") @Description("时间戳，要保存的直播的起始时间（非必须参数）") start:String?
	):  Flowable<T>


	@Description("保存直播数据")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_LIVE_DATA_LIVE_STREAM_Url)
	fun <T:BaseResult<Void>> saveLiveDataLiveStream(
		@Field("end") @Description("时间戳，要保存的直播的结束时间（非必须参数）") end:String?,
		@Field("key") @Description("流名（非必须参数）") key:String?,
		@Field("start") @Description("时间戳，要保存的直播的起始时间（非必须参数）") start:String?
	):  Flowable<T>


	@Description("直播分享")
	@FormUrlEncoded
	@POST(Constants.API.LIVE_SHARE_DATA_LIVE_STREAM_Url)
	fun <T:BaseResult<Void>> liveShareDataLiveStream(
		@Field("memberId") @Description("主播ID") memberId:String
	):  Flowable<T>


	@Description("启用流直播")
	@FormUrlEncoded
	@POST(Constants.API.ENABLE_STREAM_LIVE_STREAM_Url)
	fun <T:BaseResult<Void>> enableStreamLiveStream(
		@Field("enableKey") @Description("启用的流名（非必须参数）") enableKey:String?
	):  Flowable<T>


	@Description("保存直播间信息")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_LIVE_ROOM_INFO_LIVESTREAM_Url)
	fun <T:BaseResult<Void>> saveLiveRoomInfoLiveStream(
		@Field("memberId") @Description("直播用户ID") memberId:String,
		@Field("picUrl") @Description("封面Url") picUrl:String,
		@Field("productsInfo") @Description("商品Id集合") productsInfo:String,
		@Field("roomName") @Description("房间名") roomName:String
	):  Flowable<T>


	@Description("HLS直播地址")
	@FormUrlEncoded
	@POST(Constants.API.HLS_PLAY_URLLIVE_STREAM_Url)
	fun <T:BaseResult<Void>> hlsPlayURLLiveStream(
		@Field("key") @Description("流名（非必须参数）") key:String?
	):  Flowable<T>


	@Description("禁播")
	@FormUrlEncoded
	@POST(Constants.API.DISABLE_STREAM_LIVE_STREAM_Url)
	fun <T:BaseResult<Void>> disableStreamLiveStream(
		@Field("disableKey") @Description("禁用的流名（非必须参数）") disableKey:String?,
		@Field("disabledTill") @Description("禁用时间（分钟）（非必须参数）") disabledTill:String?,
		@Field("disabledType") @Description("禁用类型（非必须参数）") disabledType:String?
	):  Flowable<T>


	@Description("列出所有流")
	@FormUrlEncoded
	@POST(Constants.API.LIST_RET_LIVE_STREAM_Url)
	fun <T:BaseResult<Void>> listRetLiveStream(
		@Field("limit") @Description("查询的数量（非必须参数）") limit:String?,
		@Field("marker") @Description("上一次查询返回的标记（非必须参数）") marker:String?
	):  Flowable<T>

}