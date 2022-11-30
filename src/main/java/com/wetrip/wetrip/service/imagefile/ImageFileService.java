package com.wetrip.wetrip.service.imagefile;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public interface ImageFileService {
    Long saveFile(MultipartFile files) throws IOException;
}
