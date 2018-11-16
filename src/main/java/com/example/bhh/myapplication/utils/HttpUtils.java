package com.example.bhh.myapplication.utils;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpUtils {
    public static  HttpUtils httpUtils;

    private HttpUtils() {
    }

    public   static HttpUtils getInstance(){
        if (httpUtils ==null){
            synchronized (HttpUtils.class){
                if (httpUtils==null) {
                    httpUtils = new HttpUtils();
                }
            }
        }
        return httpUtils;
    }

    public MyServer myServer(){
        Retrofit build = new Retrofit.Builder().baseUrl(MyServer.URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return build.create(MyServer.class);
    }

}
