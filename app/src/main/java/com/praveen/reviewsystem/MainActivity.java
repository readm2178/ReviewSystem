package com.praveen.reviewsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    TextView Account,CompanyText,EmployeeTxtView;
    Button LoginButton1,LoginButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
//        getSupportActionBar().hide(); // hide the title bar
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_main);

        initialize();
        onClick();


    }

    private void initialize() {
        Account =(TextView)findViewById(R.id.Account);
        CompanyText =(TextView)findViewById(R.id.CompanyText);
        EmployeeTxtView =(TextView)findViewById(R.id.EmployeeTxtView);
        LoginButton1 =(Button) findViewById(R.id.LoginButton1);
        LoginButton2 =(Button) findViewById(R.id.loginbutton2);

    }

    private void onClick() {

        LoginButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent company = new Intent(MainActivity.this,Login.class);
                startActivity(company);
            }
        });
        LoginButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Employee = new Intent(MainActivity.this,EmployeeLogin.class);
                startActivity(Employee);
            }
        });
    }
}
