package com.zihua.spring_test.autodi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zihua on 17-1-10.
 */
@Configuration
@ComponentScan(basePackageClasses = {MediaPlayer.class,SgtPeppers.class})
public class CDPlayerConfig {
}
