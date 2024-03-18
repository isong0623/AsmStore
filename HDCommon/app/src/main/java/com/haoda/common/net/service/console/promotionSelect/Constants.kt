package com.haoda.common.net.service.console.promotionSelect

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("修改")
			const val UPDATE_20_PROMOTION_SELECT_Url = "promotionSelect/promotionSelect/update";
			@Description("获取以选择商品id列表")
			const val GET_SELECTED_PRODECT_IDS_3_PROMOTION_SELECT_Url = "promotionSelect/promotionSelect/getSelectedProdectIds";
			@Description("详情")
			const val DETAIL_24_PROMOTION_SELECT_Url = "promotionSelect/promotionSelect/detail";
			@Description("添加")
			const val SAVE_20_PROMOTION_SELECT_Url = "promotionSelect/promotionSelect/save";
			@Description("分页查询")
			const val PAGE_26_PROMOTION_SELECT_Url = "promotionSelect/promotionSelect/page";
			@Description("删除")
			const val DELETE_18_PROMOTION_SELECT_Url = "promotionSelect/promotionSelect/delete";
			@Description("设置商品")
			const val SET_PRODUCTS_3PROMOTION_SELECT_Url = "promotionSelect/promotionSelect/setProducts";
		}
	}
}
