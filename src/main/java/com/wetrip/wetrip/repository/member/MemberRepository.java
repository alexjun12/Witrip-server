package com.wetrip.wetrip.repository.member;

import com.wetrip.wetrip.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository {
    Member join(Member member);
    Member update(Member member);
    Optional<Member> findById(String id);

    Optional<Member> findByIdAndPassword(String id, String password);
}
