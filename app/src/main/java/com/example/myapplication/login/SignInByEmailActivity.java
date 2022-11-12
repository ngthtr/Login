package com.example.myapplication.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.constant.Constant;

public class SignInByEmailActivity extends Activity {
    private EditText etEmail;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_email_layout);
        declareView();

    }

    private void declareView() {
        etEmail = findViewById(R.id.etEmail);
        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(view -> startSignInByEmailPwdActivity());
    }

    private void startSignInByEmailPwdActivity() {
        String email = etEmail.getText().toString();
        if (!email.equals("")) {
            Intent intent = new Intent(this, SignInByEmailPwdActivity.class);
            intent.putExtra(Constant.KEY_EMAIL, email);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Email invalid", Toast.LENGTH_SHORT).show();
        }

    }
}
