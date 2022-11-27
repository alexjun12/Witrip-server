package com.wetrip.wetrip.service.marker;

import com.wetrip.wetrip.dto.marker.request.MarkerJoinRequestDto;
import com.wetrip.wetrip.dto.marker.response.MarkerJoinResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface MarkerService {
    MarkerJoinResponseDto enrollMarker(MarkerJoinRequestDto markerJoinRequestDto);
}
