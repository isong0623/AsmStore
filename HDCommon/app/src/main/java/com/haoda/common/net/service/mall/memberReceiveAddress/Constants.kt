package com.haoda.common.net.service.mall.memberReceiveAddress

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("详细信息")
			const val DETAIL_MEMBER_RECEIVE_ADDRESS_Url = "memberReceiveAddress/memberReceiveAddress/detail";
			@Description("删除")
			const val DELETE_MEMBER_RECEIVE_ADDRESS_Url = "memberReceiveAddress/memberReceiveAddress/delete";
			@Description("设置默认地址")
			const val SET_DEFAULT_ADDRESS_MEMBER_RECEIVE_ADDRESS_Url = "memberReceiveAddress/memberReceiveAddress/setDefaultAddress";
			@Description("修改")
			const val UPDATE_MEMBER_RECEIVE_ADDRESS_Url = "memberReceiveAddress/memberReceiveAddress/update";
			@Description("获取默认收货地址")
			const val GET_DEFAULT_ADDRESS_MEMBER_RECEIVE_ADDRESS_Url = "memberReceiveAddress/memberReceiveAddress/getDefaultAddress";
			@Description("添加")
			const val SAVE_MEMBER_RECEIVE_ADDRESS_Url = "memberReceiveAddress/memberReceiveAddress/save";
			@Description("获取所有")
			const val LIST_MEMBER_RECEIVE_ADDRESS_Url = "memberReceiveAddress/memberReceiveAddress/list";
		}
	}
}
