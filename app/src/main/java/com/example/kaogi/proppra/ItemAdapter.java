package com.example.kaogi.proppra;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Color;

import java.util.ArrayList;

/**
 * Created by Taytay on 5/19/2018.
 */

public class ItemAdapter extends ArrayAdapter<Item> {
    private int mcolor;

    public ItemAdapter(Activity context, ArrayList<Item> item, int color) {
        super(context, 0, item);
        mcolor=color;
    }

    /*public WordAdapter(Activity context, ArrayList<Word> word) {
        super(context, 0, word);
    }*/

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.itemlist, parent, false);
        }


        // Get the {@link AndroidFlavor} object located at this position in the list
        Item currentAndroidWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView property_id = (TextView) listItemView.findViewById(R.id.property_id);
        property_id.setText(currentAndroidWord.getmProperty_id());

        TextView size = (TextView) listItemView.findViewById(R.id.size);
        size.setText(currentAndroidWord.getmSize());

        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(currentAndroidWord.getmLocation());

        TextView time = (TextView) listItemView.findViewById(R.id.time);
        time.setText(currentAndroidWord.getmTime_remain());

        TextView price = (TextView) listItemView.findViewById(R.id.price);
        price.setText(currentAndroidWord.getmStart_at());

        //setImage
        ImageView image = (ImageView) listItemView.findViewById(R.id.img);
        image.setImageResource(currentAndroidWord.getmImageResourceId());

        View container =listItemView.findViewById(R.id.setColor);
        container.setBackgroundColor(ContextCompat.getColor(getContext(),mcolor));

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
