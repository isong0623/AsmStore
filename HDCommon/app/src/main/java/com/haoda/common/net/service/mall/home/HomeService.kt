package com.haoda.common.net.service.mall.home

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface HomeService : BaseService{
	@Description("获取APP轮播图")
	@Headers("haodaAuthorization:\"\"")
	@POST(Constants.API.GET_APP_BANNER_HOME_Url)
	fun <T:BaseResult<Void>> getAppBannerHome(

	):  Flowable<T>


	@Description("获取优选尖货")
	@POST(Constants.API.GET_PROMOTION_SELECT_HOME_Url)
	fun <T:BaseResult<Void>> getPromotionSelectHome(

	):  Flowable<T>


	@Description("获取热卖商品")
	@FormUrlEncoded
	@Headers("haodaAuthorization:\"\"")
	@POST(Constants.API.GET_PROMOTION_HOT_HOME_Url)
	fun <T:BaseResult<Void>> getPromotionHotHome(
		@Field("currentPage") @Description("当前页") currentPage:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("获取APP首页广告图")
	@POST(Constants.API.GET_APP_HOME_PICHOME_Url)
	fun <T:BaseResult<Void>> getAppHomePicHome(

	):  Flowable<T>


	@Description("获取APP标签")
	@Headers("haodaAuthorization:\"\"")
	@POST(Constants.API.GET_APP_LABER_HOME_Url)
	fun <T:BaseResult<Void>> getAppLaberHome(

	):  Flowable<T>


	@Description("增加分享次数")
	@FormUrlEncoded
	@POST(Constants.API.ADD_SHARE_NUM_HOME_Url)
	fun <T:BaseResult<Void>> addShareNumHome(
		@Field("shareSign") @Description("分享标识") shareSign:String
	):  Flowable<T>


	@Description("获取每日推荐")
	@Headers("haodaAuthorization:\"\"")
	@POST(Constants.API.GET_PROMOTION_DAILY_HOME_Url)
	fun <T:BaseResult<Void>> getPromotionDailyHome(

	):  Flowable<T>

}