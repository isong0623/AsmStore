package com.haoda.common.net.service.mall.coinTask

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("7天连续签到记录")
			const val SIGN_LOG_COIN_TASK_Url = "coinTask/coinTask/signLog";
			@Description("获取团子任务列表")
			const val GET_APP_COIN_TASK_LISTCOIN_TASK_Url = "coinTask/coinTask/getAppCoinTaskList";
			@Description("完成任务")
			const val COMPLETE_COIN_TASK_Url = "coinTask/coinTask/complete";
		}
	}
}
