package com.haoda.common.net.service.mall.memberReceiveAddress

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface MemberReceiveAddressDataSourceWrapper {
	fun <T:BaseResult<Void>> detailMemberReceiveAddress(id:String):Flowable<T> {
		return ApiEngine.getService(MemberReceiveAddressService::class.java)
			.detailMemberReceiveAddress<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> deleteMemberReceiveAddress(id:String):Flowable<T> {
		return ApiEngine.getService(MemberReceiveAddressService::class.java)
			.deleteMemberReceiveAddress<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> setDefaultAddressMemberReceiveAddress(id:String):Flowable<T> {
		return ApiEngine.getService(MemberReceiveAddressService::class.java)
			.setDefaultAddressMemberReceiveAddress<T>(id)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> updateMemberReceiveAddress(city:String?,defaultStatus:String?,detailAddress:String?,id:String,name:String?,phoneNumber:String?,postCode:String?,province:String?,region:String?):Flowable<T> {
		return ApiEngine.getService(MemberReceiveAddressService::class.java)
			.updateMemberReceiveAddress<T>(city,defaultStatus,detailAddress,id,name,phoneNumber,postCode,province,region)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> getDefaultAddressMemberReceiveAddress():Flowable<T> {
		return ApiEngine.getService(MemberReceiveAddressService::class.java)
			.getDefaultAddressMemberReceiveAddress<T>()
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> saveMemberReceiveAddress(city:String,defaultStatus:String,detailAddress:String,name:String,phoneNumber:String,postCode:String?,province:String,region:String):Flowable<T> {
		return ApiEngine.getService(MemberReceiveAddressService::class.java)
			.saveMemberReceiveAddress<T>(city,defaultStatus,detailAddress,name,phoneNumber,postCode,province,region)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> listMemberReceiveAddress():Flowable<T> {
		return ApiEngine.getService(MemberReceiveAddressService::class.java)
			.listMemberReceiveAddress<T>()
			.compose(RxSchedulers.io_main())
	}

}