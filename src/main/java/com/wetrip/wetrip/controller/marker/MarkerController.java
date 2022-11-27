package com.wetrip.wetrip.controller.marker;

import com.wetrip.wetrip.dto.marker.request.MarkerJoinRequestDto;
import com.wetrip.wetrip.dto.marker.response.MarkerJoinResponseDto;
import org.springframework.stereotype.Controller;

@Controller
public interface MarkerController {
    MarkerJoinResponseDto enrollMarker(MarkerJoinRequestDto markerJoinRequestDto);
}
