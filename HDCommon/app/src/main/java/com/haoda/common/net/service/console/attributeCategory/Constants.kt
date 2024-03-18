package com.haoda.common.net.service.console.attributeCategory

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("更新属性分类")
			const val UPDATE_13_ATTRIBUTE_CATEGORY_Url = "attributeCategory/attributeCategory/update";
			@Description("属性分类分页")
			const val PAGE_19_ATTRIBUTE_CATEGORY_Url = "attributeCategory/attributeCategory/page";
			@Description("添加属性分类")
			const val SAVE_13_ATTRIBUTE_CATEGORY_Url = "attributeCategory/attributeCategory/save";
			@Description("属性分类list")
			const val LIST_1_ATTRIBUTE_CATEGORY_Url = "attributeCategory/attributeCategory/list";
			@Description("属性分类详情")
			const val DETAIL_17_ATTRIBUTE_CATEGORY_Url = "attributeCategory/attributeCategory/detail";
			@Description("删除属性分类")
			const val DELETE_12_ATTRIBUTE_CATEGORY_Url = "attributeCategory/attributeCategory/delete";
		}
	}
}
