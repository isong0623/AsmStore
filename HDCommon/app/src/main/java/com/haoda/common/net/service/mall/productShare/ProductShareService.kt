package com.haoda.common.net.service.mall.productShare

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface ProductShareService : BaseService{
	@Description("获取商品分享信息")
	@FormUrlEncoded
	@POST(Constants.API.SHARE_PRODUCT_SHARE_Url)
	fun <T:BaseResult<Void>> shareProductShare(
		@Field("productId") @Description("productId") productId:String
	):  Flowable<T>


	@Description("分享成功")
	@FormUrlEncoded
	@POST(Constants.API.SHARE_SUCCESS_PRODUCT_SHARE_Url)
	fun <T:BaseResult<Void>> shareSuccessProductShare(
		@Field("id") @Description("分享ID") id:String,
		@Field("secretCode") @Description("分享加密信息") secretCode:String,
		@Field("shareType") @Description("分享类型（1-微信朋友圈2-微信好友）") shareType:String
	):  Flowable<T>

}