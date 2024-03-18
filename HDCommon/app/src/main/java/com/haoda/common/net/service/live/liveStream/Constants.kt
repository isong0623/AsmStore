package com.haoda.common.net.service.live.liveStream

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("RTMP推流地址")
			const val RTMP_PUBLISH_URLLIVE_STREAM_Url = "liveStream/liveStream/rtmpPublishURL";
			@Description("直播关注列表接口")
			const val FOLLOW_LIVE_STREAM_Url = "liveStream/liveStream/follow";
			@Description("直播分享小程序URL")
			const val LIVE_SHARE_URL_LIVE_STREAM_Url = "liveStream/liveStream/liveShareUrl";
			@Description("RTMP直播地址")
			const val RTMP_PLAY_URLLIVE_STREAM_Url = "liveStream/liveStream/rtmpPlayURL";
			@Description("查看推流历史")
			const val HISTORY_RECORD_LIVE_STREAM_Url = "liveStream/liveStream/historyRecord";
			@Description("查看直播状态")
			const val LIVE_STATUS_LIVE_STREAM_Url = "liveStream/liveStream/liveStatus";
			@Description("列出正在直播的流")
			const val LIST_LIVE_RET_LIVE_STREAM_Url = "liveStream/liveStream/listLiveRet";
			@Description("截图直播地址")
			const val SNAPSHOT_PLAY_URLLIVE_STREAM_Url = "liveStream/liveStream/snapshotPlayURL";
			@Description("上传封面")
			const val UPLOAD_PHOTO_LIVE_STREAM_Url = "liveStream/liveStream/uploadPhoto";
			@Description("HDL直播地址")
			const val HDL_PLAY_URLLIVE_STREAM_Url = "liveStream/liveStream/hdlPlayURL";
			@Description("获取直播鉴权")
			const val CREATE_STREAM_LIVE_STREAM_Url = "liveStream/liveStream/createStream";
			@Description("删除直播商品")
			const val DEL_LIVE_PRODUCTS_LIVE_STREAM_Url = "liveStream/liveStream/delLiveProducts";
			@Description("检查用户直播资格和鉴权key")
			const val QUALIFICATION_AND_ISEXIST_KEYLIVE_STREAM_Url = "liveStream/liveStream/qualificationAndIsExistKey";
			@Description("保存直播数据并获取作业id")
			const val SAVE_LIVE_DATA_RETID_LIVESTREAM_Url = "liveStream/liveStream/saveLiveDataRetId";
			@Description("保存直播数据")
			const val SAVE_LIVE_DATA_LIVE_STREAM_Url = "liveStream/liveStream/saveLiveData";
			@Description("直播分享")
			const val LIVE_SHARE_DATA_LIVE_STREAM_Url = "liveStream/liveStream/liveShare";
			@Description("启用流直播")
			const val ENABLE_STREAM_LIVE_STREAM_Url = "liveStream/liveStream/enableStream";
			@Description("保存直播间信息")
			const val SAVE_LIVE_ROOM_INFO_LIVESTREAM_Url = "liveStream/liveStream/saveLiveRoomInfo";
			@Description("HLS直播地址")
			const val HLS_PLAY_URLLIVE_STREAM_Url = "liveStream/liveStream/hlsPlayURL";
			@Description("禁播")
			const val DISABLE_STREAM_LIVE_STREAM_Url = "liveStream/liveStream/disableStream";
			@Description("列出所有流")
			const val LIST_RET_LIVE_STREAM_Url = "liveStream/liveStream/listRet";
		}
	}
}
