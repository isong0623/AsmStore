package com.haoda.common.net.service.mall.cart

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("获取购物车信息")
			const val GET_CART_CART_Url = "cart/cart/getCart";
			@Description("清空购物车")
			const val APP_CLEAR_CART_Url = "cart/cart/appClear";
			@Description("选中购物车商品")
			const val SELECT_CART_Url = "cart/cart/select";
			@Description("全选购物车商品")
			const val SELECT_ALL_CART_Url = "cart/cart/selectAll";
			@Description("取消全选购物车商品")
			const val UN_SELECT_ALL_CART_Url = "cart/cart/unSelectAll";
			@Description("修改购物车商品数量")
			const val UPDATE_QUANTITY_CART_Url = "cart/cart/updateQuantity";
			@Description("取消选中购物车商品")
			const val UN_SELECT_CART_Url = "cart/cart/unSelect";
			@Description("删除购物车中商品")
			const val APP_BATCH_DELETE_CART_Url = "cart/cart/appBatchDelete";
			@Description("添加购物车")
			const val APP_SAVE_CART_Url = "cart/cart/appSave";
			@Description("删除购物车中商品")
			const val APP_DELETE_CART_Url = "cart/cart/appDelete";
		}
	}
}
