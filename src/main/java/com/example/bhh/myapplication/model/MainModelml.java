package com.example.bhh.myapplication.model;

import android.util.Log;

import com.example.bhh.myapplication.Bean;
import com.example.bhh.myapplication.utils.HttpUtils;
import com.example.bhh.myapplication.utils.MyServer;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class MainModelml implements MainModel {
    @Override
    public void getData(final HttpFinish httpFinish) {
        MyServer myServer = HttpUtils.getInstance().myServer();
        Observable<Bean> postData = myServer.postData();
        postData.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.e("eeee",d.toString());
                    }

                    @Override
                    public void onNext(Bean value) {
                        Log.e("----Next---",value.getResult().getData().get(2).getAuthor_name());
                        httpFinish.setData(value.getResult().getData());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("---e-",e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
