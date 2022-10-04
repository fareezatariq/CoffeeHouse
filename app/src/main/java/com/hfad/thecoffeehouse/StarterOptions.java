package com.hfad.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        AdapterView.OnItemClickListener onItemClickListener= new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listStart, View itemView, int position, long id) {
                Intent intent= new Intent(StarterOptions.this,com.hfad.thecoffeehouse.StarterActivity.class );
            }
        };
    }
}