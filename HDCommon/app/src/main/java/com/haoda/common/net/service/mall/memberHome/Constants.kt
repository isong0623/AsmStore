package com.haoda.common.net.service.mall.memberHome

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("\"我的\"页面数量加载接口")
			const val MEMBER_HOME_INDEX_MEMBER_HOME_Url = "memberHome/memberHome/memberHomeIndex";
		}
	}
}
