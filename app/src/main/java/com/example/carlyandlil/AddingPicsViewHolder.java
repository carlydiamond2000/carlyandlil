package com.example.carlyandlil;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class AddingPicsViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public ImageView picview;


    public AddingPicsViewHolder(@NonNull View itemView) {
        super(itemView);

        cardView = itemView.findViewById(R.id.cardview);
        picview = itemView.findViewById(R.id.picview);

    }
}
