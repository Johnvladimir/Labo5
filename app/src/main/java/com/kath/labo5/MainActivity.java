package com.kath.labo5;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

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
        series.add(new Serie("Deporte Soccer", "Juego de dos equipos de 11 jugadores", R.drawable.soccer, "Deporte de juego en equipo"));
        series.add(new Serie("Deporte Basketball", "Juego de dos equipos de 5 jugadores", R.drawable.basket, "Deporte de juego en equipo y altura"));
        series.add(new Serie("Deporte Tenis", "Juego de dos jugadores o entre dos parejas", R.drawable.tenis, "Deporte de estrategia, resistencia y habilidad"));

    }

}