package com.example.hp.wubinjddemo.presenter.shouy;

import android.content.Context;


import com.example.hp.wubinjddemo.bean.shouy.Jiugongge_bean;
import com.example.hp.wubinjddemo.bean.shouy.Shouye_bean;
import com.example.hp.wubinjddemo.model.shouy.Getjiugongge;
import com.example.hp.wubinjddemo.model.shouy.Getjson;
import com.example.hp.wubinjddemo.model.shouy.Imode;
import com.example.hp.wubinjddemo.view.shouy.Iview;

import java.util.List;

public class Mypresenter implements Ipressenter {
    @Override
    public void getmv(final Context context, final Iview iview, Imode imode) {
        imode.getnetjson(new Getjson() {
            @Override
            public void getnetjson(Shouye_bean shouye_bean) {
                iview.setadapter(context,shouye_bean);
            }
        });
    }


    @Override
    public void getmv1(final Iview iview, final Imode imode) {
        imode.getjiugonggejson(new Getjiugongge() {
            @Override
            public void getJiugongge(List<Jiugongge_bean.DataBean> data) {
                iview.setadapter1(data);
            }
        });
    }
}
