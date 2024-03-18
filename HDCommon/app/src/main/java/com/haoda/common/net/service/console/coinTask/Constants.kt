package com.haoda.common.net.service.console.coinTask

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("删除")
			const val DELETE_1_COIN_TASK_Url = "coinTask/coinTask/delete";
			@Description("分页查询")
			const val PAGE_1_COIN_TASK_Url = "coinTask/coinTask/page";
			@Description("详情")
			const val DETAIL_1_COIN_TASK_Url = "coinTask/coinTask/detail";
			@Description("添加")
			const val SAVE_1_COIN_TASK_Url = "coinTask/coinTask/save";
			@Description("修改")
			const val UPDATE_1_COIN_TASK_Url = "coinTask/coinTask/update";
		}
	}
}
