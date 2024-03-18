package com.haoda.common.net.service.mall.memberReceiveAddress

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface MemberReceiveAddressService : BaseService{
	@Description("详细信息")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_MEMBER_RECEIVE_ADDRESS_Url)
	fun <T:BaseResult<Void>> detailMemberReceiveAddress(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_MEMBER_RECEIVE_ADDRESS_Url)
	fun <T:BaseResult<Void>> deleteMemberReceiveAddress(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("设置默认地址")
	@FormUrlEncoded
	@POST(Constants.API.SET_DEFAULT_ADDRESS_MEMBER_RECEIVE_ADDRESS_Url)
	fun <T:BaseResult<Void>> setDefaultAddressMemberReceiveAddress(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_MEMBER_RECEIVE_ADDRESS_Url)
	fun <T:BaseResult<Void>> updateMemberReceiveAddress(
		@Field("city") @Description("城市（非必须参数）") city:String?,
		@Field("defaultStatus") @Description("是否为默认(0->不是1->是)（非必须参数）") defaultStatus:String?,
		@Field("detailAddress") @Description("详细地址（非必须参数）") detailAddress:String?,
		@Field("id") @Description("id") id:String,
		@Field("name") @Description("收货人名称（非必须参数）") name:String?,
		@Field("phoneNumber") @Description("手机号（非必须参数）") phoneNumber:String?,
		@Field("postCode") @Description("邮政编码（非必须参数）") postCode:String?,
		@Field("province") @Description("省份/直辖市（非必须参数）") province:String?,
		@Field("region") @Description("区（非必须参数）") region:String?
	):  Flowable<T>


	@Description("获取默认收货地址")
	@POST(Constants.API.GET_DEFAULT_ADDRESS_MEMBER_RECEIVE_ADDRESS_Url)
	fun <T:BaseResult<Void>> getDefaultAddressMemberReceiveAddress(

	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_MEMBER_RECEIVE_ADDRESS_Url)
	fun <T:BaseResult<Void>> saveMemberReceiveAddress(
		@Field("city") @Description("城市") city:String,
		@Field("defaultStatus") @Description("是否为默认(0->不是1->是)") defaultStatus:String,
		@Field("detailAddress") @Description("详细地址") detailAddress:String,
		@Field("name") @Description("收货人名称") name:String,
		@Field("phoneNumber") @Description("手机号") phoneNumber:String,
		@Field("postCode") @Description("邮政编码（非必须参数）") postCode:String?,
		@Field("province") @Description("省份/直辖市") province:String,
		@Field("region") @Description("区") region:String
	):  Flowable<T>


	@Description("获取所有")
	@POST(Constants.API.LIST_MEMBER_RECEIVE_ADDRESS_Url)
	fun <T:BaseResult<Void>> listMemberReceiveAddress(

	):  Flowable<T>

}