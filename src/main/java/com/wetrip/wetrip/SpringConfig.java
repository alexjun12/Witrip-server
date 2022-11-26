package com.wetrip.wetrip;

import com.wetrip.wetrip.repository.member.MemberRepository;
import com.wetrip.wetrip.repository.member.MemberRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
@ComponentScan
public class SpringConfig {
    private final EntityManager em;
    private final DataSource dataSource;


    public SpringConfig(EntityManager em, DataSource dataSource) {
        this.em = em;
        this.dataSource = dataSource;
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemberRepositoryImpl(em, dataSource);
    }
}
