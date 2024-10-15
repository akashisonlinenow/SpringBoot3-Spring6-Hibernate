package com.akashonlinehere.springcoredemo.config;

import com.akashonlinehere.springcoredemo.common.Coach;
import com.akashonlinehere.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic") // here, if we want then we can specify custom bean id of our choice --> here I used "aquatic"
    public Coach swimCoach(){    // bean id defaults to the method name here...
        return new SwimCoach();
    }
}
