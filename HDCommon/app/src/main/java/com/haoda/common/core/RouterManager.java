package com.haoda.common.core;

import android.app.Activity;

import androidx.annotation.NonNull;

import java.util.HashMap;
import java.util.Map;

public class RouterManager {
    private static Map<String,Class<? extends Activity>> mRoutermanager = new HashMap<>();
    public static void registerRule(@NonNull String key,@NonNull Class bindActivity){
        mRoutermanager.put(key,bindActivity);
    }

    public static Class match(@NonNull String key){
        Class target = mRoutermanager.get(key);
        if(target == null){
            throw new RuntimeException(String.format("未注册的Activity:%s",key));
        }
        return target;
    }
}
