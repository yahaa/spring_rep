package com.zihua.controller;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by zihua on 16-12-28.
 */
@Controller
@RequestMapping(value = "/search")
public class AjaxService {

    private List<String> all = new ArrayList<String>();

    @RequestMapping(value = "/more/{keyword}")
    @ResponseBody
    public List<String> getMore(@PathVariable(value = "keyword") String keyword) {
        initAll();

        ArrayList<String> result = new ArrayList<String>();
        for (String s : all) {
            if (s.contains(keyword)) result.add(s);
        }
        return result;
    }


    public void initAll() {
        String artical = "Clicking I was born" +
                " with bilateral retinoblastoma, " +
                "retinal cancer. My right eye was removed at " +
                "seven months of age. I was 13 months when they " +
                "removed my left eye. The first thing I did upon " +
                "awakening from that last surgery was to climb out " +
                "of my crib and begin wandering around the intensive " +
                "care nursery, probably looking for the one who did " +
                "this to me. (Laughter) Evidently, wandering around " +
                "the nursery was not a problem for me without eyes. " +
                "The problem was getting caught.";
        artical = artical.replaceAll("[.,()]+", " ");
        String[] words = artical.split("[ ]+");
        for (String s : words) {
            all.add(s);
        }

    }
}
