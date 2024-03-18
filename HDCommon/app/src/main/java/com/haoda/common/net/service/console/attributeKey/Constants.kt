package com.haoda.common.net.service.console.attributeKey

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("属性分页")
			const val PAGE_20_ATTRIBUTE_KEY_Url = "attributeKey/attributeKey/page";
			@Description("属性分类详情")
			const val DETAIL_18_ATTRIBUTE_KEY_Url = "attributeKey/attributeKey/detail";
			@Description("属性keylist")
			const val LIST_2_ATTRIBUTE_KEY_Url = "attributeKey/attributeKey/list";
			@Description("更新属性")
			const val UPDATE_14_ATTRIBUTE_KEY_Url = "attributeKey/attributeKey/update";
			@Description("删除属性")
			const val DELETE_13_ATTRIBUTE_KEY_Url = "attributeKey/attributeKey/delete";
			@Description("添加属性名key")
			const val SAVE_14_ATTRIBUTE_KEY_Url = "attributeKey/attributeKey/save";
		}
	}
}
