
package com.haoda.common.tools;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;

import androidx.annotation.NonNull;

import com.haoda.common.R;


public class TipsDialog extends Dialog {
    private static TipsDialog customProgressDialog = null;
    private Activity activity;
    boolean bCanDismissInBackKey = false;

    public TipsDialog(Context context) {
        super(context);
    }

    public TipsDialog(Context context, int theme) {
        super(context, theme);
    }

    public TipsDialog(Context context, int theme, Activity activity) {
        super(context, theme);
        this.activity = activity;
    }


    @Override
    public boolean onTouchEvent(@NonNull MotionEvent event) {
        return true;
    }

    public TipsDialog setCanDismissInBackPressed(boolean b){
        bCanDismissInBackKey = b;
        return this;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        try {
            if (keyCode == KeyEvent.KEYCODE_BACK) {
                if(bCanDismissInBackKey){
                    if (activity != null) {
                        activity.finish();
                        activity = null;
                        dismissDialog();
                    }
                    dismissDialog();
                }
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.onKeyDown(keyCode, event);
    }

    /**
     * 显示Dialog
     * @param activity
     * @return
     */
    public static TipsDialog createDialog(Activity activity) {
        return createDialog(activity,null);
    }

    public static TipsDialog createDialog(Activity activity,String msg) {
        try{if(customProgressDialog!=null) customProgressDialog.dismiss();} catch (Exception e){}
        try {
            customProgressDialog = new TipsDialog(activity, R.style.LoadingDialogStyle, activity);
            customProgressDialog.setCancelable(false);
            customProgressDialog.setContentView(R.layout.dialog_tips);
            customProgressDialog.getWindow().getAttributes().gravity = Gravity.CENTER;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customProgressDialog;
    }

    @Override
    public void show() {
        if(customProgressDialog!=null) super.show();
    }

    /**
     * 隐藏dialog
     */
    public static void dismissDialog() {
        try {
            if (customProgressDialog != null) {
                customProgressDialog.dismiss();
                if(customProgressDialog.isShowing()){
                    new Handler(Looper.getMainLooper()).postDelayed(()-> dismissDialog(),333L);
                    return;
                }
                customProgressDialog.dismiss();
                customProgressDialog = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
