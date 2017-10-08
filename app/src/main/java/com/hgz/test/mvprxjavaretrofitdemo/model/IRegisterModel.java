package com.hgz.test.mvprxjavaretrofitdemo.model;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

/**
 * Created by Administrator on 2017/10/8.
 */

public interface IRegisterModel {
    Observable<ResponseBody> register();
}
