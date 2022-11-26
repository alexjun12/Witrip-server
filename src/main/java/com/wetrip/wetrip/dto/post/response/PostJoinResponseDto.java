package com.wetrip.wetrip.dto.post.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostJoinResponseDto {
    private String title;
    private String place;
    private String mainImageUrl;
    private String userId;
    private String date;
    private int star;
}
