package com.astm.reservation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Table2 extends AppCompatActivity {

    int[] table1 = {1,1,1,1,1,1,1,1,1,1,1,1,1,1};
    int ora = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table1);
        this.setTitle(R.string.table1_status);


        final TextView tv1 =  findViewById(R.id.textView1);
        tv1.setText(setT(ora));
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(table1[ora-8] == 1)
                    table1[ora-8] = 0;
                tv1.setTextColor(getResources().getColor(R.color.ocupat));
            }
        });
        if(table1[ora-8]==1) {
            tv1.setTextColor(getResources().getColor(R.color.liber));
        } else {
            tv1.setTextColor(getResources().getColor(R.color.ocupat));
        }
        ora++;

        final TextView tv2 =  findViewById(R.id.textView2);
        tv2.setText(setT(ora));
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(table1[ora-8] == 1)
                    table1[ora-8] = 0;
                tv2.setTextColor(getResources().getColor(R.color.ocupat));
            }
        });
        if(table1[ora-8]==1) {
            tv2.setTextColor(getResources().getColor(R.color.liber));
        } else {
            tv2.setTextColor(getResources().getColor(R.color.ocupat));
        }
        ora++;

        final TextView tv3 =  findViewById(R.id.textView3);
        tv3.setText(setT(ora));
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(table1[ora-8] == 1)
                    table1[ora-8] = 0;
                tv3.setTextColor(getResources().getColor(R.color.ocupat));
            }
        });
        if(table1[ora-8]==1) {
            tv3.setTextColor(getResources().getColor(R.color.liber));
        } else {
            tv3.setTextColor(getResources().getColor(R.color.ocupat));
        }
        ora++;

        final TextView tv4 =  findViewById(R.id.textView4);
        tv4.setText(setT(ora));
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(table1[ora-8] == 1)
                    table1[ora-8] = 0;
                tv4.setTextColor(getResources().getColor(R.color.ocupat));
            }
        });
        if(table1[ora-8]==1) {
            tv4.setTextColor(getResources().getColor(R.color.liber));
        } else {
            tv4.setTextColor(getResources().getColor(R.color.ocupat));
        }
        ora++;

        final TextView tv5 =  findViewById(R.id.textView5);
        tv5.setText(setT(ora));
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(table1[ora-8] == 1)
                    table1[ora-8] = 0;
                tv5.setTextColor(getResources().getColor(R.color.ocupat));
            }
        });
        if(table1[ora-8]==1) {
            tv5.setTextColor(getResources().getColor(R.color.liber));
        } else {
            tv5.setTextColor(getResources().getColor(R.color.ocupat));
        }
        ora++;

        final TextView tv6 =  findViewById(R.id.textView6);
        tv6.setText(setT(ora));
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(table1[ora-8] == 1)
                    table1[ora-8] = 0;
                tv6.setTextColor(getResources().getColor(R.color.ocupat));
            }
        });
        if(table1[ora-8]==1) {
            tv6.setTextColor(getResources().getColor(R.color.liber));
        } else {
            tv6.setTextColor(getResources().getColor(R.color.ocupat));
        }
        ora++;

        final TextView tv7 =  findViewById(R.id.textView7);
        tv7.setText(setT(ora));
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(table1[ora-8] == 1)
                    table1[ora-8] = 0;
                tv7.setTextColor(getResources().getColor(R.color.ocupat));
            }
        });
        if(table1[ora-8]==1) {
            tv7.setTextColor(getResources().getColor(R.color.liber));
        } else {
            tv7.setTextColor(getResources().getColor(R.color.ocupat));
        }
        ora++;

        final TextView tv8 =  findViewById(R.id.textView8);
        tv8.setText(setT(ora));
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(table1[ora-8] == 1)
                    table1[ora-8] = 0;
                tv8.setTextColor(getResources().getColor(R.color.ocupat));
            }
        });
        if(table1[ora-8]==1) {
            tv8.setTextColor(getResources().getColor(R.color.liber));
        } else {
            tv8.setTextColor(getResources().getColor(R.color.ocupat));
        }
        ora++;

        final TextView tv9 =  findViewById(R.id.textView9);
        tv9.setText(setT(ora));
        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(table1[ora-8] == 1)
                    table1[ora-8] = 0;
                tv9.setTextColor(getResources().getColor(R.color.ocupat));
            }
        });
        if(table1[ora-8]==1) {
            tv9.setTextColor(getResources().getColor(R.color.liber));
        } else {
            tv9.setTextColor(getResources().getColor(R.color.ocupat));
        }
        ora++;

        final TextView tv10 =  findViewById(R.id.textView10);
        tv10.setText(setT(ora));
        tv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(table1[ora-8] == 1)
                    table1[ora-8] = 0;
                tv10.setTextColor(getResources().getColor(R.color.ocupat));
            }
        });
        if(table1[ora-8]==1) {
            tv10.setTextColor(getResources().getColor(R.color.liber));
        } else {
            tv10.setTextColor(getResources().getColor(R.color.ocupat));
        }
        ora++;

        final TextView tv11 =  findViewById(R.id.textView11);
        tv11.setText(setT(ora));
        tv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(table1[ora-8] == 1)
                    table1[ora-8] = 0;
                tv11.setTextColor(getResources().getColor(R.color.ocupat));
            }
        });
        if(table1[ora-8]==1) {
            tv11.setTextColor(getResources().getColor(R.color.liber));
        } else {
            tv11.setTextColor(getResources().getColor(R.color.ocupat));
        }
        ora++;

        final TextView tv12 =  findViewById(R.id.textView12);
        tv12.setText(setT(ora));
        tv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(table1[ora-8] == 1)
                    table1[ora-8] = 0;
                tv12.setTextColor(getResources().getColor(R.color.ocupat));
            }
        });
        if(table1[ora-8]==1) {
            tv12.setTextColor(getResources().getColor(R.color.liber));
        } else {
            tv12.setTextColor(getResources().getColor(R.color.ocupat));
        }
        ora++;

        final TextView tv13 =  findViewById(R.id.textView13);
        tv13.setText(setT(ora));
        tv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(table1[ora-8] == 1)
                    table1[ora-8] = 0;
                tv13.setTextColor(getResources().getColor(R.color.ocupat));
            }
        });
        if(table1[ora-8]==1) {
            tv13.setTextColor(getResources().getColor(R.color.liber));
        } else {
            tv13.setTextColor(getResources().getColor(R.color.ocupat));
        }
        ora++;

        final TextView tv14 =  findViewById(R.id.textView14);
        tv14.setText(setT(ora));
        tv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(table1[ora-8] == 1)
                    table1[ora-8] = 0;
                tv14.setTextColor(getResources().getColor(R.color.ocupat));
            }
        });
        if(table1[ora-8]==1) {
            tv14.setTextColor(getResources().getColor(R.color.liber));
        } else {
            tv14.setTextColor(getResources().getColor(R.color.ocupat));
        }
        ora=8;

    }


    public String setT(int x){
        StringBuilder text = new StringBuilder();
        text.append("Ora ");
        text.append(x);
        text.append(": ");

        if(table1[x-8] == 1){
            text.append("Liber");

        }
        else {
            text.append("Ocupat");
        }
        return text.toString();
    }




}


