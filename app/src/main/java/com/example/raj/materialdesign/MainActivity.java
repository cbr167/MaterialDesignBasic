package com.example.raj.materialdesign;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ScrollingView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolBar;
    TabLayout tabs;
    FloatingActionButton floatBar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolBar  = (Toolbar) findViewById(R.id.toolBar);
        tabs = (TabLayout) findViewById(R.id.tabs);
        floatBar = (FloatingActionButton)findViewById(R.id.floatBar);
        button = (Button) findViewById(R.id.button);

        tabs.addTab(tabs.newTab().setText("Table0"));
        tabs.addTab(tabs.newTab().setText("Table1"));
        tabs.addTab(tabs.newTab().setText("Table2"));
        tabs.addTab(tabs.newTab().setText("Table2"));
        tabs.addTab(tabs.newTab().setText("Table2"));


        setSupportActionBar(toolBar);
        getSupportActionBar().setTitle("Material Design");
        toolBar.setTitleTextColor(getResources().getColor(R.color.white));

        floatBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "SnackBar", Snackbar.LENGTH_INDEFINITE).setAction("Action", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"Snack bar cloicmas", Toast.LENGTH_LONG).show();
                    }
                }).show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Show.class));
            }
        });

    }
}
