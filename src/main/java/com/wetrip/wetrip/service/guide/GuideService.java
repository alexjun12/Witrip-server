package com.wetrip.wetrip.service.guide;

import com.wetrip.wetrip.dto.guide.request.GuideSigninRequestDto;
import com.wetrip.wetrip.dto.guide.response.GuideSigninResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface GuideService {
    GuideSigninResponseDto signIn(GuideSigninRequestDto guideSigninRequestDto);
}
