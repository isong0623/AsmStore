package com.haoda.common.net.service.console.homePic

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface HomePicDataSourceWrapper {
	fun <T:BaseResult<Void>> save_10HomePic(channelType:String,discription:String?,endTime:String,jumpType:String,name:String,pageUrl:String?,pic:String,productId:String?,sort:String,startTime:String,status:String):Flowable<T> {
		return ApiEngine.getService(HomePicService::class.java)
			.save_10HomePic<T>(channelType,discription,endTime,jumpType,name,pageUrl,pic,productId,sort,startTime,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadHtml5_3HomePic():Flowable<T> {
		return ApiEngine.getService(HomePicService::class.java)
			.uploadHtml5_3HomePic<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> startUse_5HomePic(id:String):Flowable<T> {
		return ApiEngine.getService(HomePicService::class.java)
			.startUse_5HomePic<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_10HomePic(channelType:String?,discription:String?,endTime:String?,id:String,jumpType:String?,name:String?,pageUrl:String?,pic:String?,productId:String?,sort:String?,startTime:String?,status:String?):Flowable<T> {
		return ApiEngine.getService(HomePicService::class.java)
			.update_10HomePic<T>(channelType,discription,endTime,id,jumpType,name,pageUrl,pic,productId,sort,startTime,status)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> uploadPicture_6HomePic():Flowable<T> {
		return ApiEngine.getService(HomePicService::class.java)
			.uploadPicture_6HomePic<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_9HomePic(id:String):Flowable<T> {
		return ApiEngine.getService(HomePicService::class.java)
			.delete_9HomePic<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> stopUse_5HomePic(id:String):Flowable<T> {
		return ApiEngine.getService(HomePicService::class.java)
			.stopUse_5HomePic<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detail_10HomePic(id:String):Flowable<T> {
		return ApiEngine.getService(HomePicService::class.java)
			.detail_10HomePic<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> page_11HomePic(currentPage:String,name:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(HomePicService::class.java)
			.page_11HomePic<T>(currentPage,name,pageSize)
			.compose(RxSchedulers.io_main())
	}

}