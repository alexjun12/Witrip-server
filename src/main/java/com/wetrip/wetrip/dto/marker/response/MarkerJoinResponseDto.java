package com.wetrip.wetrip.dto.marker.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MarkerJoinResponseDto {
    private Long postId;
    private String imgUrl;
    private String content;
    private int markerNum;
    private String latitude;
    private String longitude;
}
