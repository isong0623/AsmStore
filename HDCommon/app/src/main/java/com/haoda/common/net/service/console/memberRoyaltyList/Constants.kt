package com.haoda.common.net.service.console.memberRoyaltyList

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("分页查询下级用户")
			const val SUBORDINATE_PAGE_BYID_MEMBER_ROYALTY_LIST_Url = "memberRoyaltyList/memberRoyaltyList/subordinatePageById";
			@Description("分页查询")
			const val PAGE_13_MEMBER_ROYALTY_LIST_Url = "memberRoyaltyList/memberRoyaltyList/page";
		}
	}
}
