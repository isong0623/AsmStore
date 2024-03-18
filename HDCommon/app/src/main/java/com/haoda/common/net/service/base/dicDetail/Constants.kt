package com.haoda.common.net.service.base.dicDetail

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("删除")
			const val DELETE_1_DIC_DETAIL_Url = "dicDetail/dicDetail/delete";
			@Description("加载数据字典")
			const val LOAD_DIC_DIC_DETAIL_Url = "dicDetail/dicDetail/loadDic";
			@Description("添加")
			const val SAVE_1_DIC_DETAIL_Url = "dicDetail/dicDetail/save";
			@Description("分页查询")
			const val PAGE_1_DIC_DETAIL_Url = "dicDetail/dicDetail/page";
			@Description("修改")
			const val UPDATE_1_DIC_DETAIL_Url = "dicDetail/dicDetail/update";
		}
	}
}
