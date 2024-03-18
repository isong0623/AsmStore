package com.haoda.common.net.service.console.expressCompany

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("修改")
			const val UPDATE_6_EXPRESS_COMPANY_Url = "expressCompany/expressCompany/update";
			@Description("详情")
			const val DETAIL_6_EXPRESS_COMPANY_Url = "expressCompany/expressCompany/detail";
			@Description("停用")
			const val STOP_USE_2EXPRESS_COMPANY_Url = "expressCompany/expressCompany/stopUse";
			@Description("分页查询")
			const val PAGE_7_EXPRESS_COMPANY_Url = "expressCompany/expressCompany/page";
			@Description("添加")
			const val SAVE_6_EXPRESS_COMPANY_Url = "expressCompany/expressCompany/save";
			@Description("获取选择列表")
			const val GET_SELECT_LIST_EXPRESS_COMPANY_Url = "expressCompany/expressCompany/getSelectList";
			@Description("启用")
			const val START_USE_2EXPRESS_COMPANY_Url = "expressCompany/expressCompany/startUse";
			@Description("删除")
			const val DELETE_5_EXPRESS_COMPANY_Url = "expressCompany/expressCompany/delete";
		}
	}
}
