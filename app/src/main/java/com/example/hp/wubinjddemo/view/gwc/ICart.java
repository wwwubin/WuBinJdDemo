package com.example.hp.wubinjddemo.view.gwc;

import com.example.hp.wubinjddemo.bean.gwc.CartBean;

import java.util.List;

public interface ICart {
        void showlist(List<CartBean.DataBean> grouplist, List<List<CartBean.DataBean.ListBean>> childlist);

}
