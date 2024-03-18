package com.haoda.common.net.config

import java.util.*

class Optional<M>(val includeNull: M?) {

    val isEmpty: Boolean
        get() = includeNull == null

    fun get(): M {
        if (includeNull == null)
            throw NoSuchElementException("No value present")
        return includeNull
    }
}
