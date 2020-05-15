package com.example.admin.kidscornerabc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class AlphabetActivity extends AppCompatActivity {

    GridView gridView;

    String [] values = {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    };

    int [] audio = {
            R.raw.a, R.raw.b, R.raw.c, R.raw.d, R.raw.e,
            R.raw.f, R.raw.g, R.raw.h, R.raw.i, R.raw.j,
            R.raw.k, R.raw.l, R.raw.m, R.raw.n, R.raw.o,
            R.raw.p, R.raw.q, R.raw.r, R.raw.s, R.raw.t,
            R.raw.u, R.raw.v, R.raw.w, R.raw.x, R.raw.y,
            R.raw.z
    };

    int [] image = {
            R.drawable.apple, R.drawable.ball, R.drawable.cat,
            R.drawable.doll, R.drawable.elephant, R.drawable.fruits,
            R.drawable.grass, R.drawable.horse, R.drawable.ink,
            R.drawable.jacket, R.drawable.knife, R.drawable.lamp,
            R.drawable.mango, R.drawable.net, R.drawable.orange,
            R.drawable.people, R.drawable.queen, R.drawable.rainbow,
            R.drawable.sun, R.drawable.tree, R.drawable.umbrela,
            R.drawable.van, R.drawable.window, R.drawable.xylophone,
            R.drawable.yellow, R.drawable.zebra
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        gridView = (GridView)findViewById(R.id.gridViewAlphabet);
        GridAlphabetAdapter gridAlphabetAdapter = new GridAlphabetAdapter(this, values, audio, image);
        gridView.setAdapter(gridAlphabetAdapter);
    }
}
