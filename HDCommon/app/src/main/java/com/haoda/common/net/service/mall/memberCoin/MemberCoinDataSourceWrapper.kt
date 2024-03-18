package com.haoda.common.net.service.mall.memberCoin

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface MemberCoinDataSourceWrapper {
	fun <T:BaseResult<Void>> goldIndexMemberCoin():Flowable<T> {
		return ApiEngine.getService(MemberCoinService::class.java)
			.goldIndexMemberCoin<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> copperIndexMemberCoin():Flowable<T> {
		return ApiEngine.getService(MemberCoinService::class.java)
			.copperIndexMemberCoin<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> memberCopperLogPageMemberCoin(currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(MemberCoinService::class.java)
			.memberCopperLogPageMemberCoin<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> copperToGoldMemberCoin(count:String):Flowable<T> {
		return ApiEngine.getService(MemberCoinService::class.java)
			.copperToGoldMemberCoin<T>(count)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> memberGoldLogPageMemberCoin(currentPage:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(MemberCoinService::class.java)
			.memberGoldLogPageMemberCoin<T>(currentPage,pageSize)
			.compose(RxSchedulers.io_main())
	}

}