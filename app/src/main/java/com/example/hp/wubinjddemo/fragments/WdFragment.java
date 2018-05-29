package com.example.hp.wubinjddemo.fragments;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.hp.wubinjddemo.R;
import com.example.hp.wubinjddemo.activitys.JddlActivity;

public class WdFragment extends BaseFragment {
    private View view;
    @Override
    View createView(LayoutInflater inflater) {
        view = View.inflate(getActivity(), R.layout.layout_wd,null);
        TextView tv=view.findViewById(R.id.dlzc);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), JddlActivity.class));
            }
        });
        return view;
    }
}
