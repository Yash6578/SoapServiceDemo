package com.saopservice.demo.config;

import com.example.soapclient.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    Calculator getCalculator() {
        return new Calculator();
    }
}
