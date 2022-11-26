package com.wetrip.wetrip.controller.post;

import com.wetrip.wetrip.dto.post.request.PostJoinRequestDto;
import com.wetrip.wetrip.dto.post.response.PostJoinResponseDto;
import com.wetrip.wetrip.service.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class PostControllerImpl implements PostController{

    @Autowired
    private final PostService postService;

    @Override
    @PostMapping(value="/post/writePost")
    @ResponseBody
    public PostJoinResponseDto writePost(@RequestBody PostJoinRequestDto postJoinRequestDto) {
        return postService.writePost(postJoinRequestDto);
    }
}
