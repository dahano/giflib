package com.ofirdahan.giflib.Controller;

import com.ofirdahan.giflib.data.GifRepository;
import com.ofirdahan.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class GifController {
    @Autowired
    private GifRepository gifRepository;


    @RequestMapping("/")
    public String listGifs(){
        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelmap){
        Gif gif = gifRepository.findByName("android-explosion");
        modelmap.put("gif", gif);
        return "gif-details";
    }

}
