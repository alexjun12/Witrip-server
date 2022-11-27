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
@Table(name="marker",schema="main")
public class Marker {
    public Marker() {}

    @Id
    @Column(name="markerid")
    private Long markerId;

    @Column(name="postid")
    private Long postId;

    @Column(name="imgurl")
    private String imgUrl;

    private String content;

    @Column(name="markernum")
    private int markerNum;

    private String latitude;
    private String longitude;
}
