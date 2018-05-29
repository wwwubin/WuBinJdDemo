package com.example.hp.wubinjddemo.activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hp.wubinjddemo.R;
import com.example.hp.wubinjddemo.model.dengl.DenglModelImpl;
import com.example.hp.wubinjddemo.presenter.dengl.DenglPresenterImpl;
import com.example.hp.wubinjddemo.view.dengl.DenglView;

public class JddlActivity extends Activity implements DenglView {
    private EditText tel;
    private EditText pwd;
    private Button butt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jddl);
        tel = findViewById(R.id.tel);
        pwd = findViewById(R.id.pwd);
        butt =findViewById(R.id.butt);
        butt.setOnClickListener(new View.OnClickListener() {
            //            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
//            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                // butt.setBackgroundColor(Color.RED);
                //butt.setBackground(getDrawable(R.drawable.but_color));
                DenglPresenterImpl denglPresenter = new DenglPresenterImpl();
                DenglModelImpl denglModel = new DenglModelImpl();
                denglPresenter.loginPresenter(denglModel,JddlActivity.this);
            }
        });
    }

    @Override
    public String getMobile() {
        return tel.getText().toString();
    }

    @Override
    public String getPassWord() {
        return pwd.getText().toString();
    }

    @Override
    public void loginSuccess() {
        startActivity(new Intent(JddlActivity.this, GeRenActivity.class));
    }

    @Override
    public void loginError() {
        Toast.makeText(JddlActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
    }
}
