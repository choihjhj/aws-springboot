package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor //기본생성자 생성
@Entity
public class Posts extends BaseTimeEntity { //BaseTimeEntity(createdDate,modifiedDate 상속받도록함)

    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pk auto 증가 옵션
    private Long id; //Entity의 pk는 long타입이 좋음, 조합해서 사용하는것 비추

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}