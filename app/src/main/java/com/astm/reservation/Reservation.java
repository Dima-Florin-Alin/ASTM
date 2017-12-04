package com.astm.reservation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Reservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        // buton pentru a lansa a 2-a activitate
        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondAct = new Intent(getApplicationContext(), Rest1.class);
                startActivity(secondAct);
            }
        });

        // buton pentru a lansa a 3-a activitate
        Button thirdActivityBtn = (Button) findViewById(R.id.thirdActivityBtn);
        thirdActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent thirdAct = new Intent(getApplicationContext(), Rest2.class);
                startActivity(thirdAct);
            }
        });
    }
    }