package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//JpaConfig 파일 생성했으므로 아래 @EnableJpaAuditing 삭제
//@EnableJpaAuditing //JPA Auditing 활성화, jpa 엔티티 객체가 생성이 되거나 변경이 되었을 때 자동으로 값을 등록
@SpringBootApplication
        //(exclude = SecurityAutoConfiguration.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
