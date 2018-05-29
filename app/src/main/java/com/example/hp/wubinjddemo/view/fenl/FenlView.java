package com.example.hp.wubinjddemo.view.fenl;



import com.example.hp.wubinjddemo.bean.fenl.LeftBean;
import com.example.hp.wubinjddemo.bean.fenl.RightBean;

import java.util.List;

/**
 * Created by wonder on 2018/4/29.
 */

public interface FenlView {
    //显示左侧列表
    void showLeftView(List<LeftBean.DataBean> list);
    //显示右侧
    void showRightView(List<RightBean.DataBean> list);
    //获取分类的cid
    String getCid();
}
