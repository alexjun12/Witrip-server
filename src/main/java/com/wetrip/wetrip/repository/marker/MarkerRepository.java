package com.wetrip.wetrip.repository.marker;

import com.wetrip.wetrip.domain.Marker;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkerRepository {
    Marker join(Marker marker);
}
