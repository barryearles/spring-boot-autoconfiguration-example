package com.example.autoconfigure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan("com.example.autoconfigure.*")
public class SpringBootAutoconfigureExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAutoconfigureExampleApplication.class, args);
    }
}
