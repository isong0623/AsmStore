package com.haoda.common.net.service.mall.order

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("VIP购买订单支付成功，给用户添加会员")
			const val ADD_MEMBER_VIP_ORDER_Url = "order/order/addMemberVip";
			@Description("立即购买确认订单")
			const val GET_ORDER_CHECK_BY_PRODUCT_ID_ORDER_Url = "order/order/getOrderCheckByProductId";
			@Description("取消订单")
			const val MEMBER_ORDER_CANCEL_ORDER_Url = "order/order/memberOrderCancel";
			@Description("2、商户后台下单（微信或者支付宝）（原订单支付）")
			const val ORDER_PAY_ORDER_Url = "order/order/orderPay";
			@Description("查询支付结果")
			const val ORDER_PAY_RES_ORDER_Url = "order/order/orderPayRes";
			@Description("获取订单快递信息")
			const val GET_EXPRESS_MESSAGE_ORDER_Url = "order/order/getExpressMessage";
			@Description("购物车确认订单")
			const val GET_ORDER_CHECK_BY_CARTORDER_Url = "order/order/getOrderCheckByCart";
			@Description("获取订单优惠券")
			const val GET_ORDER_COUPONS_ORDER_Url = "order/order/getOrderCoupons";
			@Description("订单未评价商品列表")
			const val ORDER_NOT_APPRAISED_PRODUCT_LISTORDER_Url = "order/order/orderNotAppraisedProductList";
			@Description("刷新确认订单信息")
			const val ORDER_CHECK_REFRESH_ORDER_Url = "order/order/orderCheckRefresh";
			@Description("订单分页查询")
			const val APP_MEMBER_PAGE_ORDER_Url = "order/order/appMemberPage";
			@Description("订单确认收货接口")
			const val RECEIVED_CONFIRM_ORDER_Url = "order/order/receivedConfirm";
			@Description("订单详细信息")
			const val ORDER_DETAIL_ORDER_Url = "order/order/orderDetail";
			@Description("删除订单信息")
			const val MEMBER_DELETE_ORDER_Url = "order/order/memberDelete";
			@Description("待付款订单重新付款")
			const val ORDER_SUBMIT_VIEW_ORDER_Url = "order/order/orderSubmitView";
			@Description("1、提交订单")
			const val ORDER_SUBMIT_ORDER_Url = "order/order/orderSubmit";
			@Description("提交购买vip订单")
			const val ORDER_VIP_SUBMIT_ORDER_Url = "order/order/orderVipSubmit";
		}
	}
}
