package com.haoda.common.net.service.console.order

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("订单详细信息")
			const val DETAIL_13_ORDER_Url = "order/order/detail";
			@Description("订单快递信息")
			const val ORDER_EXPRESS_INFO_ORDER_Url = "order/order/orderExpressInfo";
			@Description("订单快递信息")
			const val UPDATE_ORDER_DELIVERY_ORDER_Url = "order/order/updateOrderDelivery";
			@Description("分页查询")
			const val PAGE_15_ORDER_Url = "order/order/page";
			@Description("订单发货")
			const val ORDER_DELIVER_ORDER_Url = "order/order/orderDeliver";
		}
	}
}
