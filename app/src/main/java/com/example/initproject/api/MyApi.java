package com.example.initproject.api;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by 张先磊 on 2018/4/17.
 */

public interface MyApi {
    String BASE_URL = "http://210.28.188.99:8088/";

    @POST("auth/register")
    Observable<Object> getRegisterCode(@Body RequestBody body);

    @POST("auth")
    Observable<Object> getLoginCode(@Body RequestBody body);

    @POST("user/image")
    Observable<Object> postHeadImage(@Header("Authorization") String auto,@Part MultipartBody.Part file);
}

/*    MultipartBody.Part body =
            MultipartBody.Part.createFormData("image", file.getName(), requestFile);*/
