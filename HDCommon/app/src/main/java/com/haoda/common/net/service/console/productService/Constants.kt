package com.haoda.common.net.service.console.productService

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("详情")
			const val DETAIL_20_PRODUCT_SERVICE_Url = "productService/productService/detail";
			@Description("分页查询")
			const val PAGE_22_PRODUCT_SERVICE_Url = "productService/productService/page";
			@Description("删除")
			const val DELETE_15_PRODUCT_SERVICE_Url = "productService/productService/delete";
			@Description("修改")
			const val UPDATE_16_PRODUCT_SERVICE_Url = "productService/productService/update";
			@Description("添加")
			const val SAVE_16_PRODUCT_SERVICE_Url = "productService/productService/save";
			@Description("获取所有")
			const val LIST_4_PRODUCT_SERVICE_Url = "productService/productService/list";
		}
	}
}
