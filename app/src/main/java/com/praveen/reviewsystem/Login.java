package com.praveen.reviewsystem;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button LoginBtn;
    TextInputEditText Email,Password;

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        initialize();
        OnClick();
    }

    private void initialize() {

        LoginBtn = (Button)findViewById(R.id.LoginBtn);
        Email =(TextInputEditText)findViewById(R.id.EmailidEditTxt);
        Password = (TextInputEditText)findViewById(R.id.PasswordEditTxt);

    }


    private void OnClick() {

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent AddReview = new Intent(Login.this, BottomNavigation.class);
                startActivity(AddReview);
            }
        });
    }
}
