package com.haoda.common.net.service.mall.category

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("商品分类详细信息")
			const val LEVEL_DETAIL_CATEGORY_Url = "category/category/levelDetail";
			@Description("分页获取商品信息")
			const val PRODUCT_PAGE_CATEGORY_Url = "category/category/productPage";
			@Description("获取其他商品分类")
			const val GET_OTHER_CATEGORY_CATEGORY_Url = "category/category/getOtherCategory";
		}
	}
}
