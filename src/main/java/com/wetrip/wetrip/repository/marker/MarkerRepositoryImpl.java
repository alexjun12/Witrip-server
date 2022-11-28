package com.wetrip.wetrip.repository.marker;

import com.wetrip.wetrip.domain.Marker;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Marker> findByPostId(Long postId) {
        List<Marker> result = em.createQuery("select m from Marker m where m.postId = :postId",Marker.class)
                .setParameter("postId",postId)
                .getResultList();

        return result.stream().findAny();
    }
}
