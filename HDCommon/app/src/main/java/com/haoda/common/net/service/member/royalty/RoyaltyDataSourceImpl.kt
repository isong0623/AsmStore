package com.haoda.common.net.service.member.royalty

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class RoyaltyDataSourceImpl : BaseDataSource() {

	var service = object : RoyaltyDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("获取用户粉丝全部数据")
	fun<T:BaseResult<Void>> findMemberIdByFansRoyalty(
		@Description("当前登录用户ID") memberId:String,
		@Description("页数（非必须参数）") pageNum:String? = null,
		@Description("每页的条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.findMemberIdByFansRoyalty<T>(memberId,pageNum,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> findMemberIdByFansRoyalty(
		@Description("当前登录用户ID") memberId:String,
		@Description("页数（非必须参数）") pageNum:String? = null,
		@Description("每页的条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.findMemberIdByFansRoyalty<T>(memberId,pageNum,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取用户提现历史记录")
	fun<T:BaseResult<Void>> getMemberWithdrawRoyalty(
		@Description("当前登录用户ID(不可为空)") memberId:String,
		@Description("pageNum（非必须参数）") pageNum:String? = null,
		@Description("pageSize（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getMemberWithdrawRoyalty<T>(memberId,pageNum,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getMemberWithdrawRoyalty(
		@Description("当前登录用户ID(不可为空)") memberId:String,
		@Description("pageNum（非必须参数）") pageNum:String? = null,
		@Description("pageSize（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getMemberWithdrawRoyalty<T>(memberId,pageNum,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("月度概况")
	fun<T:BaseResult<Void>> monthlySurveyRoyalty(
		@Description("当前页（非必须参数）") currentPage:String? = null,
		@Description("粉丝条件（1-直属粉丝，2-二级粉丝）（非必须参数）") fansCondition:String? = null,
		@Description("月条件（1-本月，2-上月）（非必须参数）") monthCondition:String? = null,
		@Description("查询条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.monthlySurveyRoyalty<T>(currentPage,fansCondition,monthCondition,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> monthlySurveyRoyalty(
		@Description("当前页（非必须参数）") currentPage:String? = null,
		@Description("粉丝条件（1-直属粉丝，2-二级粉丝）（非必须参数）") fansCondition:String? = null,
		@Description("月条件（1-本月，2-上月）（非必须参数）") monthCondition:String? = null,
		@Description("查询条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.monthlySurveyRoyalty<T>(currentPage,fansCondition,monthCondition,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("根据用户ID获取银行卡列表信息")
	fun<T:BaseResult<Void>> getMemberBankRoyalty(
		@Description("当前登录用户ID(ID为空，随机码不可为空)") memberId:String,
		@Description("pageNum（非必须参数）") pageNum:String? = null,
		@Description("pageSize（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getMemberBankRoyalty<T>(memberId,pageNum,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getMemberBankRoyalty(
		@Description("当前登录用户ID(ID为空，随机码不可为空)") memberId:String,
		@Description("pageNum（非必须参数）") pageNum:String? = null,
		@Description("pageSize（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getMemberBankRoyalty<T>(memberId,pageNum,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("保存新的银行卡信息")
	fun<T:BaseResult<Void>> saveMemberBankRoyalty(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.saveMemberBankRoyalty<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> saveMemberBankRoyalty(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.saveMemberBankRoyalty<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("今日/昨日概况")
	fun<T:BaseResult<Void>> daySurveyRoyalty(
		@Description("当前页（非必须参数）") currentPage:String? = null,
		@Description("日条件（1-今天，2-昨天）（非必须参数）") dayCondition:String? = null,
		@Description("粉丝条件（1-直属粉丝，2-二级粉丝）（非必须参数）") fansCondition:String? = null,
		@Description("查询条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.daySurveyRoyalty<T>(currentPage,dayCondition,fansCondition,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> daySurveyRoyalty(
		@Description("当前页（非必须参数）") currentPage:String? = null,
		@Description("日条件（1-今天，2-昨天）（非必须参数）") dayCondition:String? = null,
		@Description("粉丝条件（1-直属粉丝，2-二级粉丝）（非必须参数）") fansCondition:String? = null,
		@Description("查询条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.daySurveyRoyalty<T>(currentPage,dayCondition,fansCondition,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("我的收益")
	fun<T:BaseResult<Void>> myProfitRoyalty(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.myProfitRoyalty<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> myProfitRoyalty(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.myProfitRoyalty<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("验证用户是否微信授权")
	fun<T:BaseResult<Void>> wechatAuthorizationRoyalty(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.wechatAuthorizationRoyalty<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> wechatAuthorizationRoyalty(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.wechatAuthorizationRoyalty<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取用户粉丝当日数据")
	fun<T:BaseResult<Void>> findMemberIdByDayFansRoyalty(
		@Description("天数（非必须参数）") isType:String? = null,
		@Description("当前登录用户ID") memberId:String,
		@Description("页数（非必须参数）") pageNum:String? = null,
		@Description("每页的条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.findMemberIdByDayFansRoyalty<T>(isType,memberId,pageNum,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> findMemberIdByDayFansRoyalty(
		@Description("天数（非必须参数）") isType:String? = null,
		@Description("当前登录用户ID") memberId:String,
		@Description("页数（非必须参数）") pageNum:String? = null,
		@Description("每页的条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.findMemberIdByDayFansRoyalty<T>(isType,memberId,pageNum,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("账单明细")
	fun<T:BaseResult<Void>> billdetailsRoyalty(
		@Description("当前页（非必须参数）") currentPage:String? = null,
		@Description("查询条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.billdetailsRoyalty<T>(currentPage,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> billdetailsRoyalty(
		@Description("当前页（非必须参数）") currentPage:String? = null,
		@Description("查询条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.billdetailsRoyalty<T>(currentPage,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("直播收益详情")
	fun<T:BaseResult<Void>> liveProfitDetailRoyalty(
		@Description("当前页（非必须参数）") currentPage:String? = null,
		@Description("直播结束时间") endTime:String,
		@Description("查询条数（非必须参数）") pageSize:String? = null,
		@Description("直播开始时间") startTime:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.liveProfitDetailRoyalty<T>(currentPage,endTime,pageSize,startTime).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> liveProfitDetailRoyalty(
		@Description("当前页（非必须参数）") currentPage:String? = null,
		@Description("直播结束时间") endTime:String,
		@Description("查询条数（非必须参数）") pageSize:String? = null,
		@Description("直播开始时间") startTime:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.liveProfitDetailRoyalty<T>(currentPage,endTime,pageSize,startTime).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取用户首页分销数据")
	fun<T:BaseResult<Void>> findMemberIdByLogRoyalty(
		@Description("当前登录用户ID（非必须参数）") memberId:String? = null,
		@Description("分享用户随机码（非必须参数）") random:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.findMemberIdByLogRoyalty<T>(memberId,random).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> findMemberIdByLogRoyalty(
		@Description("当前登录用户ID（非必须参数）") memberId:String? = null,
		@Description("分享用户随机码（非必须参数）") random:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.findMemberIdByLogRoyalty<T>(memberId,random).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("支付成功添加分销订单记录")
	fun<T:BaseResult<Void>> saveRecordRoyalty(
		@Description("订单id") orderId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.saveRecordRoyalty<T>(orderId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> saveRecordRoyalty(
		@Description("订单id") orderId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.saveRecordRoyalty<T>(orderId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取用户分销基础数据/可提现余额")
	fun<T:BaseResult<Void>> detailRoyalty(
		@Description("当前登录用户ID") memberId:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detailRoyalty<T>(memberId).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detailRoyalty(
		@Description("当前登录用户ID") memberId:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detailRoyalty<T>(memberId).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("提现-提现余额")
	fun<T:BaseResult<Void>> getPostalCashRoyalty(
		@Description("提现额度") amount:String,
		@Description("银行卡号（非必须参数）") bankId:String? = null,
		@Description("当前登录用户ID") memberId:String,
		@Description("提现方式,0-银行卡，1-微信") postalCashWay:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getPostalCashRoyalty<T>(amount,bankId,memberId,postalCashWay).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getPostalCashRoyalty(
		@Description("提现额度") amount:String,
		@Description("银行卡号（非必须参数）") bankId:String? = null,
		@Description("当前登录用户ID") memberId:String,
		@Description("提现方式,0-银行卡，1-微信") postalCashWay:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getPostalCashRoyalty<T>(amount,bankId,memberId,postalCashWay).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取用户分销数据")
	fun<T:BaseResult<Void>> findMemberIdByLogDetailsRoyalty(
		@Description("当前登录用户ID") memberId:String,
		@Description("页数（非必须参数）") pageNum:String? = null,
		@Description("每页的条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.findMemberIdByLogDetailsRoyalty<T>(memberId,pageNum,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> findMemberIdByLogDetailsRoyalty(
		@Description("当前登录用户ID") memberId:String,
		@Description("页数（非必须参数）") pageNum:String? = null,
		@Description("每页的条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.findMemberIdByLogDetailsRoyalty<T>(memberId,pageNum,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("查询用户分销体系(没有则添加)")
	fun<T:BaseResult<Void>> saveMemberRoyalty(
		@Description("当前登录用户ID(ID为空，随机码不可为空)（非必须参数）") memberId:String? = null,
		@Description("分享用户随机码(随机码为空，ID不可为空)（非必须参数）") random:String? = null,
		@Description("time") time:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.saveMemberRoyalty<T>(memberId,random,time).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> saveMemberRoyalty(
		@Description("当前登录用户ID(ID为空，随机码不可为空)（非必须参数）") memberId:String? = null,
		@Description("分享用户随机码(随机码为空，ID不可为空)（非必须参数）") random:String? = null,
		@Description("time") time:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.saveMemberRoyalty<T>(memberId,random,time).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取直播记录")
	fun<T:BaseResult<Void>> getliveRecordRoyalty(
		@Description("当前页（非必须参数）") currentPage:String? = null,
		@Description("查询条数（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getliveRecordRoyalty<T>(currentPage,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getliveRecordRoyalty(
		@Description("当前页（非必须参数）") currentPage:String? = null,
		@Description("查询条数（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getliveRecordRoyalty<T>(currentPage,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}