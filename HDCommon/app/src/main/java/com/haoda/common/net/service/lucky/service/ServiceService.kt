package com.haoda.common.net.service.lucky.service

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface ServiceService : BaseService{
	@Description("后台分页查询")
	@FormUrlEncoded
	@POST(Constants.API.LIST_SERVICE_Url)
	fun <T:BaseResult<Void>> listService(
		@Field("current") @Description("当前页码（非必须参数）") current:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("size") @Description("奖品size类型：0：小1：大（非必须参数）") size:String?
	):  Flowable<T>


	@Description("根据id查详情")
	@FormUrlEncoded
	@POST(Constants.API.DETAIL_BY_IDSERVICE_Url)
	fun <T:BaseResult<Void>> detailByIdService(
		@Field("orizeLogId") @Description("orizeLogId") orizeLogId:String
	):  Flowable<T>


	@Description("修改")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE_SERVICE_Url)
	fun <T:BaseResult<Void>> updateService(
		@Field("enable") @Description("是否可用：0：不可用1：可用（非必须参数）") enable:String?,
		@Field("freight") @Description("运费，保留小数点后两位（非必须参数）") freight:String?,
		@Field("id") @Description("id") id:String,
		@Field("integralNum") @Description("如果是积分，代表积分数量，其他无意义（非必须参数）") integralNum:String?,
		@Field("levelId") @Description("奖品等级id（非必须参数）") levelId:String?,
		@Field("levelName") @Description("奖品等级（非必须参数）") levelName:String?,
		@Field("number") @Description("奖品数量（非必须参数）") number:String?,
		@Field("prizeDesc") @Description("奖品描述（非必须参数）") prizeDesc:String?,
		@Field("prizeImg") @Description("奖品图片url（非必须参数）") prizeImg:String?,
		@Field("prizeImgOne") @Description("奖品小图片one（非必须参数）") prizeImgOne:String?,
		@Field("prizeImgTwo") @Description("奖品小图片two（非必须参数）") prizeImgTwo:String?,
		@Field("prizeName") @Description("奖品名称（非必须参数）") prizeName:String?,
		@Field("showFirst") @Description("是否第一个弹窗展示：0：否1：是（非必须参数）") showFirst:String?,
		@Field("size") @Description("奖品大小类型：0：小1：大（非必须参数）") size:String?,
		@Field("sort") @Description("排序（非必须参数）") sort:String?,
		@Field("type") @Description("奖品类型：0：实物1：虚拟（非必须参数）") type:String?
	):  Flowable<T>


	@Description("首窗展示")
	@POST(Constants.API.FIRST_SHOW_SERVICE_Url)
	fun <T:BaseResult<Void>> firstShowService(

	):  Flowable<T>


	@Description("发货")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE2_SERVICE_Url)
	fun <T:BaseResult<Void>> update2Service(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("分页查询")
	@FormUrlEncoded
	@POST(Constants.API.LIST_2_SERVICE_Url)
	fun <T:BaseResult<Void>> list_2Service(
		@Field("current") @Description("当前页码（非必须参数）") current:String?,
		@Field("delivery") @Description("发货状态：0->待付款；1->待发货；2->已发货99:默认未支付（非必须参数）") delivery:String?,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("type") @Description("奖品类型：0：实物1：积分2：月会员3：年会员（非必须参数）") type:String?
	):  Flowable<T>


	@Description("按奖品大小类型查询list")
	@FormUrlEncoded
	@Headers("haodaAuthorization:\"\"")
	@POST(Constants.API.LIST_1_SERVICE_Url)
	fun <T:BaseResult<Void>> list_1Service(
		@Field("size") @Description("奖品大小类型：0：小1：大") size:String
	):  Flowable<T>


	@Description("奖品-立即兑换-下单")
	@FormUrlEncoded
	@POST(Constants.API.UPDATE1_SERVICE_Url)
	fun <T:BaseResult<Void>> update1Service(
		@Field("address") @Description("领奖人地址") address:String,
		@Field("freight") @Description("运费，保留小数点后两位，比如10.00,不填默认0.00") freight:String,
		@Field("id") @Description("id") id:String,
		@Field("memberId") @Description("用户id") memberId:String,
		@Field("mobile") @Description("领奖人手机号") mobile:String,
		@Field("payType") @Description("支付方式：0->未支付；1->支付宝；2->微信;3->微信小程序") payType:String,
		@Field("username") @Description("领奖人姓名") username:String
	):  Flowable<T>


	@Description("添加")
	@FormUrlEncoded
	@POST(Constants.API.SAVE_SERVICE_Url)
	fun <T:BaseResult<Void>> saveService(
		@Field("enable") @Description("是否可用：0：不可用1：可用") enable:String,
		@Field("freight") @Description("运费，保留小数点后两位，比如10.00,不填默认0.00") freight:String,
		@Field("integralNum") @Description("如果是积分，代表积分数量，其他无意义") integralNum:String,
		@Field("levelId") @Description("奖品等级id") levelId:String,
		@Field("levelName") @Description("奖品等级") levelName:String,
		@Field("number") @Description("奖品数量") number:String,
		@Field("prizeDesc") @Description("奖品描述") prizeDesc:String,
		@Field("prizeImg") @Description("奖品图片url") prizeImg:String,
		@Field("prizeImgOne") @Description("奖品小图片one,不填默认'0'") prizeImgOne:String,
		@Field("prizeImgTwo") @Description("奖品小图片two,不填默认'0'") prizeImgTwo:String,
		@Field("prizeName") @Description("奖品名称") prizeName:String,
		@Field("showFirst") @Description("是否第一个弹窗展示：0：否1：是") showFirst:String,
		@Field("size") @Description("奖品size类型：0：小1：大") size:String,
		@Field("sort") @Description("排序") sort:String,
		@Field("type") @Description("奖品虚实类型：0：实物1：虚拟") type:String
	):  Flowable<T>


	@Description("js支付结果通知")
	@FormUrlEncoded
	@POST(Constants.API.JS_PAY_RESULT_SERVICE_Url)
	fun <T:BaseResult<Void>> jsPayResultService(
		@Field("payLogId") @Description("支付日志id") payLogId:String,
		@Field("payStatus") @Description("js支付结果:0:失败1:成功") payStatus:String,
		@Field("prizeLogId") @Description("奖品兑换id") prizeLogId:String
	):  Flowable<T>


	@Description("用户兑换记录分页查询")
	@FormUrlEncoded
	@POST(Constants.API.LIST1_SERVICE_Url)
	fun <T:BaseResult<Void>> list1Service(
		@Field("current") @Description("当前页码（非必须参数）") current:String?,
		@Field("memberId") @Description("用户id") memberId:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?
	):  Flowable<T>


	@Description("幸运大抽奖")
	@FormUrlEncoded
	@POST(Constants.API.DRAW_PRIZE_SERVICE_Url)
	fun <T:BaseResult<Void>> drawPrizeService(
		@Field("drawType") @Description("抽奖方式（1:单;5:五）") drawType:String,
		@Field("memberId") @Description("用户id") memberId:String,
		@Field("size") @Description("奖品size类型：0：小1：大2：通用") size:String
	):  Flowable<T>


	@Description("删除")
	@FormUrlEncoded
	@POST(Constants.API.DELETE_SERVICE_Url)
	fun <T:BaseResult<Void>> deleteService(
		@Field("id") @Description("id") id:String
	):  Flowable<T>


	@Description("用户中奖记录分页查询")
	@FormUrlEncoded
	@POST(Constants.API.LIST5_SERVICE_Url)
	fun <T:BaseResult<Void>> list5Service(
		@Field("current") @Description("当前页码（非必须参数）") current:String?,
		@Field("memberId") @Description("用户id") memberId:String,
		@Field("pageSize") @Description("每页条数（非必须参数）") pageSize:String?,
		@Field("type") @Description("奖品类型：0：实物1：积分2：月会员3：年会员（非必须参数）") type:String?
	):  Flowable<T>

}