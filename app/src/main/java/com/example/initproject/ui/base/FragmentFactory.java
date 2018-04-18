package com.example.initproject.ui.base;

import com.example.initproject.ui.fragment.AddressFragment;
import com.example.initproject.ui.fragment.FavouriteFragment;
import com.example.initproject.ui.fragment.MeFragment;
import com.example.initproject.ui.fragment.TimeFragment;

/**
 * Created by 张先磊 on 2018/4/17.
 */

public class FragmentFactory {

    public static FragmentFactory mInstance;

    private FragmentFactory(){}
    // 双重检验模式
    public static FragmentFactory getInstance() {
        if (mInstance == null) {
            synchronized (FragmentFactory.class) {
                if (mInstance == null) {
                    mInstance = new FragmentFactory();
                }
            }
        }
        return mInstance;
    }

    private AddressFragment mAddressFragment;
    private FavouriteFragment mFavouriteFragment;
    private TimeFragment mTimeFragment;
    private MeFragment mMeFragment;

    public AddressFragment getAddressFragment(){
        if (mAddressFragment == null){
            synchronized (FragmentFactory.class){
                if (mAddressFragment == null){
                    mAddressFragment = new AddressFragment();
                }
            }
        }
        return mAddressFragment;
    }

    public FavouriteFragment getFavouriteFragment(){
        if (mFavouriteFragment == null){
            synchronized (FragmentFactory.class){
                if (mFavouriteFragment== null){
                    mFavouriteFragment = new FavouriteFragment();
                }
            }
        }
        return mFavouriteFragment;
    }

    public TimeFragment getTimeFragment(){
        if (mTimeFragment == null){
            synchronized (FragmentFactory.class){
                if (mTimeFragment == null){
                    mTimeFragment = new TimeFragment();
                }
            }
        }
        return mTimeFragment;
    }

    public MeFragment getMeFragment(){
        if (mMeFragment == null){
            synchronized (FragmentFactory.class){
                if (mMeFragment == null){
                    mMeFragment = new MeFragment();
                }
            }
        }
        return mMeFragment;
    }

}
