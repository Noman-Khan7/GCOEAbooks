package com.example.noman.gcoeabooks;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
private DrawerLayout sdrawerlayout;
private ActionBarDrawerToggle sToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sdrawerlayout=findViewById(R.id.main_draw);
        sToggle=new ActionBarDrawerToggle(this,sdrawerlayout,R.string.open,R.string.close);
        sdrawerlayout.addDrawerListener(sToggle);
        sToggle.syncState();;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(sToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

