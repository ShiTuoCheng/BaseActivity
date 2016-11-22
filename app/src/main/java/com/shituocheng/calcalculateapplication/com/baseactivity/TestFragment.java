package com.shituocheng.calcalculateapplication.com.baseactivity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class TestFragment extends BaseFragment {

    //private TextView tx_view_test;

    //BufferKnife注入View

    @BindView(R.id.tx_view_test) TextView tx_view_test;

    public TestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(bindLayout(), container, false);

        initView(v);

        return v;
    }

    @Override
    public void initView(View view) {

        //tx_view_test = (TextView)view.findViewById(R.id.tx_view_test);

        ButterKnife.bind(getActivity());

    }

    @Override
    public int bindLayout() {
        return R.layout.fragment_test;
    }

}
