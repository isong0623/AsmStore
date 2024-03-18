package com.haoda.common.net.service.console.promotion

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("详情")
			const val DETAIL_22_PROMOTION_Url = "promotion/promotion/detail";
			@Description("设置商品")
			const val SET_PRODUCTS_1PROMOTION_Url = "promotion/promotion/setProducts";
			@Description("分页查询")
			const val PAGE_24_PROMOTION_Url = "promotion/promotion/page";
			@Description("添加")
			const val SAVE_18_PROMOTION_Url = "promotion/promotion/save";
			@Description("获取以选择商品id列表")
			const val GET_SELECTED_PRODECT_IDS_1_PROMOTION_Url = "promotion/promotion/getSelectedProdectIds";
			@Description("修改")
			const val UPDATE_18_PROMOTION_Url = "promotion/promotion/update";
		}
	}
}
