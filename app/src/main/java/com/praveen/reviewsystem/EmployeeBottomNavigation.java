package com.praveen.reviewsystem;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.praveen.reviewsystem.Fragments.EmployeeProfileFragment;
import com.praveen.reviewsystem.Fragments.EmployeeReviewsFragment;

public class EmployeeBottomNavigation extends AppCompatActivity {

    BottomNavigationView EmployeeBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_bottom_navigation);

        initialize();
        onClick();
    }


    private void initialize() {
        EmployeeBottomNavigation =(BottomNavigationView)findViewById(R.id.EmployeeBottomNavigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.EmployeeFragment,new EmployeeReviewsFragment()).commit();
        return;

    }

    private void onClick() {

      EmployeeBottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
          @Override
          public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

              Fragment selectedFragment = null;

              switch (menuItem.getItemId()){

                  case (R.id.EmployeeProfile):
                      selectedFragment = new EmployeeProfileFragment();
                      break;

                  case(R.id.EmployeeReviews):
                      selectedFragment = new EmployeeReviewsFragment();
                      break;
              }
              getSupportFragmentManager().beginTransaction().replace(R.id.EmployeeFragment,selectedFragment).commit();

              return true;
          }
      });
    }
}
