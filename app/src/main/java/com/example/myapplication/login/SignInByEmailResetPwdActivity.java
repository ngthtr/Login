package com.example.myapplication.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.constant.Constant;
import com.google.android.material.textfield.TextInputEditText;

public class SignInByEmailResetPwdActivity extends Activity {
    private String email;
    private TextInputEditText etEmail;
    private Button btnResetPwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_email_reset_pwd_layout);
        declareView();
        receiver();
        handler();
    }

    private void handler() {
        etEmail.setText(email);
    }

    private void receiver() {
        email = getIntent().getStringExtra(Constant.KEY_EMAIL);

    }

    private void declareView() {
        etEmail = findViewById(R.id.etEmail);
        btnResetPwd = findViewById(R.id.btnResetPwd);
        btnResetPwd.setOnClickListener(view -> resetPassword());
    }

    private void resetPassword() {
    }
}
