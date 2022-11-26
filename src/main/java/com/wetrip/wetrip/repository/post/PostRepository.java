package com.wetrip.wetrip.repository.post;

import com.wetrip.wetrip.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostRepository {
    Post join(Post post);
    Optional<Post> findById(String id);
}
