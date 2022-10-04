package com.hfad.thecoffeehouse;

import androidx.annotation.NonNull;

public class Starter {
    private String name;
    private String description;
    private int imageID;
    public static final Starter[] starters={
      new Starter("Mozzarella Sticks",
              "Filled with creamy mozzarella cheese " +
                      "and coated with delicious spices", R.drawable.mozzarella),
            new Starter("Nuggets", "Juicy and tendered chicken " +
                    "coated with delicious spices", R.drawable.nuggets),
            new Starter("Chicken Salad","Mix of fresh " +
                    "vegetables and juicy chicken for " +
                    "a healthy start", R.drawable.chickensalad )
    };
  private Starter  (String name, String description, int imageID){
      this.name=name;
      this.description=description;
      this.imageID=imageID;
  }

    public String getName() {return name;}
    public String getDescription() {return description;}
    public int getImageID() {return imageID;}
    @NonNull
    public String toString() {
        return this.name;
    }
}
