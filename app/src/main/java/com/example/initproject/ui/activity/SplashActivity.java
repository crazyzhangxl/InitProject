package com.example.initproject.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.initproject.R;
import com.example.initproject.ui.base.BaseActivity;
import com.example.initproject.ui.presenter.SplashPresenter;
import com.example.initproject.ui.view.SplashView;

import butterknife.BindView;

public class SplashActivity extends BaseActivity<SplashView, SplashPresenter> {
    @BindView(R.id.btn_pm_dispatcher)
    Button mBtnPmDispatcher;
    @BindView(R.id.btn_next)
    Button mBtnNext;
    @BindView(R.id.btn_main)
    Button mBtnMain;


    @Override
    protected void initListener() {
        mBtnPmDispatcher.setOnClickListener(view -> startActivity(new Intent(mContext, PermissionActivity.class)));

        mBtnNext.setOnClickListener(view -> startActivity(new Intent(mContext, NextActivity.class)));

        mBtnMain.setOnClickListener(view -> startActivity(new Intent(mContext, MainActivity.class)));


    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView(Bundle savedInstanceState) {

    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void init() {

    }

    @Override
    protected SplashPresenter createPresenter() {
        return new SplashPresenter(this);
    }



}
