package com.haoda.common.net.service.member.TbMemberVip

import com.haoda.common.net.service.BaseDataSource
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.annotation.Description
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class TbMemberVipDataSourceImpl : BaseDataSource() {

	var service = object : TbMemberVipDataSourceWrapper{}
	var cd: CompositeDisposable? = CompositeDisposable()

	@Description("查询会员商品信息")
	fun<T:BaseResult<Void>> findPageToProListTbMemberVip(
		@Description("pageNum（非必须参数）") pageNum:String? = null,
		@Description("pageSize（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.findPageToProListTbMemberVip<T>(pageNum,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> findPageToProListTbMemberVip(
		@Description("pageNum（非必须参数）") pageNum:String? = null,
		@Description("pageSize（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.findPageToProListTbMemberVip<T>(pageNum,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("猜你喜欢的商品")
	fun<T:BaseResult<Void>> getGuessYouLikePageTbMemberVip(
		@Description("pageNum（非必须参数）") pageNum:String? = null,
		@Description("pageSize（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getGuessYouLikePageTbMemberVip<T>(pageNum,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getGuessYouLikePageTbMemberVip(
		@Description("pageNum（非必须参数）") pageNum:String? = null,
		@Description("pageSize（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getGuessYouLikePageTbMemberVip<T>(pageNum,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("根据用户手机号查询会员信息")
	fun<T:BaseResult<Void>> selectFormemberIdTbMemberVip(
		@Description("购买时间（非必须参数）") buyingTime:String? = null,
		@Description("来源渠道0:后台添加1：用户购买2：积分抽奖（非必须参数）") channel:String? = null,
		@Description("（非必须参数）") createTime:String? = null,
		@Description("创建人（非必须参数）") createUser:String? = null,
		@Description("折扣率（非必须参数）") discount:String? = null,
		@Description("到期时间（非必须参数）") dueTime:String? = null,
		@Description("（非必须参数）") id:String? = null,
		@Description("用户ID（非必须参数）") memberId:String? = null,
		@Description("用户手机号") mobile:String,
		@Description("（非必须参数）") updateTime:String? = null,
		@Description("（非必须参数）") updateUser:String? = null,
		@Description("折扣率（非必须参数）") vipType:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.selectFormemberIdTbMemberVip<T>(buyingTime,channel,createTime,createUser,discount,dueTime,id,memberId,mobile,updateTime,updateUser,vipType).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> selectFormemberIdTbMemberVip(
		@Description("购买时间（非必须参数）") buyingTime:String? = null,
		@Description("来源渠道0:后台添加1：用户购买2：积分抽奖（非必须参数）") channel:String? = null,
		@Description("（非必须参数）") createTime:String? = null,
		@Description("创建人（非必须参数）") createUser:String? = null,
		@Description("折扣率（非必须参数）") discount:String? = null,
		@Description("到期时间（非必须参数）") dueTime:String? = null,
		@Description("（非必须参数）") id:String? = null,
		@Description("用户ID（非必须参数）") memberId:String? = null,
		@Description("用户手机号") mobile:String,
		@Description("（非必须参数）") updateTime:String? = null,
		@Description("（非必须参数）") updateUser:String? = null,
		@Description("折扣率（非必须参数）") vipType:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.selectFormemberIdTbMemberVip<T>(buyingTime,channel,createTime,createUser,discount,dueTime,id,memberId,mobile,updateTime,updateUser,vipType).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("获取分页数据")
	fun<T:BaseResult<Void>> findListByPageTbMemberVip(
		@Description("购买时间（非必须参数）") buyingTime:String? = null,
		@Description("来源渠道（非必须参数）") channel:String? = null,
		@Description("（非必须参数）") createTime:String? = null,
		@Description("创建人（非必须参数）") createUser:String? = null,
		@Description("折扣率（非必须参数）") discount:String? = null,
		@Description("到期时间（非必须参数）") dueTime:String? = null,
		@Description("（非必须参数）") id:String? = null,
		@Description("用户ID（非必须参数）") memberId:String? = null,
		@Description("用户手机号（非必须参数）") mobile:String? = null,
		@Description("pageNum（非必须参数）") pageNum:String? = null,
		@Description("（非必须参数）") updateTime:String? = null,
		@Description("（非必须参数）") updateUser:String? = null,
		@Description("折扣率（非必须参数）") vipType:String? = null,
		@Description("pageSize（非必须参数）") pageSize:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.findListByPageTbMemberVip<T>(buyingTime,channel,createTime,createUser,discount,dueTime,id,memberId,mobile,pageNum,updateTime,updateUser,vipType,pageSize).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> findListByPageTbMemberVip(
		@Description("购买时间（非必须参数）") buyingTime:String? = null,
		@Description("来源渠道（非必须参数）") channel:String? = null,
		@Description("（非必须参数）") createTime:String? = null,
		@Description("创建人（非必须参数）") createUser:String? = null,
		@Description("折扣率（非必须参数）") discount:String? = null,
		@Description("到期时间（非必须参数）") dueTime:String? = null,
		@Description("（非必须参数）") id:String? = null,
		@Description("用户ID（非必须参数）") memberId:String? = null,
		@Description("用户手机号（非必须参数）") mobile:String? = null,
		@Description("pageNum（非必须参数）") pageNum:String? = null,
		@Description("（非必须参数）") updateTime:String? = null,
		@Description("（非必须参数）") updateUser:String? = null,
		@Description("折扣率（非必须参数）") vipType:String? = null,
		@Description("pageSize（非必须参数）") pageSize:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.findListByPageTbMemberVip<T>(buyingTime,channel,createTime,createUser,discount,dueTime,id,memberId,mobile,pageNum,updateTime,updateUser,vipType,pageSize).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("查询会员id列表")
	fun<T:BaseResult<Void>> getVipMemberIdTbMemberVip(
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.getVipMemberIdTbMemberVip<T>().subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> getVipMemberIdTbMemberVip(
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.getVipMemberIdTbMemberVip<T>().subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("根据ID删除数据")
	fun<T:BaseResult<Void>> deleteTbMemberVip(
		@Description("id") id:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.deleteTbMemberVip<T>(id).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> deleteTbMemberVip(
		@Description("id") id:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.deleteTbMemberVip<T>(id).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("修改会员数据")
	fun<T:BaseResult<Void>> updateTbMemberVip(
		@Description("购买时间（非必须参数）") buyingTime:String? = null,
		@Description("来源渠道0:后台添加1：用户购买2：积分抽奖（非必须参数）") channel:String? = null,
		@Description("（非必须参数）") createTime:String? = null,
		@Description("创建人（非必须参数）") createUser:String? = null,
		@Description("折扣率（非必须参数）") discount:String? = null,
		@Description("到期时间（非必须参数）") dueTime:String? = null,
		@Description("（非必须参数）") id:String? = null,
		@Description("用户ID（非必须参数）") memberId:String? = null,
		@Description("用户手机号（非必须参数）") mobile:String? = null,
		@Description("（非必须参数）") updateTime:String? = null,
		@Description("（非必须参数）") updateUser:String? = null,
		@Description("折扣率（非必须参数）") vipType:String? = null,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.updateTbMemberVip<T>(buyingTime,channel,createTime,createUser,discount,dueTime,id,memberId,mobile,updateTime,updateUser,vipType).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> updateTbMemberVip(
		@Description("购买时间（非必须参数）") buyingTime:String? = null,
		@Description("来源渠道0:后台添加1：用户购买2：积分抽奖（非必须参数）") channel:String? = null,
		@Description("（非必须参数）") createTime:String? = null,
		@Description("创建人（非必须参数）") createUser:String? = null,
		@Description("折扣率（非必须参数）") discount:String? = null,
		@Description("到期时间（非必须参数）") dueTime:String? = null,
		@Description("（非必须参数）") id:String? = null,
		@Description("用户ID（非必须参数）") memberId:String? = null,
		@Description("用户手机号（非必须参数）") mobile:String? = null,
		@Description("（非必须参数）") updateTime:String? = null,
		@Description("（非必须参数）") updateUser:String? = null,
		@Description("折扣率（非必须参数）") vipType:String? = null,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.updateTbMemberVip<T>(buyingTime,channel,createTime,createUser,discount,dueTime,id,memberId,mobile,updateTime,updateUser,vipType).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("批量删除数据")
	fun<T:BaseResult<Void>> deleteBatIdsTbMemberVip(
		@Description("ids") ids:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.deleteBatIdsTbMemberVip<T>(ids).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> deleteBatIdsTbMemberVip(
		@Description("ids") ids:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.deleteBatIdsTbMemberVip<T>(ids).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}

	@Description("添加会员VIP的接口")
	fun<T:BaseResult<Void>> addTbMemberVip(
		@Description("来源渠道0:后台添加1：用户购买-支付宝2：积分抽奖3：用户购买-微信支付4:用户购买-小程序（非必须参数）") channel:String? = null,
		@Description("折扣率（非必须参数）") discount:String? = null,
		@Description("用户id,channel!=0必传（非必须参数）") memberId:String? = null,
		@Description("手机号,channel=0必传（非必须参数）") mobile:String? = null,
		@Description("会员类型：2：月会员3：年会员") vipType:String,
		onNext: Consumer<in T?>?,
		onError: Consumer<in Throwable?>?= defaultErrorProcessor,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: Consumer<in Subscription> = defaultSubscriptionProcessor
	) {
		cd?.add(service.addTbMemberVip<T>(channel,discount,memberId,mobile,vipType).subscribe(onNext,onError,onComplete,onSubscribe))
	}

	fun<T:BaseResult<Void>> addTbMemberVip(
		@Description("来源渠道0:后台添加1：用户购买-支付宝2：积分抽奖3：用户购买-微信支付4:用户购买-小程序（非必须参数）") channel:String? = null,
		@Description("折扣率（非必须参数）") discount:String? = null,
		@Description("用户id,channel!=0必传（非必须参数）") memberId:String? = null,
		@Description("手机号,channel=0必传（非必须参数）") mobile:String? = null,
		@Description("会员类型：2：月会员3：年会员") vipType:String,
		onNext: (result:T) -> Unit,
		onError: (e:Throwable) -> Unit = defaultErrorProcessor_K,
		onComplete: Action = defaultCompleteProcessor,
		onSubscribe: (s:Subscription) ->Unit = {}
	) {
		cd?.add(service.addTbMemberVip<T>(channel,discount,memberId,mobile,vipType).subscribe({onNext(it)},{onError(it)},{onComplete.run()},{onSubscribe(it)}))
	}


	fun destory(){
		cd?.clear()
		cd = null
	}
}