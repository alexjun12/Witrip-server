package com.wetrip.wetrip.controller.guide;

import com.wetrip.wetrip.dto.guide.request.GuideEditRequestDto;
import com.wetrip.wetrip.dto.guide.request.GuideLoginRequestDto;
import com.wetrip.wetrip.dto.guide.request.GuideMypageRequestDto;
import com.wetrip.wetrip.dto.guide.request.GuideSigninRequestDto;
import com.wetrip.wetrip.dto.guide.response.GuideEditResponseDto;
import com.wetrip.wetrip.dto.guide.response.GuideLoginResponseDto;
import com.wetrip.wetrip.dto.guide.response.GuideMypageResponseDto;
import com.wetrip.wetrip.dto.guide.response.GuideSigninResponseDto;
import org.springframework.stereotype.Controller;

@Controller
public interface GuideController {
    GuideSigninResponseDto signIn(GuideSigninRequestDto guideSigninRequestDto);
    GuideLoginResponseDto logIn(GuideLoginRequestDto guideLoginRequestDto);
    GuideMypageResponseDto myPage(GuideMypageRequestDto guideMypageRequestDto);
    GuideEditResponseDto edit(GuideEditRequestDto guideEditRequestDto);
}
