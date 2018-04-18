package com.example.initproject.ui.activity;


import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.initproject.R;
import com.example.initproject.ui.base.BaseActivity;
import com.example.initproject.ui.base.FragmentFactory;
import com.example.initproject.ui.fragment.AddressFragment;
import com.example.initproject.ui.fragment.FavouriteFragment;
import com.example.initproject.ui.fragment.MeFragment;
import com.example.initproject.ui.fragment.TimeFragment;
import com.example.initproject.ui.presenter.MainPresenter;
import com.example.initproject.ui.view.MainView;
import com.roughike.bottombar.BottomBar;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.yokeyword.fragmentation.SupportFragment;


public class MainActivity extends BaseActivity<MainView, MainPresenter> {
    @BindView(R.id.fg_main)
    FrameLayout mFgMain;
    private SupportFragment[] mFragments = new SupportFragment[4];
    public static final int TIME = 0;
    public static final int FAVOURITE = 1;
    public static final int ADDRESS = 2;
    public static final int ME = 3;
    @BindView(R.id.bottomBar)
    BottomBar mBottomBar;
    private long exitTime;
    private int prePosition;

    @Override
    protected void initListener() {
        mBottomBar.setOnTabSelectListener(tabId -> {
            switch (tabId) {
                case R.id.tab_recents:
                    showHideFragment(mFragments[0], mFragments[prePosition]);
                    prePosition = 0;
                    break;
                case R.id.tab_favorites:
                    showHideFragment(mFragments[1], mFragments[prePosition]);
                    prePosition = 1;
                    break;
                case R.id.tab_nearby:
                    showHideFragment(mFragments[2], mFragments[prePosition]);
                    prePosition = 2;
                    break;
                case R.id.tab_friends:
                    showHideFragment(mFragments[3], mFragments[prePosition]);
                    prePosition = 3;
                    break;
            }
        });

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            mFragments[TIME] = FragmentFactory.getInstance().getTimeFragment();
            mFragments[FAVOURITE] = FragmentFactory.getInstance().getFavouriteFragment();
            mFragments[ADDRESS] = FragmentFactory.getInstance().getAddressFragment();
            mFragments[ME] = FragmentFactory.getInstance().getMeFragment();
            //加载ME
            loadMultipleRootFragment(R.id.fg_main, ME,
                    mFragments[TIME],
                    mFragments[FAVOURITE],
                    mFragments[ADDRESS],
                    mFragments[ME]);
        } else {
            // 这里我们需要拿到mFragments的引用,也可以通过getSupportFragmentManager.getFragments()自行进行判断查找(效率更高些),用下面的方法查找更方便些
            mFragments[TIME] = findFragment(TimeFragment.class);
            mFragments[FAVOURITE] = findFragment(FavouriteFragment.class);
            mFragments[ADDRESS] = findFragment(AddressFragment.class);
            mFragments[ME] = findFragment(MeFragment.class);
        }

        mBottomBar.setDefaultTab(R.id.tab_friends);
        prePosition = 3;
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {

    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }


    @Override
    public void onBackPressedSupport() {
        if ((System.currentTimeMillis() - exitTime) > 2000) {
            Toast.makeText(this, "再按一次退出该应用", Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
            return;
        }
        super.onBackPressedSupport();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
