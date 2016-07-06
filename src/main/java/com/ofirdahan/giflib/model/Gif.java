package com.ofirdahan.giflib.model;

import java.util.Date;

public class Gif {
    private String name;
    private String creator;
    private boolean favorite;

    public Gif(String name, String creator, boolean favorite) {
        this.name = name;
        this.creator = creator;
        this.favorite = favorite;
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
