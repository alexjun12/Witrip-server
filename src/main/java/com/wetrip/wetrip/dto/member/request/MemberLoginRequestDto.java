package com.wetrip.wetrip.dto.member.request;

import com.wetrip.wetrip.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberLoginRequestDto {
    private String id;
    private String password;

    public MemberLoginRequestDto() {}
}
