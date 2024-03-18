package com.haoda.common.net.service.console.rate

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("详情")
			const val DETAIL_25_RATE_Url = "rate/rate/detail";
			@Description("详情")
			const val SAVE_21_RATE_Url = "rate/rate/save";
			@Description("获取所有比率")
			const val LIST_6_RATE_Url = "rate/rate/list";
			@Description("编辑")
			const val UPDATE_21_RATE_Url = "rate/rate/update";
		}
	}
}
