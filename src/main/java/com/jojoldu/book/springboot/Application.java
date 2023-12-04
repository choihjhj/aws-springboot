package com.jojoldu.book.springboot;

import hello.itemservice.ItemServiceApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //jpa 엔티티 객체가 생성이 되거나 변경이 되었을 때 자동으로 값을 등록
@SpringBootApplication
        //(exclude = SecurityAutoConfiguration.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
