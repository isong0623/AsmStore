package com.haoda.common.net.service.mall.memberHome

import com.haoda.common.net.annotation.Description
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import io.reactivex.Flowable
import retrofit2.http.*

interface MemberHomeService : BaseService{
	@Description("\"我的\"页面数量加载接口")
	@POST(Constants.API.MEMBER_HOME_INDEX_MEMBER_HOME_Url)
	fun <T:BaseResult<Void>> memberHomeIndexMemberHome(

	):  Flowable<T>

}