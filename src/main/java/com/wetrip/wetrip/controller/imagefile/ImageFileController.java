package com.wetrip.wetrip.controller.imagefile;

import com.wetrip.wetrip.domain.ImageFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
public interface ImageFileController {
    Long uploadImage(MultipartFile file) throws IOException;
}
