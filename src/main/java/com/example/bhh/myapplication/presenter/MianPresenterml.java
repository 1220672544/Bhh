package com.example.bhh.myapplication.presenter;

import com.example.bhh.myapplication.Bean;
import com.example.bhh.myapplication.model.MainModel;
import com.example.bhh.myapplication.model.MainModelml;
import com.example.bhh.myapplication.view.MainView;

import java.util.List;

public class MianPresenterml implements MainPresenter, MainModel.HttpFinish {
    private MainModel mainModel = new MainModelml();
    private MainView mainView;

    public MianPresenterml(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void getmTovData() {
        if (mainView!=null){
            mainModel.getData(this);
        }
    }

    @Override
    public void setData(List<Bean.ResultBean.DataBean> beans) {
        if (mainView!=null){
            mainView.showData(beans);
        }
    }
}
