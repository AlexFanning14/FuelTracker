package com.alexfanning.android.fueltracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btnLogPurchase;
    private Button btnRcntTransct;
    private Button btnStats;
    private Button btnNearbyGarage;
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void findViews(){
        btnLogPurchase = (Button) findViewById(R.id.btnLogPurchaseMainMen);
        btnRcntTransct = (Button) findViewById(R.id.btnRecent);
        btnStats = (Button) findViewById(R.id.btnStats);
        btnNearbyGarage= (Button) findViewById(R.id.btnViewGarage);

    }

    protected void btnLogTransaction_Clicked(View v){
        startActivity(new Intent(this,LogPurchase.class));
    }





}
