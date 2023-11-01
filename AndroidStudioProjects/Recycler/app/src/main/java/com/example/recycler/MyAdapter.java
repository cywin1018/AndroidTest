package com.example.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycler.databinding.ItemViewBinding;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ItemViewBinding binding = ItemViewBinding.inflate(LayoutInflater.from(viewGroup.getContext()),
                viewGroup, false);
        return new MyViewHolder(binding);
    }
    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.binding.name.setText(items.get(position).getName());
        holder.binding.email.setText(items.get(position).getEmail());
        holder.binding.imageview.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    //    public MyAdapter(Context context, List<Item> items) {
//        this.context = context;
//        this.items = items;
//    }
//
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        holder.nameView.setText(items.get(position).getName());
//        holder.emailView.setText(items.get(position).getEmail());
//        holder.imageView.setImageResource(items.get(position).getImage());
//    }
//
//    @Override
//    public int getItemCount() {
//        return items.size();
//    }
}
