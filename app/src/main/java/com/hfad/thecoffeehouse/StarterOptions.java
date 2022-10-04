package com.hfad.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class StarterOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter_options);
        ArrayAdapter<Starter> listAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Starter.starters);
        ListView listStart= (ListView) findViewById(R.id.list_starters);
        listStart.setAdapter(listAdapter);

    }
}