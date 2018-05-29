package com.example.hp.wubinjddemo.activitys;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hp.wubinjddemo.R;
import com.example.hp.wubinjddemo.adapter.fenl.LieAdapter;
import com.example.hp.wubinjddemo.bean.LieBean;
import com.example.hp.wubinjddemo.model.LieModelImpl;
import com.example.hp.wubinjddemo.presenter.LiePresenterImpl;
import com.example.hp.wubinjddemo.view.LieView;

import java.util.List;

public class LiebActivity extends Activity implements LieView {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lieb);
         recyclerView= findViewById(R.id.lie_recyc);
         recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LiePresenterImpl liePresenter = new LiePresenterImpl();
        liePresenter.showToLie(new LieModelImpl(liePresenter),this);
    }

    @Override
    public void lieGoodsList(List<LieBean.DataBean> list) {
        LieAdapter lieAdapter = new LieAdapter(this, list);
        recyclerView.setAdapter(lieAdapter);
    }
}
