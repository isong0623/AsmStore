package com.haoda.common.net.service

import com.haoda.common.core.Logger
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import org.reactivestreams.Subscription

open class BaseDataSource {
    val defaultErrorProcessor: Consumer<in Throwable?> = Consumer {
        procError(it)
    }
    val defaultCompleteProcessor: Action = Action {

    }
    val defaultSubscriptionProcessor: Consumer<in Subscription?> = Consumer {

    }
    val defaultErrorProcessor_K: (e: Throwable) -> Unit = {
        procError(it)
    }

    private fun <E : Throwable> procError(e: E) {
        Logger.e("onNetError", e.message)
    }
}