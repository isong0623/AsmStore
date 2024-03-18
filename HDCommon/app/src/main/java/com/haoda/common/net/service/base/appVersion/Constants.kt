package com.haoda.common.net.service.base.appVersion

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("版本更新")
			const val UPDATE_APP_VERSION_Url = "appVersion/appVersion/update";
			@Description("版本删除")
			const val DELETE_APP_VERSION_Url = "appVersion/appVersion/delete";
			@Description("版本保存")
			const val SAVE_APP_VERSION_Url = "appVersion/appVersion/save";
			@Description("版本详情后台维护用")
			const val DETAIL_APP_VERSION_Url = "appVersion/appVersion/detail";
			@Description("分页查询")
			const val PAGE_APP_VERSION_Url = "appVersion/appVersion/page";
		}
	}
}
