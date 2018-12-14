package com.example.kitchenadventures;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    public static final String EXTRA_RECIPEID = "recipeId";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        ArrayAdapter<Recipe> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Recipe.recipes);
        ListView listView = (ListView) findViewById(R.id.list_recipes);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listDrinks,
                                            View itemView,
                                            int position,
                                            long id) {
                        Intent intent = new Intent(RecipeActivity.this,
                                Recipe.class);
                        intent.putExtra(RecipeActivity.EXTRA_RECIPEID, (int) id);
                        startActivity(intent);
                    }
                };

                        listView.setOnItemClickListener(itemClickListener);


        int recipeId = 0;
        Recipe recipe = Recipe.recipes[recipeId];

        TextView title = findViewById(R.id.textView_recipe_title);
        title.setText(recipe.getName());

        TextView ingredientList = (TextView) findViewById(R.id.textView_recipe_ingredientList);
        ingredientList.setText(recipe.getIngredients());

        TextView instructionList = (TextView) findViewById(R.id.textView_recipe_instructionnList);
        instructionList.setText(recipe.getInstructions());

        ImageView photo = (ImageView) findViewById(R.id.imageView_recipe);
        photo.setImageResource(recipe.getImageResourceId());
    }
}