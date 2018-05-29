package com.example.hp.wubinjddemo.model.dengl;

import android.util.Log;

import com.example.hp.wubinjddemo.bean.LoginBean;
import com.example.hp.wubinjddemo.bean.RegBean;
import com.example.hp.wubinjddemo.util.HttpUtils;
import com.example.hp.wubinjddemo.util.OkLoadListener;
import com.google.gson.Gson;
import java.util.Map;

import static android.content.ContentValues.TAG;

public class DenglModelImpl implements DenglModel {
    @Override
    public void login(String url, Map<String, String> parms, final LoginListener loginListener) {
        HttpUtils httpUtils = HttpUtils.getHttpUtils();
        httpUtils.okPost(url,parms);
        httpUtils.setOkLoadListener(new OkLoadListener() {
            @Override
            public void okLoadSuccess(String json) {
                Log.d(TAG, "LoadSuccess: "+json);
                Gson gson=new Gson();
                LoginBean loginBean = gson.fromJson(json, LoginBean.class);
                if(loginBean.getCode().equals("0")){
                    loginListener.loginSuccess(json);
                }else {
                    loginListener.loginError(json);
                }

            }

            @Override
            public void okLoadError(String error) {
                loginListener.loginError(error);
            }
        });
    }

    @Override
    public void Reg(String url, Map<String, String> parms, final LoginListener loginListener) {
        HttpUtils httpUtils = HttpUtils.getHttpUtils();
        httpUtils.okPost(url,parms);
        httpUtils.setOkLoadListener(new OkLoadListener() {
            @Override
            public void okLoadSuccess(String json) {
                Log.d(TAG, "LoadSuccess: "+json);
                Gson gson=new Gson();
                RegBean regBean = gson.fromJson(json, RegBean.class);
                if(regBean.getCode().equals("0")){
                    loginListener.loginSuccess(json);
                }else {
                    loginListener.loginError(json);
                }

            }

            @Override
            public void okLoadError(String error) {
                loginListener.loginError(error);
            }
        });
    }
}
