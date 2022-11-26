package com.wetrip.wetrip.service.post;

import com.wetrip.wetrip.dto.post.request.PostJoinRequestDto;
import com.wetrip.wetrip.dto.post.response.PostJoinResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
    PostJoinResponseDto writePost(PostJoinRequestDto postJoinRequestDto);
}
