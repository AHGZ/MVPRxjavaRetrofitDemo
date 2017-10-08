package com.hgz.test.mvprxjavaretrofitdemo.view.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.hgz.test.mvprxjavaretrofitdemo.R;
import com.hgz.test.mvprxjavaretrofitdemo.presenter.RegisterPresenter;
import com.hgz.test.mvprxjavaretrofitdemo.view.RegisterView;

public class MainActivity extends AppCompatActivity implements RegisterView{

    private RegisterPresenter registerPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerPresenter = new RegisterPresenter(this);
    }

    @Override
    public void RegisterSucceed() {
        Toast.makeText(MainActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void RegisterFail() {
        Toast.makeText(MainActivity.this, "注册失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context context() {
        return null;
    }

    public void onClick(View view) {
        registerPresenter.register();
    }
}
