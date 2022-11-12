package com.example.myapplication.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.myapplication.R;

public class SignUpActivity extends Activity {
    private Button btnSignUpByEmail;
    private LinearLayout btnBackToSignInLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_layout);
        declareView();

    }

    private void declareView() {
        btnSignUpByEmail = findViewById(R.id.btnSignUpByEmail);
        btnSignUpByEmail.setOnClickListener(view -> startActivity(
                new Intent(this, SignUpByEmailActivity.class)));

        btnBackToSignInLayout = findViewById(R.id.btnBackToSignInLayout);
        btnBackToSignInLayout.setOnClickListener(view -> startActivity(
                new Intent(this, SignInActivity.class)));
    }

}
