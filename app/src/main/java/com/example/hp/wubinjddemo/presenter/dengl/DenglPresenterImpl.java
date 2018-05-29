package com.example.hp.wubinjddemo.presenter.dengl;


import com.example.hp.wubinjddemo.http.HttpConfig;
import com.example.hp.wubinjddemo.model.dengl.DenglModel;
import com.example.hp.wubinjddemo.model.dengl.LoginListener;
import com.example.hp.wubinjddemo.view.dengl.DenglView;
import com.example.hp.wubinjddemo.view.dengl.ZhucView;

import java.util.HashMap;
import java.util.Map;

public class DenglPresenterImpl implements DenglPresenter {
    @Override
    public void loginPresenter(DenglModel denglModel, final DenglView denglView) {
        Map<String,String> parms=new HashMap<>();
        parms.put("mobile",denglView.getMobile());
        parms.put("password",denglView.getPassWord());
        denglModel.login(HttpConfig.login_url, parms, new LoginListener() {
            @Override
            public void loginSuccess(String json) {
                denglView.loginSuccess();
            }

            @Override
            public void loginError(String error) {
                denglView.loginError();
            }
        });
    }

    @Override
    public void RegPresenter(DenglModel denglModel, final ZhucView zhucView) {
        Map<String,String> parms=new HashMap<>();
        parms.put("mobile",zhucView.getMobile());
        parms.put("password",zhucView.getPassWord());
        denglModel.Reg(HttpConfig.reg_url, parms, new LoginListener() {
            @Override
            public void loginSuccess(String json) {
                zhucView.regSuccess();
            }

            @Override
            public void loginError(String error) {
                zhucView.regError();
            }
        });
    }
}
