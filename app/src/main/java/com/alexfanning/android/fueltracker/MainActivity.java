package com.alexfanning.android.fueltracker;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.pref_menu_item){
            startActivity( new Intent(this,SettingsActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
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

    protected void btnNearbyGas_Clicked(View v){
        findGasStations();
    }

    private void findGasStations(){
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=gas station");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }







}
