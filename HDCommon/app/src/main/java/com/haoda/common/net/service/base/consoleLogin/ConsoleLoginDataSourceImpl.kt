package com.haoda.common.net.service.base.consoleLogin

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class ConsoleLoginDataSourceImpl : BaseDataSource() {

	var service = object : ConsoleLoginDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("登录")
	fun<T:BaseResult<Void>> loginConsoleLogin(
		@Description("密码") password:String,
		@Description("用户名") userName:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.loginConsoleLogin<T>(password,userName).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> loginConsoleLogin(
		@Description("密码") password:String,
		@Description("用户名") userName:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.loginConsoleLogin<T>(password,userName).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}