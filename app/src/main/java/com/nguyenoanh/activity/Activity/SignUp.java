package com.nguyenoanh.activity.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.nguyenoanh.activity.R;

public class SignUp extends AppCompatActivity {
    Button btnSignUp;
    TextView tvSignIn;
    EditText edtEmail, edtPass;

    public static final String EMAIL = "email";
    public static final String PASS = "pass";
    public static final String BUNDLE = "bundle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_sign_up);

        edtEmail = (EditText) findViewById (R.id.edt_email);
        edtPass = (EditText) findViewById (R.id.edt_pass);

        btnSignUp = (Button) findViewById (R.id.btn_sign_up);
        btnSignUp.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                byBundle ();
//                byExtras ();
//                finish();
            }
        });

        tvSignIn = (TextView) findViewById (R.id.tv_sign_in);
        tvSignIn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, SignIn.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity (intent);
                finish();
            }
        });
    }

    //tear up data and send it to activity SignIn
    public void byExtras() {
        Intent intent = new Intent(SignUp.this, SignIn.class);
        intent.putExtra(EMAIL, edtEmail.getText().toString());
        intent.putExtra(PASS, edtPass.getText().toString());
        startActivity(intent);
    }

    //packed data and sent to activity SignIn
    public void byBundle() {
        Intent intent = new Intent(SignUp.this, SignIn.class);
        Bundle bundle = new Bundle();
        bundle.putString(EMAIL, edtEmail.getText().toString());
        bundle.putString(PASS, edtPass.getText().toString());
        intent.putExtra(BUNDLE, bundle);
        startActivity(intent);
    }
}
