package com.example.instagram.Adapter;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.ModelClassStory;
import com.example.instagram.R;
import com.example.instagram.StoryActivity;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterStory extends RecyclerView.Adapter<AdapterStory.StoryViewHolder> {
   private final ArrayList<ModelClassStory> storyArrayList;
     Context context;


    public AdapterStory(ArrayList<ModelClassStory> storyArrayList, Context context) {
        this.storyArrayList = storyArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterStory.StoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_design, parent, false);
        return new StoryViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull AdapterStory.StoryViewHolder holder, int position) {
        final ModelClassStory temp = storyArrayList.get(position);
         holder.storyTitle.setText(storyArrayList.get(position).getStoryTitle());
         holder.storyIcon.setImageResource(storyArrayList.get(position).getStoryIcon());
         holder.storyHidden.setImageResource(storyArrayList.get(position).getStoryHidden());
         holder.storyIcon.setOnClickListener(v -> {
             Intent intent = new Intent(context, StoryActivity.class);
             intent.putExtra("image", temp.getStoryHidden());
             intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
             context.startActivity(intent);

         });
    }

    @Override
    public int getItemCount() {
        return storyArrayList.size();
    }
    public static class StoryViewHolder extends RecyclerView.ViewHolder{
        private final CircleImageView storyIcon;
        private final TextView storyTitle;
        private final ImageView storyHidden;
        public StoryViewHolder(@NonNull View itemView) {
            super(itemView);
            storyIcon = itemView.findViewById(R.id.storyIcon);
            storyTitle = itemView.findViewById(R.id.storyTitle);
            storyHidden = itemView.findViewById(R.id.storyHidden);
        }
    }

}
