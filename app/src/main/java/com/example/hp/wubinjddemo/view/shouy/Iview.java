package com.example.hp.wubinjddemo.view.shouy;

import android.content.Context;

import com.example.hp.wubinjddemo.bean.shouy.Jiugongge_bean;
import com.example.hp.wubinjddemo.bean.shouy.Shouye_bean;

import java.util.List;
public interface Iview {
        void setadapter(Context context, Shouye_bean shouye_bean);

        void setadapter1(List<Jiugongge_bean.DataBean> data);
    }
