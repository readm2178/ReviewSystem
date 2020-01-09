package com.praveen.reviewsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button CompanyLogin,EmployeeLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
        onClick();
    }



    private void initialize() {

        CompanyLogin = (Button)findViewById(R.id.CompanyLoginButton);
        EmployeeLogin = (Button)findViewById(R.id.EmployeeLoginButton);
    }

    private void onClick() {

        CompanyLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Company = new Intent(MainActivity.this,Login.class);
                startActivity(Company);
            }
        });
    }
}
