package com.haoda.common.net.service.mall.search

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("获取热门搜索")
			const val APP_GET_SEARCH_HOTSEARCH_Url = "search/search/appGetSearchHot";
			@Description("搜索商品")
			const val SEARCH_SEARCH_Url = "search/search/search";
		}
	}
}
