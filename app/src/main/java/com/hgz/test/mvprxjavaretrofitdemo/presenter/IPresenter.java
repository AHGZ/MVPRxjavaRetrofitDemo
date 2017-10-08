package com.hgz.test.mvprxjavaretrofitdemo.presenter;

import android.content.Context;

import com.hgz.test.mvprxjavaretrofitdemo.app.MyApplication;
import com.hgz.test.mvprxjavaretrofitdemo.view.IView;

/**
 * Created by Administrator on 2017/10/8.
 */

public class IPresenter<T extends IView>{
    protected T view;
    public IPresenter(T view){
        this.view=view;
        init();
    }

    protected void init() {

    }
    public Context context(){
        if (view!=null&&view.context()!=null){
            return view.context();
        }
        return MyApplication.context();
    }
}
