package com.example.bhh.myapplication.utils;

import com.example.bhh.myapplication.Bean;

import io.reactivex.Observable;
import retrofit2.http.POST;

public interface MyServer {
//    http://v.juhe.cn/toutiao/index?type=top&key=e315530fcb4ea3ed1adce160f1097893
    String URL ="http://v.juhe.cn/toutiao/";
    @POST("index?type=top&key=e315530fcb4ea3ed1adce160f1097893")
    Observable<Bean> postData();
}
