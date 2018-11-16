package com.example.bhh.myapplication.model;

import com.example.bhh.myapplication.Bean;

import java.util.List;

public interface MainModel {
    interface  HttpFinish{
        void setData(List<Bean.ResultBean.DataBean> beans);
    }
    void getData(HttpFinish httpFinish);
}
