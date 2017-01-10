package com.zihua.spring_test.di;

/**
 * Created by zihua on 16-12-27.
 */
public class Bird implements FlyBehavier{

    @Override
    public void fly() {
        System.out.println("i am a brid i can fly !");
    }
}
