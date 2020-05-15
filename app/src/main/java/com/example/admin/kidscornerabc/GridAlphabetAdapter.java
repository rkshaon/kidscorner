package com.example.admin.kidscornerabc;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;

public class GridAlphabetAdapter extends BaseAdapter {

    Context context;
    String values[];
    int [] audio;
    int [] image;
    LayoutInflater inflater;
    // for pop up
    private PopupWindow mPopupWindow;
    private PopupWindow POPUP_WINDOW_SCORE = null;

    public GridAlphabetAdapter(Context context, String[] values, int[] audio, int[] image) {
        this.context = context;
        this.values = values;
        this.audio = audio;
        this.image = image;
        inflater = (LayoutInflater.from(context));

    }



    @Override
    public int getCount() {
        //return 0;
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
        if (convertView == null){
            convertView = inflater.inflate(R.layout.gridbutton, null);
        }
        //convertView = inflater.inflate(R.layout.gridbutton, null);
        final Button GridViewButton = (Button)convertView.findViewById(R.id.gridViewButton);
        GridViewButton.setText(values[position]);
        final Animation animation = AnimationUtils.loadAnimation(context, R.anim.zoom);
        GridViewButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                if (v.equals(GridViewButton)){
                    //GridViewButton.startAnimation(animation);
                    //Toast.makeText(context, "Clicked: " + GridViewButton.getText().toString(), Toast.LENGTH_SHORT).show();
                    //showPopUp(position);
                    GridViewButton.setText("");
                    GridViewButton.setBackgroundResource(image[position]);
                    MediaPlayer mediaPlayer = MediaPlayer.create(context, audio[position]);
                    mediaPlayer.start();
                    //GridViewButton.setBackground(image[position]);
                }
            }
        });
        return  convertView;
    }
}
