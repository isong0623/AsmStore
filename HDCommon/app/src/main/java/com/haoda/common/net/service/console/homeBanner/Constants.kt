package com.haoda.common.net.service.console.homeBanner

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("添加")
			const val SAVE_8_HOME_BANNER_Url = "homeBanner/homeBanner/save";
			@Description("详情")
			const val DETAIL_8_HOME_BANNER_Url = "homeBanner/homeBanner/detail";
			@Description("修改")
			const val UPDATE_8_HOME_BANNER_Url = "homeBanner/homeBanner/update";
			@Description("删除")
			const val DELETE_7_HOME_BANNER_Url = "homeBanner/homeBanner/delete";
			@Description("分页查询")
			const val PAGE_9_HOME_BANNER_Url = "homeBanner/homeBanner/page";
			@Description("停用")
			const val STOP_USE_3HOME_BANNER_Url = "homeBanner/homeBanner/stopUse";
			@Description("上传图片")
			const val UPLOAD_HTML5_1HOME_BANNER_Url = "homeBanner/homeBanner/uploadHtml5";
			@Description("上传图片")
			const val UPLOAD_PICTURE_4HOME_BANNER_Url = "homeBanner/homeBanner/uploadPicture";
			@Description("启用")
			const val START_USE_3HOME_BANNER_Url = "homeBanner/homeBanner/startUse";
		}
	}
}
