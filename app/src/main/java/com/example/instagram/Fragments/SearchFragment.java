package com.example.instagram.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.Adapter.AdapterSearch;
import com.example.instagram.ModelClassSearch;
import com.example.instagram.R;

import java.util.ArrayList;


public class SearchFragment extends Fragment {
    private ArrayList<ModelClassSearch> searchArrayList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        buildData();
        initRecyclerViewSearch(view);
        return view;
    }
    public void initRecyclerViewSearch(View view) {
        RecyclerView recyclerViewSearch = view.findViewById(R.id.recyclerViewSearch);
        recyclerViewSearch.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        AdapterSearch adapterSearch = new AdapterSearch(searchArrayList);
        recyclerViewSearch.setAdapter(adapterSearch);
    }
    public void buildData(){
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage1));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage2));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage3));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage4));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage5));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage1));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage2));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage3));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage4));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage5));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage1));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage2));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage3));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage4));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage5));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage1));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage2));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage3));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage4));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage5));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage1));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage2));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage3));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage4));
        searchArrayList.add(new ModelClassSearch(R.drawable.postimage5));
    }
}