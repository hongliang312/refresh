package com.example.refresh.view;

import com.example.refresh.bean.ShowBean;

import java.util.List;

/**
 * Created by 知足 on 2018/2/5.
 */

public interface NewsView {
    void success(List<ShowBean.NewslistBean> data);
    void failed(String e);
}
