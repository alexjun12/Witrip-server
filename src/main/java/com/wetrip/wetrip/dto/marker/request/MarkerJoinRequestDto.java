package com.wetrip.wetrip.dto.marker.request;

import com.wetrip.wetrip.domain.Marker;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MarkerJoinRequestDto {
    private Long postId;
    private String imgUrl;
    private String content;
    private int markerNum;
    private String latitude;
    private String longitude;

    public MarkerJoinRequestDto(){}

    public Marker toEntity(){
        return Marker.builder()
                .markerId(randomIdCreate())
                .postId(postId)
                .imgUrl(imgUrl)
                .content(content)
                .markerNum(markerNum)
                .latitude(latitude)
                .longitude(longitude)
                .build();
    }

    private Long randomIdCreate(){
        return (long)(Math.random() * 1000000) + 100000;
    }
}
