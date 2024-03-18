package com.haoda.common.net.service.console.homePic

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("添加")
			const val SAVE_10_HOME_PIC_Url = "homePic/homePic/save";
			@Description("上传图片")
			const val UPLOAD_HTML5_3HOME_PIC_Url = "homePic/homePic/uploadHtml5";
			@Description("启用")
			const val START_USE_5HOME_PIC_Url = "homePic/homePic/startUse";
			@Description("修改")
			const val UPDATE_10_HOME_PIC_Url = "homePic/homePic/update";
			@Description("上传图片")
			const val UPLOAD_PICTURE_6HOME_PIC_Url = "homePic/homePic/uploadPicture";
			@Description("删除")
			const val DELETE_9_HOME_PIC_Url = "homePic/homePic/delete";
			@Description("停用")
			const val STOP_USE_5HOME_PIC_Url = "homePic/homePic/stopUse";
			@Description("详情")
			const val DETAIL_10_HOME_PIC_Url = "homePic/homePic/detail";
			@Description("分页查询")
			const val PAGE_11_HOME_PIC_Url = "homePic/homePic/page";
		}
	}
}
