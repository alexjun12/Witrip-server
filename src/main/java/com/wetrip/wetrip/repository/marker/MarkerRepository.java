package com.wetrip.wetrip.repository.marker;

import com.wetrip.wetrip.domain.Marker;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MarkerRepository {
    Marker join(Marker marker);
    Optional<Marker> findByPostId(Long postId);
}
