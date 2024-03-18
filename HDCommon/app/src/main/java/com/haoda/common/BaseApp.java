package com.haoda.common;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.app.annotation.aspect.TimeLog;
import com.haoda.common.core.IRouterRegister;

import java.util.ServiceLoader;

import io.realm.Realm;

public class BaseApp extends Application {
    private static BaseApp mApp;

    @TimeLog
    public void onCreate() {
        if(!isAppMainProcess()) return;
        super.onCreate();
        mApp = this;
        Realm.init(this);
        registerActivityLifeCycleCallBack();
        registerRouter();
    }

    public static BaseApp getAppContext() {
        return mApp;
    }

    public static boolean isDebug(){
        return BuildConfig.DEBUG;
    }

    private static Activity currentActivity;
    public static Activity getCurActivity() {
        return currentActivity;
    }
    private void registerActivityLifeCycleCallBack(){
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {

            }

            @Override
            public void onActivityStarted(@NonNull Activity activity) {

            }

            @Override
            public void onActivityResumed(@NonNull Activity activity) {

            }

            @Override
            public void onActivityPaused(@NonNull Activity activity) {

            }

            @Override
            public void onActivityStopped(@NonNull Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(@NonNull Activity activity) {

            }
        });
    }

    public void registerRouter(){
        ServiceLoader<IRouterRegister> rules = ServiceLoader.load(IRouterRegister.class);
        for (IRouterRegister rule : rules) rule.registerRouter();
    }

    /**
     * 判断是不是UI主进程，因为有些东西只能在UI主进程初始化
     */
    public static boolean isAppMainProcess() {
        try {
            int pid = android.os.Process.myPid();
            String process = getAppNameByPID(getAppContext(), pid);
            Log.d("isAppMainProcess","process");
            if (TextUtils.isEmpty(process)) {
                return true;
            } else if (getAppContext().getPackageName().equalsIgnoreCase(process)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    /**
     * 根据Pid得到进程名
     */
    public static String getAppNameByPID(Context context, int pid) {
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        for (android.app.ActivityManager.RunningAppProcessInfo processInfo : manager.getRunningAppProcesses()) {
            if (processInfo.pid == pid) {
                return processInfo.processName;
            }
        }
        return "";
    }
}
