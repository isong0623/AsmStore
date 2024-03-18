package com.haoda.common.net.config;

import com.haoda.common.net.retrofit.ApiException;
import com.haoda.common.net.bean.BaseResult;

import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

import static io.reactivex.BackpressureStrategy.BUFFER;

public class RxSchedulers {
    public static <T> FlowableTransformer<T, T> io_main() {
        return (FlowableTransformer<T, T>) mTransformer;
    }

     private static final FlowableTransformer<? extends BaseResult<Object>, ? extends BaseResult<Object>> mTransformer =
             observable ->
                     observable
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .compose(handleStream());

    private static <T> FlowableTransformer<BaseResult<T>,BaseResult<T>> handleStream(){
        return srcStream -> srcStream.flatMap(
                (Function<BaseResult<T>, Flowable<BaseResult<T>>>)
                        result -> checkHttpData(result)
        );
    }

    private static <T> Flowable<BaseResult<T>> checkHttpData(BaseResult<T> t) {
        return Flowable.create((observable) -> {
            try {
                switch (t.getCode().trim()){
                    case "1000":
                        observable.onNext(t);
                        break;
                    case "AC1000"://验证码已发送，请稍后再试
                    case "EX1000"://请先下架商品
                    case "EXP2001"://暂无物流信息
                    case "2003"://当前用户被禁用
                    case "2004"://验证码错误,请重新输入
                    case "2010"://用户购物车数量超过限制
                    case "2024"://用户收藏商品超过最大值
                    case "2044"://获取用户微信失败
                        observable.onError(new ApiException(t.getCode().trim(),t.getMessage()));
                        break;
                    default:
                    case "9999"://参数异常
                        observable.onError(new ApiException(t.getCode().trim(),"别着急，服务器好像打盹了呢~"));
                        break;
                }

            } catch (Exception e) {
                observable.onError(e);
            }
            finally {
                observable.onComplete();
            }
        },BUFFER);
    }
}