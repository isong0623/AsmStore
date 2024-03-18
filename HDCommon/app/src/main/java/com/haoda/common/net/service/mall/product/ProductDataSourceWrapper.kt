package com.haoda.common.net.service.mall.product

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface ProductDataSourceWrapper {
	fun <T:BaseResult<Void>> getVipListProduct(currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(ProductService::class.java)
			.getVipListProduct<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_2Product(productId:String,skuCode:String?):Flowable<T> {
		return ApiEngine.getService(ProductService::class.java)
			.detail_2Product<T>(productId,skuCode)
			.compose(RxSchedulers.io_main())
	}

}