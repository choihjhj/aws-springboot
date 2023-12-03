package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.service.PostsService;
//import com.jojoldu.book.springboot.web.dto.PostsResponseDto;
import com.jojoldu.book.springboot.web.dto.PostsResponseDto;
import com.jojoldu.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.jojoldu.book.springboot.web.dto.PostsUpdateRequestDto;
@RequiredArgsConstructor
@RestController
@Slf4j
public class PostsApiController {

    private final PostsService postsService;

 /* ----- 로그 테스트
    @GetMapping("/log")
    public String test(){
        String temp="test";
        log.info("-------log test : {}",temp);
        return temp;
    }
*/
    @PostMapping("/api/v1/posts")
    public long save(@RequestBody PostsSaveRequestDto requestsDto) {
        return postsService.save(requestsDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
//        log.info("------------ update--------"); //로그 안찍힘
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
/*
    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }

*/
}