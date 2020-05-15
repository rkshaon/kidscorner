package com.example.admin.kidscornerabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button learnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        learnBtn = (Button)findViewById(R.id.learnButton);
        learnBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, LearnActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menufile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.about:
                Toast.makeText(this, "About Selected", Toast.LENGTH_SHORT).show();
                Intent intentAbout = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intentAbout);
                break;
            case R.id.help:
                Toast.makeText(this, "Help Selected", Toast.LENGTH_SHORT).show();
                Intent intentHelp = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(intentHelp);
                break;
            default:
                break;
        }
        return true;
    }
}
