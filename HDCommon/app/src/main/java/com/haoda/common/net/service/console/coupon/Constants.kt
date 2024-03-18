package com.haoda.common.net.service.console.coupon

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("修改")
			const val UPDATE_2_COUPON_Url = "coupon/coupon/update";
			@Description("添加")
			const val SAVE_2_COUPON_Url = "coupon/coupon/save";
			@Description("启用")
			const val START_USE_COUPON_Url = "coupon/coupon/startUse";
			@Description("详情")
			const val DETAIL_2_COUPON_Url = "coupon/coupon/detail";
			@Description("停用")
			const val STOP_USE_COUPON_Url = "coupon/coupon/stopUse";
			@Description("分页查询")
			const val PAGE_3_COUPON_Url = "coupon/coupon/page";
			@Description("获取推送的优惠卷")
			const val GET_COUPON_BYTYPE_COUPON_Url = "coupon/coupon/getCouponByType";
			@Description("删除")
			const val DELETE_2_COUPON_Url = "coupon/coupon/delete";
		}
	}
}
