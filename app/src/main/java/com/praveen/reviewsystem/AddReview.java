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

    EditText FirstnameEditText,LastnameEditText,EmailEditText,PhoneNoEditText;
    Button NextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_review);

        initlize();
        onClick();
    }

    private void initlize() {

        NextBtn = (Button)findViewById(R.id.NextBtn);

        FirstnameEditText = (EditText)findViewById(R.id.FirstNameEditTxt);
        LastnameEditText =(EditText)findViewById(R.id.LastNameEditTxt);
        EmailEditText =(EditText)findViewById(R.id.EmailidEditTxt);
        PhoneNoEditText=(EditText)findViewById(R.id.PhoneNoEditTxt);
    }

    private void onClick() {

        NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddReview.this,AddReviewDetails.class);

                startActivity(intent);
            }
        });


    }

}

