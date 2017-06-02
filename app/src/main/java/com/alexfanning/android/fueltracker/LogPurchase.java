package com.alexfanning.android.fueltracker;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LogPurchase extends AppCompatActivity {

    private TextView mTxtViewDate;
    private EditText mEdtTxtLitres;
    private EditText mEdtTxtPricePL;
    private EditText mEdtTxtTotlPrice;
    private EditText mEdtTxtGarage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_purchase);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
