package com.example.hp.wubinjddemo.presenter.shouy;

import android.content.Context;

import com.example.hp.wubinjddemo.model.shouy.Imode;
import com.example.hp.wubinjddemo.view.shouy.Iview;
public interface Ipressenter {
    void getmv(Context context, Iview iview, Imode imode);

    void getmv1(Iview iview, Imode imode);
}
