package com.haoda.common.net.service.mall.ios

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface IosService : BaseService{
	@Description("ios展示标识")
	@FormUrlEncoded
	@POST(Constants.API.IOS_SHOW_IOS_Url)
	fun <T:BaseResult<Void>> iosShowIos(
		@Field("buildIn") @Description("ios版本(包)入参") buildIn:String,
		@Field("dicKeyId") @Description("字典表ios-config-build-id") dicKeyId:String
	):  Flowable<T>


	@Description("ios更新信息")
	@FormUrlEncoded
	@POST(Constants.API.IOS_UPDATE_IOS_Url)
	fun <T:BaseResult<Void>> iosUpdateIos(
		@Field("buildIn") @Description("build号") buildIn:String,
		@Field("downloadChannel") @Description("下载渠道") downloadChannel:String,
		@Field("platformMarking") @Description("平台标记(ios,android)") platformMarking:String,
		@Field("version") @Description("版本号") version:String
	):  Flowable<T>

}