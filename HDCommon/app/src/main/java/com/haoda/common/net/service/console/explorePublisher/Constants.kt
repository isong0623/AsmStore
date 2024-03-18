package com.haoda.common.net.service.console.explorePublisher

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("添加")
			const val SAVE_5_EXPLORE_PUBLISHER_Url = "explorePublisher/explorePublisher/save";
			@Description("上传图片")
			const val UPLOAD_PICTURE_3EXPLORE_PUBLISHER_Url = "explorePublisher/explorePublisher/uploadPicture";
			@Description("修改")
			const val UPDATE_5_EXPLORE_PUBLISHER_Url = "explorePublisher/explorePublisher/update";
			@Description("分页查询")
			const val PAGE_6_EXPLORE_PUBLISHER_Url = "explorePublisher/explorePublisher/page";
			@Description("详情")
			const val DETAIL_5_EXPLORE_PUBLISHER_Url = "explorePublisher/explorePublisher/detail";
		}
	}
}
