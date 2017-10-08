package com.hgz.test.mvprxjavaretrofitdemo.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/10/8.
 */

public class MyApplication extends Application{
    private static MyApplication context;
    @Override
    public void onCreate() {
        super.onCreate();
        this.context=this;
    }
    public static Context context(){
        return context;
    }
}
