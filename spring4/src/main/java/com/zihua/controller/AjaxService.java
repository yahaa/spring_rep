package com.zihua.controller;

import com.google.gson.Gson;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zihua on 16-12-28.
 */
@Controller
@RequestMapping(value = "/search")
public class AjaxService {

    private List<String> all = new ArrayList<String>();

    @RequestMapping(value = "/more")
    @ResponseBody
    public void getMore(HttpServletRequest request, HttpServletResponse response) throws IOException {
        initAll();
        String keyword = request.getParameter("keyword");
        Set<String> result = new HashSet<String>();
        for (String s : all) {
            if (s.contains(keyword)) result.add(s);
        }
        Gson gson = new Gson();
        response.getWriter().write(gson.toJson(result));

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
