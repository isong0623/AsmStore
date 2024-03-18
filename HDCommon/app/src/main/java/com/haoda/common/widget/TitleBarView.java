package com.haoda.common.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.haoda.common.R;

import static com.scwang.smart.refresh.layout.util.SmartUtil.dp2px;

public class TitleBarView extends ConstraintLayout {

    public TitleBarView(@NonNull Context context) {
        super(context);
    }

    public TitleBarView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        onInitAttrs(attrs);
    }

    public TitleBarView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        onInitAttrs(attrs);
    }

    @TargetApi(21)
    public TitleBarView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        onInitAttrs(attrs);
    }

    public TextView tvTitleLeft,tvTitleCenter,tvTitleRight;
    public ImageView imgTitleLeft,imgTitleCenter,imgTitleRight;

    private boolean bIsFirstInit = true;
    private void onInitAttrs(@Nullable AttributeSet attrs){
        if(!bIsFirstInit)return;
        bIsFirstInit = false;
        LayoutInflater.from(getContext()).inflate(R.layout.widget_title_bar_view,this);
        tvTitleLeft = findViewById(R.id.tv_left);
        tvTitleCenter = findViewById(R.id.tv_center);
        tvTitleRight = findViewById(R.id.tv_right);
        imgTitleLeft = findViewById(R.id.iv_left);
        imgTitleCenter = findViewById(R.id.iv_center);
        imgTitleRight = findViewById(R.id.iv_right);

        TypedArray ta = getContext().obtainStyledAttributes(attrs, R.styleable.TitleBarView);
        String lt = ta.getString(R.styleable.TitleBarView_l_tv_text);
        setLeftText(lt==null?"":lt);
        String ct = ta.getString(R.styleable.TitleBarView_c_tv_text);
        setCenterText(ct==null?"":ct);
        String rt = ta.getString(R.styleable.TitleBarView_r_tv_text);
        setRightText(rt==null?"":rt);

        setLeftTextColor  (ta.getColor(R.styleable.TitleBarView_l_tv_text_color,Color.BLACK));
        setCenterTextColor(ta.getColor(R.styleable.TitleBarView_c_tv_text_color,Color.BLACK));
        setRightTextColor (ta.getColor(R.styleable.TitleBarView_r_tv_text_color,Color.BLACK));

        setLeftTextSize(ta.getDimensionPixelSize(R.styleable.TitleBarView_l_tv_text_size,dp2px(14f)));
        setRightTextSize(ta.getDimensionPixelSize(R.styleable.TitleBarView_c_tv_text_size,dp2px(14f)));
        setCenterTextSize(ta.getDimensionPixelSize(R.styleable.TitleBarView_r_tv_text_size,dp2px(14f)));

        int lid = ta.getResourceId(R.styleable.TitleBarView_l_img,-1);
        if(lid!=-1) setLeftImageDrawable(lid);
        else setLeftImageDrawable(R.drawable.ic_title_left);
        int cid = ta.getResourceId(R.styleable.TitleBarView_c_img,-1);
        if(cid!=-1) setCenterImageDrawable(cid);
        int rid = ta.getResourceId(R.styleable.TitleBarView_r_img,-1);
        if(rid!=-1) setRightImageDrawable(rid);

        ta.recycle();
    }

    private TitleBarView setText(TextView tv,String text){
        if(tv!=null&&text!=null) tv.setText(text);
        return this;
    }

    public TitleBarView setLeftText(String text){
        return setText(tvTitleLeft,text);
    }

    public TitleBarView setCenterText(String text){
        return setText(tvTitleCenter,text);
    }

    public TitleBarView setRightText(String text){
        return setText(tvTitleRight,text);
    }

    private TitleBarView setTextColor(TextView tv,Object color){
        if(tv!=null){
            if(color instanceof Integer){//R.Color.xxx
                tv.setTextColor(getResources().getColor((int) color));
                return this;
            }
            if(color instanceof String){//#????????
                tv.setTextColor(Color.parseColor((String) color));
                return this;
            }
        }
        throw new RuntimeException(getContext().getClass().getSimpleName()+"->未定义的背景类型："+color);
    }

    public TitleBarView setLeftTextColor(Object color){
        return setTextColor(tvTitleLeft,color);
    }

    public TitleBarView setCenterTextColor(Object color){
        return setTextColor(tvTitleCenter,color);
    }

    public TitleBarView setRightTextColor(Object color){
        return setTextColor(tvTitleRight,color);
    }


    private TitleBarView setTextSize(TextView tv, float fSize_sp){
        if(tv!=null) tv.setTextSize(TypedValue.COMPLEX_UNIT_SP,fSize_sp);
        return this;
    }

    public TitleBarView setLeftTextSize(float fSize_sp){
        return setTextSize(tvTitleLeft,fSize_sp);
    }

    public TitleBarView setCenterTextSize(float fSize_sp){
        return setTextSize(tvTitleCenter,fSize_sp);
    }

    public TitleBarView setRightTextSize(float fSize_sp){
        return setTextSize(tvTitleRight,fSize_sp);
    }

    private TitleBarView setImageDrawable(ImageView img, @DrawableRes int resId){
        if(img!=null) img.setVisibility(VISIBLE);
        if(img!=null) img.setImageResource(resId);
        return this;
    }

    public TitleBarView setLeftImageDrawable(@DrawableRes int resId){
        return setImageDrawable(imgTitleLeft,resId);
    }

    public TitleBarView setCenterImageDrawable(@DrawableRes int resId){
        return setImageDrawable(imgTitleCenter,resId);
    }

    public TitleBarView setRightImageDrawable(@DrawableRes int resId){
        return setImageDrawable(imgTitleRight,resId);
    }

}