package com.haoda.common.net.service.member.TbMemberVip

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface TbMemberVipDataSourceWrapper {
	fun <T:BaseResult<Void>> findPageToProListTbMemberVip(pageNum:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(TbMemberVipService::class.java)
			.findPageToProListTbMemberVip<T>(pageNum,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getGuessYouLikePageTbMemberVip(pageNum:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(TbMemberVipService::class.java)
			.getGuessYouLikePageTbMemberVip<T>(pageNum,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> selectFormemberIdTbMemberVip(buyingTime:String?,channel:String?,createTime:String?,createUser:String?,discount:String?,dueTime:String?,id:String?,memberId:String?,mobile:String,updateTime:String?,updateUser:String?,vipType:String?):Flowable<T> {
		return ApiEngine.getService(TbMemberVipService::class.java)
			.selectFormemberIdTbMemberVip<T>(buyingTime,channel,createTime,createUser,discount,dueTime,id,memberId,mobile,updateTime,updateUser,vipType)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> findListByPageTbMemberVip(buyingTime:String?,channel:String?,createTime:String?,createUser:String?,discount:String?,dueTime:String?,id:String?,memberId:String?,mobile:String?,pageNum:String?,updateTime:String?,updateUser:String?,vipType:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(TbMemberVipService::class.java)
			.findListByPageTbMemberVip<T>(buyingTime,channel,createTime,createUser,discount,dueTime,id,memberId,mobile,pageNum,updateTime,updateUser,vipType,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getVipMemberIdTbMemberVip():Flowable<T> {
		return ApiEngine.getService(TbMemberVipService::class.java)
			.getVipMemberIdTbMemberVip<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> deleteTbMemberVip(id:String):Flowable<T> {
		return ApiEngine.getService(TbMemberVipService::class.java)
			.deleteTbMemberVip<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> updateTbMemberVip(buyingTime:String?,channel:String?,createTime:String?,createUser:String?,discount:String?,dueTime:String?,id:String?,memberId:String?,mobile:String?,updateTime:String?,updateUser:String?,vipType:String?):Flowable<T> {
		return ApiEngine.getService(TbMemberVipService::class.java)
			.updateTbMemberVip<T>(buyingTime,channel,createTime,createUser,discount,dueTime,id,memberId,mobile,updateTime,updateUser,vipType)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> deleteBatIdsTbMemberVip(ids:String):Flowable<T> {
		return ApiEngine.getService(TbMemberVipService::class.java)
			.deleteBatIdsTbMemberVip<T>(ids)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> addTbMemberVip(channel:String?,discount:String?,memberId:String?,mobile:String?,vipType:String):Flowable<T> {
		return ApiEngine.getService(TbMemberVipService::class.java)
			.addTbMemberVip<T>(channel,discount,memberId,mobile,vipType)
			.compose(RxSchedulers.io_main())
	}

}