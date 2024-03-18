package com.haoda.common.net.service.base.role

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("查询所有")
			const val LIST_1_ROLE_Url = "role/role/list";
			@Description("修改")
			const val UPDATE_4_ROLE_Url = "role/role/update";
			@Description("分配权限")
			const val RANGE_PERMISSIONS_ROLE_Url = "role/role/rangePermissions";
			@Description("分页查询")
			const val PAGE_4_ROLE_Url = "role/role/page";
			@Description("获取权限")
			const val GET_PERMISSIONS_ROLE_Url = "role/role/getPermissions";
			@Description("删除")
			const val DELETE_4_ROLE_Url = "role/role/delete";
			@Description("添加")
			const val SAVE_4_ROLE_Url = "role/role/save";
		}
	}
}
