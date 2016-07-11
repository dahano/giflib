package com.ofirdahan.giflib.data;

import com.ofirdahan.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
        new Gif("android-explosion",1,  "Chris Ramacciotti", false),
        new Gif("ben-and-mike",2,  "Ben Jakuben", true),
        new Gif("book-dominos",3, "Craig Dennis", false),
        new Gif("compiler-bot",1, "Ada Lovelace", true),
        new Gif("cowboy-coder",2, "Grace Hopper", false),
        new Gif("infinite-andrew",3, "Marissa Mayer", true)
    );

    public Gif findByName(String name){
        for(Gif gif: ALL_GIFS){
            if(gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs(){
        return ALL_GIFS;
    }

    public List<Gif> findByCategoryId(int id){
        List<Gif> gifs = new ArrayList<Gif>();

        for(Gif gif : ALL_GIFS){
            if(gif.getCategoryId() == id){
                gifs.add(gif);
            }
        }

        return gifs;
    }

}
