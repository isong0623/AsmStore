package com.haoda.common.net.service.console.homeLaber

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("停用")
			const val STOP_USE_4HOME_LABER_Url = "homeLaber/homeLaber/stopUse";
			@Description("启用")
			const val START_USE_4HOME_LABER_Url = "homeLaber/homeLaber/startUse";
			@Description("上传图片")
			const val UPLOAD_HTML5_2HOME_LABER_Url = "homeLaber/homeLaber/uploadHtml5";
			@Description("分页查询")
			const val PAGE_10_HOME_LABER_Url = "homeLaber/homeLaber/page";
			@Description("删除")
			const val DELETE_8_HOME_LABER_Url = "homeLaber/homeLaber/delete";
			@Description("上传图片")
			const val UPLOAD_PICTURE_5HOME_LABER_Url = "homeLaber/homeLaber/uploadPicture";
			@Description("添加")
			const val SAVE_9_HOME_LABER_Url = "homeLaber/homeLaber/save";
			@Description("详情")
			const val DETAIL_9_HOME_LABER_Url = "homeLaber/homeLaber/detail";
			@Description("修改")
			const val UPDATE_9_HOME_LABER_Url = "homeLaber/homeLaber/update";
		}
	}
}
