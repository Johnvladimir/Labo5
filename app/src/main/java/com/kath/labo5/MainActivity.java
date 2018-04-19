package com.kath.labo5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    SeriesAdapter adapter;
    ArrayList<Serie> series;
    LinearLayoutManager lmanager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        series = new ArrayList<>();
        rv = findViewById(R.id.recycler);
        rv.setHasFixedSize(true);

        lmanager = new LinearLayoutManager(this);
        rv.setLayoutManager(lmanager);
        prepareSeries();
        adapter = new SeriesAdapter(series);
        rv.setAdapter(adapter);
    }

    private void prepareSeries() {
        String TAG = "Mensaje";
        series = new ArrayList<>();
        series.add(new Serie("Paisaje Bonito 1 :)","13",R.drawable.twd,"Vista muy bonita 1 :)"));
        series.add(new Serie("Paisaje Bonito 2 :)","13",R.drawable.twd2,"Vista muy bonita 2 :)"));
        series.add(new Serie("Paisaje Bonito 3 :)","13",R.drawable.twd3,"Vista muy bonita 3 :)"));
    }
}
