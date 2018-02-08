package com.example.refresh.view;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import com.example.refresh.R;
import com.example.refresh.adapter.MyAdapter;
import com.example.refresh.bean.ShowBean;
import com.example.refresh.presenter.NewsPresenter;
import com.jcodecraeer.xrecyclerview.ProgressStyle;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.xrv)
    XRecyclerView mXrv;
    private NewsPresenter presenter;
    private List<ShowBean.NewslistBean> list = new ArrayList<>();
    private MyAdapter adapter;
    private int num=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mXrv.setLayoutManager(gridLayoutManager);
        getData(num);
        mXrv.setPullRefreshEnabled(true);
        mXrv.setLoadingMoreEnabled(true);
        mXrv.setRefreshProgressStyle(ProgressStyle.BallSpinFadeLoader); //样式可有可无
        mXrv.setLoadingMoreProgressStyle(ProgressStyle.Pacman);         //样式可有可无

        mXrv.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable(){
                    public void run() {
                        num=10;
                        getData(num);
                        mXrv.refreshComplete();
                    }

                }, 2000);

            }

            @Override
            public void onLoadMore() {
                new Handler().postDelayed(new Runnable(){
                    public void run() {
                        num+=10;
                        getData(num);
                        mXrv.refreshComplete();
                    }
                }, 2000);

            }
        });

    }
    public void getData(int count){
        presenter = new NewsPresenter();
        presenter.getNews("2a0024d1f7f558e09936f697580f1643", num);
        presenter.attachView(new NewsView() {
            @Override
            public void success(List<ShowBean.NewslistBean> data) {
                //list.clear();
                list.addAll(data);
                Log.i("zzz", "success: " + list.toString());
                if (adapter==null){
                    adapter = new MyAdapter(list, MainActivity.this);
                    mXrv.setAdapter(adapter);
                }else {
                    adapter.notifyDataSetChanged();
                }

            }

            @Override
            public void failed(String e) {

            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter !=null){
            presenter.detachView();
        }
    }
}
