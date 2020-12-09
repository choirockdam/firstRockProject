package com.jojoldu.book.firstRockdamProject.service;


import com.jojoldu.book.firstRockdamProject.domain.Posts;
import com.jojoldu.book.firstRockdamProject.domain.PostsRepository;
import com.jojoldu.book.firstRockdamProject.web.dto.PostsResponseDto;
import com.jojoldu.book.firstRockdamProject.web.dto.PostsSaveRequestDto;
import com.jojoldu.book.firstRockdamProject.web.dto.PostsUpdateDto;
import com.jojoldu.book.firstRockdamProject.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {

        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {

        Posts posts = postsRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("해당 사용자가 없습니다. id=" + id)
        );

        posts.update(requestDto.getTitle(), requestDto.getContents());
        return id;
    }

    public PostsResponseDto findById(Long id) {

        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다.id="+id));
        return new PostsResponseDto(entity);


    }
}
