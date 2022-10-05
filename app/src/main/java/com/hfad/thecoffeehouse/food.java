package com.hfad.thecoffeehouse;

import androidx.annotation.NonNull;

public class food {
    private String name;
    private String description;
    private int imageID;

    public food(String name, String description, int imageID) {
        this.name = name;
        this.description = description;
        this.imageID = imageID;
    }
public static final food[] essen={
  new food("Mongolian Bowl", "Combination for fresh veggies, chicken, and rice", R.drawable.mongolian),
        new food("Japanese Fried Rice", "Fried veggies, mushrooms, shrimp, and tasty rice", R.drawable.japanesefriedrice),
        new food("Burger", "Double decker Steak burger", R.drawable.steakhouseburger)
};
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageID() {
        return imageID;
    }
    @NonNull
    public String toString(){
        return this.name;
    }
}
