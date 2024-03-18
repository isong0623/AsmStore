package com.haoda.common.net.service.base.dicDetail

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface DicDetailDataSourceWrapper {
	fun <T:BaseResult<Void>> delete_1DicDetail(id:String):Flowable<T> {
		return ApiEngine.getService(DicDetailService::class.java)
			.delete_1DicDetail<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> loadDicDicDetail():Flowable<T> {
		return ApiEngine.getService(DicDetailService::class.java)
			.loadDicDicDetail<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_1DicDetail(dicKey:String,dicTypeId:String,dicValue:String):Flowable<T> {
		return ApiEngine.getService(DicDetailService::class.java)
			.save_1DicDetail<T>(dicKey,dicTypeId,dicValue)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_1DicDetail(currentPage:String,dicTypeId:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(DicDetailService::class.java)
			.page_1DicDetail<T>(currentPage,dicTypeId,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_1DicDetail(dicKey:String?,dicTypeId:String?,dicValue:String?,id:String):Flowable<T> {
		return ApiEngine.getService(DicDetailService::class.java)
			.update_1DicDetail<T>(dicKey,dicTypeId,dicValue,id)
			.compose(RxSchedulers.io_main())
	}

}