package com.haoda.common.net.service.lucky.service

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface ServiceDataSourceWrapper {
	fun <T:BaseResult<Void>> listService(current:String?,pageSize:String?,size:String?):Flowable<T> {
		return ApiEngine.getService(ServiceService::class.java)
			.listService<T>(current,pageSize,size)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> detailByIdService(orizeLogId:String):Flowable<T> {
		return ApiEngine.getService(ServiceService::class.java)
			.detailByIdService<T>(orizeLogId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> updateService(enable:String?,freight:String?,id:String,integralNum:String?,levelId:String?,levelName:String?,number:String?,prizeDesc:String?,prizeImg:String?,prizeImgOne:String?,prizeImgTwo:String?,prizeName:String?,showFirst:String?,size:String?,sort:String?,type:String?):Flowable<T> {
		return ApiEngine.getService(ServiceService::class.java)
			.updateService<T>(enable,freight,id,integralNum,levelId,levelName,number,prizeDesc,prizeImg,prizeImgOne,prizeImgTwo,prizeName,showFirst,size,sort,type)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> firstShowService():Flowable<T> {
		return ApiEngine.getService(ServiceService::class.java)
			.firstShowService<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update2Service(id:String):Flowable<T> {
		return ApiEngine.getService(ServiceService::class.java)
			.update2Service<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> list_2Service(current:String?,delivery:String?,pageSize:String?,type:String?):Flowable<T> {
		return ApiEngine.getService(ServiceService::class.java)
			.list_2Service<T>(current,delivery,pageSize,type)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> list_1Service(size:String):Flowable<T> {
		return ApiEngine.getService(ServiceService::class.java)
			.list_1Service<T>(size)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update1Service(address:String,freight:String,id:String,memberId:String,mobile:String,payType:String,username:String):Flowable<T> {
		return ApiEngine.getService(ServiceService::class.java)
			.update1Service<T>(address,freight,id,memberId,mobile,payType,username)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> saveService(enable:String,freight:String,integralNum:String,levelId:String,levelName:String,number:String,prizeDesc:String,prizeImg:String,prizeImgOne:String,prizeImgTwo:String,prizeName:String,showFirst:String,size:String,sort:String,type:String):Flowable<T> {
		return ApiEngine.getService(ServiceService::class.java)
			.saveService<T>(enable,freight,integralNum,levelId,levelName,number,prizeDesc,prizeImg,prizeImgOne,prizeImgTwo,prizeName,showFirst,size,sort,type)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> jsPayResultService(payLogId:String,payStatus:String,prizeLogId:String):Flowable<T> {
		return ApiEngine.getService(ServiceService::class.java)
			.jsPayResultService<T>(payLogId,payStatus,prizeLogId)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> list1Service(current:String?,memberId:String,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(ServiceService::class.java)
			.list1Service<T>(current,memberId,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> drawPrizeService(drawType:String,memberId:String,size:String):Flowable<T> {
		return ApiEngine.getService(ServiceService::class.java)
			.drawPrizeService<T>(drawType,memberId,size)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> deleteService(id:String):Flowable<T> {
		return ApiEngine.getService(ServiceService::class.java)
			.deleteService<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> list5Service(current:String?,memberId:String,pageSize:String?,type:String?):Flowable<T> {
		return ApiEngine.getService(ServiceService::class.java)
			.list5Service<T>(current,memberId,pageSize,type)
			.compose(RxSchedulers.io_main())
	}

}