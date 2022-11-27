package com.wetrip.wetrip.repository.marker;

import com.wetrip.wetrip.domain.Marker;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Repository
@Transactional
public class MarkerRepositoryImpl implements MarkerRepository{
    private final EntityManager em;
    private final DataSource dataSource;

    public MarkerRepositoryImpl(EntityManager em, DataSource dataSource) {
        this.em = em;
        this.dataSource = dataSource;
    }

    @Override
    public Marker join(Marker marker) {
        em.persist(marker);
        return marker;
    }
}
