package com.haoda.common.net.service.console.searchHot

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("分页查询")
			const val PAGE_28_SEARCH_HOT_Url = "searchHot/searchHot/page";
			@Description("修改")
			const val UPDATE_23_SEARCH_HOT_Url = "searchHot/searchHot/update";
			@Description("停用")
			const val STOP_USE_8SEARCH_HOT_Url = "searchHot/searchHot/stopUse";
			@Description("删除")
			const val DELETE_20_SEARCH_HOT_Url = "searchHot/searchHot/delete";
			@Description("详情")
			const val DETAIL_27_SEARCH_HOT_Url = "searchHot/searchHot/detail";
			@Description("添加")
			const val SAVE_23_SEARCH_HOT_Url = "searchHot/searchHot/save";
			@Description("启用")
			const val START_USE_8SEARCH_HOT_Url = "searchHot/searchHot/startUse";
		}
	}
}
