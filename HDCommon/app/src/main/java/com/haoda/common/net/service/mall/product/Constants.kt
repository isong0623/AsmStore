package com.haoda.common.net.service.mall.product

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("获取商品-VIP列表")
			const val GET_VIP_LIST_PRODUCT_Url = "product/product/getVipList";
			@Description("商品详情")
			const val DETAIL_2_PRODUCT_Url = "product/product/detail";
		}
	}
}
