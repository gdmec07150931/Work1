package com.a07150931.lxc.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    @Override     //重写
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//  R  是一静态类

        Log.v("MainActity","onCreate啊，7777");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.v("MainActity","onStart啊，11111");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MainActity","onResume啊，222222");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MainActity","onPause啊，我要出现了33333");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.v("MainActity","onStop啊，我被挡住了444444");

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.v("MainActity","onRestart啊，多萨德韦55555");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.v("MainActity","onDestroy啊，林66666");

    }
}
