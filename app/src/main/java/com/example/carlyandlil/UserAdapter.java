package com.example.carlyandlil;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserAdapter extends RecyclerView.Adapter<AddingPicsViewHolder> {
    @NonNull
    @Override
    public AddingPicsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.myclosetpictures,parent,false);
        AddingPicsViewHolder viewHolder = new AddingPicsViewHolder(view);
        return viewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull AddingPicsViewHolder holder, int position) {
        holder.picview.setImageResource(R.drawable.eveningfit1);


    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
