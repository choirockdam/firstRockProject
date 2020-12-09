package com.jojoldu.book.firstRockdamProject.web;


import com.jojoldu.book.firstRockdamProject.service.PostsService;
import com.jojoldu.book.firstRockdamProject.web.dto.PostsResponseDto;
import com.jojoldu.book.firstRockdamProject.web.dto.PostsSaveRequestDto;
import com.jojoldu.book.firstRockdamProject.web.dto.PostsUpdateDto;
import com.jojoldu.book.firstRockdamProject.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PutMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto)
    {

        return postsService.save(requestDto);
    }
    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto)
    {

        return postsService.update(id,requestDto);
    }
    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id)
    {
        return postsService.findById(id);

    }
}
