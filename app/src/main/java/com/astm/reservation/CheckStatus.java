package com.astm.reservation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CheckStatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_status);
        this.setTitle(R.string.CheckStatus);
    }

    public void Table1_status(View view) {
        Intent Table1_status = new Intent(getApplicationContext(), Table1.class);
        startActivity(Table1_status);
    }

    public void Table2_status(View view) {
        Intent Table2_status = new Intent(getApplicationContext(), Table2.class);
        startActivity(Table2_status);
    }

    public void Table3_status(View view) {
        Intent Table3_status = new Intent(getApplicationContext(), Table3.class);
        startActivity(Table3_status);
    }

    public void Table4_status(View view) {
        Intent Table3_status = new Intent(getApplicationContext(), Table4.class);
        startActivity(Table3_status);
    }
}
