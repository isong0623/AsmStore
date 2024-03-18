package com.haoda.common.net.service.base.systemConfig

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("删除")
			const val DELETE_5_SYSTEM_CONFIG_Url = "systemConfig/systemConfig/delete";
			@Description("分页查询")
			const val PAGE_5_SYSTEM_CONFIG_Url = "systemConfig/systemConfig/page";
			@Description("添加")
			const val SAVE_5_SYSTEM_CONFIG_Url = "systemConfig/systemConfig/save";
			@Description("修改")
			const val UPDATE_5_SYSTEM_CONFIG_Url = "systemConfig/systemConfig/update";
		}
	}
}
