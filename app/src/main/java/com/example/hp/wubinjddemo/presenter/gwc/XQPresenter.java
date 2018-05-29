package com.example.hp.wubinjddemo.presenter.gwc;

import com.example.hp.wubinjddemo.bean.gwc.AddCart;
import com.example.hp.wubinjddemo.bean.gwc.XQBean;
import com.example.hp.wubinjddemo.model.gwc.XQModel;
import com.example.hp.wubinjddemo.view.gwc.IView;
import com.example.hp.wubinjddemo.view.gwc.OnNetLisenter;

/**
 * 详情页的P层
 */
public class XQPresenter {
    private final XQModel xqModel;
    private IView iView;
    public XQPresenter(IView iView) {
        xqModel = new XQModel();
        this.iView=iView;
    }
    public void getXQ(){
        xqModel.getXQ(12, "android", new OnNetLisenter<XQBean>() {
            @Override
            public void Success(XQBean xqBean) {
                iView.showBean(xqBean);
            }
        });
    }
    public void getAdd(){
        xqModel.getAdd(3043, 12, "android", new OnNetLisenter<AddCart>() {
            @Override
            public void Success(AddCart addCart) {
                iView.showStr(addCart.getMsg());
            }
        });
    }
}
