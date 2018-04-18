package com.example.initproject.ui.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.initproject.R;
import com.example.initproject.ui.activity.MainActivity;
import com.example.initproject.ui.base.BaseFragment;
import com.example.initproject.ui.presenter.TimeFgPresenter;
import com.example.initproject.ui.view.ITimeFgView;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by 张先磊 on 2018/4/17.
 */

public class TimeFragment extends BaseFragment<ITimeFgView, TimeFgPresenter> {

    @BindView(R.id.time)
    TextView mTime;



    @Override
    public void init() {

    }

    @Override
    public void initView(View rootView) {

    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }

    @Override
    protected TimeFgPresenter createPresenter() {
        return new TimeFgPresenter((MainActivity) getActivity());
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.fragment_time;
    }




}
