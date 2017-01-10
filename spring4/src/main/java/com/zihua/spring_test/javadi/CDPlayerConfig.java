package com.zihua.spring_test.javadi;

import com.google.gson.Gson;
import com.zihua.spring_test.autodi.CDPlayer;
import com.zihua.spring_test.autodi.CompactDisc;
import com.zihua.spring_test.autodi.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zihua on 17-1-10.
 */
@Configuration
public class CDPlayerConfig {
    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public Gson getGson(){
        return new Gson();
    }
}
