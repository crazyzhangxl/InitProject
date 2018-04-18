package com.example.initproject.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.initproject.commom.Constants;

/**
 * Created by zxl on 2017/8/26.
 * sharePreference 使用键值对来进行存储的
 * 位于 /data/data/应用包名/shared_prefs/*.xml  这里面就是<map></map> 键值对了
 *
 * /data/data/ 存放当前应用的私有信息  应用卸载也就删除了
 */

public class SharePreferenceUtils {
    // 私有的 外部当然没法访问咯
    private static SharedPreferences mSharedPreferences;

    public static void putBoolean(Context mContext, String key, boolean value){
        if (mSharedPreferences == null)
            mSharedPreferences = mContext.getSharedPreferences(Constants.SP_NAME, Context.MODE_PRIVATE);
        mSharedPreferences.edit().putBoolean(key,value).apply();
    }

    public static boolean getBoolean(Context mContext, String key, boolean defValue){
        if (mSharedPreferences == null)
            mSharedPreferences = mContext.getSharedPreferences(Constants.SP_NAME, Context.MODE_PRIVATE);
        return mSharedPreferences.getBoolean(key,defValue);
    }

    public static void putString(Context mContext, String key, String value){
        if (mSharedPreferences == null)
            mSharedPreferences = mContext.getSharedPreferences(Constants.SP_NAME, Context.MODE_PRIVATE);
        mSharedPreferences.edit().putString(key,value).apply();
    }

    public static String getString(Context mContext, String key, String defValue){
        if (mSharedPreferences == null)
            mSharedPreferences = mContext.getSharedPreferences(Constants.SP_NAME, Context.MODE_PRIVATE);
        return mSharedPreferences.getString(key,defValue);
    }

    public static void putInt(Context mContext, String key , int value){
        if (mSharedPreferences == null){
            mSharedPreferences = mContext.getSharedPreferences(Constants.SP_NAME, Context.MODE_PRIVATE);
        }
        mSharedPreferences.edit().putInt(key,value).apply();
    }

    public static int getInt(Context mContext, String key, int defValue){
        if (mSharedPreferences == null){
            mSharedPreferences = mContext.getSharedPreferences(Constants.SP_NAME, Context.MODE_PRIVATE);
        }
        return mSharedPreferences.getInt(key,defValue);
    }

    public static void clear(Context mContext){
        if (mSharedPreferences == null){
            mSharedPreferences = mContext.getSharedPreferences(Constants.SP_NAME, Context.MODE_PRIVATE);
        }
        mSharedPreferences.edit().clear().apply();
    }
}
