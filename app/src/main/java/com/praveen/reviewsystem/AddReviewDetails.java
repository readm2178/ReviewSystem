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

        AddReview = (TextView)findViewById(R.id.AddReview);
        Designation = (EditText)findViewById(R.id.DesignationEditTxt);
        CurrentExp = (EditText)findViewById(R.id.CurrentExpEditTxt);
        PreviousExp =(EditText)findViewById(R.id.PreviousExpEditTxt);
        Strength = (EditText)findViewById(R.id.StrengthEditTxt);
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