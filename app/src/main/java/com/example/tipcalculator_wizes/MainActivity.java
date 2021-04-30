package com.example.tipcalculator_wizes;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn_enter, btn_15, btn_20, btn_10;
    EditText tip, people, bill, total, custom;
    double value1, value2;
    double value3, value4;
    String output, tip_output;
    //private Intent i, j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_enter = (Button) findViewById(R.id.enter);
        btn_15 = (Button) findViewById(R.id.fifteen);
        btn_20 = (Button) findViewById(R.id.twenty);
        btn_10 = (Button) findViewById(R.id.ten);

        tip = (EditText) findViewById(R.id.tip);
        people = (EditText) findViewById(R.id.people);
        bill = (EditText) findViewById(R.id.bill);
        total = (EditText) findViewById(R.id.total);
        custom = (EditText) findViewById(R.id.custom);

        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people.setText("");
            }
        });
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                custom.setText("");
            }
        });
        bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill.setText("");
            }
        });

        btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Double.parseDouble(bill.getText()+ "");
                value3 = .1;
                value2 = Double.parseDouble(people.getText()+ "");
                if(value2 < 1.0) {
                    value2 = 1.0;
                    people.setText("1");
                }
                tip.setText("$"+((value1 * value3)/value2) + "");
                total.setText("$"+((value1 * value3) + value1) + "");
                output = total.getText().toString();
                tip_output = tip.getText().toString();
                global.i = output;
                global.j = tip_output;
                //i.putExtra("billTotal", output);
                //j.putExtra("tipTotal", tip_output);
                openNewActivity();

            }
        });
        btn_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Double.parseDouble(bill.getText()+ "");
                value3 = .15;
                value2 = Double.parseDouble(people.getText()+ "");
                if(value2 < 1.0) {
                    value2 = 1.0;
                    people.setText("1");
                }
                tip.setText("$"+((value1 * value3)/value2) + "");
                total.setText("$"+((value1 * value3) + value1) + "");
                output = total.getText().toString();
                tip_output = tip.getText().toString();
                global.i = output;
                global.j = tip_output;
                //i.putExtra("billTotal", output);
                //j.putExtra("tipTotal", tip_output);
                openNewActivity();
            }
        });
        btn_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Double.parseDouble(bill.getText()+ "");
                value3 = .2;
                value2 = Double.parseDouble(people.getText()+ "");
                if(value2 < 1.0) {
                    value2 = 1.0;
                    people.setText("1");
                }
                tip.setText("$"+((value1 * value3)/value2) + "");
                total.setText("$"+((value1 * value3) + value1)+ "");
                output = total.getText().toString();
                tip_output = tip.getText().toString();
                global.i = output;
                global.j = tip_output;
                //i.putExtra("billTotal", output);
                //j.putExtra("tipTotal", tip_output);
                openNewActivity();
            }
        });
        btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Double.parseDouble(bill.getText()+ "");
                value3 = Double.parseDouble(custom.getText()+ "");
                value4 = value3 / 100;
                value2 = Double.parseDouble(people.getText()+ "");
                if(value2 < 1) {
                    value2 = 1;
                    people.setText("1");
                }
                tip.setText("$"+((value1 * value4)/value2) + "");
                total.setText("$"+((value1 * value4) + value1) + "");
                output = total.getText().toString();
                tip_output = tip.getText().toString();
                global.i = output;
                global.j = tip_output;
                //i.putExtra("billTotal", output);
                //j.putExtra("tipTotal", tip_output);
                openNewActivity();
            }
        });

    }
    public void openNewActivity(){
        Intent intent = new Intent(this, Results.class);
        startActivity(intent);
    }
    /*private OnKeyListener mKeyListener = new OnKeyListener() {
        @Override
        public boolean onKey(View v, int keyCode, KeyEvent event) {

            switch (v.getId()) {
                case R.id.custom:
                case R.id.people:
                case R.id.bill:
            }
            return false;
        }

    };*/
}
