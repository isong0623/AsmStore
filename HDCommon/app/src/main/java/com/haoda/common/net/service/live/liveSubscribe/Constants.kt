package com.haoda.common.net.service.live.liveSubscribe

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("取消关注")
			const val CANCEL_SUBSCRIBE_LIVE_SUBSCRIBE_Url = "liveSubscribe/liveSubscribe/cancelSubscribe";
			@Description("观众信息")
			const val VIEWER_INFO_LIVE_SUBSCRIBE_Url = "liveSubscribe/liveSubscribe/viewerInfo";
			@Description("关注")
			const val SUBSCRIBE_LIVE_SUBSCRIBE_Url = "liveSubscribe/liveSubscribe/subscribe";
			@Description("获取粉丝数/点赞数")
			const val GET_STREAMER_INFO_LIVE_SUBSCRIBE_Url = "liveSubscribe/liveSubscribe/getStreamerInfo";
		}
	}
}
