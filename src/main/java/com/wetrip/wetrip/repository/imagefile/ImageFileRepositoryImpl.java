package com.wetrip.wetrip.repository.imagefile;

import com.wetrip.wetrip.domain.ImageFile;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Repository
@Transactional
public class ImageFileRepositoryImpl implements ImageFileRepository{
    private final EntityManager em;
    private final DataSource dataSource;

    public ImageFileRepositoryImpl(EntityManager em, DataSource dataSource) {
        this.em = em;
        this.dataSource = dataSource;
    }

    @Override
    public ImageFile join(ImageFile imageFile) {
        em.persist(imageFile);
        return imageFile;
    }
}
