package com.haoda.common.net.service.base.consoleIndex

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("修改密码")
			const val UPDATE_PASSWORD_CONSOLE_INDEX_Url = "consoleIndex/consoleIndex/updatePassword";
			@Description("获取登录用户")
			const val CURRENT_USER_CONSOLE_INDEX_Url = "consoleIndex/consoleIndex/currentUser";
			@Description("退出")
			const val LOGOUT_CONSOLE_INDEX_Url = "consoleIndex/consoleIndex/logout";
			@Description("获取菜单")
			const val MENU_CONSOLE_INDEX_Url = "consoleIndex/consoleIndex/menu";
			@Description("获取当前用户权限")
			const val GET_CURRENT_USER_PERMISSIONS_CONSOLE_INDEX_Url = "consoleIndex/consoleIndex/getCurrentUserPermissions";
		}
	}
}
