package com.astm.reservation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Rest1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest1);
        this.setTitle(R.string.but1);
            }

    public void CheckStatusActivity(View view) {
        Intent CheckStatus = new Intent(getApplicationContext(), CheckStatus.class);
        startActivity(CheckStatus);


    }
}




