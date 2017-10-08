package com.hgz.test.mvprxjavaretrofitdemo.constant;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2017/10/8.
 */

public interface RegisterApi {
    @GET("http://www.baidu.com")
    Observable<ResponseBody> register();
}
