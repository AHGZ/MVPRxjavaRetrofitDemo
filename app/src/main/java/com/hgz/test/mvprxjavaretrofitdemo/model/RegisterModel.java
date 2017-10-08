package com.hgz.test.mvprxjavaretrofitdemo.model;

import com.hgz.test.mvprxjavaretrofitdemo.constant.RegisterApi;
import com.hgz.test.mvprxjavaretrofitdemo.utils.RetrofitManager;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

/**
 * Created by Administrator on 2017/10/8.
 */

public class RegisterModel implements IRegisterModel{
    @Override
    public Observable<ResponseBody> register() {
        return RetrofitManager.getDefault().create(RegisterApi.class).register();
    }
}
