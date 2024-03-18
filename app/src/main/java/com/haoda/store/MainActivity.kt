package com.haoda.store

import androidx.appcompat.app.AppCompatActivity
import org.kotlin.annotationProcessor.LayoutResId
import org.kotlin.annotationProcessor.Router
import org.kotlin.annotationProcessor.RouterVisibleLevel

@Router(key = "main", description = "主页面", visible = RouterVisibleLevel.Application)
@LayoutResId(R.layout.activity_main)
class MainActivity : AppCompatActivity()