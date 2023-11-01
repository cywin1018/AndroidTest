package com.example.recycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycler.databinding.ItemViewBinding;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ItemViewBinding binding;
    public MyViewHolder(ItemViewBinding binding){
        super(binding.getRoot());
        this.binding = binding;
    }
//    ImageView imageView;
//    TextView nameView,emailView;
//    public MyViewHolder(@NonNull View itemView) {
//        super(itemView);
//        imageView = itemView.findViewById(R.id.imageview);
//        nameView = itemView.findViewById(R.id.name);
//        emailView = itemView.findViewById(R.id.email);
//    }
}
