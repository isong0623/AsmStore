package com.haoda.common.net.service.base.permission

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("修改")
			const val UPDATE_3_PERMISSION_Url = "permission/permission/update";
			@Description("添加")
			const val SAVE_3_PERMISSION_Url = "permission/permission/save";
			@Description("分页查询")
			const val PAGE_3_PERMISSION_Url = "permission/permission/page";
			@Description("删除")
			const val DELETE_3_PERMISSION_Url = "permission/permission/delete";
			@Description("获取所有权限")
			const val LIST_PERMISSION_Url = "permission/permission/list";
			@Description("详情")
			const val DETAIL_1_PERMISSION_Url = "permission/permission/detail";
		}
	}
}
