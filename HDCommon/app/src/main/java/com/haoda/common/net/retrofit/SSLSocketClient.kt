package com.haoda.common.net.retrofit

import java.security.SecureRandom
import java.security.cert.X509Certificate
import javax.net.ssl.*
import kotlin.jvm.Throws

object SSLSocketClient {

    @Throws(RuntimeException::class)
    fun getSSLSocketFactory(): SSLSocketFactory {
        try {
            var sslContext = SSLContext.getInstance("SSL")
            sslContext.init(null, getTrustManager(), SecureRandom())
            return sslContext.socketFactory
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    private fun getTrustManager(): Array<TrustManager> {
        return arrayOf(object : X509TrustManager {
            override fun checkClientTrusted(chain: Array<out X509Certificate>?, authType: String?) {}
            override fun checkServerTrusted(chain: Array<out X509Certificate>?, authType: String?) {}
            override fun getAcceptedIssuers(): Array<X509Certificate> { return arrayOf() }
        })
    }

    fun getHostnameVerifier(): HostnameVerifier {
        return HostnameVerifier { _, _ ->
            true
        }
    }

}