package com.jdu.aws.web;

import com.jdu.aws.service.posts.PostsService;
import com.jdu.aws.web.domain.posts.Posts;
import com.jdu.aws.web.dto.PostsResponseDto;
import com.jdu.aws.web.dto.PostsSaveRequestDto;
import com.jdu.aws.web.dto.PostsUpdateRequestDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {

    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();

    }
}
