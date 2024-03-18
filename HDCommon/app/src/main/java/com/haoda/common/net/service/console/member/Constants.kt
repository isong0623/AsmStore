package com.haoda.common.net.service.console.member

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("分页查询")
			const val PAGE_12_MEMBER_Url = "member/member/page";
			@Description("启用发布文章")
			const val START_PUBLISHER_MEMBER_Url = "member/member/startPublisher";
			@Description("停用发布文章")
			const val STOP_PUBLISHER_MEMBER_Url = "member/member/stopPublisher";
			@Description("详情")
			const val DETAIL_11_MEMBER_Url = "member/member/detail";
		}
	}
}
