package com.haoda.common.net.service.lucky.service

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class ServiceDataSourceImpl : BaseDataSource() {

	var service = object : ServiceDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("后台分页查询")
	fun<T:BaseResult<Void>> listService(
		@Description("当前页码（非必须参数）") current:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("奖品size类型：0：小1：大（非必须参数）") size:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.listService<T>(current,pageSize,size).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> listService(
		@Description("当前页码（非必须参数）") current:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("奖品size类型：0：小1：大（非必须参数）") size:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.listService<T>(current,pageSize,size).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("根据id查详情")
	fun<T:BaseResult<Void>> detailByIdService(
		@Description("orizeLogId") orizeLogId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detailByIdService<T>(orizeLogId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detailByIdService(
		@Description("orizeLogId") orizeLogId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detailByIdService<T>(orizeLogId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("修改")
	fun<T:BaseResult<Void>> updateService(
		@Description("是否可用：0：不可用1：可用（非必须参数）") enable:String? = null,
		@Description("运费，保留小数点后两位（非必须参数）") freight:String? = null,
		@Description("id") id:String,
		@Description("如果是积分，代表积分数量，其他无意义（非必须参数）") integralNum:String? = null,
		@Description("奖品等级id（非必须参数）") levelId:String? = null,
		@Description("奖品等级（非必须参数）") levelName:String? = null,
		@Description("奖品数量（非必须参数）") number:String? = null,
		@Description("奖品描述（非必须参数）") prizeDesc:String? = null,
		@Description("奖品图片url（非必须参数）") prizeImg:String? = null,
		@Description("奖品小图片one（非必须参数）") prizeImgOne:String? = null,
		@Description("奖品小图片two（非必须参数）") prizeImgTwo:String? = null,
		@Description("奖品名称（非必须参数）") prizeName:String? = null,
		@Description("是否第一个弹窗展示：0：否1：是（非必须参数）") showFirst:String? = null,
		@Description("奖品大小类型：0：小1：大（非必须参数）") size:String? = null,
		@Description("排序（非必须参数）") sort:String? = null,
		@Description("奖品类型：0：实物1：虚拟（非必须参数）") type:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.updateService<T>(enable,freight,id,integralNum,levelId,levelName,number,prizeDesc,prizeImg,prizeImgOne,prizeImgTwo,prizeName,showFirst,size,sort,type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> updateService(
		@Description("是否可用：0：不可用1：可用（非必须参数）") enable:String? = null,
		@Description("运费，保留小数点后两位（非必须参数）") freight:String? = null,
		@Description("id") id:String,
		@Description("如果是积分，代表积分数量，其他无意义（非必须参数）") integralNum:String? = null,
		@Description("奖品等级id（非必须参数）") levelId:String? = null,
		@Description("奖品等级（非必须参数）") levelName:String? = null,
		@Description("奖品数量（非必须参数）") number:String? = null,
		@Description("奖品描述（非必须参数）") prizeDesc:String? = null,
		@Description("奖品图片url（非必须参数）") prizeImg:String? = null,
		@Description("奖品小图片one（非必须参数）") prizeImgOne:String? = null,
		@Description("奖品小图片two（非必须参数）") prizeImgTwo:String? = null,
		@Description("奖品名称（非必须参数）") prizeName:String? = null,
		@Description("是否第一个弹窗展示：0：否1：是（非必须参数）") showFirst:String? = null,
		@Description("奖品大小类型：0：小1：大（非必须参数）") size:String? = null,
		@Description("排序（非必须参数）") sort:String? = null,
		@Description("奖品类型：0：实物1：虚拟（非必须参数）") type:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.updateService<T>(enable,freight,id,integralNum,levelId,levelName,number,prizeDesc,prizeImg,prizeImgOne,prizeImgTwo,prizeName,showFirst,size,sort,type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("首窗展示")
	fun<T:BaseResult<Void>> firstShowService(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.firstShowService<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> firstShowService(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.firstShowService<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("发货")
	fun<T:BaseResult<Void>> update2Service(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.update2Service<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> update2Service(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.update2Service<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("分页查询")
	fun<T:BaseResult<Void>> list_2Service(
		@Description("当前页码（非必须参数）") current:String? = null,
		@Description("发货状态：0->待付款；1->待发货；2->已发货99:默认未支付（非必须参数）") delivery:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("奖品类型：0：实物1：积分2：月会员3：年会员（非必须参数）") type:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.list_2Service<T>(current,delivery,pageSize,type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> list_2Service(
		@Description("当前页码（非必须参数）") current:String? = null,
		@Description("发货状态：0->待付款；1->待发货；2->已发货99:默认未支付（非必须参数）") delivery:String? = null,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("奖品类型：0：实物1：积分2：月会员3：年会员（非必须参数）") type:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.list_2Service<T>(current,delivery,pageSize,type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("按奖品大小类型查询list")
	fun<T:BaseResult<Void>> list_1Service(
		@Description("奖品大小类型：0：小1：大") size:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.list_1Service<T>(size).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> list_1Service(
		@Description("奖品大小类型：0：小1：大") size:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.list_1Service<T>(size).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("奖品-立即兑换-下单")
	fun<T:BaseResult<Void>> update1Service(
		@Description("领奖人地址") address:String,
		@Description("运费，保留小数点后两位，比如10.00,不填默认0.00") freight:String,
		@Description("id") id:String,
		@Description("用户id") memberId:String,
		@Description("领奖人手机号") mobile:String,
		@Description("支付方式：0->未支付；1->支付宝；2->微信;3->微信小程序") payType:String,
		@Description("领奖人姓名") username:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.update1Service<T>(address,freight,id,memberId,mobile,payType,username).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> update1Service(
		@Description("领奖人地址") address:String,
		@Description("运费，保留小数点后两位，比如10.00,不填默认0.00") freight:String,
		@Description("id") id:String,
		@Description("用户id") memberId:String,
		@Description("领奖人手机号") mobile:String,
		@Description("支付方式：0->未支付；1->支付宝；2->微信;3->微信小程序") payType:String,
		@Description("领奖人姓名") username:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.update1Service<T>(address,freight,id,memberId,mobile,payType,username).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("添加")
	fun<T:BaseResult<Void>> saveService(
		@Description("是否可用：0：不可用1：可用") enable:String,
		@Description("运费，保留小数点后两位，比如10.00,不填默认0.00") freight:String,
		@Description("如果是积分，代表积分数量，其他无意义") integralNum:String,
		@Description("奖品等级id") levelId:String,
		@Description("奖品等级") levelName:String,
		@Description("奖品数量") number:String,
		@Description("奖品描述") prizeDesc:String,
		@Description("奖品图片url") prizeImg:String,
		@Description("奖品小图片one,不填默认'0'") prizeImgOne:String,
		@Description("奖品小图片two,不填默认'0'") prizeImgTwo:String,
		@Description("奖品名称") prizeName:String,
		@Description("是否第一个弹窗展示：0：否1：是") showFirst:String,
		@Description("奖品size类型：0：小1：大") size:String,
		@Description("排序") sort:String,
		@Description("奖品虚实类型：0：实物1：虚拟") type:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.saveService<T>(enable,freight,integralNum,levelId,levelName,number,prizeDesc,prizeImg,prizeImgOne,prizeImgTwo,prizeName,showFirst,size,sort,type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> saveService(
		@Description("是否可用：0：不可用1：可用") enable:String,
		@Description("运费，保留小数点后两位，比如10.00,不填默认0.00") freight:String,
		@Description("如果是积分，代表积分数量，其他无意义") integralNum:String,
		@Description("奖品等级id") levelId:String,
		@Description("奖品等级") levelName:String,
		@Description("奖品数量") number:String,
		@Description("奖品描述") prizeDesc:String,
		@Description("奖品图片url") prizeImg:String,
		@Description("奖品小图片one,不填默认'0'") prizeImgOne:String,
		@Description("奖品小图片two,不填默认'0'") prizeImgTwo:String,
		@Description("奖品名称") prizeName:String,
		@Description("是否第一个弹窗展示：0：否1：是") showFirst:String,
		@Description("奖品size类型：0：小1：大") size:String,
		@Description("排序") sort:String,
		@Description("奖品虚实类型：0：实物1：虚拟") type:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.saveService<T>(enable,freight,integralNum,levelId,levelName,number,prizeDesc,prizeImg,prizeImgOne,prizeImgTwo,prizeName,showFirst,size,sort,type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("js支付结果通知")
	fun<T:BaseResult<Void>> jsPayResultService(
		@Description("支付日志id") payLogId:String,
		@Description("js支付结果:0:失败1:成功") payStatus:String,
		@Description("奖品兑换id") prizeLogId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.jsPayResultService<T>(payLogId,payStatus,prizeLogId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> jsPayResultService(
		@Description("支付日志id") payLogId:String,
		@Description("js支付结果:0:失败1:成功") payStatus:String,
		@Description("奖品兑换id") prizeLogId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.jsPayResultService<T>(payLogId,payStatus,prizeLogId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("用户兑换记录分页查询")
	fun<T:BaseResult<Void>> list1Service(
		@Description("当前页码（非必须参数）") current:String? = null,
		@Description("用户id") memberId:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.list1Service<T>(current,memberId,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> list1Service(
		@Description("当前页码（非必须参数）") current:String? = null,
		@Description("用户id") memberId:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.list1Service<T>(current,memberId,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("幸运大抽奖")
	fun<T:BaseResult<Void>> drawPrizeService(
		@Description("抽奖方式（1:单;5:五）") drawType:String,
		@Description("用户id") memberId:String,
		@Description("奖品size类型：0：小1：大2：通用") size:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.drawPrizeService<T>(drawType,memberId,size).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> drawPrizeService(
		@Description("抽奖方式（1:单;5:五）") drawType:String,
		@Description("用户id") memberId:String,
		@Description("奖品size类型：0：小1：大2：通用") size:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.drawPrizeService<T>(drawType,memberId,size).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("删除")
	fun<T:BaseResult<Void>> deleteService(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.deleteService<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> deleteService(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.deleteService<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("用户中奖记录分页查询")
	fun<T:BaseResult<Void>> list5Service(
		@Description("当前页码（非必须参数）") current:String? = null,
		@Description("用户id") memberId:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("奖品类型：0：实物1：积分2：月会员3：年会员（非必须参数）") type:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.list5Service<T>(current,memberId,pageSize,type).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> list5Service(
		@Description("当前页码（非必须参数）") current:String? = null,
		@Description("用户id") memberId:String,
		@Description("每页条数（非必须参数）") pageSize:String? = null,
		@Description("奖品类型：0：实物1：积分2：月会员3：年会员（非必须参数）") type:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.list5Service<T>(current,memberId,pageSize,type).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}