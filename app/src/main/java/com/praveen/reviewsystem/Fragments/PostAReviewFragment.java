package com.praveen.reviewsystem.Fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.praveen.reviewsystem.AddReviewDetails;
import com.praveen.reviewsystem.R;

public class PostAReviewFragment extends Fragment {

    Activity context;
    Button NextStepBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context = getActivity();
        return inflater.inflate(R.layout.add_review,container,false);
    }

   public void onStart(){
        super.onStart();
        NextStepBtn =(Button)context.findViewById(R.id.NextStepBtn);

        onClick();
   }
   private void onClick() {

        NextStepBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, AddReviewDetails.class);
                startActivity(intent);
            }
        });
    }
}
