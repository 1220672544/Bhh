package com.example.bhh.myapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bhh.myapplication.Bean;
import com.example.bhh.myapplication.MyRlAdapter;
import com.example.bhh.myapplication.R;
import com.example.bhh.myapplication.presenter.MianPresenterml;
import com.example.bhh.myapplication.view.MainView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AFragment extends Fragment implements MainView {

    private RecyclerView rl;
    private MianPresenterml presenterml;
    private MyRlAdapter rlAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_a, container, false);
        initView(inflate);
        presenterml = new MianPresenterml(this);
        presenterml.getmTovData();
        return inflate;
    }

    private void initView(View inflate) {
        rl = (RecyclerView) inflate.findViewById(R.id.rl);
    }

    @Override
    public void showData(List<Bean.ResultBean.DataBean> beans) {
        rlAdapter = new MyRlAdapter(getContext(),beans);
        rl.setAdapter(rlAdapter);
        rl.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
    }
}
