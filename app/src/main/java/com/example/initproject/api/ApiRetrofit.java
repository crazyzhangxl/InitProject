package com.example.initproject.api;

import com.example.initproject.api.base.BaseApiRetrofit;
import com.example.initproject.model.request.LoginRequest;
import com.example.initproject.model.response.LoginResponse;
import com.example.initproject.model.response.PsersonResponse;
import com.google.gson.Gson;


import java.io.File;

import io.reactivex.Observable;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 张先磊 on 2018/4/17.
 */

public class ApiRetrofit extends BaseApiRetrofit {

    public MyApi mApi;
    public static ApiRetrofit mInstance;
    private ApiRetrofit(){
        //在构造方法中完成对Retrofit接口的初始化

        mApi = new Retrofit.Builder()
                .baseUrl(MyApi.BASE_URL)
                .client(getClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
                .create(MyApi.class);
    }

    public static ApiRetrofit getInstance(){
        if (mInstance == null){
            synchronized (ApiRetrofit.class){
                if (mInstance == null){
                    mInstance = new ApiRetrofit();
                }
            }
        }
        return  mInstance;
    }


    public Observable<Object> getRegisterCode(){
        return mApi.getRegisterCode(getRequestBody(new PsersonResponse("zxlzxlzxlzxlzxl","123123123","man")));
    }

    public Observable<Object> getLoginCode(){
        return mApi.getLoginCode(getRequestBody(new LoginRequest("zxlzxlzxlzxlzxl","123123123")));
    }

    public Observable<Object> postHeadImage(String auth,File file){
        return mApi.postHeadImage(auth,getMultipartBody(file));
    }


    private RequestBody getRequestBody(Object obj) {
        String route = new Gson().toJson(obj);
        RequestBody body=RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"),route);
        return body;
    }

    private MultipartBody.Part getMultipartBody(File file){
        RequestBody requestFile =
                RequestBody.create(MediaType.parse("multipart/form-data"), file);

        MultipartBody.Part multipartBody =
                MultipartBody.Part.createFormData("image", file.getName(), requestFile);
        return multipartBody;
    }



}
