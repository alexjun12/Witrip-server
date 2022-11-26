package com.wetrip.wetrip.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor
@Table(name="member",schema="main")
public class Member {
    public Member(){}

    @Id
    @Column(name="member_id")
    private Long memberId;

    private String id;

    private String password;

    private String name;
}
