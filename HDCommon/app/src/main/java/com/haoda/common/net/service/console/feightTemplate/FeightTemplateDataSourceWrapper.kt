package com.haoda.common.net.service.console.feightTemplate

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface FeightTemplateDataSourceWrapper {
	fun <T:BaseResult<Void>> update_7FeightTemplate(description:String?,fullPrice:String?,id:String,name:String?,price:String?,type:String?):Flowable<T> {
		return ApiEngine.getService(FeightTemplateService::class.java)
			.update_7FeightTemplate<T>(description,fullPrice,id,name,price,type)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_8FeightTemplate(currentPage:String,name:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(FeightTemplateService::class.java)
			.page_8FeightTemplate<T>(currentPage,name,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> listFeightTemplate():Flowable<T> {
		return ApiEngine.getService(FeightTemplateService::class.java)
			.listFeightTemplate<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_6FeightTemplate(id:String):Flowable<T> {
		return ApiEngine.getService(FeightTemplateService::class.java)
			.delete_6FeightTemplate<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_7FeightTemplate(id:String):Flowable<T> {
		return ApiEngine.getService(FeightTemplateService::class.java)
			.detail_7FeightTemplate<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_7FeightTemplate(description:String?,fullPrice:String?,name:String,price:String?,type:String):Flowable<T> {
		return ApiEngine.getService(FeightTemplateService::class.java)
			.save_7FeightTemplate<T>(description,fullPrice,name,price,type)
			.compose(RxSchedulers.io_main())
	}

}