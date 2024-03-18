package com.haoda.common.net.service.base.consoleLogin

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("登录")
			const val LOGIN_CONSOLE_LOGIN_Url = "consoleLogin/consoleLogin/login";
		}
	}
}
