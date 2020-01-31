package com.praveen.reviewsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EmployeeLogin extends AppCompatActivity {

    ImageView RightArrowImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_login);

        initialize();
        onClick();
    }



    private void initialize() {

        RightArrowImg =(ImageView)findViewById(R.id.RightArrowImg);
    }

    private void onClick() {

        RightArrowImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(EmployeeLogin.this,EmployeeBottomNavigation.class);
                startActivity(intent);
            }
        });
    }
}
