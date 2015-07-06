package com.example.autoconfigure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
//@Configuration
public class SpringBootAutoconfigureExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAutoconfigureExampleApplication.class, args);
    }

//    @Bean
//    public String result() {
//        return "my-override-value";
//    }
}
