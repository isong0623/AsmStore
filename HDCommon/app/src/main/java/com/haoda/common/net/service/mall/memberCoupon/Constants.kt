package com.haoda.common.net.service.mall.memberCoupon

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("获取可领取优惠券列表")
			const val MEMBER_CAN_GET_LIST_MEMBER_COUPON_Url = "memberCoupon/memberCoupon/memberCanGetList";
			@Description("分页查询")
			const val MEMBER_PAGE_1MEMBER_COUPON_Url = "memberCoupon/memberCoupon/memberPage";
			@Description("领取优惠券")
			const val RECEIVE_COUPON_MEMBER_COUPON_Url = "memberCoupon/memberCoupon/receiveCoupon";
			@Description("根据id查询")
			const val QUERY_COUPON_BYID_MEMBER_COUPON_Url = "memberCoupon/memberCoupon/queryCouponById";
		}
	}
}
