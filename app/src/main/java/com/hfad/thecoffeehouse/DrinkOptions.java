package com.hfad.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_options);
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, Drink.drinks);
    ListView listDrinks= (ListView) findViewById(R.id.list_drinks);
    listDrinks.setAdapter(listAdapter);
      AdapterView.OnItemClickListener itemClickListener= new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> lisDrinks, View itemView, int position, long id) {
              Intent intent= new Intent(DrinkOptions.this,com.hfad.thecoffeehouse.DrinkActivity.class );
              intent.putExtra(DrinkActivity.EXTRA_DRINKID, (int) id);
              startActivity(intent);
          }
      };
      listDrinks.setOnItemClickListener(itemClickListener);
       }
}