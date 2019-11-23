package com.tingna.springwebservice.web.service;

import com.tingna.springwebservice.web.domain.posts.Posts;
import com.tingna.springwebservice.web.domain.posts.PostsRepository;
import com.tingna.springwebservice.web.dto.posts.PostsMainResponseDto;
import com.tingna.springwebservice.web.dto.posts.PostsSaveRequestDto;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto dto){
        return postsRepository.save(dto.toEntity()).getId();
    }

    @Transactional(readOnly = true) //조회속도 개선
    public List<PostsMainResponseDto> findAllDesc() {
        return postsRepository.findAllDesc()
                .map(PostsMainResponseDto::new)//repository 결과로 넘어온 Posts의 Stream을 map을 통해 PostsMainResponseDto로 변환 -> List로 반환
                .collect(Collectors.toList());
    }
}