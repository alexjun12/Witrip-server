package com.wetrip.wetrip.controller.member;

import com.wetrip.wetrip.dto.member.request.MemberJoinRequestDto;
import com.wetrip.wetrip.dto.member.request.MemberLoginRequestDto;
import com.wetrip.wetrip.dto.member.response.MemberJoinResponseDto;
import com.wetrip.wetrip.dto.member.response.MemberLoginResponseDto;
import com.wetrip.wetrip.service.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MemberControllerImpl implements MemberController{
    @Autowired
    private final MemberService memberService;

    @Override
    @PostMapping(value="/member/signIn")
    @ResponseBody
    public MemberJoinResponseDto signIn(@RequestBody MemberJoinRequestDto memberJoinRequestDto) {
        return memberService.signIn(memberJoinRequestDto);
    }

    @Override
    @PostMapping(value="/member/logIn")
    @ResponseBody
    public MemberLoginResponseDto logIn(@RequestBody MemberLoginRequestDto memberLoginRequestDto) {
        return memberService.logIn(memberLoginRequestDto);
    }
}
