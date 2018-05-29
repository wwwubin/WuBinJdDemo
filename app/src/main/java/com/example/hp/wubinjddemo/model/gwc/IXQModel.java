package com.example.hp.wubinjddemo.model.gwc;

import com.example.hp.wubinjddemo.bean.gwc.XQBean;
import com.example.hp.wubinjddemo.view.gwc.OnNetLisenter;

/**
 * 实现详情页model层的接口
 */
public interface IXQModel {
    public void getXQ(int pid, String str, final OnNetLisenter<XQBean> cgsb);
}
