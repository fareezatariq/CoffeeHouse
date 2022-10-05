package com.hfad.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StarterActivity extends AppCompatActivity {
public static final String Extra_STARTERID="starterId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);
    int starterId= (Integer)getIntent().getExtras().get(Extra_STARTERID);
    Starter starter= Starter.starters[starterId];
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(starter.getName());
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(starter.getDescription());
        ImageView photo = (ImageView)findViewById(R.id.image);
        photo.setImageResource(starter.getImageID());
        photo.setContentDescription(starter.getName());
    }
}