package com.jojoldu.book.firstRockdamProject.web.dto;

import com.jojoldu.book.firstRockdamProject.domain.Posts;

public class PostsResponseDto {

    private Long id;
    private String title;
    private String cotent;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = id;
        this.title = title;
        this.cotent = cotent;
        this.author = author;
    }
}
