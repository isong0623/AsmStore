package com.haoda.common.net.service.mall.search

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface SearchService : BaseService{
	@Description("获取热门搜索")
	@POST(Constants.API.APP_GET_SEARCH_HOTSEARCH_Url)
	fun <T:BaseResult<Void>> appGetSearchHotSearch(

	):  Flowable<T>


	@Description("搜索商品")
	@FormUrlEncoded
	@POST(Constants.API.SEARCH_SEARCH_Url)
	fun <T:BaseResult<Void>> searchSearch(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("keywords") @Description("keywords（非必须参数）") keywords:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("sortType") @Description("排序类型(1->按新品从新到旧；2->按销量从高到低；3->按价格从低到高；4->按价格从高到低；99->综合)（非必须参数）") sortType:String?
	):  Flowable<T>

}