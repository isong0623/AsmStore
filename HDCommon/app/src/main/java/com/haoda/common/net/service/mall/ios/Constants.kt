package com.haoda.common.net.service.mall.ios

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("ios展示标识")
			const val IOS_SHOW_IOS_Url = "ios/ios/iosShow";
			@Description("ios更新信息")
			const val IOS_UPDATE_IOS_Url = "ios/ios/iosUpdate";
		}
	}
}
