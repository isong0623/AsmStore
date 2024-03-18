package com.haoda.common.net.service.base.dicType

import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.config.RxSchedulers
import com.haoda.common.net.retrofit.ApiEngine
import io.reactivex.Flowable

interface DicTypeDataSourceWrapper {
	fun <T:BaseResult<Void>> page_2DicType(currentPage:String,field:String?,fieldDesc:String?,module:String?,pageSize:String?):Flowable<T> {
		return ApiEngine.getService(DicTypeService::class.java)
			.page_2DicType<T>(currentPage,field,fieldDesc,module,pageSize)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> save_2DicType(field:String,fieldDesc:String,module:String):Flowable<T> {
		return ApiEngine.getService(DicTypeService::class.java)
			.save_2DicType<T>(field,fieldDesc,module)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> update_2DicType(field:String?,fieldDesc:String?,id:String,module:String?):Flowable<T> {
		return ApiEngine.getService(DicTypeService::class.java)
			.update_2DicType<T>(field,fieldDesc,id,module)
			.compose(RxSchedulers.io_main())
	}
	fun <T:BaseResult<Void>> delete_2DicType(id:String):Flowable<T> {
		return ApiEngine.getService(DicTypeService::class.java)
			.delete_2DicType<T>(id)
			.compose(RxSchedulers.io_main())
	}

}