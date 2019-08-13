package com.nguyenoanh.activity.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.nguyenoanh.activity.R;

public class SignIn extends AppCompatActivity {
    Button btnSignIn;
    TextView tvSignUp, tvForgotPass;

    EditText edtEmail, edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_sign_in);

        edtEmail = (EditText) findViewById (R.id.edt_email);
        edtPass = (EditText) findViewById (R.id.edt_pass);

        //receive data to activity SignUp
        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundle = intent.getBundleExtra(SignUp.BUNDLE);
            if (bundle != null) {
                edtEmail.setText(bundle.getString(SignUp.EMAIL));
                edtPass.setText(bundle.getString(SignUp.PASS));
            } else {
                edtEmail.setText(intent.getStringExtra(SignUp.EMAIL));
                edtPass.setText(intent.getStringExtra(SignUp.PASS));
            }
        }

        //click Forgot Password -> open browser link https://www.google.com/
        tvForgotPass = (TextView) findViewById (R.id.tv_forgot_pass);
        tvForgotPass.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/"));
                startActivity(intent);
            }
        });

        btnSignIn = (Button) findViewById (R.id.btn_sign_in);
        btnSignIn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                String email = edtEmail.getText().toString();
                String pass = edtPass.getText().toString();

                //check email and pass if true to activity NewFeed, false still at SignIn
//                if(email.equals ("meocon.on90@gmail.com") && pass.equals ("12345678")){
                    Intent intent = new Intent(SignIn.this, NewFeed.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
//                }else {
//                    Toast.makeText(SignIn.this, "Login failed", Toast.LENGTH_SHORT).show();
//                }
            }
        });

        //listener event click button SingUp
        tvSignUp = (TextView) findViewById (R.id.tv_sign_up);
        tvSignUp.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignIn.this, SignUp.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }
}
