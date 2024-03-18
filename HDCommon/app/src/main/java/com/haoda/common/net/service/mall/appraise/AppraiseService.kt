package com.haoda.common.net.service.mall.appraise

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface AppraiseService : BaseService{
	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.PAGE_APPRAISE_Url)
	fun <T:BaseResult<Void>> pageAppraise(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("productId") @Description("商品ID") productId:String,
		@Field("queryFlag") @Description("查询标识（1->全部2->最新3->有图）（非必须参数）") queryFlag:String?
	):  Flowable<T>

}