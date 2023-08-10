package com.example.carlyandlil;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public ImageView logo;
    public TextView username;
    public TextView password;

    public TextView getUsername() {
        return username;
    }

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
