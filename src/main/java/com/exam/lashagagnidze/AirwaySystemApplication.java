package com.exam.lashagagnidze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AirwaySystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirwaySystemApplication.class, args);
    }

}
