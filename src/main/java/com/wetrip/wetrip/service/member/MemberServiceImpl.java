package com.wetrip.wetrip.service.member;

import com.wetrip.wetrip.domain.Member;
import com.wetrip.wetrip.dto.member.request.MemberJoinRequestDto;
import com.wetrip.wetrip.dto.member.request.MemberLoginRequestDto;
import com.wetrip.wetrip.dto.member.response.MemberJoinResponseDto;
import com.wetrip.wetrip.dto.member.response.MemberLoginResponseDto;
import com.wetrip.wetrip.exception.CustomException;
import com.wetrip.wetrip.exception.ErrorCode;
import com.wetrip.wetrip.repository.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    @Autowired
    private final MemberRepository memberRepository;

    @Override
    public MemberJoinResponseDto signIn(MemberJoinRequestDto memberJoinRequestDto) {
        memberRepository.findById(memberJoinRequestDto.getId()).ifPresent(m -> {throw new CustomException(ErrorCode.ALREADY_JOINED_USER);});
        Member member = memberJoinRequestDto.toEntity();
        Member result = memberRepository.join(member);
        return new MemberJoinResponseDto(result.getName());
    }

    @Override
    public MemberLoginResponseDto logIn(MemberLoginRequestDto memberLoginRequestDto) {
        Member result = memberRepository.findByIdAndPassword(memberLoginRequestDto.getId(),memberLoginRequestDto.getPassword()).orElseThrow(() -> new CustomException(ErrorCode.USER_NOT_FOUND));
        return new MemberLoginResponseDto(result.getName());
    }
}
