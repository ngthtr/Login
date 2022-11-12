package com.example.myapplication.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TableRow;

import com.example.myapplication.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;

public class SignInActivity extends Activity {
    private Button btnSignInByEmail;
    private SignInButton btnSignInByGoogle;
    private TableRow btnComeToSignUpLayout;
    private GoogleSignInOptions gso;
    private GoogleSignInClient gsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_layout);
        declareView();
    }

    private void declareView() {
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        gsc = GoogleSignIn.getClient(this, gso);

        btnSignInByEmail = findViewById(R.id.btnSignInByMail);
        btnSignInByEmail.setOnClickListener(view -> startActivity(
                new Intent(this, SignInByEmailActivity.class)));

        btnComeToSignUpLayout = findViewById(R.id.btnComeToSignUpLayout);
        btnComeToSignUpLayout.setOnClickListener(view -> startActivity(
                new Intent(this, SignUpActivity.class)));

//        btnSignInByGoogle = findViewById(R.id.btnSignInByGoogle);
//        btnSignInByGoogle.setOnClickListener(view -> loginByGoogle());
    }

//    private void loginByGoogle() {
//        Intent intent = gsc.getSignInIntent();
//        startActivityForResult(intent, 1000);
//
//    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode,Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if(requestCode == 1000){
//            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
//
//            try {
//                task.getResult(ApiException.class);
//                startActivity(new Intent(this, WelcomeActivity.class));
//            } catch (ApiException e) {
//                Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_SHORT).show();
//            }
//        }
//
//    }

}
