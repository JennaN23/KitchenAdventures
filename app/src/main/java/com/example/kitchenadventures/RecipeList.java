package com.example.kitchenadventures;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class RecipeList extends Fragment {

    private Button buttonCarrot;
    private Button buttonJar;
    private Button buttonWaffle;
    private Button buttonPesto;
    private Button buttonChili;
    private Button buttonTofu;
    private Button buttonChocolate;
    private Button buttonCinnamon;
    private Button buttonMuffins;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_recipe_list, container, false);

        return rootView;
    }



    private void wireWidgets() {
        buttonCarrot.findViewById(R.id.button_recipeList_carrot);
        buttonJar.findViewById(R.id.button_recipeList_jar);
        buttonWaffle.findViewById(R.id.button_recipeList_waffle);
        buttonTofu.findViewById(R.id.button_recipeList_tofu);
        buttonPesto.findViewById(R.id.button_recipeList_pesto);
        buttonChili.findViewById(R.id.button_recipeList_chili);
        buttonChocolate.findViewById(R.id.button_recipeList_chocolate);
        buttonCinnamon.findViewById(R.id.button_recipeList_cinnamon);
        buttonMuffins.findViewById(R.id.button_recipeList_muffins);
    }


}
