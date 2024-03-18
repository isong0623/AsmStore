package com.haoda.common.net.service.exploreconsole.test

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface TestService : BaseService{
	@Description("测试")
	@GET(Constants.API.DETAIL_USING_GETTEST_Url)
	fun <T:BaseResult<Void>> detailUsingGETTest(

	):  Flowable<T>

}