package com.wetrip.wetrip.service.post;

import com.wetrip.wetrip.domain.Post;
import com.wetrip.wetrip.dto.post.request.PostJoinRequestDto;
import com.wetrip.wetrip.dto.post.response.PostJoinResponseDto;
import com.wetrip.wetrip.repository.post.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    @Autowired
    private final PostRepository postRepository;

    @Override
    public PostJoinResponseDto writePost(PostJoinRequestDto postJoinRequestDto) {
        Post post = postJoinRequestDto.toEntity();
        Post result = postRepository.join(post);
        return new PostJoinResponseDto(result.getTitle(),result.getPlace(),result.getMainImageUrl(),result.getUserId(),result.getDate(),result.getStar());
    }
}
