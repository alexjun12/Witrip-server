package com.wetrip.wetrip.service.member;

import com.wetrip.wetrip.domain.Member;
import com.wetrip.wetrip.dto.member.request.MemberJoinRequestDto;
import com.wetrip.wetrip.dto.member.response.MemberJoinResponseDto;
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
        Member member = memberJoinRequestDto.toEntity();
        Member result = memberRepository.join(member);
        return new MemberJoinResponseDto(result.getName());
    }
}
