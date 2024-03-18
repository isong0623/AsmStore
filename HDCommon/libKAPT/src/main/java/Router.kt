package org.kotlin.annotationProcessor

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * @author Isidore
 */
@Retention(RetentionPolicy.SOURCE)
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS)
annotation class Router(val description: String = "", val key: String = "", val visible: RouterVisibleLevel = RouterVisibleLevel.Application)