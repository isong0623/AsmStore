package com.haoda.common.net.service.base.dicType

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("分页查询")
			const val PAGE_2_DIC_TYPE_Url = "dicType/dicType/page";
			@Description("添加")
			const val SAVE_2_DIC_TYPE_Url = "dicType/dicType/save";
			@Description("修改")
			const val UPDATE_2_DIC_TYPE_Url = "dicType/dicType/update";
			@Description("删除")
			const val DELETE_2_DIC_TYPE_Url = "dicType/dicType/delete";
		}
	}
}
