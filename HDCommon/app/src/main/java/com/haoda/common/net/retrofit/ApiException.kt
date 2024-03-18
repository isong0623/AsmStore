package com.haoda.common.net.retrofit

class ApiException(val code: String,val msg: String) : Exception(String.format("%s->%s",code,msg))
