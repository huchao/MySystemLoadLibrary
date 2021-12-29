package com.huchao.mysystemloadlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.huchao.mysystemloadlibrary.jni.MyTestJni;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtnLoad;
    private Button mBtnNativePrint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnLoad = findViewById(R.id.btn_load);
        mBtnNativePrint = findViewById(R.id.btn_print);

        mBtnLoad.setOnClickListener(this);
        mBtnNativePrint.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.equals(mBtnLoad)) {
            System.loadLibrary("mytest");

        } else if (v.equals(mBtnNativePrint)) {
            MyTestJni.printLog();
        }
    }
}