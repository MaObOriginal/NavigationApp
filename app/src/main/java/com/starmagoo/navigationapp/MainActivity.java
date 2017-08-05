package com.starmagoo.navigationapp;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import static com.starmagoo.navigationapp.R.*;

public class MainActivity extends AppCompatActivity {



    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    //private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        //mToolbar = (Toolbar) findViewById(id.nav_action);
        //setSupportActionBar(mToolbar);

        mDrawerLayout = (DrawerLayout) findViewById(id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, string.open, string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        //getSupportActionBar().setHomeAsUpIndicator(mipmap.ic_menu_white_24dp);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
