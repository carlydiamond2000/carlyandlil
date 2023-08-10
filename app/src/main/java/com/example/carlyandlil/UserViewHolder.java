package com.example.carlyandlil;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public ImageView image;
    public TextView username;
    public TextView password;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        username = itemView.findViewById(R.id.username);
        password = itemView.findViewById(R.id.password);
    }
}