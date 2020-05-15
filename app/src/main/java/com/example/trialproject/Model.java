package com.example.trialproject;


public class Model {
    private int image;
    private String title;
    private String desc;
    private String coins;
    public Model(int image, String title, String desc,String coins) {
        this.image = image;
        this.title = title;
        this.desc = desc;
        this.coins = coins;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCoins() {
        return coins;
    }

    public void setCoins(String coins) {
        this.coins = coins;
    }

}
