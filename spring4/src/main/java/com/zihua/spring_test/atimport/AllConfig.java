package com.zihua.spring_test.atimport;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by zihua on 16-12-27.
 */
@Configuration
@Import({CustomerConfig.class,BossConfig.class})
public class AllConfig {
}
