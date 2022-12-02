package com.wetrip.wetrip.repository.guide;

import com.wetrip.wetrip.domain.Guide;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GuideRepository {
    Guide join(Guide guide);
    Guide update(Guide guide);

    Optional<Guide> findById(String id);
    Optional<Guide> findByIdAndPassword(String id, String password);
}
