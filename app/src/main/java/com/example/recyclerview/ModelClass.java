package com.example.recyclerview;

public class ModelClass {

    private String text;
    private int image;

    public ModelClass(String text1, int image) {
        this.image = image;
        this.text = text1;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
