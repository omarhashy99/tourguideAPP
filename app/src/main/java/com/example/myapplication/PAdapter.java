package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class PAdapter extends ArrayAdapter<AllPlaces> {

    public PAdapter(Activity context, ArrayList<AllPlaces> androidN ) {
        super(context, 0, androidN);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        AllPlaces currentAndroid = getItem(position);

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        assert currentAndroid != null;
        if (currentAndroid.isHasImage()) {
            // If an image is available, display the provided image based on the resource ID
            image.setImageResource(currentAndroid.getmImageResourceId());
            // Make sure the view is visible
            image.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            image.setVisibility(View.GONE);
        }


        TextView name = (TextView) listItemView.findViewById(R.id.nameX);
        name.setText(currentAndroid.getmName());


        TextView describtion = (TextView) listItemView.findViewById(R.id.descreptionx);
        describtion.setText(currentAndroid.getmDescreption());

        return listItemView;
    }
}
