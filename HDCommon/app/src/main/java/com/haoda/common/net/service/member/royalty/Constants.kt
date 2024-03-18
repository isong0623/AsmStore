package com.haoda.common.net.service.member.royalty

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("获取用户粉丝全部数据")
			const val FIND_MEMBER_IDBY_FANS_ROYALTY_Url = "royalty/royalty/getMemberFans";
			@Description("获取用户提现历史记录")
			const val GET_MEMBER_WITHDRAW_ROYALTY_Url = "royalty/royalty/getMemberWithdraw";
			@Description("月度概况")
			const val MONTHLY_SURVEY_ROYALTY_Url = "royalty/royalty/monthlySurvey";
			@Description("根据用户ID获取银行卡列表信息")
			const val GET_MEMBER_BANK_ROYALTY_Url = "royalty/royalty/getMemberBank";
			@Description("保存新的银行卡信息")
			const val SAVE_MEMBER_BANK_ROYALTY_Url = "royalty/royalty/saveMemberBank";
			@Description("今日/昨日概况")
			const val DAY_SURVEY_ROYALTY_Url = "royalty/royalty/daySurvey";
			@Description("我的收益")
			const val MY_PROFIT_ROYALTY_Url = "royalty/royalty/myProfit";
			@Description("验证用户是否微信授权")
			const val WECHAT_AUTHORIZATION_ROYALTY_Url = "royalty/royalty/wechatAuthorization";
			@Description("获取用户粉丝当日数据")
			const val FIND_MEMBER_IDBY_DAYFANS_ROYALTY_Url = "royalty/royalty/getMemberDayFans";
			@Description("账单明细")
			const val BILLDETAILS_ROYALTY_Url = "royalty/royalty/billdetails";
			@Description("直播收益详情")
			const val LIVE_PROFIT_DETAIL_ROYALTY_Url = "royalty/royalty/liveProfitDetail";
			@Description("获取用户首页分销数据")
			const val FIND_MEMBER_IDBY_LOGROYALTY_Url = "royalty/royalty/getMemberRoyalty";
			@Description("支付成功添加分销订单记录")
			const val SAVE_RECORD_ROYALTY_Url = "royalty/royalty/saveRecord";
			@Description("获取用户分销基础数据/可提现余额")
			const val DETAIL_ROYALTY_Url = "royalty/royalty/getMemberRoyaltydetail";
			@Description("提现-提现余额")
			const val GET_POSTAL_CASH_ROYALTY_Url = "royalty/royalty/getPostalCash";
			@Description("获取用户分销数据")
			const val FIND_MEMBER_IDBY_LOGDETAILS_ROYALTY_Url = "royalty/royalty/getMemberRoyaltyDetails";
			@Description("查询用户分销体系(没有则添加)")
			const val SAVE_MEMBER_ROYALTY_Url = "royalty/royalty/qMemberRoyalty";
			@Description("获取直播记录")
			const val GETLIVE_RECORD_ROYALTY_Url = "royalty/royalty/getliveRecord";
		}
	}
}
