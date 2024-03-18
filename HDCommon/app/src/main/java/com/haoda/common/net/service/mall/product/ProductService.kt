package com.haoda.common.net.service.mall.product

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface ProductService : BaseService{
	@Description("获取商品-VIP列表")
	@FormUrlEncoded
	@POST(Constants.API.GET_VIP_LIST_PRODUCT_Url)
	fun <T:BaseResult<Void>> getVipListProduct(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("商品详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_2_PRODUCT_Url)
	fun <T:BaseResult<Void>> detail_2Product(
		@Field("productId") @Description("productId") productId:String,
		@Field("skuCode") @Description("skuCode（非必须参数）") skuCode:String?
	):  Flowable<T>

}