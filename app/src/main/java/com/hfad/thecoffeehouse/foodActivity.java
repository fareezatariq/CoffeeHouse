package com.hfad.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class foodActivity extends AppCompatActivity {
    public static final String Extra_foodId= "foodId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        int foodId= (Integer)getIntent().getExtras().get(Extra_foodId);
        food essen= food.essen[foodId];
        TextView name= (TextView) findViewById(R.id.name);
        name.setText(essen.getName());
        TextView desc= (TextView) findViewById(R.id.description);
        desc.setText(essen.getDescription());
        ImageView photo= (ImageView) findViewById(R.id.image);
        photo.setImageResource(essen.getImageID());
        photo.setContentDescription(essen.getName());
    }
}