package com.haoda.common.net.service.mall.memberSuggest

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("用户意见反馈")
			const val APP_SUGGEST_MEMBER_SUGGEST_Url = "memberSuggest/memberSuggest/appSuggest";
		}
	}
}
