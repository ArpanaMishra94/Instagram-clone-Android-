package com.example.instagram.Fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.instagram.Adapter.Adapter;
import com.example.instagram.Adapter.AdapterStory;
import com.example.instagram.ModelClass;
import com.example.instagram.ModelClassStory;
import com.example.instagram.R;
import com.example.instagram.StoryActivity;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private ArrayList<ModelClass> arrayList = new ArrayList<>();
    private ArrayList<ModelClassStory> arrayListStory = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        buildListDataStory();
        buildListData();
        initRecyclerView(view);
        return view;
    }
    public void initRecyclerView(View view){
        RecyclerView recyclerViewStory = view.findViewById(R.id.recyclerViewStory);
        recyclerViewStory.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        AdapterStory adapterStory = new AdapterStory(arrayListStory, getContext());
        recyclerViewStory.setAdapter(adapterStory);


        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        Adapter adapter = new Adapter(arrayList);
        recyclerView.setAdapter(adapter);

    }
    public void buildListData(){
        arrayList.add(new ModelClass(R.drawable.userimage1, R.drawable.postimage2,"an_dy"));
        arrayList.add(new ModelClass(R.drawable.userimage2, R.drawable.postimage3,"e_r_i_n"));
        arrayList.add(new ModelClass(R.drawable.userimage3, R.drawable.postimage4,"Al_sa"));
        arrayList.add(new ModelClass(R.drawable.userimage4, R.drawable.postimage5,"d_e_vis"));
        arrayList.add(new ModelClass(R.drawable.userimage5, R.drawable.postimage1,"ji_m"));
        arrayList.add(new ModelClass(R.drawable.userimage1, R.drawable.postimage2,"pa_m"));
        arrayList.add(new ModelClass(R.drawable.userimage2, R.drawable.postimage3,"mi_ch_el"));
    }
    public void buildListDataStory(){
        arrayListStory.add(new ModelClassStory(R.drawable.userimage5, "An_drew", R.drawable.storyimage7));
        arrayListStory.add(new ModelClassStory(R.drawable.userimage4, "ber_ni", R.drawable.postimage4));
        arrayListStory.add(new ModelClassStory(R.drawable.userimage3, "ja_n", R.drawable.postimage3));
        arrayListStory.add(new ModelClassStory(R.drawable.userimage2, "ph_ylis", R.drawable.storyimage1));
        arrayListStory.add(new ModelClassStory(R.drawable.userimage1, "jenni_fer", R.drawable.postimage5));
        arrayListStory.add(new ModelClassStory(R.drawable.userimage5, "andy", R.drawable.postimage1));
        arrayListStory.add(new ModelClassStory(R.drawable.userimage4, "as_trid", R.drawable.postimage2));
        arrayListStory.add(new ModelClassStory(R.drawable.userimage3, "ce_ce", R.drawable.postimage3));
        arrayListStory.add(new ModelClassStory(R.drawable.userimage2, "bi_l_ly", R.drawable.postimage4));
        arrayListStory.add(new ModelClassStory(R.drawable.userimage1, "r_o_y", R.drawable.postimage5));
        arrayListStory.add(new ModelClassStory(R.drawable.userimage5, "to_by", R.drawable.postimage1));
    }
}