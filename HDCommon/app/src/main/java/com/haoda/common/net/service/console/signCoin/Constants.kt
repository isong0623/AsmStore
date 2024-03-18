package com.haoda.common.net.service.console.signCoin

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("删除签到配置")
			const val DELETE_21_SIGN_COIN_Url = "signCoin/signCoin/delete";
			@Description("添加签到配置")
			const val SAVE_24_SIGN_COIN_Url = "signCoin/signCoin/save";
			@Description("签到配置详情")
			const val DETAIL_28_SIGN_COIN_Url = "signCoin/signCoin/detail";
			@Description("签到配置list")
			const val LIST_7_SIGN_COIN_Url = "signCoin/signCoin/list";
			@Description("更新签到配置")
			const val UPDATE_24_SIGN_COIN_Url = "signCoin/signCoin/update";
			@Description("签到配置分页")
			const val PAGE_29_SIGN_COIN_Url = "signCoin/signCoin/page";
		}
	}
}
