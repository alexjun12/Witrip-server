package com.wetrip.wetrip.service.guide;

import com.wetrip.wetrip.domain.Guide;
import com.wetrip.wetrip.dto.guide.request.GuideEditRequestDto;
import com.wetrip.wetrip.dto.guide.request.GuideLoginRequestDto;
import com.wetrip.wetrip.dto.guide.request.GuideMypageRequestDto;
import com.wetrip.wetrip.dto.guide.request.GuideSigninRequestDto;
import com.wetrip.wetrip.dto.guide.response.GuideEditResponseDto;
import com.wetrip.wetrip.dto.guide.response.GuideLoginResponseDto;
import com.wetrip.wetrip.dto.guide.response.GuideMypageResponseDto;
import com.wetrip.wetrip.dto.guide.response.GuideSigninResponseDto;
import com.wetrip.wetrip.exception.CustomException;
import com.wetrip.wetrip.exception.ErrorCode;
import com.wetrip.wetrip.repository.guide.GuideRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GuideServiceImpl implements GuideService{
    @Autowired
    private final GuideRepository guideRepository;

    @Override
    public GuideSigninResponseDto signIn(GuideSigninRequestDto guideSigninRequestDto) {
        guideRepository.findById(guideSigninRequestDto.getId()).ifPresent(g -> {throw new CustomException(ErrorCode.ALREADY_JOINED_USER);
        });
        Guide guide = guideSigninRequestDto.toEntity();
        Guide result = guideRepository.join(guide);
        return new GuideSigninResponseDto(result.getName(), result.getRegion(), result.getStar(), result.getTotalCount(), result.getMent());
    }

    @Override
    public GuideLoginResponseDto logIn(GuideLoginRequestDto guideLoginRequestDto) {
        Guide result = guideRepository.findByIdAndPassword(guideLoginRequestDto.getId(), guideLoginRequestDto.getPassword()).orElseThrow(() -> new CustomException(ErrorCode.USER_NOT_FOUND));
        return new GuideLoginResponseDto(result.getName(),result.getRegion(),result.getStar(),result.getTotalCount(), result.getMent());
    }

    @Override
    public GuideMypageResponseDto myPage(GuideMypageRequestDto guideMypageRequestDto) {
        Guide result = guideRepository.findById(guideMypageRequestDto.getId()).orElseThrow(() -> new CustomException(ErrorCode.USER_NOT_FOUND));
        return new GuideMypageResponseDto(result.getName(), result.getRegion(), result.getStar(), result.getTotalCount(), result.getMent());
    }

    @Override
    public GuideEditResponseDto edit(GuideEditRequestDto guideEditRequestDto) {
        Guide result = guideRepository.findById(guideEditRequestDto.getId()).orElseThrow(() -> new CustomException(ErrorCode.USER_NOT_FOUND));
        result.setName(guideEditRequestDto.getName());
        result.setRegion(guideEditRequestDto.getRegion());
        result.setMent(guideEditRequestDto.getMent());
        guideRepository.update(result);
        return new GuideEditResponseDto(result.getName(),result.getRegion(),result.getMent());
    }
}
