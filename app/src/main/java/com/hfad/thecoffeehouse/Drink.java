package com.hfad.thecoffeehouse;

public class Drink {
    private String name;
    private String description;
    private int imageResourceID;

    public static final Drink[] drinks={
       new Drink("Latte", "A couple of espresso " +
               "shots with steamed milk",
               R.drawable.new_project),
       new Drink("Cappuccino", "Espresso, hot milk, " +
               "and a steamed milk foam",
               R.drawable.cafe_espresso),
       new Drink("Filter",  "Highest quality beans " +
               "roasted and brewed fresh",
               R.drawable.filter_coffee_0)};
    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceId;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceID() {
        return imageResourceID;
    }
    public String toString() {
        return this.name;
    }

}

