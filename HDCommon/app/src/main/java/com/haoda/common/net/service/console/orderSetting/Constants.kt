package com.haoda.common.net.service.console.orderSetting

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("添加")
			const val SAVE_12_ORDER_SETTING_Url = "orderSetting/orderSetting/save";
			@Description("分页查询")
			const val PAGE_18_ORDER_SETTING_Url = "orderSetting/orderSetting/page";
			@Description("详情")
			const val DETAIL_16_ORDER_SETTING_Url = "orderSetting/orderSetting/detail";
			@Description("删除")
			const val DELETE_11_ORDER_SETTING_Url = "orderSetting/orderSetting/delete";
			@Description("修改")
			const val UPDATE_12_ORDER_SETTING_Url = "orderSetting/orderSetting/update";
		}
	}
}
