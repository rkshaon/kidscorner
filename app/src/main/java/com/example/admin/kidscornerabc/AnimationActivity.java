package com.example.admin.kidscornerabc;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        zoom();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intentAnimation = new Intent(AnimationActivity.this, MainActivity.class);
                startActivity(intentAnimation);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

    public void zoom(){
        ImageView image = (ImageView)findViewById(R.id.animImage);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom);
        image.startAnimation(animation1);
    }
}
