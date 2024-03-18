package com.haoda.common.net.service.console.orderSetting

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface OrderSettingDataSourceWrapper {
	fun <T:BaseResult<Void>> save_12OrderSetting(discription:String,settingKey:String,settingValue:String):Flowable<T> {
		return ApiEngine.getService(OrderSettingService::class.java)
			.save_12OrderSetting<T>(discription,settingKey,settingValue)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_18OrderSetting(currentPage:String,pageSize:String?,settingKey:String?):Flowable<T> {
		return ApiEngine.getService(OrderSettingService::class.java)
			.page_18OrderSetting<T>(currentPage,pageSize,settingKey)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_16OrderSetting(id:String):Flowable<T> {
		return ApiEngine.getService(OrderSettingService::class.java)
			.detail_16OrderSetting<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_11OrderSetting(id:String):Flowable<T> {
		return ApiEngine.getService(OrderSettingService::class.java)
			.delete_11OrderSetting<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_12OrderSetting(discription:String?,id:String,settingKey:String?,settingValue:String?):Flowable<T> {
		return ApiEngine.getService(OrderSettingService::class.java)
			.update_12OrderSetting<T>(discription,id,settingKey,settingValue)
			.compose(RxSchedulers.io_main())
	}

}