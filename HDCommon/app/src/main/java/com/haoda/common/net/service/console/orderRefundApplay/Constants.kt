package com.haoda.common.net.service.console.orderRefundApplay

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("详情")
			const val DETAIL_15_ORDER_REFUND_APPLAY_Url = "orderRefundApplay/orderRefundApplay/detail";
			@Description("申请拒绝")
			const val APPLAY_NOT_AGREE_ORDER_REFUND_APPLAY_Url = "orderRefundApplay/orderRefundApplay/applayNotAgree";
			@Description("申请通过")
			const val APPLAY_AGREE_ORDER_REFUND_APPLAY_Url = "orderRefundApplay/orderRefundApplay/applayAgree";
			@Description("分页查询")
			const val PAGE_17_ORDER_REFUND_APPLAY_Url = "orderRefundApplay/orderRefundApplay/page";
			@Description("同意退款")
			const val REFUND_AGREE_ORDER_REFUND_APPLAY_Url = "orderRefundApplay/orderRefundApplay/refundAgree";
			@Description("拒绝退款")
			const val REFUND_NOT_AGREE_ORDER_REFUND_APPLAY_Url = "orderRefundApplay/orderRefundApplay/refundNotAgree";
		}
	}
}
