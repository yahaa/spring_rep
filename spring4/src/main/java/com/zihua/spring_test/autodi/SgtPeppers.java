package com.zihua.spring_test.autodi;

import org.springframework.stereotype.Component;

/**
 * Created by zihua on 17-1-10.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt.pepper";
    private String artist = "The Bulute";

    @Override
    public void play() {
        System.out.println(title);
        System.out.println(artist);
    }
}
