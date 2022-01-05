package com.example.instagram.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.ModelClass;
import com.example.instagram.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
  private ArrayList<ModelClass> arrayList;
  public Adapter(ArrayList<ModelClass> arrayList){
      this.arrayList = arrayList;
  }
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.post_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        ModelClass modelClass = arrayList.get(position);
        holder.postPic.setImageResource(modelClass.getPostPic());
        holder.userName.setText(modelClass.getUserName());
        holder.userImage.setImageResource(modelClass.getUserImage());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       ImageView userImage;
       ImageView postPic;
       TextView userName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userImage = itemView.findViewById(R.id.userImage);
            userName = itemView.findViewById(R.id.userName);
            postPic = itemView.findViewById(R.id.postPic);
        }
    }
}
