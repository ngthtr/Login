package com.example.myapplication.apppp;

import android.app.Activity;
import android.os.Bundle;

import com.example.myapplication.R;

public class WelcomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_layout);
        declareView();
    }

    private void declareView() {
    }

}
