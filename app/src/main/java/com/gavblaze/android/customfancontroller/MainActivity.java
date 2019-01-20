package com.gavblaze.android.customfancontroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int x = 78;
        int y = 112;
        int k = x % y;

        Log.i("LOG_TAG", "TEST..... " + k);
    }
}
