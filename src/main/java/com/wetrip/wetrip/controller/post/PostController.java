package com.wetrip.wetrip.controller.post;

import com.wetrip.wetrip.dto.post.request.PostJoinRequestDto;
import com.wetrip.wetrip.dto.post.response.PostJoinResponseDto;
import org.springframework.stereotype.Controller;

@Controller
public interface PostController {
    PostJoinResponseDto writePost(PostJoinRequestDto postJoinRequestDto);
}
