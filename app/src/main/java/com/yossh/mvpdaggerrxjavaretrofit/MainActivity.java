package com.yossh.mvpdaggerrxjavaretrofit;

import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends BaseActivity {

    @Override
    public void onViewReady(Bundle savedInstanceState) {
        showProgressDialog();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                hideProgressDialog();
            }
        }, 5000);
    }

    @Override
    public int setView() {
        return R.layout.activity_main;
    }
}
