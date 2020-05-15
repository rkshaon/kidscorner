package com.example.admin.kidscornerabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnActivity extends AppCompatActivity implements View.OnClickListener {

    Button alphabetBtn, numberBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        alphabetBtn = (Button)findViewById(R.id.alphabetButton);
        numberBtn = (Button)findViewById(R.id.numberButton);
        alphabetBtn.setOnClickListener(this);
        numberBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.equals(alphabetBtn)){
            Intent intentAlphabet = new Intent(LearnActivity.this, AlphabetActivity.class);
            startActivity(intentAlphabet);
        }
        if (v.equals(numberBtn)){
            Intent intentNumber = new Intent(LearnActivity.this, NumberActivity.class);
            startActivity(intentNumber);
        }
    }
}
