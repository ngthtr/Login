package com.example.myapplication.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.constant.Constant;

public class SignInByEmailPwdActivity extends Activity {
    private String email;
    private TextView tvDescription;
    private TextView btnForgotPwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_email_pwd_layout);
        declareView();
        receiver();
        handler();
    }
    private void declareView() {
        tvDescription = findViewById(R.id.tvDescription);
        btnForgotPwd = findViewById(R.id.btnForgotPwd);
        btnForgotPwd.setOnClickListener(view -> {
            Intent intent = new Intent(this, SignInByEmailResetPwdActivity.class);
            intent.putExtra(Constant.KEY_EMAIL, email);
            startActivity(intent);
        });
    }

    private void receiver() {
        email = getIntent().getStringExtra(Constant.KEY_EMAIL);
    }

    private void handler() {
        String description = tvDescription.getText().toString();
        tvDescription.setText(description + email);
    }

}
