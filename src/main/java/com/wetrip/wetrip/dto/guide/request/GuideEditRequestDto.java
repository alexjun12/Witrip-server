package com.wetrip.wetrip.dto.guide.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GuideEditRequestDto {
    private String id;
    private String name;
    private String region;
    private String ment;

    public GuideEditRequestDto() {};
}
