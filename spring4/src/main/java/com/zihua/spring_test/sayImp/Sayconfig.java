package com.zihua.spring_test.sayImp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zihua on 16-12-26.
 */
@Configuration
public class Sayconfig {
    @Bean(name="sayMany")
    public Say say(){
        return new SayMany();
    }
}
