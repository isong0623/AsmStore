package com.haoda.common.net.service.mall.orderRefundApplay

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("撤销售后申请")
			const val REVOKE_REFUND_APPLAY_ORDER_REFUND_APPLAY_Url = "orderRefundApplay/orderRefundApplay/revokeRefundApplay";
			@Description("上传申请图片")
			const val UPLOAD_PIC_1ORDER_REFUND_APPLAY_Url = "orderRefundApplay/orderRefundApplay/uploadPic";
			@Description("提交售后申请")
			const val ORDER_REFUND_APPLAY_ORDER_REFUND_APPLAY_Url = "orderRefundApplay/orderRefundApplay/orderRefundApplay";
			@Description("批量上传申请图片")
			const val UPLOAD_PICS_1ORDER_REFUND_APPLAY_Url = "orderRefundApplay/orderRefundApplay/uploadPics";
			@Description("获取退货原因选择列表")
			const val GET_REFUND_REASON_SELECT_DATAORDER_REFUND_APPLAY_Url = "orderRefundApplay/orderRefundApplay/getRefundReasonSelectData";
			@Description("订单售后申请详细信息")
			const val DETAIL_1_ORDER_REFUND_APPLAY_Url = "orderRefundApplay/orderRefundApplay/detail";
			@Description("订单售后分页查询")
			const val APP_MEMBER_REFUND_PAGE_ORDER_REFUND_APPLAY_Url = "orderRefundApplay/orderRefundApplay/appMemberRefundPage";
			@Description("订单售后申请分页查询")
			const val APP_MEMBER_REFUND_APPLAY_PAGEORDER_REFUND_APPLAY_Url = "orderRefundApplay/orderRefundApplay/appMemberRefundApplayPage";
		}
	}
}
