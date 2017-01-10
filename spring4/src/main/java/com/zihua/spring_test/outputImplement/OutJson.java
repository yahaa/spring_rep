package com.zihua.spring_test.outputImplement;

import com.google.gson.Gson;

/**
 * Created by zihua on 16-12-26.
 */
public class OutJson implements OutputGe {
    @Override
    public void output(Object o) {
        Gson gson=new Gson();
        System.out.println(gson.toJson(o));

    }
}
