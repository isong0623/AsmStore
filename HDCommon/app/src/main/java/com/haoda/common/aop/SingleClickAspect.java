package com.haoda.common.aop;

import android.view.View;

import com.haoda.common.R;
import com.haoda.common.core.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Calendar;

@Aspect
public class SingleClickAspect {
    static int TIME_TAG = R.id.aop_aspect_j_click;
    public static final int MIN_CLICK_DELAY_TIME = 600;

    @Pointcut("execution(@com.app.annotation.aspect.SingleClick * *(..))")//方法切入点
    public void methodAnnotated() {}

    @Around("methodAnnotated()")//在连接点进行方法替换
    public void aroundJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable {
        View view = null;
        for (Object arg : joinPoint.getArgs())
            if (arg instanceof View) view = (View) arg;
        if (view != null) {
            Object tag = view.getTag(TIME_TAG);
            long lastClickTime = ((tag != null) ? (long) tag : 0);
            Logger.d("SingleClickAspect", "lastClickTime:" + lastClickTime);
            long currentTime = Calendar.getInstance().getTimeInMillis();
            if (currentTime - lastClickTime > MIN_CLICK_DELAY_TIME) {//过滤掉600毫秒内的连续点击
                view.setTag(TIME_TAG, currentTime);
                Logger.d("SingleClickAspect", "currentTime:" + currentTime);
                joinPoint.proceed();//执行原方法
            }
        }
    }
}
