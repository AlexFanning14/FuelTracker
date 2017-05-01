package com.alexfanning.android.fueltracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btnLogPurchase;
    Button btnRcntTransct;
    Button btnStats;
    Button btnNearbyGarage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btnLogPurchase_Clckd(View view){
        Intent i = new Intent(getApplicationContext(),LogPurchase.class);
        startActivity(i);
    }





}
