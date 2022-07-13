package com.example.goldenteamproject.models;

public class DialyMealModel {
    int image;
    String name;
    String desc;
    String type;
    public int getImage() {
        return image;
    }

    public DialyMealModel(int image, String name, String desc, String type) {
        this.image = image;
        this.name = name;
        this.desc = desc;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DialyMealModel(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
     }
}
