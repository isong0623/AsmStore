package com.haoda.common.net.service.console.coupon

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface CouponService : BaseService{
	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_2_COUPON_Url)
	fun <T:BaseResult<Void>> update_2Coupon(
		@Field("categoryIds") @Description("商品分类ID数组（非必须参数）") categoryIds:String?,
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("getEndTime") @Description("获取结束时间（非必须参数）") getEndTime:String?,
		@Field("getStartTime") @Description("获取开始时间（非必须参数）") getStartTime:String?,
		@Field("getTimeFlag") @Description("获取时间标志（0->无限制1->有限制）（非必须参数）") getTimeFlag:String?,
		@Field("id") @Description("id") id:String,
		@Field("minPoint") @Description("使用最低金额；0表示无门槛（非必须参数）") minPoint:String?,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("perLimit") @Description("每人限领张数（非必须参数）") perLimit:String?,
		@Field("price") @Description("金额（非必须参数）") price:String?,
		@Field("publishCount") @Description("发行数量（非必须参数）") publishCount:String?,
		@Field("publishCountType") @Description("发行数量类型（0->不限量1->限量）（非必须参数）") publishCountType:String?,
		@Field("status") @Description("状态（0->停用1->正常）（非必须参数）") status:String?,
		@Field("type") @Description("优惠卷类型；1->注册赠券2->用户领取（非必须参数）") type:String?,
		@Field("useEndTime") @Description("结束使用时间（非必须参数）") useEndTime:String?,
		@Field("useStartTime") @Description("开始使用时间（非必须参数）") useStartTime:String?,
		@Field("useTimeLimit") @Description("领取后可用时间（单位：天）（非必须参数）") useTimeLimit:String?,
		@Field("useTimeType") @Description("使用时间类型（1->固定日期2->固定时长）（非必须参数）") useTimeType:String?,
		@Field("useType") @Description("使用类型：1->全场通用；2->指定分类；（非必须参数）") useType:String?
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_2_COUPON_Url)
	fun <T:BaseResult<Void>> save_2Coupon(
		@Field("categoryIds") @Description("商品分类ID数组（非必须参数）") categoryIds:String?,
		@Field("description") @Description("描述（非必须参数）") description:String?,
		@Field("getEndTime") @Description("获取结束时间（非必须参数）") getEndTime:String?,
		@Field("getStartTime") @Description("获取开始时间（非必须参数）") getStartTime:String?,
		@Field("getTimeFlag") @Description("获取时间标志（0->无限制1->有限制）") getTimeFlag:String,
		@Field("minPoint") @Description("使用最低金额；0表示无门槛") minPoint:String,
		@Field("name") @Description("名称") name:String,
		@Field("perLimit") @Description("每人限领张数") perLimit:String,
		@Field("price") @Description("金额") price:String,
		@Field("publishCount") @Description("发行数量（非必须参数）") publishCount:String?,
		@Field("publishCountType") @Description("发行数量类型（0->不限量1->限量）") publishCountType:String,
		@Field("status") @Description("状态（0->停用1->正常）") status:String,
		@Field("type") @Description("优惠卷类型；1->注册赠券2->用户领取") type:String,
		@Field("useEndTime") @Description("结束使用时间（非必须参数）") useEndTime:String?,
		@Field("useStartTime") @Description("开始使用时间（非必须参数）") useStartTime:String?,
		@Field("useTimeLimit") @Description("领取后可用时间（单位：天）（非必须参数）") useTimeLimit:String?,
		@Field("useTimeType") @Description("使用时间类型（1->固定日期2->固定时长）") useTimeType:String,
		@Field("useType") @Description("使用类型：1->全场通用；2->指定分类；") useType:String
	):  Flowable<T>


	@Description("启用")
	@FormUrlEncoded
	@POST(Constants.API.START_USE_COUPON_Url)
	fun <T:BaseResult<Void>> startUseCoupon(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_2_COUPON_Url)
	fun <T:BaseResult<Void>> detail_2Coupon(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("停用")
	@FormUrlEncoded
	@POST(Constants.API.STOP_USE_COUPON_Url)
	fun <T:BaseResult<Void>> stopUseCoupon(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_3_COUPON_Url)
	fun <T:BaseResult<Void>> page_3Coupon(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("name") @Description("名称（非必须参数）") name:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("type") @Description("优惠卷类型；1->注册赠券2->用户领取优惠券（非必须参数）") type:String?
	):  Flowable<T>


	@Description("获取推送的优惠卷")
	@FormUrlEncoded
	@POST(Constants.API.GET_COUPON_BYTYPE_COUPON_Url)
	fun <T:BaseResult<Void>> getCouponByTypeCoupon(
		@Field("type") @Description("type") type:String
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_2_COUPON_Url)
	fun <T:BaseResult<Void>> delete_2Coupon(
		@Field("id") @Description("id") id:String
	):  Flowable<T>

}