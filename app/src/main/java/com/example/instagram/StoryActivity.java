package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {
private ImageView storyImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        storyImage = (ImageView) findViewById(R.id.storyView);
        storyImage.setImageResource(getIntent().getIntExtra("image", 0));
    }
}