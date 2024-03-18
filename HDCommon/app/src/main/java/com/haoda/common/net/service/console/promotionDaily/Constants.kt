package com.haoda.common.net.service.console.promotionDaily

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("设置商品")
			const val SET_PRODUCTS_2PROMOTION_DAILY_Url = "promotionDaily/promotionDaily/setProducts";
			@Description("启用")
			const val START_USE_6PROMOTION_DAILY_Url = "promotionDaily/promotionDaily/startUse";
			@Description("修改")
			const val UPDATE_19_PROMOTION_DAILY_Url = "promotionDaily/promotionDaily/update";
			@Description("上传图片")
			const val UPLOAD_PICTURE_8PROMOTION_DAILY_Url = "promotionDaily/promotionDaily/uploadPicture";
			@Description("删除")
			const val DELETE_17_PROMOTION_DAILY_Url = "promotionDaily/promotionDaily/delete";
			@Description("获取以选择商品id列表")
			const val GET_SELECTED_PRODECT_IDS_2_PROMOTION_DAILY_Url = "promotionDaily/promotionDaily/getSelectedProdectIds";
			@Description("详情")
			const val DETAIL_23_PROMOTION_DAILY_Url = "promotionDaily/promotionDaily/detail";
			@Description("添加")
			const val SAVE_19_PROMOTION_DAILY_Url = "promotionDaily/promotionDaily/save";
			@Description("分页查询")
			const val PAGE_25_PROMOTION_DAILY_Url = "promotionDaily/promotionDaily/page";
			@Description("停用")
			const val STOP_USE_6PROMOTION_DAILY_Url = "promotionDaily/promotionDaily/stopUse";
		}
	}
}
