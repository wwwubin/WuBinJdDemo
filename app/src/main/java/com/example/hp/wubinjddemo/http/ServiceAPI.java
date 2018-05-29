package com.example.hp.wubinjddemo.http;

import com.example.hp.wubinjddemo.bean.gwc.AddCart;
import com.example.hp.wubinjddemo.bean.gwc.CartBean;
import com.example.hp.wubinjddemo.bean.gwc.XQBean;
import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ServiceAPI {
    @GET("getProductDetail")
    Flowable<XQBean> getXQ(@Query("pid") int pid, @Query("source") String str);
    @GET("addCart")
    Flowable<AddCart> getMsg(@Query("uid") int uid, @Query("pid") int pid, @Query("source") String str);
    @GET("getCarts")
    Flowable<CartBean> getCart(@Query("uid") int uid, @Query("source") String str);
}
