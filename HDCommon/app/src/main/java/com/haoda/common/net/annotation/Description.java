package com.haoda.common.net.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Isidore
 */
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.TYPE,ElementType.PARAMETER})
@Retention(RetentionPolicy.SOURCE)
public @interface Description {
    String value() default "";
}
