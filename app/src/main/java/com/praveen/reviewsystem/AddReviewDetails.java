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
    EditText DesignationEditTxt, CurrentExpEditTxt,PhoneNoEditText,StrengthEditTxt,WeaknessEditTxt,PerformanceEditTxt;
    Button SubmiBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_review_details);

        initialize();
        onClick();

    }

    private void initialize() {

        AddReview = (TextView)findViewById(R.id.AddReview);
        DesignationEditTxt = (EditText)findViewById(R.id.DesignationEditTxt);
        CurrentExpEditTxt = (EditText)findViewById(R.id.CurrentExpEditTxt);
        PhoneNoEditText =(EditText)findViewById(R.id.PhoneNoEditText);
        StrengthEditTxt = (EditText)findViewById(R.id.StrengthEditTxt);
        WeaknessEditTxt =(EditText)findViewById(R.id.WeaknessEditTxt);
        PerformanceEditTxt =(EditText)findViewById(R.id.PerformanceEditTxt);
        SubmiBtn =(Button)findViewById(R.id.SubmiBtn);
    }

    private void onClick() {

        SubmiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AddReviewDetails.this,CompanyDashboard.class);
                startActivity(i);
            }
        });

    }

}