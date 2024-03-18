package com.haoda.common.net.service.console.feightTemplate

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("修改")
			const val UPDATE_7_FEIGHT_TEMPLATE_Url = "feightTemplate/feightTemplate/update";
			@Description("分页查询")
			const val PAGE_8_FEIGHT_TEMPLATE_Url = "feightTemplate/feightTemplate/page";
			@Description("获取所有")
			const val LIST_FEIGHT_TEMPLATE_Url = "feightTemplate/feightTemplate/list";
			@Description("删除")
			const val DELETE_6_FEIGHT_TEMPLATE_Url = "feightTemplate/feightTemplate/delete";
			@Description("详情")
			const val DETAIL_7_FEIGHT_TEMPLATE_Url = "feightTemplate/feightTemplate/detail";
			@Description("添加")
			const val SAVE_7_FEIGHT_TEMPLATE_Url = "feightTemplate/feightTemplate/save";
		}
	}
}
