package com.haoda.common.net.service.mall.memberAppraise

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("批量上传评价图片")
			const val UPLOAD_PICS_MEMBER_APPRAISE_Url = "memberAppraise/memberAppraise/uploadPics";
			@Description("已评价商品分页查询")
			const val GET_MEMBER_APPRAISED_PAGE_MEMBER_APPRAISE_Url = "memberAppraise/memberAppraise/getMemberAppraisedPage";
			@Description("商品评价")
			const val APP_SAVE_1MEMBER_APPRAISE_Url = "memberAppraise/memberAppraise/appSave";
			@Description("上传评价图片")
			const val UPLOAD_PIC_MEMBER_APPRAISE_Url = "memberAppraise/memberAppraise/uploadPic";
			@Description("未评价商品分页查询")
			const val GET_MEMBER_NOT_APPRAISE_PAGEMEMBER_APPRAISE_Url = "memberAppraise/memberAppraise/getMemberNotAppraisePage";
		}
	}
}
