package com.danny.demo1;

import com.danny.demo1.model.LombokPOJO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    LombokPOJO lombokPOJO = LombokPOJO.builder()
            .name("danny")
            .age(20)
            .build();

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}
