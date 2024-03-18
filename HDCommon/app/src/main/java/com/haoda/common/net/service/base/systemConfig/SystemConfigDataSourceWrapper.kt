package com.haoda.common.net.service.base.systemConfig

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface SystemConfigDataSourceWrapper {
	fun <T:BaseResult<Void>> delete_5SystemConfig(id:String):Flowable<T> {
		return ApiEngine.getService(SystemConfigService::class.java)
			.delete_5SystemConfig<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_5SystemConfig(configKey:String?,currentPage:String,description:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(SystemConfigService::class.java)
			.page_5SystemConfig<T>(configKey,currentPage,description,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_5SystemConfig(configKey:String,configValue:String,description:String?,status:String):Flowable<T> {
		return ApiEngine.getService(SystemConfigService::class.java)
			.save_5SystemConfig<T>(configKey,configValue,description,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_5SystemConfig(configKey:String?,configValue:String?,description:String?,id:String,status:String?):Flowable<T> {
		return ApiEngine.getService(SystemConfigService::class.java)
			.update_5SystemConfig<T>(configKey,configValue,description,id,status)
			.compose(RxSchedulers.io_main())
	}

}