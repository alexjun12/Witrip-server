package com.wetrip.wetrip.repository.member;

import com.wetrip.wetrip.domain.Member;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class MemberRepositoryImpl implements MemberRepository{

    private final EntityManager em;
    private final DataSource dataSource;

    public MemberRepositoryImpl(EntityManager em, DataSource dataSource) {
        this.em = em;
        this.dataSource = dataSource;
    }

    @Override
    public Member join(Member member) {
        em.persist(member);
        return member;
    }

    @Override
    public Member update(Member member) {
        em.merge(member);
        return member;
    }

    @Override
    public Optional<Member> findById(String id) {
        List<Member> result = em.createQuery("select m from Member m where m.id = :id", Member.class)
                .setParameter("id",id)
                .getResultList();

        return result.stream().findAny();
    }
}
