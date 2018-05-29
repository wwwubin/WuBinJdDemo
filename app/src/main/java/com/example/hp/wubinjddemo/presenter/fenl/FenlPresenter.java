package com.example.hp.wubinjddemo.presenter.fenl;


import com.example.hp.wubinjddemo.model.fenl.FenlModel;
import com.example.hp.wubinjddemo.view.fenl.FenlView;

/**
 * Created by wonder on 2018/4/29.
 */

public interface FenlPresenter {
    //显示左侧列表
    void showLeftToView(FenlModel iModel, FenlView iView);
    //显示右侧列表
    void showRightToView(FenlModel iModel, FenlView iView);
}
