package com.example.kaogi.proppra;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.graphics.Color;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        FloatingActionButton mapMode = (FloatingActionButton)findViewById(R.id.floatBTN);
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("property id:1568","size: big","location: xxx","time remaining : 25 day 12 hours","strat at 500,000 THB",R.drawable.index));
        items.add(new Item("property id:1568","size: big","location: xxx","time remaining : 25 day 12 hours","strat at 500,000 THB",R.drawable.index1));
        items.add(new Item("property id:1568","size: big","location: xxx","time remaining : 25 day 12 hours","strat at 500,000 THB",R.drawable.index2));
        items.add(new Item("property id:1568","size: big","location: xxx","time remaining : 25 day 12 hours","strat at 500,000 THB",R.drawable.index4));
        items.add(new Item("property id:1568","size: big","location: xxx","time remaining : 25 day 12 hours","strat at 500,000 THB",R.drawable.index));
        items.add(new Item("property id:1568","size: big","location: xxx","time remaining : 25 day 12 hours","strat at 500,000 THB",R.drawable.index1));

        com.example.kaogi.proppra.ItemAdapter itemsAdapter = new com.example.kaogi.proppra.ItemAdapter(this,items, R.color.white);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Item word = items.get(position);
                String strI = String.valueOf(position);
                Log.d("click at",strI);
                Intent myIntent = new Intent(view.getContext(), com.example.kaogi.proppra.Detail.class);
                startActivityForResult(myIntent, 0);
            }
        });



    }
}
