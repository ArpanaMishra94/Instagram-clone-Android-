package com.example.instagram.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.instagram.Adapter.AdapterProfilePictures;
import com.example.instagram.Adapter.AdapterProfileSavedPics;
import com.example.instagram.ModelClassProfilePictures;
import com.example.instagram.ModelClassProfileSaved;
import com.example.instagram.R;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {
    RecyclerView recyclerViewPictures;
    RecyclerView recyclerViewSaved;
    private ImageView myPictures;
    private ImageView savedPictures;
    private ArrayList<ModelClassProfilePictures> arrayListProfilePictures = new ArrayList<>();
    private ArrayList<ModelClassProfileSaved> arrayListProfileSaved = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_profile, container, false);
        recyclerViewPictures = view.findViewById(R.id.recyclerViewPictures);
        recyclerViewSaved = view.findViewById(R.id.recyclerViewSaved);
        myPictures = view.findViewById(R.id.gridButton);
        savedPictures = view.findViewById(R.id.saveButton);
        buildDataPictures();
        buildDataSavedPics();
        initRecyclerViewProfile();
        recyclerViewPictures.setVisibility(View.VISIBLE);
        recyclerViewSaved.setVisibility(View.GONE);

        myPictures.setOnClickListener(v -> {
            recyclerViewPictures.setVisibility(View.VISIBLE);
            recyclerViewSaved.setVisibility(View.GONE);
        });

        savedPictures.setOnClickListener(v -> {
            recyclerViewPictures.setVisibility(View.GONE);
            recyclerViewSaved.setVisibility(View.VISIBLE);
        });

        return view;
    }
    public void initRecyclerViewProfile(){

        recyclerViewPictures.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        AdapterProfilePictures adapterProfilePictures = new AdapterProfilePictures(arrayListProfilePictures);
        recyclerViewPictures.setAdapter(adapterProfilePictures);


        recyclerViewSaved.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        AdapterProfileSavedPics adapterProfileSavedPics = new AdapterProfileSavedPics(arrayListProfileSaved);
        recyclerViewSaved.setAdapter(adapterProfileSavedPics);
    }

    public void buildDataPictures(){
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.postimage4));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.postimage1));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.userimage3));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.userimage4));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.postimage5));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.userimage1));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.postimage2));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.userimage3));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.userimage2));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.postimage1));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.postimage3));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.postimage4));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.postimage5));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.userimage1));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.userimage2));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.postimage4));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.userimage2));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.postimage1));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.userimage3));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.userimage4));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.userimage5));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.userimage1));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.userimage2));
        arrayListProfilePictures.add(new ModelClassProfilePictures(R.drawable.userimage3));
    }
    public void buildDataSavedPics(){
        arrayListProfileSaved.add(new ModelClassProfileSaved(R.drawable.postimage1));
        arrayListProfileSaved.add(new ModelClassProfileSaved(R.drawable.postimage2));
        arrayListProfileSaved.add(new ModelClassProfileSaved(R.drawable.postimage3));
        arrayListProfileSaved.add(new ModelClassProfileSaved(R.drawable.postimage4));
        arrayListProfileSaved.add(new ModelClassProfileSaved(R.drawable.userimage1));
        arrayListProfileSaved.add(new ModelClassProfileSaved(R.drawable.userimage2));
        arrayListProfileSaved.add(new ModelClassProfileSaved(R.drawable.userimage3));
        arrayListProfileSaved.add(new ModelClassProfileSaved(R.drawable.postimage5));
        arrayListProfileSaved.add(new ModelClassProfileSaved(R.drawable.userimage1));
        arrayListProfileSaved.add(new ModelClassProfileSaved(R.drawable.postimage5));
        arrayListProfileSaved.add(new ModelClassProfileSaved(R.drawable.postimage3));
        arrayListProfileSaved.add(new ModelClassProfileSaved(R.drawable.postimage4));
        arrayListProfileSaved.add(new ModelClassProfileSaved(R.drawable.postimage1));
        arrayListProfileSaved.add(new ModelClassProfileSaved(R.drawable.userimage2));
        arrayListProfileSaved.add(new ModelClassProfileSaved(R.drawable.postimage3));
        arrayListProfileSaved.add(new ModelClassProfileSaved(R.drawable.postimage4));
    }
}