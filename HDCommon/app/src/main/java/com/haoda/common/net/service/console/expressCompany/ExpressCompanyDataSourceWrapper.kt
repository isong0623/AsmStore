package com.haoda.common.net.service.console.expressCompany

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface ExpressCompanyDataSourceWrapper {
	fun <T:BaseResult<Void>> update_6ExpressCompany(code:String?,id:String,name:String?,status:String?):Flowable<T> {
		return ApiEngine.getService(ExpressCompanyService::class.java)
			.update_6ExpressCompany<T>(code,id,name,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_6ExpressCompany(id:String):Flowable<T> {
		return ApiEngine.getService(ExpressCompanyService::class.java)
			.detail_6ExpressCompany<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> stopUse_2ExpressCompany(id:String):Flowable<T> {
		return ApiEngine.getService(ExpressCompanyService::class.java)
			.stopUse_2ExpressCompany<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_7ExpressCompany(code:String?,currentPage:String,name:String?,pageSize:String?,status:String?):Flowable<T> {
		return ApiEngine.getService(ExpressCompanyService::class.java)
			.page_7ExpressCompany<T>(code,currentPage,name,pageSize,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_6ExpressCompany(code:String,name:String,status:String):Flowable<T> {
		return ApiEngine.getService(ExpressCompanyService::class.java)
			.save_6ExpressCompany<T>(code,name,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getSelectListExpressCompany():Flowable<T> {
		return ApiEngine.getService(ExpressCompanyService::class.java)
			.getSelectListExpressCompany<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> startUse_2ExpressCompany(id:String):Flowable<T> {
		return ApiEngine.getService(ExpressCompanyService::class.java)
			.startUse_2ExpressCompany<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_5ExpressCompany(id:String):Flowable<T> {
		return ApiEngine.getService(ExpressCompanyService::class.java)
			.delete_5ExpressCompany<T>(id)
			.compose(RxSchedulers.io_main())
	}

}