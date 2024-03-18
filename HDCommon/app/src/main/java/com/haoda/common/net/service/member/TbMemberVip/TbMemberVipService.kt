package com.haoda.common.net.service.member.TbMemberVip

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface TbMemberVipService : BaseService{
	@Description("查询会员商品信息")
	@FormUrlEncoded
	@POST(Constants.API.FIND_PAGE_TOPRO_LIST_TB_MEMBER_VIP_Url)
	fun <T:BaseResult<Void>> findPageToProListTbMemberVip(
		@Field("pageNum") @Description("pageNum（非必须参数）") pageNum:String?,
		@Field("pageSize") @Description("pageSize（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("猜你喜欢的商品")
	@FormUrlEncoded
	@Headers("haodaAuthorization:\"\"")
	@POST(Constants.API.GET_GUESS_YOU_LIKE_PAGETB_MEMBER_VIP_Url)
	fun <T:BaseResult<Void>> getGuessYouLikePageTbMemberVip(
		@Field("pageNum") @Description("pageNum（非必须参数）") pageNum:String?,
		@Field("pageSize") @Description("pageSize（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("根据用户手机号查询会员信息")
	@FormUrlEncoded
	@POST(Constants.API.SELECT_FORMEMBER_IDTB_MEMBER_VIP_Url)
	fun <T:BaseResult<Void>> selectFormemberIdTbMemberVip(
		@Field("buyingTime") @Description("购买时间（非必须参数）") buyingTime:String?,
		@Field("channel") @Description("来源渠道0:后台添加1：用户购买2：积分抽奖（非必须参数）") channel:String?,
		@Field("createTime") @Description("（非必须参数）") createTime:String?,
		@Field("createUser") @Description("创建人（非必须参数）") createUser:String?,
		@Field("discount") @Description("折扣率（非必须参数）") discount:String?,
		@Field("dueTime") @Description("到期时间（非必须参数）") dueTime:String?,
		@Field("id") @Description("（非必须参数）") id:String?,
		@Field("memberId") @Description("用户ID（非必须参数）") memberId:String?,
		@Field("mobile") @Description("用户手机号") mobile:String,
		@Field("updateTime") @Description("（非必须参数）") updateTime:String?,
		@Field("updateUser") @Description("（非必须参数）") updateUser:String?,
		@Field("vipType") @Description("折扣率（非必须参数）") vipType:String?
	):  Flowable<T>


	@Description("获取分页数据")
	@FormUrlEncoded
	@POST(Constants.API.FIND_LIST_BYPAGE_TB_MEMBER_VIP_Url)
	fun <T:BaseResult<Void>> findListByPageTbMemberVip(
		@Field("buyingTime") @Description("购买时间（非必须参数）") buyingTime:String?,
		@Field("channel") @Description("来源渠道（非必须参数）") channel:String?,
		@Field("createTime") @Description("（非必须参数）") createTime:String?,
		@Field("createUser") @Description("创建人（非必须参数）") createUser:String?,
		@Field("discount") @Description("折扣率（非必须参数）") discount:String?,
		@Field("dueTime") @Description("到期时间（非必须参数）") dueTime:String?,
		@Field("id") @Description("（非必须参数）") id:String?,
		@Field("memberId") @Description("用户ID（非必须参数）") memberId:String?,
		@Field("mobile") @Description("用户手机号（非必须参数）") mobile:String?,
		@Field("pageNum") @Description("pageNum（非必须参数）") pageNum:String?,
		@Field("updateTime") @Description("（非必须参数）") updateTime:String?,
		@Field("updateUser") @Description("（非必须参数）") updateUser:String?,
		@Field("vipType") @Description("折扣率（非必须参数）") vipType:String?,
		@Field("pageSize") @Description("pageSize（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("查询会员id列表")
	@POST(Constants.API.GET_VIP_MEMBER_ID_TB_MEMBER_VIP_Url)
	fun <T:BaseResult<Void>> getVipMemberIdTbMemberVip(

	):  Flowable<T>


	@Description("根据ID删除数据")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_TB_MEMBER_VIP_Url)
	fun <T:BaseResult<Void>> deleteTbMemberVip(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("修改会员数据")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_TB_MEMBER_VIP_Url)
	fun <T:BaseResult<Void>> updateTbMemberVip(
		@Field("buyingTime") @Description("购买时间（非必须参数）") buyingTime:String?,
		@Field("channel") @Description("来源渠道0:后台添加1：用户购买2：积分抽奖（非必须参数）") channel:String?,
		@Field("createTime") @Description("（非必须参数）") createTime:String?,
		@Field("createUser") @Description("创建人（非必须参数）") createUser:String?,
		@Field("discount") @Description("折扣率（非必须参数）") discount:String?,
		@Field("dueTime") @Description("到期时间（非必须参数）") dueTime:String?,
		@Field("id") @Description("（非必须参数）") id:String?,
		@Field("memberId") @Description("用户ID（非必须参数）") memberId:String?,
		@Field("mobile") @Description("用户手机号（非必须参数）") mobile:String?,
		@Field("updateTime") @Description("（非必须参数）") updateTime:String?,
		@Field("updateUser") @Description("（非必须参数）") updateUser:String?,
		@Field("vipType") @Description("折扣率（非必须参数）") vipType:String?
	):  Flowable<T>


	@Description("批量删除数据")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_BAT_IDS_TB_MEMBER_VIP_Url)
	fun <T:BaseResult<Void>> deleteBatIdsTbMemberVip(
		@Field("ids") @Description("ids") ids:String
	):  Flowable<T>


	@Description("添加会员VIP的接口")
	@FormUrlEncoded
	@POST(Constants.API.ADD_TB_MEMBER_VIP_Url)
	fun <T:BaseResult<Void>> addTbMemberVip(
		@Field("channel") @Description("来源渠道0:后台添加1：用户购买-支付宝2：积分抽奖3：用户购买-微信支付4:用户购买-小程序（非必须参数）") channel:String?,
		@Field("discount") @Description("折扣率（非必须参数）") discount:String?,
		@Field("memberId") @Description("用户id,channel!=0必传（非必须参数）") memberId:String?,
		@Field("mobile") @Description("手机号,channel=0必传（非必须参数）") mobile:String?,
		@Field("vipType") @Description("会员类型：2：月会员3：年会员") vipType:String
	):  Flowable<T>

}