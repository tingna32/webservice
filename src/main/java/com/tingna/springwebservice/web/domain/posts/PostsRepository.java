package com.tingna.springwebservice.web.domain.posts;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PostsRepository extends JpaRepository<Posts, Long>{
 //DBLayer 접근, JpaRepository<Entity클래스,PK타입>을 삭송하면 기본적인 CRUD가 자동생성
    @Query("SELECT p " + //@Query는 SpringDataJpa에 제공하지 않는 메소드는 쿼더리로 작성해도 되는 것을 보여줌
            "FROM Posts p " +
            "ORDER BY p.id DESC")
    Stream<Posts> findAllDesc();
}

