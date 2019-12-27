package com.praveen.reviewsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddReview extends AppCompatActivity {

    TextView AddReview,FirstName,LastName,Email,PhoneNo;
    EditText FirstnameEditText,LastnameEditText,EmailEditText,PhoneNoEditText;
    Button Step2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_review);

        initlize();
        onClick();
    }

    private void initlize() {

        Step2 = (Button)findViewById(R.id.Step2Btn);
        AddReview = (TextView)findViewById(R.id.AddReview);
        FirstName = (TextView)findViewById(R.id.FirstName);
        LastName  = (TextView)findViewById(R.id.LastName);
        Email = (TextView)findViewById(R.id.Email);
        PhoneNo = (TextView)findViewById(R.id.PhoneNo);

        FirstnameEditText = (EditText)findViewById(R.id.FirstnameEditText);
        LastnameEditText =(EditText)findViewById(R.id.LastnameEditText);
        EmailEditText =(EditText)findViewById(R.id.EmailEditText);
        PhoneNoEditText=(EditText)findViewById(R.id.PhoneNoEditText);
    }

    private void onClick() {

        Step2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddReview.this,AddReviewDetails.class);
                startActivity(intent);
            }
        });


    }

}

