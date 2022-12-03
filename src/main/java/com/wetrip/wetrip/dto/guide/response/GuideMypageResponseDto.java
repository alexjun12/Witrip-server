package com.wetrip.wetrip.dto.guide.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GuideMypageResponseDto {
    private String name;
    private String region;
    private double star;
    private int totalCount;
    private String ment;
}
