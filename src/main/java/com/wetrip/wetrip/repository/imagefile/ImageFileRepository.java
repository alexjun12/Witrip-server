package com.wetrip.wetrip.repository.imagefile;

import com.wetrip.wetrip.domain.ImageFile;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageFileRepository {
    ImageFile join(ImageFile imageFile);
}
