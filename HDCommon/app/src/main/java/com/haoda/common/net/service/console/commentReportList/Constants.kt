package com.haoda.common.net.service.console.commentReportList

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("删除无效举报的记录")
			const val ONLY_DEL_REPORT_COMMENT_REPORT_LIST_Url = "commentReportList/commentReportList/onlyDelReport";
			@Description("删除被举报的评论")
			const val DEL_COMMENT_COMMENT_REPORT_LIST_Url = "commentReportList/commentReportList/delComment";
			@Description("分页查询举报内容")
			const val PAGE_2_COMMENT_REPORT_LIST_Url = "commentReportList/commentReportList/page";
		}
	}
}
