package com.example.hp.wubinjddemo.activitys;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.hp.wubinjddemo.R;


/**
 * Created by wonder on 2018/4/26.
 */

public class AddSubView extends LinearLayout implements View.OnClickListener{

    private EditText count;
    private TextView add;
    private TextView sub;

    public AddSubView(Context context) {
        this(context,null);
    }

    public AddSubView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public AddSubView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View inflate = View.inflate(context, R.layout.layout_add, this);
         sub= inflate.findViewById(R.id.sub);
        add = inflate.findViewById(R.id.add);
        count = inflate.findViewById(R.id.count);
        sub.setOnClickListener(this);
        add.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
    switch(view.getId()){
    case R.id.sub:
       sub();
      break;
      case R.id.add:
       add();
      break;
    }
    }

    private void add() {
        String s = count.getText().toString();
        double v = Double.parseDouble(s);
        v++;
        count.setText(v+"");
    }

    private void sub() {
        String s = count.getText().toString();
        double v = Double.parseDouble(s);
        if(v>=1){
            v--;
            count.setText(v+"");
        }
    }
  public String getCount(){
        return count.getText().toString();
  }
  public void setCount(double count1){
      count.setText(count1+"");
  }
}
