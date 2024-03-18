package com.haoda.common.net.service.mall.orderRefundApplay

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface OrderRefundApplayService : BaseService{
	@Description("撤销售后申请")
	@FormUrlEncoded
	@POST(Constants.API.REVOKE_REFUND_APPLAY_ORDER_REFUND_APPLAY_Url)
	fun <T:BaseResult<Void>> revokeRefundApplayOrderRefundApplay(
		@Field("orderItemId") @Description("订单商品ID") orderItemId:String
	):  Flowable<T>


	@Description("上传申请图片")
	@POST(Constants.API.UPLOAD_PIC_1ORDER_REFUND_APPLAY_Url)
	fun <T:BaseResult<Void>> uploadPic_1OrderRefundApplay(

	):  Flowable<T>


	@Description("提交售后申请")
	@FormUrlEncoded
	@POST(Constants.API.ORDER_REFUND_APPLAY_ORDER_REFUND_APPLAY_Url)
	fun <T:BaseResult<Void>> orderRefundApplayOrderRefundApplay(
		@Field("contactMobile") @Description("联系电话") contactMobile:String,
		@Field("contactPerson") @Description("联系人") contactPerson:String,
		@Field("memberDesc") @Description("用户描述（非必须参数）") memberDesc:String?,
		@Field("orderItemId") @Description("订单商品ID") orderItemId:String,
		@Field("pics") @Description("图片链接地址数组（非必须参数）") pics:String?,
		@Field("quantity") @Description("商品数量") quantity:String,
		@Field("refundReasonId") @Description("退款原因ID") refundReasonId:String
	):  Flowable<T>


	@Description("批量上传申请图片")
	@POST(Constants.API.UPLOAD_PICS_1ORDER_REFUND_APPLAY_Url)
	fun <T:BaseResult<Void>> uploadPics_1OrderRefundApplay(

	):  Flowable<T>


	@Description("获取退货原因选择列表")
	@POST(Constants.API.GET_REFUND_REASON_SELECT_DATAORDER_REFUND_APPLAY_Url)
	fun <T:BaseResult<Void>> getRefundReasonSelectDataOrderRefundApplay(

	):  Flowable<T>


	@Description("订单售后申请详细信息")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_1_ORDER_REFUND_APPLAY_Url)
	fun <T:BaseResult<Void>> detail_1OrderRefundApplay(
		@Field("orderRefundApplayId") @Description("orderRefundApplayId") orderRefundApplayId:String
	):  Flowable<T>


	@Description("订单售后分页查询")
	@FormUrlEncoded
	@POST(Constants.API.APP_MEMBER_REFUND_PAGE_ORDER_REFUND_APPLAY_Url)
	fun <T:BaseResult<Void>> appMemberRefundPageOrderRefundApplay(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("订单售后申请分页查询")
	@FormUrlEncoded
	@POST(Constants.API.APP_MEMBER_REFUND_APPLAY_PAGEORDER_REFUND_APPLAY_Url)
	fun <T:BaseResult<Void>> appMemberRefundApplayPageOrderRefundApplay(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>

}