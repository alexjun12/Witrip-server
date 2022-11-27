package com.wetrip.wetrip.service.marker;

import com.wetrip.wetrip.domain.Marker;
import com.wetrip.wetrip.dto.marker.request.MarkerJoinRequestDto;
import com.wetrip.wetrip.dto.marker.response.MarkerJoinResponseDto;
import com.wetrip.wetrip.repository.marker.MarkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarkerServiceImpl implements MarkerService{

    @Autowired
    private final MarkerRepository markerRepository;

    @Override
    public MarkerJoinResponseDto enrollMarker(MarkerJoinRequestDto markerJoinRequestDto) {
        Marker marker = markerJoinRequestDto.toEntity();
        Marker result = markerRepository.join(marker);
        return new MarkerJoinResponseDto(result.getPostId(),result.getImgUrl(), result.getContent(), result.getMarkerNum(), result.getLatitude(), result.getLongitude());
    }
}
