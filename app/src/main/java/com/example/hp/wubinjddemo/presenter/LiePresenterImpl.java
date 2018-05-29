package com.example.hp.wubinjddemo.presenter;

import com.example.hp.wubinjddemo.bean.LieBean;
import com.example.hp.wubinjddemo.model.LieModel;
import com.example.hp.wubinjddemo.view.LieView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiePresenterImpl implements LiePresenter {
    private LieView lieView;
    @Override
    public void showToLie(LieModel lieModel, LieView lieView) {
             this.lieView=lieView;
        Map<String,String> map=new HashMap<>();
        map.put("pscid","1");
        lieModel.getLieGoodsList(map);
    }

    @Override
    public void getLieDate(List<LieBean.DataBean> list) {
              lieView.lieGoodsList(list);
    }
}
