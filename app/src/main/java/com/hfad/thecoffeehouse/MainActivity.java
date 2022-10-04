package com.hfad.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
/**
 * OnItemClickListener is a nested class within the AdapterView class.
 * A ListView is a subclass of AdapterView.
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdapterView.OnItemClickListener itemClickListener= new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
       if (position == 0){
           Intent intent = new Intent(MainActivity.this,com.hfad.thecoffeehouse.DrinkOptions.class );
       startActivity(intent);
       }else if (position==1){
           Intent intent= new Intent(MainActivity.this, com.hfad.thecoffeehouse.StarterOptions.class);
           startActivity(intent);
       }
           }
        };
        ListView listView= (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}