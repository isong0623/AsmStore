package com.haoda.common.net.service.console.refundReason

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("修改")
			const val UPDATE_22_REFUND_REASON_Url = "refundReason/refundReason/update";
			@Description("启用")
			const val START_USE_7REFUND_REASON_Url = "refundReason/refundReason/startUse";
			@Description("详情")
			const val DETAIL_26_REFUND_REASON_Url = "refundReason/refundReason/detail";
			@Description("停用")
			const val STOP_USE_7REFUND_REASON_Url = "refundReason/refundReason/stopUse";
			@Description("添加")
			const val SAVE_22_REFUND_REASON_Url = "refundReason/refundReason/save";
			@Description("删除")
			const val DELETE_19_REFUND_REASON_Url = "refundReason/refundReason/delete";
			@Description("分页查询")
			const val PAGE_27_REFUND_REASON_Url = "refundReason/refundReason/page";
		}
	}
}
