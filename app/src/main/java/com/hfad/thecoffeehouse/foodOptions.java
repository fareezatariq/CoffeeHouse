package com.hfad.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class foodOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_options);
        ArrayAdapter<food> listAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1 ,food.essen);
        ListView list_food=(ListView) findViewById(R.id.list_food);
        list_food.setAdapter(listAdapter);
        AdapterView.OnItemClickListener itemClickListener= new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
          Intent intent= new Intent( foodOptions.this, com.hfad.thecoffeehouse.foodActivity.class);
           intent.putExtra(foodActivity.Extra_foodId, (int) id);
            startActivity(intent);
            }
        };
        list_food.setOnItemClickListener(itemClickListener);
    }
}