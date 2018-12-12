package com.example.kitchenadventures;

public class Recipe {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Recipe[] recipes = {
            new Recipe("Carrrot Cake Oatmeal", "A breakfast dish.", R.drawable.purple__breakfast_jar),
            new Recipe("Sweet Potato Soup", "A main course.", R.drawable.sweet_potato_soup_1),
            new Recipe("Tartlet", "A dessert.", R.drawable.tartlet)
    };

    private Recipe(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

