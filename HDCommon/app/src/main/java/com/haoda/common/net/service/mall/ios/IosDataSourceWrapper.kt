package com.haoda.common.net.service.mall.ios

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface IosDataSourceWrapper {
	fun <T:BaseResult<Void>> iosShowIos(buildIn:String,dicKeyId:String):Flowable<T> {
		return ApiEngine.getService(IosService::class.java)
			.iosShowIos<T>(buildIn,dicKeyId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> iosUpdateIos(buildIn:String,downloadChannel:String,platformMarking:String,version:String):Flowable<T> {
		return ApiEngine.getService(IosService::class.java)
			.iosUpdateIos<T>(buildIn,downloadChannel,platformMarking,version)
			.compose(RxSchedulers.io_main())
	}

}