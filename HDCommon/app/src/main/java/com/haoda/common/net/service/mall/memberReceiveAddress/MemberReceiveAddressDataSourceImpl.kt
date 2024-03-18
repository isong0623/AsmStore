package com.haoda.common.net.service.mall.memberReceiveAddress

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class MemberReceiveAddressDataSourceImpl : BaseDataSource() {

	var service = object : MemberReceiveAddressDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("详细信息")
	fun<T:BaseResult<Void>> detailMemberReceiveAddress(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.detailMemberReceiveAddress<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> detailMemberReceiveAddress(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.detailMemberReceiveAddress<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("删除")
	fun<T:BaseResult<Void>> deleteMemberReceiveAddress(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.deleteMemberReceiveAddress<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> deleteMemberReceiveAddress(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.deleteMemberReceiveAddress<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("设置默认地址")
	fun<T:BaseResult<Void>> setDefaultAddressMemberReceiveAddress(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.setDefaultAddressMemberReceiveAddress<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> setDefaultAddressMemberReceiveAddress(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.setDefaultAddressMemberReceiveAddress<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("修改")
	fun<T:BaseResult<Void>> updateMemberReceiveAddress(
		@Description("城市（非必须参数）") city:String? = null,
		@Description("是否为默认(0->不是1->是)（非必须参数）") defaultStatus:String? = null,
		@Description("详细地址（非必须参数）") detailAddress:String? = null,
		@Description("id") id:String,
		@Description("收货人名称（非必须参数）") name:String? = null,
		@Description("手机号（非必须参数）") phoneNumber:String? = null,
		@Description("邮政编码（非必须参数）") postCode:String? = null,
		@Description("省份/直辖市（非必须参数）") province:String? = null,
		@Description("区（非必须参数）") region:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.updateMemberReceiveAddress<T>(city,defaultStatus,detailAddress,id,name,phoneNumber,postCode,province,region).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> updateMemberReceiveAddress(
		@Description("城市（非必须参数）") city:String? = null,
		@Description("是否为默认(0->不是1->是)（非必须参数）") defaultStatus:String? = null,
		@Description("详细地址（非必须参数）") detailAddress:String? = null,
		@Description("id") id:String,
		@Description("收货人名称（非必须参数）") name:String? = null,
		@Description("手机号（非必须参数）") phoneNumber:String? = null,
		@Description("邮政编码（非必须参数）") postCode:String? = null,
		@Description("省份/直辖市（非必须参数）") province:String? = null,
		@Description("区（非必须参数）") region:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.updateMemberReceiveAddress<T>(city,defaultStatus,detailAddress,id,name,phoneNumber,postCode,province,region).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取默认收货地址")
	fun<T:BaseResult<Void>> getDefaultAddressMemberReceiveAddress(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getDefaultAddressMemberReceiveAddress<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getDefaultAddressMemberReceiveAddress(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getDefaultAddressMemberReceiveAddress<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("添加")
	fun<T:BaseResult<Void>> saveMemberReceiveAddress(
		@Description("城市") city:String,
		@Description("是否为默认(0->不是1->是)") defaultStatus:String,
		@Description("详细地址") detailAddress:String,
		@Description("收货人名称") name:String,
		@Description("手机号") phoneNumber:String,
		@Description("邮政编码（非必须参数）") postCode:String? = null,
		@Description("省份/直辖市") province:String,
		@Description("区") region:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.saveMemberReceiveAddress<T>(city,defaultStatus,detailAddress,name,phoneNumber,postCode,province,region).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> saveMemberReceiveAddress(
		@Description("城市") city:String,
		@Description("是否为默认(0->不是1->是)") defaultStatus:String,
		@Description("详细地址") detailAddress:String,
		@Description("收货人名称") name:String,
		@Description("手机号") phoneNumber:String,
		@Description("邮政编码（非必须参数）") postCode:String? = null,
		@Description("省份/直辖市") province:String,
		@Description("区") region:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.saveMemberReceiveAddress<T>(city,defaultStatus,detailAddress,name,phoneNumber,postCode,province,region).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取所有")
	fun<T:BaseResult<Void>> listMemberReceiveAddress(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.listMemberReceiveAddress<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> listMemberReceiveAddress(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.listMemberReceiveAddress<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}