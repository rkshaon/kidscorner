package com.example.admin.kidscornerabc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class HomeAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        zoom();
    }

    public void zoom(){
        ImageView image = (ImageView)findViewById(R.id.animImage);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom);
        image.startAnimation(animation1);

    }
}
