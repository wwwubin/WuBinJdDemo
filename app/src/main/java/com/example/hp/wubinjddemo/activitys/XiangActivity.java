package com.example.hp.wubinjddemo.activitys;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.wubinjddemo.R;
import com.example.hp.wubinjddemo.bean.gwc.XQBean;
import com.example.hp.wubinjddemo.fragments.GouWuCheFragment;
import com.example.hp.wubinjddemo.presenter.gwc.XQPresenter;
import com.example.hp.wubinjddemo.view.gwc.IView;
import com.facebook.drawee.view.SimpleDraweeView;

public class XiangActivity extends Activity implements View.OnClickListener,IView {
    private SimpleDraweeView mXqsdv;
    private TextView mTvtitle;
    private Button mTianjia;
    private LinearLayout mAddActivity;
    private XQPresenter xqPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiang);
        initView();
        xqPresenter=new XQPresenter(this);
        xqPresenter.getXQ();
    }
    private void initView() {
        mXqsdv = (SimpleDraweeView) findViewById(R.id.xqsdv1);
        mTvtitle = (TextView) findViewById(R.id.tvtitle1);
        mTianjia = (Button) findViewById(R.id.tianjia1);
        mTianjia.setOnClickListener(this);
        mAddActivity = (LinearLayout) findViewById(R.id.activity_add);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.tianjia1:
                xqPresenter.getAdd();
                break;
        }
    }

    @Override
    public void showBean(Object o) {
        XQBean xqBean = (XQBean) o;
        XQBean.DataBean data = xqBean.getData();
        String s = data.getImages().split("\\|")[0];
        Uri uri =Uri.parse(s);//地址转换成URI
        mXqsdv.setImageURI(uri);
        mTvtitle.setText(data.getTitle()+"\n"+data.getPrice());
    }

    @Override
    public void showStr(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
