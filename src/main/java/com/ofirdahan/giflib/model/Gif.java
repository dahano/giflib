package com.ofirdahan.giflib.model;

import java.util.Date;

public class Gif {
    private String name;
    private int categoryId;
    public String creator;
    private boolean favorite;

    public Gif(String name, int categoryId, String creator, boolean favorite) {
        this.name = name;
        this.categoryId = categoryId;
        this.creator = creator;
        this.favorite = favorite;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatorName() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
