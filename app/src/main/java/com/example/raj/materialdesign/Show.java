package com.example.raj.materialdesign;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.raj.materialdesign.adaptor.CustomAdapter;
import com.example.raj.materialdesign.model.Data;

public class Show extends AppCompatActivity {
     RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_se);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        Data  data = new Data();
        CustomAdapter adapter = new CustomAdapter(data.initializationData());
        recyclerView.setAdapter(adapter);

    }
}
