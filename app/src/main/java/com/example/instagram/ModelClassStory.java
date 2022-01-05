package com.example.instagram;

public class ModelClassStory {
    private int storyIcon;
    private String storyTitle;
    private int storyHidden;

    public ModelClassStory(int storyIcon, String storyTitle, int storyHidden) {
        this.storyIcon = storyIcon;
        this.storyTitle = storyTitle;
        this.storyHidden = storyHidden;
    }

    public int getStoryIcon() {
        return storyIcon;
    }

    public void setStoryIcon(int storyIcon) {
        this.storyIcon = storyIcon;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public int getStoryHidden() {
        return storyHidden;
    }

    public void setStoryHidden(int storyHidden) {
        this.storyHidden = storyHidden;
    }
}
