package com.example.bhh.myapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.bhh.myapplication.fragment.AFragment;
import com.example.bhh.myapplication.fragment.BFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout tab;
    private ViewPager vp;
    private ArrayList<String> title;
    private ArrayList<Fragment> list;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tab = (TabLayout) findViewById(R.id.tab);
        vp = (ViewPager) findViewById(R.id.vp);

        title = new ArrayList<>();
        title.add("首页");
        title.add("我的");

        list = new ArrayList<>();
        list.add(new AFragment());
        list.add(new BFragment());

        adapter = new MyAdapter(getSupportFragmentManager(),title,list);

        vp.setAdapter(adapter);

        tab.setupWithViewPager(vp);

    }
}
