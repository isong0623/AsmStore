package com.haoda.common.net.service.console.memberAnalysis

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("会员概况")
			const val MEMBER_OVERVIEW_MEMBER_ANALYSIS_Url = "memberAnalysis/memberAnalysis/memberOverview";
			@Description("新增会员总数")
			const val NEW_ADD_SUM_MEMBER_ANALYSIS_Url = "memberAnalysis/memberAnalysis/newAddSum";
			@Description("会员总数")
			const val MEMBER_SUM_MEMBER_ANALYSIS_Url = "memberAnalysis/memberAnalysis/memberSum";
		}
	}
}
