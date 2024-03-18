package com.haoda.common.net.service.console.messageCenter

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("消息推送")
			const val PUSH_MESSAGE_MESSAGE_CENTER_Url = "messageCenter/messageCenter/push";
			@Description("优惠活动推送")
			const val PUSH_PROMOTION_MESSAGE_CENTER_Url = "messageCenter/messageCenter/pushPromotion";
		}
	}
}
