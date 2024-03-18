package com.haoda.common.net.service.mall.appraise

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("分页查询")
			const val PAGE_APPRAISE_Url = "appraise/appraise/page";
		}
	}
}
