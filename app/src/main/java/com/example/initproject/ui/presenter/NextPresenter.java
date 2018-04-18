package com.example.initproject.ui.presenter;

import android.util.Log;

import com.example.initproject.api.ApiRetrofit;
import com.example.initproject.ui.base.BaseActivity;
import com.example.initproject.ui.base.BasePresenter;
import com.example.initproject.ui.view.NextView;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 张先磊 on 2018/4/17.
 */

public class NextPresenter extends BasePresenter<NextView> {


    public NextPresenter(BaseActivity context) {
        super(context);
    }

    public void register(){
        ApiRetrofit.getInstance().getRegisterCode().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Object>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Object o) {
                        Log.e("测试", "onNext: "+o );
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    public void login(){
        ApiRetrofit.getInstance().getLoginCode().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Object>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Object o) {
                        Log.e("测试", "onNext: "+o );
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void postHeadImage(){



    }


}
