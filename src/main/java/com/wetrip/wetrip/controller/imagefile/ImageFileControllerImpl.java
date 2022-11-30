package com.wetrip.wetrip.controller.imagefile;

import com.wetrip.wetrip.domain.ImageFile;
import com.wetrip.wetrip.service.imagefile.ImageFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ImageFileControllerImpl implements ImageFileController{
    @Autowired
    private final ImageFileService imageFileService;

    @Override
    @PostMapping(value="/imageFile/uploadImage")
    @ResponseBody
    public Long uploadImage(@RequestParam("file") MultipartFile file) throws IOException {
        Long result = imageFileService.saveFile(file);
        return result;
    }
}
