package com.example.refresh.http;


import com.example.refresh.bean.ShowBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;
/**
 * Created by 知足 on 2018/2/5.
 */

public interface LogService {
    //    http://api.tianapi.com/meinv/?key=2a0024d1f7f558e09936f697580f1643&num=2000
    @GET("meinv/")
    Observable<ShowBean> getUrl(@Query("key") String key, @Query("num") int num);

}
