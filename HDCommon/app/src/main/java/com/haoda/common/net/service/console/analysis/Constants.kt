package com.haoda.common.net.service.console.analysis

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("新增订单金额")
			const val NEW_ADD_SUM_1_ANALYSIS_Url = "analysis/analysis/newAddSum";
			@Description("新增订单数量统计")
			const val NEW_ADD_NUM_ANALYSIS_Url = "analysis/analysis/newAddNum";
			@Description("新增订单人数")
			const val NEW_ADD_CONSUMER_ANALYSIS_Url = "analysis/analysis/newAddConsumer";
			@Description("已完成订单人数")
			const val DONE_CONSUMER_ANALYSIS_Url = "analysis/analysis/doneConsumer";
			@Description("已完成订单")
			const val DONE_NUM_ANALYSIS_Url = "analysis/analysis/doneNum";
			@Description("订单概况")
			const val OVERVIEW_ANALYSIS_Url = "analysis/analysis/overview";
			@Description("订单实时数据")
			const val ORDERS_ANALYSIS_Url = "analysis/analysis/orders";
			@Description("已完成订单金额")
			const val DONE_SUM_ANALYSIS_Url = "analysis/analysis/doneSum";
		}
	}
}
