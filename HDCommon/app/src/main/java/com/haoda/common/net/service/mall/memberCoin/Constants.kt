package com.haoda.common.net.service.mall.memberCoin

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("用户我的团子值接口")
			const val GOLD_INDEX_MEMBER_COIN_Url = "memberCoin/memberCoin/goldIndex";
			@Description("用户我的米粉值接口")
			const val COPPER_INDEX_MEMBER_COIN_Url = "memberCoin/memberCoin/copperIndex";
			@Description("分页获取米粉值交易明细")
			const val MEMBER_COPPER_LOG_PAGE_MEMBER_COIN_Url = "memberCoin/memberCoin/memberCopperLogPage";
			@Description("米粉值兑换团子")
			const val COPPER_TO_GOLD_MEMBER_COIN_Url = "memberCoin/memberCoin/copperToGold";
			@Description("分页获取团子值交易明细")
			const val MEMBER_GOLD_LOG_PAGE_MEMBER_COIN_Url = "memberCoin/memberCoin/memberGoldLogPage";
		}
	}
}
