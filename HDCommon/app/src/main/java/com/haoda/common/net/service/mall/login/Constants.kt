package com.haoda.common.net.service.mall.login

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("更新token")
			const val PASSWORD_LOGIN_1LOGIN_Url = "login/login/refreshToken";
			@Description("微信新登录")
			const val WECHART_NEW_LOGIN_LOGIN_Url = "login/login/wechartNewLogin";
			@Description("发送验证码")
			const val SEND_AUTH_CODE_LOGIN_Url = "login/login/sendAuthCode";
			@Description("手机验证码登录")
			const val AUTH_CODE_LOGIN_LOGIN_Url = "login/login/authCodeLogin";
			@Description("发送绑定银行卡手机验证码")
			const val BINDING_BANK_CARD_CODE_LOGIN_Url = "login/login/bindingBankCardCode";
			@Description("微信新授权")
			const val WECHART_NEW_JSCODE_LOGIN_Url = "login/login/wechartNewJscode";
			@Description("密码登录")
			const val PASSWORD_LOGIN_LOGIN_Url = "login/login/passwordLogin";
			@Description("微信登录")
			const val WECHART_LOGIN_LOGIN_Url = "login/login/wechartLogin";
			@Description("微信jscode")
			const val WECHART_JSCODE_LOGIN_Url = "login/login/wechartJscode";
		}
	}
}
