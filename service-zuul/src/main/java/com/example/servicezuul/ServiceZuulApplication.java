package com.example.servicezuul;

import com.example.servicezuul.Filter.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }

    /*@Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }*/

    @Bean
    public CorsFilter corsFilter(){
        return new CorsFilter();
    }

}
