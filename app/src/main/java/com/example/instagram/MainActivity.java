package com.example.instagram;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.example.instagram.Fragments.FavFragment;
import com.example.instagram.Fragments.HomeFragment;
import com.example.instagram.Fragments.ProfileFragment;
import com.example.instagram.Fragments.SearchFragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView view;
    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.bottomNav);
       getSupportFragmentManager().beginTransaction().replace(R.id.content, new HomeFragment()).addToBackStack(null).commit();

       view.setSelectedItemId(R.id.navHome);
       view.setOnItemSelectedListener(item -> {
           Fragment fragment = null;
           switch(item.getItemId()){
               case R.id.navSearch:
                   fragment = new SearchFragment();
                   break;
               case R.id.navProfile:
                   fragment = new ProfileFragment();
                   break;
               case R.id.navHome:
                   fragment = new HomeFragment();
                   break;
               case R.id.navFav:
                   fragment = new FavFragment();
                   break;
           }
           getSupportFragmentManager().beginTransaction().replace(R.id.content, fragment).addToBackStack(null).commit();
           return true;
       });
    }



}