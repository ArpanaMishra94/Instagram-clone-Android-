package com.example.instagram.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.ModelClassFav;
import com.example.instagram.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterFav extends RecyclerView.Adapter<AdapterFav.ViewHolder> {
    private ArrayList<ModelClassFav> arrayListFav;

    public AdapterFav(ArrayList<ModelClassFav> arrayListFav) {
        this.arrayListFav = arrayListFav;
    }

    @NonNull
    @Override
    public AdapterFav.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       LayoutInflater inflater = LayoutInflater.from(parent.getContext());
       View view = inflater.inflate(R.layout.fav_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterFav.ViewHolder holder, int position) {
        ModelClassFav modelClassFav = arrayListFav.get(position);
        holder.requestImage.setImageResource(modelClassFav.getRequestImage());
        holder.requestName.setText(modelClassFav.getRequestName());
        holder.requestTime.setText(modelClassFav.getRequestTime());
    }

    @Override
    public int getItemCount() {
        return arrayListFav.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public CircleImageView requestImage;
        public TextView requestName;
        public TextView requestTime;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            requestImage = itemView.findViewById(R.id.requestAvatar);
            requestName = itemView.findViewById(R.id.requestName);
            requestTime = itemView.findViewById(R.id.requestTime);
        }
    }
}
