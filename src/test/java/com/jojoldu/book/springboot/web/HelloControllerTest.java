package com.jojoldu.book.springboot.web;

import org.apache.catalina.security.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;


import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@RunWith(SpringRunner.class) // JUnit4 버전
@ExtendWith(SpringExtension.class) //JUnit5 버전
@WebMvcTest(controllers = HelloController.class,
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = SecurityConfig.class)
        }
) //웹(컨트롤러)만 테스트 가능 , 서비스or레포지토리 테스트 안됨
public class HelloControllerTest {
    @Autowired
    private MockMvc mvc; //개발한 웹 프로그램을 실제 서버에 배포하지 않고도 테스트를 위한 요청을 제공 즉, 웹 API 테스트 할 때 사용, 이 클래스를 통해 HTTP GET, POST등에 대한 API테스트

    @Test
    public void hello가_리턴된다() throws Exception {
        //given
        String hello = "hello";

        //when, then
        mvc.perform(get("/hello")) //get매핑으로 /hello 요청
                .andExpect(status().isOk()) // 200번 OK상태인지 확인
                .andExpect(content().string(hello)); //hello 리턴하는지 확인
    }

    //@WithMockUser(roles="USER")
    @Test
    public void helloDto가_리턴된다() throws Exception {
        //given
        String name = "hello";
        int amount = 1000;

        //when, then
        mvc.perform(
                        get("/hello/dto")
                                .param("name", name)
                                .param("amount", String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name))) //json 응닫값이 name과 같은지
                .andExpect(jsonPath("$.amount", is(amount))); //json 응답값이 amount와 같은지
    }


}
