package com.haoda.common.net.service.exploreconsole.exploreConsoleLogin

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("退出")
			const val LOGOUT_EXPLORE_CONSOLE_LOGIN_Url = "exploreConsoleLogin/exploreConsoleLogin/logout";
			@Description("登录")
			const val LOGIN_EXPLORE_CONSOLE_LOGIN_Url = "exploreConsoleLogin/exploreConsoleLogin/login";
			@Description("获取登录用户")
			const val CURRENT_USER_EXPLORE_CONSOLE_LOGIN_Url = "exploreConsoleLogin/exploreConsoleLogin/currentUser";
		}
	}
}
