package com.haoda.common.net.service.mall.memberCoupon

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface MemberCouponService : BaseService{
	@Description("获取可领取优惠券列表")
	@FormUrlEncoded
	@POST(Constants.API.MEMBER_CAN_GET_LIST_MEMBER_COUPON_Url)
	fun <T:BaseResult<Void>> memberCanGetListMemberCoupon(
		@Field("type") @Description("优惠券类型") type:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.MEMBER_PAGE_1MEMBER_COUPON_Url)
	fun <T:BaseResult<Void>> memberPage_1MemberCoupon(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数(默认10条)（非必须参数）") pageSize:String?,
		@Field("qureyCode") @Description("1->未使用2->已使用3->已过期99->全部（非必须参数）") qureyCode:String?
	):  Flowable<T>


	@Description("领取优惠券")
	@FormUrlEncoded
	@POST(Constants.API.RECEIVE_COUPON_MEMBER_COUPON_Url)
	fun <T:BaseResult<Void>> receiveCouponMemberCoupon(
		@Field("couponId") @Description("couponId") couponId:String
	):  Flowable<T>


	@Description("根据id查询")
	@FormUrlEncoded
	@POST(Constants.API.QUERY_COUPON_BYID_MEMBER_COUPON_Url)
	fun <T:BaseResult<Void>> queryCouponByIdMemberCoupon(
		@Field("couponId") @Description("couponId") couponId:String,
		@Field("id") @Description("优惠券id") id:String
	):  Flowable<T>

}