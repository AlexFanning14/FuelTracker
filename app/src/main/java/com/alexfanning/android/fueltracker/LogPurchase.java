package com.alexfanning.android.fueltracker;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.ui.PlacePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LogPurchase extends AppCompatActivity {

    private TextView mTxtViewDate;
    private EditText mEdtTxtLitres;
    private EditText mEdtTxtPricePL;
    private EditText mEdtTxtTotlPrice;
    private EditText mEdtTxtGarage;
    private Button mbtnGarage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_purchase);
        ActionBar ab = getSupportActionBar();
        if (ab != null)
            ab.setDisplayHomeAsUpEnabled(true);

        findViews();

        setDate();
    }

    private void setDate(){
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        mTxtViewDate.setText(sdf.format(c.getTime()));

    }


    private void findViews(){
        mTxtViewDate = (TextView) findViewById(R.id.tvdateval);
        mEdtTxtLitres = (EditText) findViewById(R.id.tbLitres);
        mEdtTxtPricePL = (EditText) findViewById(R.id.tbPricePL);
        mEdtTxtTotlPrice = (EditText) findViewById(R.id.tbTotPrice);
        mEdtTxtGarage = (EditText) findViewById(R.id.tbGarageVal);
        mbtnGarage = (Button) findViewById(R.id.btnSelectGarage);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.pref_menu_item){
            startActivity( new Intent(this,SettingsActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    protected void btnSelectGarage_Clicked(View v){
        selectGarage();


    }


    public void selectGarage(){
        int PLACE_PICKER_REQUEST = 1;
        PlacePicker.IntentBuilder builder = new PlacePicker.IntentBuilder();


//        startActivityForResult(builder.build(this), PLACE_PICKER_REQUEST);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
