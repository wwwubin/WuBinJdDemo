package com.example.hp.wubinjddemo.presenter.dengl;

import com.example.hp.wubinjddemo.model.dengl.DenglModel;
import com.example.hp.wubinjddemo.view.dengl.DenglView;
import com.example.hp.wubinjddemo.view.dengl.ZhucView;

public interface DenglPresenter {
    void loginPresenter(DenglModel denglModel, DenglView denglView);
    void RegPresenter(DenglModel denglModel, ZhucView zhucView);
}
