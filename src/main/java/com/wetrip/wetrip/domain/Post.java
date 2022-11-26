package com.wetrip.wetrip.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Builder
@AllArgsConstructor
@Table(name="post",schema="main")
public class Post {
    public Post(){}

    @Id
    @Column(name="postid")
    private Long postId;

    private String title;
    private String place;

    @Column(name="mainimage")
    private String mainImageUrl;

    @Column(name="userid")
    private String userId;

    private String date;
    private int star;
}
