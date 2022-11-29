package com.wetrip.wetrip.service.member;

import com.wetrip.wetrip.dto.member.request.MemberJoinRequestDto;
import com.wetrip.wetrip.dto.member.request.MemberLoginRequestDto;
import com.wetrip.wetrip.dto.member.response.MemberJoinResponseDto;
import com.wetrip.wetrip.dto.member.response.MemberLoginResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    MemberJoinResponseDto signIn(MemberJoinRequestDto memberJoinRequestDto);
    MemberLoginResponseDto logIn(MemberLoginRequestDto memberLoginRequestDto);
}
