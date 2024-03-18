package com.haoda.common.net.service.mall.member

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("修改个人信息")
			const val APP_UPDATE_MEMBER_MEMBER_Url = "member/member/appUpdateMember";
			@Description("上传头像")
			const val UPLOAD_ICON_MEMBER_Url = "member/member/uploadIcon";
			@Description("修改密码")
			const val APP_UPDATE_PASSWORD_MEMBER_Url = "member/member/appUpdatePassword";
			@Description("第一次设置密码")
			const val FIRST_SET_PASSWORD_MEMBER_Url = "member/member/firstSetPassword";
			@Description("我的订单")
			const val MY_ORDER_MEMBER_Url = "member/member/myOrder";
			@Description("获取当前用户")
			const val CURRENT_USER_MEMBER_Url = "member/member/currentUser";
		}
	}
}
