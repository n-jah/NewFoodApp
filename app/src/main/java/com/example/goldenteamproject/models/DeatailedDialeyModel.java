package com.example.goldenteamproject.models;

public class DeatailedDialeyModel {
    int image;
    String name;
    String desc;


    public DeatailedDialeyModel(int image, String name, String desc) {
        this.image = image;
        this.name = name;

        this.desc = desc;
    }    public String getName() {
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
