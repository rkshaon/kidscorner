package com.example.admin.kidscornerabc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class NumberActivity extends AppCompatActivity {
    GridView gridView;
    String values[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
    int [] audio = {
            R.raw.num1, R.raw.num2, R.raw.num3, R.raw.num4, R.raw.num5,
            R.raw.num6, R.raw.num7, R.raw.num8, R.raw.num9, R.raw.num10,
            R.raw.num11, R.raw.num12, R.raw.num13, R.raw.num14, R.raw.num15,
            R.raw.num16, R.raw.num17, R.raw.num18, R.raw.num19, R.raw.num20,
            R.raw.num21, R.raw.num22, R.raw.num23, R.raw.num24, R.raw.num25,
            R.raw.num26, R.raw.num27, R.raw.num28, R.raw.num29, R.raw.num30
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        gridView = (GridView)findViewById(R.id.gridViewNumber);
        GridNumberAdapter gridNumberAdapter = new GridNumberAdapter(getApplicationContext(), values, audio);
        gridView.setAdapter(gridNumberAdapter);
    }
}
