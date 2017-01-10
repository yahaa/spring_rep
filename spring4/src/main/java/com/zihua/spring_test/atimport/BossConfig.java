package com.zihua.spring_test.atimport;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zihua on 16-12-27.
 */
@Configuration
public class BossConfig {
    @Bean(name = "zihua")
    public Bossmer getBoss() {
        return new Bossmer();
    }
}
