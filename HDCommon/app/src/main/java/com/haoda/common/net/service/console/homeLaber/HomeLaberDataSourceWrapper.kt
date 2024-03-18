package com.haoda.common.net.service.console.homeLaber

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface HomeLaberDataSourceWrapper {
	fun <T:BaseResult<Void>> stopUse_4HomeLaber(id:String):Flowable<T> {
		return ApiEngine.getService(HomeLaberService::class.java)
			.stopUse_4HomeLaber<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> startUse_4HomeLaber(id:String):Flowable<T> {
		return ApiEngine.getService(HomeLaberService::class.java)
			.startUse_4HomeLaber<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadHtml5_2HomeLaber():Flowable<T> {
		return ApiEngine.getService(HomeLaberService::class.java)
			.uploadHtml5_2HomeLaber<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_10HomeLaber(currentPage:String,name:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(HomeLaberService::class.java)
			.page_10HomeLaber<T>(currentPage,name,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_8HomeLaber(id:String):Flowable<T> {
		return ApiEngine.getService(HomeLaberService::class.java)
			.delete_8HomeLaber<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadPicture_5HomeLaber():Flowable<T> {
		return ApiEngine.getService(HomeLaberService::class.java)
			.uploadPicture_5HomeLaber<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_9HomeLaber(categoryId:String?,channelType:String,discription:String?,endTime:String,icon:String,jumpType:String,name:String,pageUrl:String?,productId:String?,sort:String,startTime:String,status:String):Flowable<T> {
		return ApiEngine.getService(HomeLaberService::class.java)
			.save_9HomeLaber<T>(categoryId,channelType,discription,endTime,icon,jumpType,name,pageUrl,productId,sort,startTime,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_9HomeLaber(id:String):Flowable<T> {
		return ApiEngine.getService(HomeLaberService::class.java)
			.detail_9HomeLaber<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_9HomeLaber(categoryId:String?,channelType:String?,discription:String?,endTime:String?,icon:String?,id:String,jumpType:String?,name:String?,pageUrl:String?,productId:String?,sort:String?,startTime:String?,status:String?):Flowable<T> {
		return ApiEngine.getService(HomeLaberService::class.java)
			.update_9HomeLaber<T>(categoryId,channelType,discription,endTime,icon,id,jumpType,name,pageUrl,productId,sort,startTime,status)
			.compose(RxSchedulers.io_main())
	}

}