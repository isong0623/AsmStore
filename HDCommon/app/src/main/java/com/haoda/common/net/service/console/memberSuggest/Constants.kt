package com.haoda.common.net.service.console.memberSuggest

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("分页查询")
			const val PAGE_14_MEMBER_SUGGEST_Url = "memberSuggest/memberSuggest/page";
			@Description("详情")
			const val DETAIL_12_MEMBER_SUGGEST_Url = "memberSuggest/memberSuggest/detail";
		}
	}
}
