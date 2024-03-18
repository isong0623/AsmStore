package com.haoda.common.net.service.console.productTag

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("修改")
			const val UPDATE_17_PRODUCT_TAG_Url = "productTag/productTag/update";
			@Description("添加")
			const val SAVE_17_PRODUCT_TAG_Url = "productTag/productTag/save";
			@Description("获取列表")
			const val LIST_5_PRODUCT_TAG_Url = "productTag/productTag/list";
			@Description("删除")
			const val DELETE_16_PRODUCT_TAG_Url = "productTag/productTag/delete";
			@Description("分页查询")
			const val PAGE_23_PRODUCT_TAG_Url = "productTag/productTag/page";
			@Description("详情")
			const val DETAIL_21_PRODUCT_TAG_Url = "productTag/productTag/detail";
		}
	}
}
