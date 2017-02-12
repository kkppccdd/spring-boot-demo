package me.raycai.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootDemoApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
