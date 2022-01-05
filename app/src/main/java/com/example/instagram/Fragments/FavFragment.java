package com.example.instagram.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.Adapter.AdapterFav;
import com.example.instagram.ModelClassFav;
import com.example.instagram.R;

import java.util.ArrayList;


public class FavFragment extends Fragment {
    private ArrayList<ModelClassFav> favArrayList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fav, container, false);
        buildDataRequests();
        initRecyclerView(view);
        return view;
    }
    public void initRecyclerView(View view) {
        RecyclerView recyclerViewFav = view.findViewById(R.id.recyclerViewFav);
        recyclerViewFav.setLayoutManager(new LinearLayoutManager(getActivity()));
        AdapterFav adapterFav = new AdapterFav(favArrayList);
        recyclerViewFav.setAdapter(adapterFav);
    }
    public void buildDataRequests(){
        favArrayList.add(new ModelClassFav(R.drawable.userimage1, "j_a_mes", "4 d"));
        favArrayList.add(new ModelClassFav(R.drawable.userimage2, "shel_don", "4 d"));
        favArrayList.add(new ModelClassFav(R.drawable.userimage3, "ra_c_hel", "4 d"));
        favArrayList.add(new ModelClassFav(R.drawable.userimage4, "mi_le_y", "4 d"));
        favArrayList.add(new ModelClassFav(R.drawable.userimage5, "to_m", "4 d"));
        favArrayList.add(new ModelClassFav(R.drawable.postimage1, "ha_r_ry", "4 d"));
        favArrayList.add(new ModelClassFav(R.drawable.postimage2, "su_san", "4 d"));
        favArrayList.add(new ModelClassFav(R.drawable.postimage3, "joh_n", "4 d"));
        favArrayList.add(new ModelClassFav(R.drawable.userimage1, "da_v_id", "4 d"));
        favArrayList.add(new ModelClassFav(R.drawable.userimage2, "dw_i_ght", "4 d"));
        favArrayList.add(new ModelClassFav(R.drawable.userimage3, "sta_n_ly", "4 d"));
        favArrayList.add(new ModelClassFav(R.drawable.userimage4, "an_ge_la", "4 d"));
        favArrayList.add(new ModelClassFav(R.drawable.userimage5, "mere_d_ith", "4 d"));
        favArrayList.add(new ModelClassFav(R.drawable.postimage1, "al_s_a", "4 d"));
        favArrayList.add(new ModelClassFav(R.drawable.postimage2, "an_d_y", "4 d"));
        favArrayList.add(new ModelClassFav(R.drawable.postimage3, "r_o_ss", "4 d"));
    }
}