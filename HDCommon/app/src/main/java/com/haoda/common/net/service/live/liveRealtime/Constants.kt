package com.haoda.common.net.service.live.liveRealtime

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("点赞")
			const val UPDATE_LIKE_NUM_LIVE_REALTIME_Url = "liveRealtime/liveRealtime/updateLikeNum";
			@Description("获取当前直播点赞数")
			const val GET_LIKE_NUM_LIVE_REALTIME_Url = "liveRealtime/liveRealtime/getLikeNum";
			@Description("直播结束保存带货记录并返回")
			const val UPDATELIVE_RECORD_LIVE_REALTIME_Url = "liveRealtime/liveRealtime/updateliveRecord";
			@Description("移除黑名单中的用户")
			const val REMOVE_BLACK_LIST_LIVE_REALTIME_Url = "liveRealtime/liveRealtime/removeBlackList";
			@Description("获取管理列表（黑名单列表，禁言列表）")
			const val GET_SUPERVISE_LIST_LIVE_REALTIME_Url = "liveRealtime/liveRealtime/getSuperviseList";
			@Description("搜索直播间中观众")
			const val SEARCH_VIEWER_LIVE_REALTIME_Url = "liveRealtime/liveRealtime/searchViewer";
			@Description("获取直播间观众列表")
			const val GET_VIEWER_LIST_LIVE_REALTIME_Url = "liveRealtime/liveRealtime/getViewerList";
		}
	}
}
