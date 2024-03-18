package com.haoda.common.core

import android.os.Looper

class Handler {
    companion object{
        private val mHandler: android.os.Handler = android.os.Handler(Looper.getMainLooper())
        @JvmStatic
        fun post(runnable: () -> Unit){
            mHandler.post(runnable)
        }
        @JvmStatic
        fun post(runnable:Runnable){
            mHandler.post(runnable)
        }
        @JvmStatic
        fun postDalayed(runnable: Runnable,dalayedMills:Long){
            mHandler.postDelayed(runnable,dalayedMills)
        }
        @JvmStatic
        fun postDalayed(runnable: () -> Unit,dalayedMills:Long){
            mHandler.postDelayed(runnable,dalayedMills)
        }
    }
}