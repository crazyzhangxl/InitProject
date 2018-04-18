package com.example.initproject.ui.base;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * Created by 张先磊 on 2018/4/17.
 */

public class BasePresenter<V> {
    public BaseActivity mContext;

    public BasePresenter(BaseActivity context) {
        mContext = context;
    }

    protected Reference<V> mViewRef;
    public void attachView(V view){
        this.mViewRef = new WeakReference<V>(view);
    }

    public void detachView(){
        if (mViewRef != null){
            mViewRef.clear();
            mViewRef = null;
        }
    }

    public V getView(){
        return mViewRef !=null?mViewRef.get():null;
    }
}
