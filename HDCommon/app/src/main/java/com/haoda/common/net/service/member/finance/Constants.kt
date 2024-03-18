package com.haoda.common.net.service.member.finance

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("银行卡对账状态")
			const val AUDIT_STATUS_FINANCE_Url = "finance/finance/auditStatus";
			@Description("财务对账数据")
			const val RECONCILIATION_MANAGEMENT_FINANCE_Url = "finance/finance/reconciliationManagement";
			@Description("微信对账状态")
			const val WECHAT_AUDIT_STATUS_FINANCE_Url = "finance/finance/wechatAuditStatus";
		}
	}
}
