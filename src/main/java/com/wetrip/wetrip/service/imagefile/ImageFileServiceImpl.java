package com.wetrip.wetrip.service.imagefile;

import com.wetrip.wetrip.domain.ImageFile;
import com.wetrip.wetrip.repository.imagefile.ImageFileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ImageFileServiceImpl implements ImageFileService {
    @Autowired
    private final ImageFileRepository imageFileRepository;
    @Value("${file.dir}")
    private String fileDir;

    @Override
    public Long saveFile(MultipartFile files) throws IOException {
        if(files.isEmpty()){
            return null;
        }
        String origName = files.getOriginalFilename();

        String uuid = UUID.randomUUID().toString();

        String extension = origName.substring(origName.lastIndexOf("."));

        String savedName = uuid + extension;

        String savedPath = fileDir + savedName;

        ImageFile file = ImageFile.builder()
                .orgNm(origName)
                .savedNm(savedName)
                .savedPath(savedPath)
                .build();

        files.transferTo(new File(savedPath));

        ImageFile savedFile = imageFileRepository.join(file);

        return savedFile.getId();
    }
}
