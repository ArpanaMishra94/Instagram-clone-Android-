package com.example.instagram.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.ModelClassProfileSaved;
import com.example.instagram.R;

import java.util.ArrayList;

public class AdapterProfileSavedPics extends RecyclerView.Adapter<AdapterProfileSavedPics.ViewHolder> {
    private final ArrayList<ModelClassProfileSaved> arrayListProfileSavedPics;

    public AdapterProfileSavedPics(ArrayList<ModelClassProfileSaved> arrayListProfileSavedPics) {
        this.arrayListProfileSavedPics = arrayListProfileSavedPics;
    }

    @NonNull
    @Override
    public AdapterProfileSavedPics.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.profile_saved_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProfileSavedPics.ViewHolder holder, int position) {
        ModelClassProfileSaved modelClassProfileSaved = arrayListProfileSavedPics.get(position);
        holder.profileSavedPic.setImageResource(modelClassProfileSaved.getProfileSaved());
    }

    @Override
    public int getItemCount() {
        return arrayListProfileSavedPics.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView profileSavedPic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profileSavedPic = itemView.findViewById(R.id.profileSavedPics);
        }
    }
}
