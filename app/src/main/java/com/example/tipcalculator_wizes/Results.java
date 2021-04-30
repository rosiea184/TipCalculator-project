package com.example.tipcalculator_wizes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Results extends AppCompatActivity {

    Button enter;
    TextView total, tip_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);
        enter = (Button) findViewById(R.id.return_page);
        tip_total = (TextView) findViewById(R.id.tip_total);
        total = (TextView) findViewById(R.id.sum);

        tip_total.setText(global.j);
        total.setText(global.i);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }

    public void openNewActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
