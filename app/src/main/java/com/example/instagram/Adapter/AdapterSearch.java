package com.example.instagram.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.ModelClassSearch;
import com.example.instagram.R;

import java.util.ArrayList;

public class AdapterSearch extends RecyclerView.Adapter<AdapterSearch.ViewHolder> {
    private ArrayList<ModelClassSearch> searchArrayList;

    public AdapterSearch(ArrayList<ModelClassSearch> searchArrayList) {
        this.searchArrayList = searchArrayList;
    }

    @NonNull
    @Override
    public AdapterSearch.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.search_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSearch.ViewHolder holder, int position) {
            ModelClassSearch modelClassSearch = searchArrayList.get(position);
            holder.searchImage.setImageResource(modelClassSearch.getSearchImage());
    }

    @Override
    public int getItemCount() {
        return searchArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView searchImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            searchImage = itemView.findViewById(R.id.searchImage);
        }
    }
}
