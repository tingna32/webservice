package com.tingna.springwebservice.web.domain.posts;

import com.tingna.springwebservice.web.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@NoArgsConstructor(access = AccessLevel.PROTECTED) //기본생성자 자동추가, 기본 생성자의 접근권한을 protected로 제한, protected Posts()와 같은 효과, Entity 클래스를 프로젝트 코드상에서 기본생성자로 생성하는 것은 막되 JPA에서 Entity 클래스를 생성하는것은 허용하기 위해 추가
@Getter //Getter 메소드를 자동생성
@Entity //테이블과 링크될 클래스임을 나타냄, 언더스코어네이밍(_)으로 이름을 매칭
public class Posts extends BaseTimeEntity{

    @Id //해당 테이블의 PK필드
    @GeneratedValue //PK 생성규칙, 기본값은  Auto, MySQL의 auto_increment와 같이 자동증가형
    private Long id;

    @Column(length = 500, nullable = false) //기본값 외에 추가로 변경이 필요한 옵션이 있을 경우 사용
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
}