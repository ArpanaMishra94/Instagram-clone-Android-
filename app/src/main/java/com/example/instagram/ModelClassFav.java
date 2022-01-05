package com.example.instagram;

public class ModelClassFav {
    private int requestImage;
    private String requestName;
    private String requestTime;

    public ModelClassFav(int requestImage, String requestName, String requestTime) {
        this.requestImage = requestImage;
        this.requestName = requestName;
        this.requestTime = requestTime;
    }

    public int getRequestImage() {
        return requestImage;
    }

    public String getRequestName() {
        return requestName;
    }

    public String getRequestTime() {
        return requestTime;
    }
}
