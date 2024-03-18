package com.haoda.common.net.bean

import com.haoda.common.net.config.Optional

class BaseResult<T> {
    var code: String? = null
    var data: T? = null
    var message: String? = null

    fun transform(): Optional<T> = Optional(data)
}