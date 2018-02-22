package com.readdle.sample.crashlytics.generatesymbolssample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.do_crash).setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        doCrash();
    }

    native void doCrash();
}
