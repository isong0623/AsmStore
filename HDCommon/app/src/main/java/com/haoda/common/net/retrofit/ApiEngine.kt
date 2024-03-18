package com.haoda.common.net.retrofit

import com.google.gson.*
import com.haoda.common.BaseApp
import com.haoda.common.net.bean.BaseResult
import com.haoda.common.net.service.BaseService
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.io.File
import java.lang.reflect.Type
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.TimeUnit

class ApiEngine {
    private val retrofit : Retrofit = getEngine()

    @SuppressWarnings("deprecated")
    private fun getEngine():Retrofit{
        //缓存
        val httpCacheDirectory = File(BaseApp.getAppContext().cacheDir, "cache")
        val cacheSize = 50 * 1024 * 1024
        val cache = Cache(httpCacheDirectory, cacheSize.toLong())
        //okhttp client
        var builder = OkHttpClient.Builder()
            .cache(cache)
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .sslSocketFactory(SSLSocketClient.getSSLSocketFactory())
            .hostnameVerifier(SSLSocketClient.getHostnameVerifier())

        if (true) {
            var loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            builder.addInterceptor(loggingInterceptor)
        }
        builder.addInterceptor(getRequstInterceptor())
//        builder.addInterceptor(getResponseInterceptor())
        val retrofit = Retrofit.Builder()
            .client(builder.build())
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(getGson()))
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
        return retrofit
    }

    private fun getRequestInterceptor():Interceptor{
        return Interceptor { chain ->
            var requestBuilder = chain
                .request()
                .newBuilder()
                .addHeader("Content-Type", "application/json; encoding=utf-8")
                .addHeader("haodaAuthorization", "")
            var response: Response
            try {
                response = chain.proceed(requestBuilder.build())
            } catch (e: Exception) {
                response = Response.Builder().body(
                    ResponseBody.create(
                        MediaType.parse("text/plain"),
                        "{\"code\":\"404\"}"
                    )
                ).build()
            }
            response
        }
    }

    //缓存
    private fun getResponseInterceptor():Interceptor{
        return  object :Interceptor {
            override fun intercept(chain: Interceptor.Chain): Response {
                val request: Request = chain.request();
                val originalResponse: Response = chain.proceed(request);
                val maxAge: Int = 24 * 3600; // 在线缓存在1天内可读取
                return originalResponse.newBuilder()
                    .removeHeader("Pragma")// 清除头信息，因为服务器如果不支持，会返回一些干扰信息，不清除下面无法生效
                    .addHeader("Cache-Control", "public, max-age=" + maxAge)
                    .build()
            }
        }
    }

    private fun getGson():Gson{
        var deserializer = JsonDeserializer<BaseResult<*>> { json: JsonElement, type: Type, _: JsonDeserializationContext ->
            var baseResult: BaseResult<*>? = Gson().fromJson(json, type)
            baseResult
        }
        return GsonBuilder()
            .registerTypeAdapter(BaseResult::class.java, deserializer)
            .create()
    }

    companion object{
        private val BASE_URL = "Base url"

        private val ApiEngine = ApiEngine()
        private val retrofit: Retrofit = ApiEngine.retrofit
        private val serviceManager:MutableMap<Class<*>,BaseService> = ConcurrentHashMap()

        @SuppressWarnings("unchecked")
        fun<T: BaseService> getService(clazz: Class<T>):T{
            var result:T? = serviceManager[clazz] as? T
            if(result == null){
                result = retrofit.create(clazz)
                serviceManager[clazz] = result
            }
            return result ?: Object() as T
        }
    }
}