package com.haoda.common.net.service.base.user

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("添加")
			const val SAVE_6_USER_Url = "user/user/save";
			@Description("获取角色")
			const val RANGE_ROLES_1USER_Url = "user/user/getRoles";
			@Description("删除")
			const val DELETE_6_USER_Url = "user/user/delete";
			@Description("详情")
			const val DETAIL_3_USER_Url = "user/user/detail";
			@Description("分配角色")
			const val RANGE_ROLES_USER_Url = "user/user/rangeRoles";
			@Description("修改")
			const val UPDATE_6_USER_Url = "user/user/update";
			@Description("分页查询")
			const val PAGE_6_USER_Url = "user/user/page";
			@Description("重置密码")
			const val DETAIL_2_USER_Url = "user/user/resetPassword";
		}
	}
}
