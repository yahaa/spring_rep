package com.zihua.spring_test.di;

/**
 * Created by zihua on 16-12-27.
 */
public class Man {
    FlyBehavier flyBehavier;

    public Man() {

    }

    public FlyBehavier getFlyBehavier() {
        return flyBehavier;
    }

    public void setFlyBehavier(FlyBehavier flyBehavier) {
        this.flyBehavier = flyBehavier;
    }

    public Man(FlyBehavier flyBehavier) {
        this.flyBehavier = flyBehavier;
    }

    public void fly(){
        flyBehavier.fly();
    }
}
