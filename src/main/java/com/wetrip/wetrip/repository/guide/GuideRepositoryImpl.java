package com.wetrip.wetrip.repository.guide;

import com.wetrip.wetrip.domain.Guide;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class GuideRepositoryImpl implements GuideRepository{
    private final EntityManager em;
    private final DataSource dataSource;

    public GuideRepositoryImpl(EntityManager em, DataSource dataSource) {
        this.em = em;
        this.dataSource = dataSource;
    }

    @Override
    public Guide join(Guide guide) {
        em.persist(guide);
        return guide;
    }

    @Override
    public Guide update(Guide guide) {
        em.merge(guide);
        return guide;
    }

    @Override
    public Optional<Guide> findById(String id) {
        List<Guide> result = em.createQuery("select g from Guide g where g.id = :id",Guide.class)
                .setParameter("id",id)
                .getResultList();

        return result.stream().findAny();
    }

    @Override
    public Optional<Guide> findByIdAndPassword(String id, String password) {
        List<Guide> result = em.createQuery("select g from Guide g where g.id = :id and g.password = :password",Guide.class)
                .setParameter("id",id)
                .setParameter("password",password)
                .getResultList();

        return result.stream().findAny();
    }
}
