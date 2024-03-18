package com.haoda.common.net.service.mall.productShare

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("获取商品分享信息")
			const val SHARE_PRODUCT_SHARE_Url = "productShare/productShare/share";
			@Description("分享成功")
			const val SHARE_SUCCESS_PRODUCT_SHARE_Url = "productShare/productShare/shareSuccess";
		}
	}
}
