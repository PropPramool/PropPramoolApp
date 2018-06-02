package com.example.kaogi.proppra;


import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChattelFragment extends Fragment {


    public ChattelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.itemlist, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("property id:1568","size: big","location: xxx","time remaining : 25 day 12 hours","strat at 500,000 THB",R.mipmap.ic_launcher));
        items.add(new Item("property id:1568","size: big","location: xxx","time remaining : 25 day 12 hours","strat at 500,000 THB",R.mipmap.ic_launcher));
        items.add(new Item("property id:1568","size: big","location: xxx","time remaining : 25 day 12 hours","strat at 500,000 THB",R.mipmap.ic_launcher));

        ItemAdapter itemsAdapter = new ItemAdapter(getActivity(),items,R.color.colorPrimary);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            }
        });
        return rootView;
    }
}
