package com.haoda.common.net.service.lucky.service

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("后台分页查询")
			const val LIST_SERVICE_Url = "service/service/prize/page";
			@Description("根据id查详情")
			const val DETAIL_BY_IDSERVICE_Url = "service/service/prizeLog/detailById";
			@Description("修改")
			const val UPDATE_SERVICE_Url = "service/service/prize/update";
			@Description("首窗展示")
			const val FIRST_SHOW_SERVICE_Url = "service/service/prize/firstShow";
			@Description("发货")
			const val UPDATE2_SERVICE_Url = "service/service/prizeLog/delivery";
			@Description("分页查询")
			const val LIST_2_SERVICE_Url = "service/service/prizeLog/page";
			@Description("按奖品大小类型查询list")
			const val LIST_1_SERVICE_Url = "service/service/prize/list";
			@Description("奖品-立即兑换-下单")
			const val UPDATE1_SERVICE_Url = "service/service/prizeLog/got";
			@Description("添加")
			const val SAVE_SERVICE_Url = "service/service/prize/save";
			@Description("js支付结果通知")
			const val JS_PAY_RESULT_SERVICE_Url = "service/service/prizeLog/payNotify";
			@Description("用户兑换记录分页查询")
			const val LIST1_SERVICE_Url = "service/service/prizeLog/pageGot";
			@Description("幸运大抽奖")
			const val DRAW_PRIZE_SERVICE_Url = "service/service/prize/draw";
			@Description("删除")
			const val DELETE_SERVICE_Url = "service/service/prize/delete";
			@Description("用户中奖记录分页查询")
			const val LIST5_SERVICE_Url = "service/service/prizeLog/pageGotBack";
		}
	}
}
