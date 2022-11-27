package com.wetrip.wetrip.controller.marker;

import com.wetrip.wetrip.dto.marker.request.MarkerJoinRequestDto;
import com.wetrip.wetrip.dto.marker.response.MarkerJoinResponseDto;
import com.wetrip.wetrip.service.marker.MarkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MarkerControllerImpl implements MarkerController{

    @Autowired
    private MarkerService markerService;

    @Override
    @PostMapping(value="/marker/enrollMarker")
    @ResponseBody
    public MarkerJoinResponseDto enrollMarker(@RequestBody MarkerJoinRequestDto markerJoinRequestDto) {
        return markerService.enrollMarker(markerJoinRequestDto);
    }
}
