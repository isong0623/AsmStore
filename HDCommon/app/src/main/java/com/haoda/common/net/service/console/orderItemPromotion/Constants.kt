package com.haoda.common.net.service.console.orderItemPromotion

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("详情")
			const val DETAIL_14_ORDER_ITEM_PROMOTION_Url = "orderItemPromotion/orderItemPromotion/detail";
			@Description("修改")
			const val UPDATE_11_ORDER_ITEM_PROMOTION_Url = "orderItemPromotion/orderItemPromotion/update";
			@Description("删除")
			const val DELETE_10_ORDER_ITEM_PROMOTION_Url = "orderItemPromotion/orderItemPromotion/delete";
			@Description("分页查询")
			const val PAGE_16_ORDER_ITEM_PROMOTION_Url = "orderItemPromotion/orderItemPromotion/page";
			@Description("添加")
			const val SAVE_11_ORDER_ITEM_PROMOTION_Url = "orderItemPromotion/orderItemPromotion/save";
		}
	}
}
