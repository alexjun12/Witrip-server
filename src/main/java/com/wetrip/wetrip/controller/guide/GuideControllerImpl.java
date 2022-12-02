package com.wetrip.wetrip.controller.guide;

import com.wetrip.wetrip.dto.guide.request.GuideSigninRequestDto;
import com.wetrip.wetrip.dto.guide.response.GuideSigninResponseDto;
import com.wetrip.wetrip.service.guide.GuideService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class GuideControllerImpl implements GuideController{
    @Autowired
    private final GuideService guideService;

    @Override
    @PostMapping(value="/guide/signIn")
    @ResponseBody
    public GuideSigninResponseDto signIn(@RequestBody GuideSigninRequestDto guideSigninRequestDto) {
        return guideService.signIn(guideSigninRequestDto);
    }
}
