package com.example.kitchenadventures;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(MainActivity.this, RecipeActivity.class);
                    startActivity(intent);
                }
            }
        };

        Button buttonCarrot = findViewById(R.id.button_recipeList_carrot);
        buttonCarrot.setOnItemClickListener(itemClickListener);

        Button buttonJar = findViewById(R.id.button_recipeList_jar);
        buttonJar.setOnItemClickListener(itemClickListener);

        Button buttonWaffle = findViewById(R.id.button_recipeList_waffle);
        buttonWaffle.setOnItemClickListener(itemClickListener);

        Button buttonTofu = findViewById(R.id.button_recipeList_tofu);
        buttonTofu.setOnItemClickListener(itemClickListener);

        Button buttonPesto = findViewById(R.id.button_recipeList_pesto);
        buttonPesto.setOnItemClickListener(itemClickListener);

        Button buttonChili = findViewById(R.id.button_recipeList_chili);
        buttonChili.setOnItemClickListener(itemClickListener);

        Button buttonChocolate = findViewById(R.id.button_recipeList_chocolate);
        buttonChocolate.setOnItemClickListener(itemClickListener);

        Button buttonCinnamon = findViewById(R.id.button_recipeList_cinnamon);
        buttonCinnamon.setOnItemClickListener(itemClickListener);

        Button buttonMuffins = findViewById(R.id.button_recipeList_muffins);
        buttonMuffins.setOnItemClickListener(itemClickListener);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment newFragment = null;

        if (id == R.id.nav_free_breakfast) {
            newFragment = new BreakfastFragment();
        }

        if(newFragment != null){
            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction()
                    .replace(R.id.container_main, newFragment)
                    .commit();
        }

        if (id == R.id.nav_local_pizza) {
            newFragment = new MainFragment();
        }

        if(newFragment != null){
            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction()
                    .replace(R.id.container_main, newFragment)
                    .commit();
        }

        if (id == R.id.nav_cake_black) {
            newFragment = new DessertFragment();
        }

        if(newFragment != null){
            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction()
                    .replace(R.id.container_main, newFragment)
                    .commit();
        }

        if (id == R.id.nav_local_dining) {
            newFragment = new RestaurantFragment();
        }

        if(newFragment != null){
            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction()
                    .replace(R.id.container_main, newFragment)
                    .commit();
        }

        if(id == R.id.nav_kitchen_black){
            newFragment = new RecipeList();
        }

        if(newFragment != null){
            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction()
                    .replace(R.id.container_main, newFragment)
                    .commit();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}