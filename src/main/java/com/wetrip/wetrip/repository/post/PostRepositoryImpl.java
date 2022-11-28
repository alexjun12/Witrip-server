package com.wetrip.wetrip.repository.post;

import com.wetrip.wetrip.domain.Post;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class PostRepositoryImpl implements PostRepository {
    private final EntityManager em;
    private final DataSource dataSource;


    public PostRepositoryImpl(EntityManager em, DataSource dataSource) {
        this.em = em;
        this.dataSource = dataSource;
    }

    @Override
    public Post join(Post post) {
        em.persist(post);
        return post;
    }

    @Override
    public Optional<Post> findByUserId(String userId) {
        List<Post> result = em.createQuery("select p from Post p where p.userId = :userId",Post.class)
                .setParameter("userId",userId)
                .getResultList();

        return result.stream().findAny();
    }
}
