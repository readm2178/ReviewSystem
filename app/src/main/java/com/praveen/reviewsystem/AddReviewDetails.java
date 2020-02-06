package com.praveen.reviewsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddReviewDetails extends AppCompatActivity {

    TextView AddReview;
    EditText Designation, CurrentExp,PreviousExp,Strength,Weakness,Performance;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_review_details);

        initialize();
        onClick();

    }

    private void initialize() {

        Designation = (EditText)findViewById(R.id.FirstNameEditTxt);
        CurrentExp = (EditText)findViewById(R.id.LastNameEditTxt);
        PreviousExp =(EditText)findViewById(R.id.EmailidEditTxt);
        Strength = (EditText)findViewById(R.id.PhoneNoEditTxt);
        Weakness =(EditText)findViewById(R.id.WeaknessEditTxt);
        Performance =(EditText)findViewById(R.id.PerformanceEditTxt);
        Submit =(Button)findViewById(R.id.SubmiBtn);
    }

    private void onClick() {

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AddReviewDetails.this,BottomNavigation.class);
                startActivity(i);
            }
        });

    }

}