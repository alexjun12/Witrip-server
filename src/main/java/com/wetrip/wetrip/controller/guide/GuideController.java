package com.wetrip.wetrip.controller.guide;

import com.wetrip.wetrip.dto.guide.request.GuideSigninRequestDto;
import com.wetrip.wetrip.dto.guide.response.GuideSigninResponseDto;
import org.springframework.stereotype.Controller;

@Controller
public interface GuideController {
    GuideSigninResponseDto signIn(GuideSigninRequestDto guideSigninRequestDto);
}
