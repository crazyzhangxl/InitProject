package com.example.initproject.util;

import android.util.Log;

import com.example.initproject.commom.Constants;

/**
 * Created by zxl on 2017/8/26.
 * 封装Log是因为 在开发的时候需要去调用Loge信息
 * 但是上市了这些信息都应该清掉
 * 但你不可能去手动删除掉吧
 */

public class LogUtils {
    // true打开日志 false关闭log日志

    public static void e(String tag , String msg){
        if (Constants.isDebug)
            Log.e(tag,msg);
    }

    public static void w(String tag , String msg){
        if (Constants.isDebug)
            Log.w(tag,msg);
    }

    public static void i(String tag , String msg){
        if (Constants.isDebug)
            Log.i(tag,msg);
    }

    public static void d(String tag , String msg){
        if (Constants.isDebug)
            Log.d(tag,msg);
    }

    public static void v(String tag , String msg){
        if (Constants.isDebug)
            Log.v(tag,msg);
    }
}
