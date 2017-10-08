package com.hgz.test.mvprxjavaretrofitdemo.presenter;

import com.hgz.test.mvprxjavaretrofitdemo.model.RegisterModel;
import com.hgz.test.mvprxjavaretrofitdemo.view.RegisterView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

/**
 * Created by Administrator on 2017/10/8.
 */

public class RegisterPresenter extends IPresenter<RegisterView> {


    private RegisterModel registerModel;

    public RegisterPresenter(RegisterView view) {
        super(view);
    }

    @Override
    protected void init() {
        registerModel = new RegisterModel();
    }

    /**
     * presenter利用model返回的被观察者 ，用rxjava的形式处理请求结果
     */
    public void register(){
        //model提供对应的被观察者
        Observable<ResponseBody> register = registerModel.register();

//用rxjava的形式处理被观察者
        register
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ResponseBody>() {
                    @Override
                    public void accept(ResponseBody responseBody) throws Exception {
                        if (view!=null){
                            view.RegisterSucceed();
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        if (view!=null){
                            view.RegisterFail();
                        }
                    }
                });
    }
}
