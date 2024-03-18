package com.haoda.common.net.service.console.exploreBanner

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("删除")
			const val DELETE_4_EXPLORE_BANNER_Url = "exploreBanner/exploreBanner/delete";
			@Description("添加")
			const val SAVE_4_EXPLORE_BANNER_Url = "exploreBanner/exploreBanner/save";
			@Description("分页查询")
			const val PAGE_5_EXPLORE_BANNER_Url = "exploreBanner/exploreBanner/page";
			@Description("停用")
			const val STOP_USE_1EXPLORE_BANNER_Url = "exploreBanner/exploreBanner/stopUse";
			@Description("上传图片")
			const val UPLOAD_PICTURE_2EXPLORE_BANNER_Url = "exploreBanner/exploreBanner/uploadPicture";
			@Description("修改")
			const val UPDATE_4_EXPLORE_BANNER_Url = "exploreBanner/exploreBanner/update";
			@Description("详情")
			const val DETAIL_4_EXPLORE_BANNER_Url = "exploreBanner/exploreBanner/detail";
			@Description("启用")
			const val START_USE_1EXPLORE_BANNER_Url = "exploreBanner/exploreBanner/startUse";
			@Description("上传图片")
			const val UPLOAD_HTML5_EXPLORE_BANNER_Url = "exploreBanner/exploreBanner/uploadHtml5";
		}
	}
}
