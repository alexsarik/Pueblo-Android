package com.example.alexandersari.finalapp;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by alexander.sari on 14/02/2017.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        //Log.v("HEY",convertView.getLayoutParams().width+" - "+convertView.getLayoutParams().height);
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(MainActivity.iTOTAL_WIDTH/2, MainActivity.iTOTAL_WIDTH/2));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //imageView.setPadding(0,0,0,0);

            imageView.setBackgroundColor(Color.WHITE);

           // imageView.setBackgroundColor();
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.house, R.drawable.ball,
            R.drawable.tree, R.drawable.beer,
            R.drawable.bike, R.drawable.fork,
            R.drawable.bag, R.drawable.bus,
            R.drawable.parking, R.drawable.sanity
    };
}