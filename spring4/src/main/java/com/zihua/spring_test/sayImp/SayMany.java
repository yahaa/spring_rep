package com.zihua.spring_test.sayImp;

/**
 * Created by zihua on 16-12-26.
 */
public class SayMany implements Say {
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }
}
