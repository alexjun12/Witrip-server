package com.wetrip.wetrip.service.guide;

import com.wetrip.wetrip.domain.Guide;
import com.wetrip.wetrip.dto.guide.request.GuideSigninRequestDto;
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
}
