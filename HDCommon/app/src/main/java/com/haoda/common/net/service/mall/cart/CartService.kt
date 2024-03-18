package com.haoda.common.net.service.mall.cart

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface CartService : BaseService{
	@Description("获取购物车信息")
	@POST(Constants.API.GET_CART_CART_Url)
	fun <T:BaseResult<Void>> getCartCart(

	):  Flowable<T>


	@Description("清空购物车")
	@POST(Constants.API.APP_CLEAR_CART_Url)
	fun <T:BaseResult<Void>> appClearCart(

	):  Flowable<T>


	@Description("选中购物车商品")
	@FormUrlEncoded
	@POST(Constants.API.SELECT_CART_Url)
	fun <T:BaseResult<Void>> selectCart(
		@Field("id") @Description("id（非必须参数）") id:String?
	):  Flowable<T>


	@Description("全选购物车商品")
	@POST(Constants.API.SELECT_ALL_CART_Url)
	fun <T:BaseResult<Void>> selectAllCart(

	):  Flowable<T>


	@Description("取消全选购物车商品")
	@POST(Constants.API.UN_SELECT_ALL_CART_Url)
	fun <T:BaseResult<Void>> unSelectAllCart(

	):  Flowable<T>


	@Description("修改购物车商品数量")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_QUANTITY_CART_Url)
	fun <T:BaseResult<Void>> updateQuantityCart(
		@Field("id") @Description("id") id:String,
		@Field("quantity") @Description("quantity") quantity:String
	):  Flowable<T>


	@Description("取消选中购物车商品")
	@FormUrlEncoded
	@POST(Constants.API.UN_SELECT_CART_Url)
	fun <T:BaseResult<Void>> unSelectCart(
		@Field("id") @Description("id（非必须参数）") id:String?
	):  Flowable<T>


	@Description("删除购物车中商品")
	@FormUrlEncoded
	@POST(Constants.API.APP_BATCH_DELETE_CART_Url)
	fun <T:BaseResult<Void>> appBatchDeleteCart(
		@Field("ids") @Description("购物车ID数组实例：1，2，3") ids:String
	):  Flowable<T>


	@Description("添加购物车")
	@FormUrlEncoded
	@POST(Constants.API.APP_SAVE_CART_Url)
	fun <T:BaseResult<Void>> appSaveCart(
		@Field("productAttributes") @Description("属性列表") productAttributes:String,
		@Field("productId") @Description("商品id") productId:String,
		@Field("quantity") @Description("商品数量") quantity:String,
		@Field("skuCode") @Description("skuCode") skuCode:String
	):  Flowable<T>


	@Description("删除购物车中商品")
	@FormUrlEncoded
	@POST(Constants.API.APP_DELETE_CART_Url)
	fun <T:BaseResult<Void>> appDeleteCart(
		@Field("id") @Description("id") id:String
	):  Flowable<T>

}