package com.haoda.common.net.service.member.finance

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class FinanceDataSourceImpl : BaseDataSource() {

	var service = object : FinanceDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("银行卡对账状态")
	fun<T:BaseResult<Void>> auditStatusFinance(
		@Description("该条记录的Id") auditId:String,
		@Description("当前操作的状态，1-审核中，2-审核成功，3-完成") auditState:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.auditStatusFinance<T>(auditId,auditState).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> auditStatusFinance(
		@Description("该条记录的Id") auditId:String,
		@Description("当前操作的状态，1-审核中，2-审核成功，3-完成") auditState:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.auditStatusFinance<T>(auditId,auditState).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("财务对账数据")
	fun<T:BaseResult<Void>> reconciliationManagementFinance(
		@Description("pageNum（非必须参数）") pageNum:String? = null,
		@Description("pageSize（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.reconciliationManagementFinance<T>(pageNum,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> reconciliationManagementFinance(
		@Description("pageNum（非必须参数）") pageNum:String? = null,
		@Description("pageSize（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.reconciliationManagementFinance<T>(pageNum,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("微信对账状态")
	fun<T:BaseResult<Void>> wechatAuditStatusFinance(
		@Description("该条记录的Id") auditId:String,
		@Description("当前操作的状态，1-审核中，2-审核成功，同意打款") auditState:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.wechatAuditStatusFinance<T>(auditId,auditState).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> wechatAuditStatusFinance(
		@Description("该条记录的Id") auditId:String,
		@Description("当前操作的状态，1-审核中，2-审核成功，同意打款") auditState:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.wechatAuditStatusFinance<T>(auditId,auditState).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}