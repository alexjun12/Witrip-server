package com.wetrip.wetrip.dto.member.request;

import com.wetrip.wetrip.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberJoinRequestDto {
    private String id;
    private String password;
    private String name;

    public MemberJoinRequestDto(){}
    public Member toEntity(){
        return Member.builder()
                .memberId(randomIdCreate())
                .id(id)
                .password(password)
                .name(name)
                .build();
    }

    private Long randomIdCreate(){
        return (long)(Math.random() * 1000000) + 100000;
    }
}
