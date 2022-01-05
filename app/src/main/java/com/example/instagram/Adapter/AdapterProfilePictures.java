package com.example.instagram.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.ModelClassProfilePictures;
import com.example.instagram.R;

import java.util.ArrayList;

public class AdapterProfilePictures extends RecyclerView.Adapter<AdapterProfilePictures.ViewHolder>{
    private ArrayList<ModelClassProfilePictures> arrayListProfilePictures;

    public AdapterProfilePictures(ArrayList<ModelClassProfilePictures> arrayListProfilePictures) {
        this.arrayListProfilePictures = arrayListProfilePictures;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.profile_pictures_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     ModelClassProfilePictures modelClassProfilePictures = arrayListProfilePictures.get(position);
     holder.profilePicture.setImageResource(modelClassProfilePictures.getProfilePictures());
    }

    @Override
    public int getItemCount() {
        return arrayListProfilePictures.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
         public ImageView profilePicture;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profilePicture = itemView.findViewById(R.id.profilePictures);
        }
    }
}
