package com.wetrip.wetrip.dto.post.request;

import com.wetrip.wetrip.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostJoinRequestDto {
    private String title;
    private String place;
    private String mainImageUrl;
    private String userId;
    private String date;
    private int star;

    public PostJoinRequestDto(){}

    public Post toEntity(){
        return Post.builder()
                .postId(randomIdCreate())
                .title(title)
                .place(place)
                .mainImageUrl(mainImageUrl)
                .userId(userId)
                .date(date)
                .star(star)
                .build();
    }

    private Long randomIdCreate(){
        return (long)(Math.random() * 1000000) + 100000;
    }
}
