package com.wetrip.wetrip.dto.guide.request;

import com.wetrip.wetrip.domain.Guide;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GuideSigninRequestDto {
    private String id;
    private String password;
    private String name;
    private String region;
    private double star;
    private int toalCount;
    private String ment;

    public GuideSigninRequestDto(){};

    public Guide toEntity(){
        return Guide.builder()
                .guideId(randomIdCreate())
                .id(id)
                .password(password)
                .name(name)
                .region(region)
                .star(star)
                .totalCount(toalCount)
                .ment(ment)
                .build();
    }

    private Long randomIdCreate(){
        return (long)(Math.random() * 1000000 + 100000);
    }
}
