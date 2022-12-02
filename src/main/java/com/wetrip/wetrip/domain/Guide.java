package com.wetrip.wetrip.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Builder
@ToString
@AllArgsConstructor
@Table(name="guide",schema="main")
public class Guide {
    public Guide(){}

    @Id
    @Column(name="guideid")
    private Long guideId;

    private String id;
    private String password;
    private String name;
    private String region;
    private double star;

    @Column(name="totalcount")
    private int totalCount;

    private String ment;
}
