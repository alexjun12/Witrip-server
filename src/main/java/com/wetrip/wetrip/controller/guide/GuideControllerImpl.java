package com.wetrip.wetrip.controller.guide;

import com.wetrip.wetrip.dto.guide.request.GuideEditRequestDto;
import com.wetrip.wetrip.dto.guide.request.GuideLoginRequestDto;
import com.wetrip.wetrip.dto.guide.request.GuideMypageRequestDto;
import com.wetrip.wetrip.dto.guide.request.GuideSigninRequestDto;
import com.wetrip.wetrip.dto.guide.response.GuideEditResponseDto;
import com.wetrip.wetrip.dto.guide.response.GuideLoginResponseDto;
import com.wetrip.wetrip.dto.guide.response.GuideMypageResponseDto;
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

    @Override
    @PostMapping(value="/guide/logIn")
    @ResponseBody
    public GuideLoginResponseDto logIn(@RequestBody GuideLoginRequestDto guideLoginRequestDto) {
        return guideService.logIn(guideLoginRequestDto);
    }

    @Override
    @PostMapping(value="/guide/myPage")
    @ResponseBody
    public GuideMypageResponseDto myPage(@RequestBody GuideMypageRequestDto guideMypageRequestDto) {
        return guideService.myPage(guideMypageRequestDto);
    }

    @Override
    @PostMapping(value="/guide/edit")
    @ResponseBody
    public GuideEditResponseDto edit(@RequestBody GuideEditRequestDto guideEditRequestDto) {
        return guideService.edit(guideEditRequestDto);
    }
}
