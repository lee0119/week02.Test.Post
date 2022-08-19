package com.sparta.week2testgold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


// 스프링 부트에서 스케줄러가 작동하게 합니다.
@EnableJpaAuditing
@SpringBootApplication
public class Week2TestGoldApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week2TestGoldApplication.class, args);
    }

}
