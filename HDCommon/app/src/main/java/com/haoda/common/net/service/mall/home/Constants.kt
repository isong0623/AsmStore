package com.haoda.common.net.service.mall.home

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("获取APP轮播图")
			const val GET_APP_BANNER_HOME_Url = "home/home/getAppBanner";
			@Description("获取优选尖货")
			const val GET_PROMOTION_SELECT_HOME_Url = "home/home/getPromotionSelect";
			@Description("获取热卖商品")
			const val GET_PROMOTION_HOT_HOME_Url = "home/home/getPromotionHot";
			@Description("获取APP首页广告图")
			const val GET_APP_HOME_PICHOME_Url = "home/home/getAppHomePic";
			@Description("获取APP标签")
			const val GET_APP_LABER_HOME_Url = "home/home/getAppLaber";
			@Description("增加分享次数")
			const val ADD_SHARE_NUM_HOME_Url = "home/home/addShareNum";
			@Description("获取每日推荐")
			const val GET_PROMOTION_DAILY_HOME_Url = "home/home/getPromotionDaily";
		}
	}
}
