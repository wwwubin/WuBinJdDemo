package com.example.hp.wubinjddemo.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.hp.wubinjddemo.R;
import com.example.hp.wubinjddemo.adapter.fenl.MyAdapter1;
import com.example.hp.wubinjddemo.adapter.fenl.MyAdapter2;
import com.example.hp.wubinjddemo.bean.fenl.LeftBean;
import com.example.hp.wubinjddemo.bean.fenl.RightBean;
import com.example.hp.wubinjddemo.model.fenl.FenlModelImpl;
import com.example.hp.wubinjddemo.presenter.fenl.FenlPresenterImpl;
import com.example.hp.wubinjddemo.view.fenl.FenlView;


import java.util.List;

public class FenLeiFragment extends BaseFragment implements FenlView {
    private View view;
    private ListView left_listview;
    private ListView right_listview;
    private String code;
    private List<LeftBean.DataBean> list;
    private FenlPresenterImpl iPresenter;
    @Override
    View createView(LayoutInflater inflater) {
        view = View.inflate(getActivity(), R.layout.layout_fl,null);
        initview();
        iPresenter = new FenlPresenterImpl();
        iPresenter.showLeftToView(new FenlModelImpl(),this);
        return view;
    }
    private void initview() {
        left_listview = view.findViewById(R.id.left_listview);
        right_listview = view.findViewById(R.id.right_listview);
        left_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FenLeiFragment.this.code=list.get(i).getCid()+"";
                iPresenter.showRightToView(new FenlModelImpl(),FenLeiFragment.this);
            }
        });
    }

    @Override
    public void showLeftView(List<LeftBean.DataBean> list) {
        this.list=list;
        MyAdapter1 myAdapter1 = new MyAdapter1(getContext(), list);
        left_listview.setAdapter(myAdapter1);
        int cid = list.get(0).getCid();
        FenLeiFragment.this.code=cid+"";
        iPresenter.showRightToView(new FenlModelImpl(),FenLeiFragment.this);
    }

    @Override
    public void showRightView(List<RightBean.DataBean> list) {
        MyAdapter2 myAdapter2=new MyAdapter2(getContext(),list);
        right_listview.setAdapter(myAdapter2);
    }

    @Override
    public String getCid() {
        return this.code;
    }
}
