package com.sparta.week2testgold.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.*;

@NoArgsConstructor // 기본생성자를 만듭니다.
@Getter
@Entity // 테이블과 연계됨을 스프링에게 알려줍니다.
public class Memo extends Timestamped { // 생성,수정 시간을 자동으로 만들어줍니다.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String contents;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String repassword;

    @Column(nullable = false)
    private String title;

    public Memo(String username, String contents, String password ,String title,String repassword) {
        this.username = username;
        this.contents = contents;
        this.password = password;
        this.repassword = repassword;
        this.title = title;
    }

    public Memo(MemoRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
        this.password = requestDto.getPassword();
        this.repassword = requestDto.getPassword();
        this.title = requestDto.getTitle();
    }
    public void update(MemoRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
        this.password = requestDto.getRepassword();
        this.title = requestDto.getTitle();
    }
}

