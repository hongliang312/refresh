package com.example.refresh.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.refresh.R;
import com.example.refresh.bean.ShowBean;
import com.example.refresh.view.Main2Activity;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by 知足 on 2018/2/5.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<ShowBean.NewslistBean> datas;
    private Context context;


    public MyAdapter(List<ShowBean.NewslistBean> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    //创建新View，被LayoutManager所调用
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = View.inflate(context, R.layout.item, null);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    //将数据与界面进行绑定的操作
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.item_img.setImageURI(datas.get(position).getPicUrl());
        viewHolder.mTextView.setText(datas.get(position).getTitle());
        viewHolder.item_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, Main2Activity.class);
                intent.putExtra("key",datas.get(position).getPicUrl());
                context.startActivity(intent);
            }
        });
    }

    //获取数据的数量
    @Override
    public int getItemCount() {
        return datas.size();
    }

    //自定义的ViewHolder，持有每个Item的的所有界面元素
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        private SimpleDraweeView item_img;
        public ViewHolder(View view) {
            super(view);
            mTextView = (TextView) view.findViewById(R.id.text);
            item_img = view.findViewById(R.id.item_img);
        }
    }
}
