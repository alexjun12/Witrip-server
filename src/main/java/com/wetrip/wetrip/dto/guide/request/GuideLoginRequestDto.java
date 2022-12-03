package com.wetrip.wetrip.dto.guide.request;

import com.wetrip.wetrip.domain.Guide;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GuideLoginRequestDto {
    private String id;
    private String password;

    public GuideLoginRequestDto() {};
}
