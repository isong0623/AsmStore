package org.kotlin.annotationProcessor

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * @author Isidore
 */
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.FIELD, AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS, AnnotationTarget.VALUE_PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
annotation class Description(val value: String = "") 