package com.haoda.common.net.service.mall.memberCollect

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("分页查询")
			const val MEMBER_PAGE_MEMBER_COLLECT_Url = "memberCollect/memberCollect/memberPage";
			@Description("取消收藏")
			const val MEMBER_CANCEL_COLLECT_MEMBER_COLLECT_Url = "memberCollect/memberCollect/memberCancelCollect";
			@Description("获取用户收藏商品数量")
			const val MEMBER_COUNT_MEMBER_COLLECT_Url = "memberCollect/memberCollect/memberCount";
			@Description("收藏商品")
			const val MEMBER_COLLECT_MEMBER_COLLECT_Url = "memberCollect/memberCollect/memberCollect";
			@Description("批量取消收藏")
			const val MEMBER_CANCEL_COLLECT_BATCH_MEMBER_COLLECT_Url = "memberCollect/memberCollect/memberCancelCollectBatch";
		}
	}
}
