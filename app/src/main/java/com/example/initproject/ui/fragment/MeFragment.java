package com.example.initproject.ui.fragment;

import android.view.View;

import com.example.initproject.R;
import com.example.initproject.ui.activity.MainActivity;
import com.example.initproject.ui.base.BaseFragment;
import com.example.initproject.ui.presenter.MeFgPresenter;
import com.example.initproject.ui.view.IMeFgView;

/**
 * Created by 张先磊 on 2018/4/17.
 */

public class MeFragment extends BaseFragment<IMeFgView,MeFgPresenter> {
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
    protected MeFgPresenter createPresenter() {
        return new MeFgPresenter((MainActivity)getActivity());
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.fragment_me;
    }
}
