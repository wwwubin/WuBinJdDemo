package com.example.hp.wubinjddemo.presenter;

import com.example.hp.wubinjddemo.bean.LieBean;
import com.example.hp.wubinjddemo.model.LieModel;
import com.example.hp.wubinjddemo.view.LieView;

import java.util.List;

public interface LiePresenter {
    void showToLie(LieModel lieModel, LieView lieView);
    void getLieDate(List<LieBean.DataBean> list);
}
