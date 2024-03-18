package com.haoda.common.net.service.member.TbMemberVip

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("查询会员商品信息")
			const val FIND_PAGE_TOPRO_LIST_TB_MEMBER_VIP_Url = "TbMemberVip/TbMemberVip/getMemberPro";
			@Description("猜你喜欢的商品")
			const val GET_GUESS_YOU_LIKE_PAGETB_MEMBER_VIP_Url = "TbMemberVip/TbMemberVip/getGuessYouLikePage";
			@Description("根据用户手机号查询会员信息")
			const val SELECT_FORMEMBER_IDTB_MEMBER_VIP_Url = "TbMemberVip/TbMemberVip/findByUserId";
			@Description("获取分页数据")
			const val FIND_LIST_BYPAGE_TB_MEMBER_VIP_Url = "TbMemberVip/TbMemberVip/list";
			@Description("查询会员id列表")
			const val GET_VIP_MEMBER_ID_TB_MEMBER_VIP_Url = "TbMemberVip/TbMemberVip/getVipMemberId";
			@Description("根据ID删除数据")
			const val DELETE_TB_MEMBER_VIP_Url = "TbMemberVip/TbMemberVip/delIds";
			@Description("修改会员数据")
			const val UPDATE_TB_MEMBER_VIP_Url = "TbMemberVip/TbMemberVip/update";
			@Description("批量删除数据")
			const val DELETE_BAT_IDS_TB_MEMBER_VIP_Url = "TbMemberVip/TbMemberVip/delBatIds";
			@Description("添加会员VIP的接口")
			const val ADD_TB_MEMBER_VIP_Url = "TbMemberVip/TbMemberVip/add";
		}
	}
}
