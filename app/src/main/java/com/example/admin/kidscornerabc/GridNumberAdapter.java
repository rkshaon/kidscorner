package com.example.admin.kidscornerabc;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Button;

public class GridNumberAdapter extends BaseAdapter {

    Context context;
    String values[];
    int audio[];
    LayoutInflater inflater;

    public GridNumberAdapter(Context context, String[] values, int[] audio) {
        this.context = context;
        this.values = values;
        this.audio = audio;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = inflater.inflate(R.layout.gridbutton, null);
        }
        //convertView = inflater.inflate(R.layout.gridbutton, null);
        final Button GridViewButton = (Button)convertView.findViewById(R.id.gridViewButton);
        GridViewButton.setText(values[position]);
        final Animation animation = AnimationUtils.loadAnimation(context, R.anim.zoom);
        GridViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.equals(GridViewButton)){
                    GridViewButton.startAnimation(animation);
                    //Toast.makeText(context, "Clicked: " + GridViewButton.getText().toString(), Toast.LENGTH_SHORT).show();
                    MediaPlayer mediaPlayer = MediaPlayer.create(context, audio[position]);
                    mediaPlayer.start();
                }
            }
        });
        return  convertView;
    }
}
