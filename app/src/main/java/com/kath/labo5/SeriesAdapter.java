package com.kath.labo5;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesAdapter.SeriesViewHolder> {
    private ArrayList<Serie> series;

    public static class SeriesViewHolder extends RecyclerView.ViewHolder {
        CardView card;
        TextView name;
        ImageView img;
        Button btn;

        public SeriesViewHolder(View itemView) {
            super(itemView);
            card = itemView.findViewById(R.id.car_view);
            name = itemView.findViewById(R.id.name);
            img = itemView.findViewById(R.id.img);
            btn = itemView.findViewById(R.id.btn);
        }
    }

    public SeriesAdapter(ArrayList<Serie> series) {
        this.series = series;
    }

    @Override
    public SeriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview, parent, false);
        return (new SeriesViewHolder(v));
    }

    @Override
    public void onBindViewHolder(SeriesViewHolder holder, final int position) {
        holder.name.setText(series.get(position).getName());
        holder.img.setImageResource(series.get(position).getImg());
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), (CharSequence) series.get(position).getName(), Toast.LENGTH_SHORT).show();
                Toast.makeText(view.getContext(), (CharSequence) series.get(position).getDesc(), Toast.LENGTH_SHORT).show();
                Toast.makeText(view.getContext(), (CharSequence) series.get(position).getCaps(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return series.size();
    }

}

