package com.praveen.reviewsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button CompanyLogin,EmployeeLogin;
    ImageView CompanyImage,EmployeeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
        onClick();
    }



    private void initialize() {

        CompanyImage = (ImageView) findViewById(R.id.CompanyImage);
        EmployeeImage= (ImageView) findViewById(R.id.EmployeeImage);
    }

    private void onClick() {

        CompanyImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Company = new Intent(MainActivity.this,Login.class);
                startActivity(Company);
            }
        });
        EmployeeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Employee = new Intent(MainActivity.this, EmployeeLogin.class);
                startActivity(Employee);
            }
        });
    }
}
